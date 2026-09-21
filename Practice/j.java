public class j {

    public static void main(String[] args) {
    // // Java follows only call by value principle but call by reference 
    // // can be implemented with the help of non primitive data structures
    
    // // Imitating call by reference (Not actual call by reference)
    // Random r1 = new Random(4, 5);
    // Random r2 = new Random(r1);
    // System.out.println(r1.x + " , " + r1.y);
    // addTen(r1);
    // System.out.println(r1.x + " , " + r1.y);
    // System.out.println(r2.x + " , " + r2.y);
    }
    // static void addTen(Random r){
    //     r.x = r.x + 10;
    //     r.y = r.y + 10;
    // }
}

// class Random {
//     int x;
//     int y;

//     Random(int x, int y){
//         this.x = x;
//         this.y = y;
//     }

//     Random(Random r){
//         this.x = r.x;
//         this.y = r.y;
//     }
// }