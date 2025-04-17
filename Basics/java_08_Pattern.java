package Basics;
 public class java_08_Pattern {

    // ****************************   Print Hollow Rectangle Pattern ******************************

    public static void hollow_rectangle(int totRows, int totCols) {
        // outer loop
     for(int i=1; i<=totRows; i++) {
    //     inner loop
    for(int j=1; j<=totCols; j++) {
        //  cell - (i,j)
        if(i==1 || i==totRows || j==1 || j==totCols){
        System.out.print("* ");
        } else {
            System.out.print("  ");
        }  
    }  
    System.out.println();
     }
    }

    //  *******************************  Inverted & Rotated Half-Pyramid *****************************
      
    public static void inverted_rotated_half_pyramid(int n) {
     for(int i = 1; i <= n; i++) {
        //  spaces
        for(int j = 1; j<= n-i; j++) {
            System.out.print(" ");
        }
        //  stars
        for(int j = 1; j <= i; j++) {
            System.out.print("*");
        }
        System.out.println();
     }
    }
     
    //  *******************************  Inverted Half-Pyramid with Numbers ********************************
    
    public static void inverted_half_pyramid_withNumbers(int n) {
        for(int i = 1; i <= n; i++) {
            //  numbers
            for(int j = 1; j <= n-i+1; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

        //  ********************************** Floyd's Triangle  ********************************

        public static void floyds_triangle(int n) {
           int counter = 1;
            for(int i = 1; i <= n; i++) {
                for(int j = 1; j <= i; j++) {
                    System.out.print(counter + " ");
                    counter++;
                }
                System.out.println();
            }
        } 

        // **********************************  0-1 Triangle Pattern  ***********************************

        public static void zero_one_triangle(int n) {
           for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                if((i+j) % 2 == 0){
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
           }
        }

        // **************************** Butterfly Pattern  *****************************
        public static void butterfly_pattern(int n) {
            //  1st half
            for(int i = 1; i <= n; i++) {
                for(int j =1; j <= i; j++) {
                    System.out.print("* ");
                }
               for(int j = 1; j <= 2*(n-i); j++) {
                System.out.print("  ");
               }
               for(int j =1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
            
        }
        // 2nd - Half
            for(int i = n; i >= 1; i--) {
                for(int j =1; j <= i; j++) {
                    System.out.print("* ");
                }
               for(int j = 1; j <= 2*(n-i); j++) {
                System.out.print("  ");
               }
               for(int j =1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
            }
        }
    
        //  **********************************  Solid Rhombus  ************************************

        public static void solid_rhombus(int n) {
            for(int i = 1; i <= n; i++) {
                for(int j = 1; j <= n-i; j++) {
                    System.out.print("  ");
                }
                for(int j = 1; j <= n; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }

        // ***************************** Hollow Rhombus  *****************************

        public static void hollow_rhombus(int n) {
            for(int i = 1; i <= n; i++) {
                for(int j = 1; j <= n-i; j++) {
                    System.out.print("  ");
                }
                for(int j = 1; j <= n; j++){
                    if(i == 1 || i == n || j == 1 || j == n){
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        }

        // *********************************** Diamond Pattern **********************************

        public static void diamond(int n) {
            for(int i = 1; i <= n; i++) {
               for(int j = 1; j <= n-i; j++) {
                System.out.print("  ");
               }
               for(int j = 1; j <= 2*i - 1; j++) {
                System.out.print("* ");
               }
               System.out.println();
            }
            for(int i = n; i >= 1; i--) {
                for(int j = 1; j <= n-i; j++) {
                 System.out.print("  ");
                }
                for(int j = 1; j <= 2*i - 1; j++) {
                 System.out.print("* ");
                }
                System.out.println();
             }
        }

        // ***************************** Number Pyramid  *****************************

        public static void numberPyramid(int n) {
            for(int i = 1; i <= n; i++) {
                for(int j = 1; j <= n-i; j++) {
                    System.out.print(" ");
                }
                for(int j = 1; j <= i; j++) {
                    System.out.print(i + " ");
                }
                System.out.println();
            }
        }

        // ************************* Palindromic Pattern With Numbers  ****************************

        public static void palindromicPatternwithNumbers(int n) {
            for(int i = 1; i <= n; i++) {
                for(int j = 1; j <= n-i; j++) {
                    System.out.print("  ");
                }
                for(int j = i; j >= 1; j--) {
                    System.out.print(j + " ");
                }
                for(int j = 2; j <= i; j++) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }
        }
    public static void main(String[] args) {
        //  Hollow Rectangle

        // hollow_rectangle(4, 5);

         //  Inverted & Rotated Half-Pyramid
        
        //   inverted_rotated_half_pyramid(7);
          
           // Inverted Half-Pyramid with Numbers
        //    inverted_half_pyramid_withNumbers(5);
             
            //   Floyd's Triangle

            // floyds_triangle(5);

            //  0-1 Triangle pattern
             
            // zero_one_triangle(5);

            // Butterfly Pattern

            // butterfly_pattern(5);

             //    Solid Rhombus

            //  solid_rhombus(5);

             //  Hollow Rhombus

            //  hollow_rhombus(5);

              //  Diamond Pattern

            //   diamond(7);

                //  Number Pyramid

                // numberPyramid(5);

                 //  Palindromic Pattern With Numbers

                 palindromicPatternwithNumbers(5);
        }
} 