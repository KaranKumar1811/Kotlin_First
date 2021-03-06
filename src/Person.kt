/*
===========================>  Classes in Kotlin  <===============================
Creation of Objects of class is shown below

val person = Person()
Here person is an object of Person Class


Defining a Constructor in a class
you can use the key word constructor to create a constructor AS SHOWN BELOW

Class Person constructor()
        or
   Class Person()
Both will create an empty constructor
The IDE will suggest you to delete the above constructor because they are Empty Constructor

Now i will create a constructor with parameters so that values can be passed into the constructor
AS SHOWN BELOW
* */
class Person(_firstName : String, _lastName: String)
// So Now We Will Create a Object in second.kt file
//Please goto second.kt LINE 98
{
    // This block is of class person just to be clear

    /*So Now we need properties to manage and handle the parameter values
    * Because you can't access the parameters of the constructor using objects of this class in another file
    * like second.kt
    *
    * Creating properties
    *
    val FirstName : String
    val SecondName : String

    if you uncomment LINE 33 and 34 there will be an error
    * because the properties haven't been initialized
    *
    * There are 3 ways to initialize these properties
     */


    /* 1. use init Block AS SHOWN BELOW
    *
    * init{
    * FirstName = _firstName
    * LastName = _lastName
    * }
    * */

    /* 2.Initialize values while declaring
    * */

     val FirstName : String = _firstName
     val LastName : String = _lastName

    /* 3. Define the properties as Parameter of constructor
    *
    * Class Person(val FirstName : String, val Lastname : String )
    * */
//PLEASE GOTO second.kt LINE 109

 /*What you learned above is a primary constructor
 * but in many cases you will need more than one constructors in class
 * so those constructors are called as Secondary Constructors
 * Now we will create an empty constructor
 * But for the secondary constructor to work you have to call the primary constructor
 * You cannot do this
 * constructor()
 * {
 * println("SECONDARY Constructor Is called")
 * }
 * you need to call the primary constructor using this keyword which refers to this class
 * As Shown in Line 78
 *
  * */

    constructor(): this("Roma","Gill"){
        println("SECONDARY Constructor Is called")
    }
    /*Now when you will call the secondary constructor
    * as shown in Second.kt file Line No 120
    * the output will be
    * SECONDARY Constructor Is called
    * */


    /*Now we will use init block to see how it works*/

    init {
        println("Init is called")
    }
    /*When ever you make a object of this class the first thing to execute is the init block
    * regardless of where init is placed in the class
    * when we run second.kt file the output of the line 120 Will be
    *
    * Init is called
    * SECONDARY Constructor Is called
    * */

    
}

