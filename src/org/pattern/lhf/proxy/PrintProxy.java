package org.pattern.lhf.proxy;

public class PrintProxy implements Printable {
    private String name;
    private Printer printer;
    public PrintProxy(){
    }
    public PrintProxy(String name){
        this.name=name;
    }
    @Override
    public synchronized void setPrinterName(String name) {
        if(printer!=null){
            printer.setPrinterName(name);
        }
        this.name=name;
    }

    @Override
    public String getPrinterName() {
        return name;
    }

    @Override
    public void print(String string) {
        realize();
        printer.print(string);
    }

    private void realize() {
        if(printer==null){
            printer=new Printer(name);
        }
    }

    public Printer getPrinter() {
        return printer;
    }

    public void setPrinter(Printer printer) {
        this.printer = printer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
