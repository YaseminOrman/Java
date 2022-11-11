package mentorinterviewques_answers;

public class Day19_20_21 {
    public static void main(String[] args) {
        //    day_19
//  How to reverse a String  ?
//    i) I can reverse a String by using reverse() method from StringBuilder Class
//    ii) I can reverse a String by using loops
//  =>Which one do you prefer to use? Tell them:
//    i) I use loops
//
//
//     day_20
//  1)What is the difference between "default" and "protected" access modifier?
//    i)"protected" access modifier is wider than "default" modifier
//    ii)"default"  ones cannot be used from outside the package, therefore it's other than name is "private protected"
//            "protected" ones can be used from the class in other packages if the classes are "child classes"
//
//    2) Could you  please tell the name of the access modifier from the narrowest to the widest?
//    private< default< protected < public
//
//  3)Could you please explain all access modifier
//  a) Private: Private members of a class can be accessed only within the class. It cannot be accessed from outside the class.
//  b) Default: Default members of a class are accessible within the same package due to visible only within the package. They cannot be accessed from outside the package.
//  c) Protected: Protected members of a class are visible within the package. Therefore, we can only access within the package but can be accessed to the subclasses outside the package through the inheritance only.
//  d) Public: Public members are visible anywhere. So, we can access it anywhere within or outside the package.
//
//
//   day_21
//        What is difference between this(), super()
//            3)this() is used to call constructor from the same class, super() is used to call constructor from parent class.
//
    }
}
