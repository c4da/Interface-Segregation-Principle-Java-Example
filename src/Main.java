
class Document {

}

interface Machine {
    void print(Document d);
    void fax(Document d);
    void scan(Document d);
}

class MultifunctionPrinter implements Machine {

    @Override
    public void print(Document d) {

    }

    @Override
    public void fax(Document d) {

    }

    @Override
    public void scan(Document d) {

    }
}

interface Printer {
    void print(Document d);
}

interface Scanner {
    void scan(Document d);
}

class JustAPrinter implements Printer {

    @Override
    public void print(Document d) {

    }
}

class OldFashionedPrinter implements Machine {

    @Override
    public void print(Document d) {

    }

    @Override
    public void fax(Document d) {
        //NOT SUPPORTED
    }

    @Override
    public void scan(Document d) {
        //NOT SUPPORTED
    }
}

class Photocopier implements Printer, Scanner {
    @Override
    public void print(Document d) {

    }

    @Override
    public void scan(Document d) {

    }
}

interface MultiFunctionDevice extends Printer, Scanner {

}

class MultiFunctionMachine implements MultiFunctionDevice {
    Printer printer;
    Scanner scanner;

    public MultiFunctionMachine(Printer printer, Scanner scanner){
        this.printer = printer;
        this.scanner = scanner;
    }

    @Override
    public void print(Document d) {
        printer.print(d);
    }

    @Override
    public void scan(Document d) {
        scanner.scan(d);
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}