import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * WrapperGenerator
 *
 * Loads a Main.java template from templates/Main.java.txt, replaces
 * placeholders, and writes it along with #compile.bat and #run.bat
 * into the output directory.
 */
public final class WrapperGenerator {

    private static final String TEMPLATE_PATH = "templates/Main.java.txt";

    private WrapperGenerator() {
    }

    /**
     * Generates Main.java, #compile.bat, and #run.bat into outputDir.
     */
    public static void generate(File outputDir, File jarFile) throws IOException {
        System.out.println("[WrapperGenerator] Generating wrapper files ...");

        String template = loadTemplate();
        String jarPath = jarFile.getAbsolutePath().replace('\\', '/');
        String source = template.replace("{JAR_PATH}", jarPath);

        writeFile(new File(outputDir, "Main.java"), source);
        System.out.println("[WrapperGenerator] Written: Main.java");

        writeFile(new File(outputDir, "#compile.bat"), buildCompileBat());
        System.out.println("[WrapperGenerator] Written: #compile.bat");

        writeFile(new File(outputDir, "#run.bat"), buildRunBat());
        System.out.println("[WrapperGenerator] Written: #run.bat");
    }

    private static String loadTemplate() throws IOException {
        File templateFile = new File(TEMPLATE_PATH);
        InputStream in;

        if (templateFile.exists()) {
            in = new FileInputStream(templateFile);
        } else {
            // Try classpath as fallback (e.g. running from JAR)
            in = WrapperGenerator.class.getResourceAsStream("/" + TEMPLATE_PATH);
            if (in == null) {
                throw new IOException("Template not found: " + TEMPLATE_PATH);
            }
        }

        StringBuilder sb = new StringBuilder(4096);
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new InputStreamReader(in, "UTF-8"));
            String line;
            while ((line = reader.readLine()) != null) {
                sb.append(line).append('\n');
            }
        } finally {
            if (reader != null) {
                try { reader.close(); } catch (IOException ignored) { }
            }
        }
        return sb.toString();
    }

    private static String buildCompileBat() {
        StringBuilder sb = new StringBuilder();
        sb.append("@echo off\n");
        sb.append("echo Compiling Main.java ...\n");
        sb.append("javac Main.java\n");
        sb.append("if %ERRORLEVEL% NEQ 0 (\n");
        sb.append("    echo Compilation failed.\n");
        sb.append("    pause\n");
        sb.append("    exit /b 1\n");
        sb.append(")\n");
        sb.append("echo Done.\n");
        sb.append("pause\n");
        return sb.toString();
    }

    private static String buildRunBat() {
        StringBuilder sb = new StringBuilder();
        sb.append("@echo off\n");
        sb.append("echo Launching RS 508 client ...\n");
        sb.append("java Main\n");
        sb.append("pause\n");
        return sb.toString();
    }

    private static void writeFile(File file, String content) throws IOException {
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(
                    new OutputStreamWriter(new FileOutputStream(file), "UTF-8")
            );
            writer.write(content);
        } finally {
            if (writer != null) {
                try { writer.close(); } catch (IOException ignored) { }
            }
        }
    }
}
