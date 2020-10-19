package core.warmup;

import core.components.printers.ConsolePrinter;
import core.components.printers.DialogPrinter;
import core.components.printers.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HelloWorld {

//    private AtomicInteger counter = new AtomicInteger(1);
//    private ThreadLocal<Integer> value;

    private ConsolePrinter consolePrinter;
    private Printer defaultPrinter;
    private DialogPrinter dialogPrinter;

    public HelloWorld() {
    }

    @Autowired
    public HelloWorld(ConsolePrinter consolePrinter) {
        this.consolePrinter = consolePrinter;
    }
//    @Autowired
//    public void setDialogPrinter(DialogPrinter dialogPrinter) {
//        this.dialogPrinter = dialogPrinter;
//    }


    public void sayHello() {
        String helloMsg = "Hello, world!";
        consolePrinter.print(helloMsg);
//        Integer r = new Random().nextInt(3);
//        Optional.of(r).filter(v -> v.equals(0))
//                .ifPresentOrElse(v -> consolePrinter.print(helloMsg),
//                        () -> Optional.of(r).filter(v -> v.equals(1))
//                                .ifPresentOrElse(
//                                        v -> dialogPrinter.print(helloMsg),
//                                        () -> defaultPrinter.print(helloMsg)));
    }

//    @Autowired
//    public void setDefaultPrinter(Printer defaultPrinter) {
//        this.defaultPrinter = defaultPrinter;
//    }

    }

