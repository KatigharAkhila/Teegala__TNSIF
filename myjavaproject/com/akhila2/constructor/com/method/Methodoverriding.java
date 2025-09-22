
   class Methodoverriding {
        void run() {
            System.out.println("running");
        }
        static class Car extends Methodoverriding{
            void run() {
                System.out.println("car is running");
            }
        }
        // Main method
            public static void main (String[] args) {

                Methodoverriding a1 = new Methodoverriding();  // parent class object
                a1.run();

                Methodoverriding a2 = new Car();
                a2.run();   // parent reference child class object
            }
        
  }
