
fun greetPerson(greeting : String,name : String ) = println("$greeting $name")

fun main() {
greetPerson("Good morning","Karan")
/*==========================>  NAMED ARGUMENTS  <===============================
*
* As you can see that the IDE is helping us to determine what to pass first
* FOR EXAMPLE
* greeting is shown in front of Good Morning and name is shown in front of Karan when you input them
* But if you are in a CODE REVIEW you won't be able to see the hints given by IDE
* So you won't be able to tell in what order the arguments should be passed in.
* which means you can mistakenly pass the name first rather than greeting
*
*                ------------> Definition of CODE REVIEW <---------------
* Code review is a software quality assurance activity in which one or several people check a program
* mainly by viewing and reading parts of its source code,
* and they do so after implementation or as an interruption of implementation.
* At least one of the persons must not be the code's author.
* https://en.wikipedia.org/wiki/Code_review for further details
*
* OR IF You want to change the FUNCTION SIGNATURE in future
* you need to know the exact order of the parameters
* because these parameters are of same type
* you will not get Any compiler error.
*
*
*                ------------> Definition of FUNCTION SIGNATURE <---------------
* A function signature is the parts of the function declaration
* that the compiler uses to perform overload resolution.
* Since multiple functions might have the same name (ie., they're overloaded),
* the compiler needs a way to determine which of several possible functions
* with a particular name a function call should resolve to.
* The signature is what the compiler considers in that overload resolution.
* */

/*TO SOLVE THIS ISSUE YOU CAN USE ***NAMED ARGUMENTS***
NAMED ARGUMENTS ARE USED AS SHOWN IN THE BELOW EXAMPLE
* */
  greetPerson(greeting = "Good Evening",name = "Paras")


    // By using this you can switch the places because the compiler will know which value belongs to which parameter
    // FOR EXAMPLE
    greetPerson(name = "Ankita",greeting = "Good Night")

    //IT IS MANDATORY TO PASS BOTH ARGUMENTS




/* =======================>  DEFAULT PARAMETER VALUES  <============================
*
* This takes the flexibility of Named Arguments to more advance level
* Default Parameters values are used to provide a value to a parameter
* In case the user do not pass any values to a argument
* For Example
*
* greetPerson(name = "Ankita")
*
* this will give error as you have not passed the value of greeting
* to solve this you need to provide the default values during defining of the function
* As Shown Below
* */

    fun greet(firstArg: String = "Hello",SecondArg: String = "Karan")= println("$firstArg $SecondArg")

    // If You Don't pass a value to firstArg it will take Hello As DEFAULT
    // same goes for SecondArg
    // As shown Below

    greet(SecondArg = "Sandeep")
    // OUTPUT of This is
    // Hello Sandeep

    greet(firstArg = "Hii")
    // OUTPUT of This is
    // Hii Karan

    greet()
    // OUTPUT of This is
    //Hello Karan

  /*There is a limitation of Named Arguments
  * If you use one named argument then it is mandatory to use named argument in the other argument
  * EXAMPLE
  *
  * greet(firstArg = "Hello","Love")
  * THIS WILL GIVE THE ERROR
  *
  * greet(firstArg = "Hello",secondArg = "Love")
  * So you have to write it like this
  *
  *
  * */
}