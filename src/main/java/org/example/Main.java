package org.example;

import java.util.Scanner;

public class Main {
    public static void main (String[]args){
        Semeistwo familyCat = new Semeistwo();
        Semeistwo britishCat = new BritishCat();
        Semeistwo arabianCat = new ArabianCat();
        Semeistwo russianCat = new RussianCat();
        Semeistwo italianCat = new ItalianCat();
        Semeistwo chinaCat = new ChinaCat();
        familyCat.voice();
        britishCat.voice();
        arabianCat.voice();
        russianCat.voice();
        italianCat.voice();
        chinaCat.voice();
    }
    }
            class Semeistwo {
            public void voice() { System.out.print("\n" + this.getClass().getSimpleName() + ": ");
            }
        }

            class BritishCat extends Semeistwo{
                public void setName() {
                    super.voice();
                    Scanner console = new Scanner(System.in);
                    String name = console.nextLine();
                    System.out.print("моя кличка - "+ name);

                }
            }
    class ArabianCat extends Semeistwo {
        public void voice() {
            super.voice();
            Scanner console = new Scanner(System.in);
            String name = console.nextLine();
            System.out.print("моя кличка - "+ name);
        }
    }
    class RussianCat extends Semeistwo {
        public void voice() {  super.voice();
            System.out.print("korm nash");
        }
    }
    class ItalianCat extends Semeistwo {
        public void voice() {  super.voice();
            System.out.print("le mow");
        }
    }
    class ChinaCat extends Semeistwo {
        public void voice() {  super.voice();
            System.out.print("domo mew");
        }
    }




