public class MathLab{
    public class LuckyNumbers {
        /* No instance variables */
      
        /* "empty" constructor with no parameters */
        public LuckyNumbers() { }
      
        /* Generates a random number between min and max, inclusive,
           and returns that random number
         */
        public int randomIntegerBetween(int min, int max) {
           int x = (int)(Math.random()*(max-min+1))+min;
           return x;
        }
      
        /* Generates and returns a String containing lucky numbers
      
           For this lucky number game, there are 5 balls randomly drawn,
           each between 1 and 65, and one "super ball" between 1 and 30.
           
           In this game, the same number CAN appear more than once.
      
           The returned String should have the 6 numbers listed (they do not
           need to be in ascending order): 5 "lucky numbers" between 1 and 65,
           and the last one, the "super ball," between 1 and 30.
           See samples below.
      
           This method should call your randomIntegerBetween method above multiple times
          */
        public String getLuckyNumbers() {
          String str = "Your lucky numbers are: ";
          for(int i=0;i<5;i++){
            str+=randomIntegerBetween(1, 65);
            str+=" ";
          }
          str+="\nThe super ball is: ";
          str+=randomIntegerBetween(1, 30);
          return str;
        }
      }
      public class Circle {
        private double radius;
      
        public Circle(double radius) {
          this.radius = radius;
        }
      
        /* Returns the area of the circle with given radius
           Area of a circle = pi * r ^ 2
           Use Math.PI for pi and use the pow method
         */
        public double area() {
          double area = Math.PI*(radius*radius);
          return area;
        }
      
        /* Returns the circumference of the circle with given radius
           Circumference of a circle = pi * 2 * r
           Use Math.PI for pi
         */
        public double circumference() {
          double circumference = Math.PI*radius*2;
          return circumference;
        }
      
        /* Setter method to update the radius of the circle to newRadius
         */
        public void setRadius(double newRadius) {
          radius = newRadius;
        }
      
        /* Returns a String that includes info about the circle,
           including its radius, area, and circumference on separate lines;
           see example output below (Reminder: the new line escape
           sequence \n allows you to include new lines in Strings)
           This method should call your other methods as appropriate.
         */
        public String getInfo() {
          return "Radius: "+radius+"\nArea: "+area()+"\nCircumference: "+circumference();
        }
      }
      public static void main(String[] args) {
        double x = 6.5;
        double thirdPower = Math.pow(x,3);
        System.out.println(thirdPower);
        
      }
      
}
