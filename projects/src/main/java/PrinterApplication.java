import components.printers.ConsolePrinter;
import components.printers.DialogPrinter;
import components.printers.FilePrinter;
import components.printers.Printer;
import config.WarmUpConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PrinterApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(WarmUpConfiguration.class);
        ConsolePrinter consolePrinter = context.getBean("consolePrinter",ConsolePrinter.class);
        consolePrinter.print("cprinter");
        DialogPrinter dialogPrinter = context.getBean("dialogPrinter",DialogPrinter.class);
        dialogPrinter.print("dprinter");
        FilePrinter filePrinter = context.getBean("filePrinter",FilePrinter.class);
        filePrinter.print("fprinter");

        Printer printer = context.getBean("consolePrinter",ConsolePrinter.class);
        printer.print("cprinter2");

        try {
            Printer bean = context.getBean(Printer.class);
        } catch (RuntimeException re) {
            System.err.println(re.getLocalizedMessage());
        }
    }
}
