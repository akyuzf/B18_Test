package Test;

public class TryWithFinally {

        public static int method() {
            try {
                System.out.println("Try Block with return type");
                return 5;
            }
            catch (NullPointerException e) {
                System.out.println("Catch Block 1");
                return 10;
            }
            catch (RuntimeException e){
                System.out.println("Catch Block 2");
                return 20;
            }
            catch (Exception e){
                System.out.println("Catch Block 3");
                return 30;
            }
            finally {
               System.out.println("Finally Block always execute");
               return 40;
            }
        }


        public static void main(String[] args) {
            System.out.println(method());
        }
    }

