

var name = "Karan"
fun Lastname(item: String) = println(item)

fun main(){
//    name = "Karan Kumar"
//    println(name)
//    println(Lastname("Kumar"))

//creating an array
    val arr = arrayOf("Kotlin","Java","Php","python")

// printing size and values of array using different inbuilt fuctions
//    println(arr.size)
//    println(arr[0])
//    println(arr.get(1))
//looping through array
//    1.
//    for(a in arr)
//    {
//        println(a)
//    }

//    2.
    //this is used to define what we want to do with each value of the collection of data which is array here.
    //it name is given by default name for each element of the array in this function.
    //foreach function is lamda syntax please search google for further details
    // Or refer to this video https://www.youtube.com/watch?v=F9UC9DY-vIU&t=2243s at 38:45

//      arr.forEach {
//        println(it)
//      }


    //3.
    //in this one you can take index of the array element but in last one you can't.
    arr.forEachIndexed { index, s ->
        println("$s is at $index")
    }


    //Kotlin has 3 collection types which are array,list,maps which are all immutable which means you cannot add or remove their values once they are defined.


    // Array VS List

    // list and array are very similar but list can be modified where as array cannot. you need to use mutableList for that.
    // size of list can be increased or decreased. Arrays have fixed size and cannot expand or shrink retaining identity (you need to copy an array to resize it). As to the lists, MutableList<T> has add and remove functions, so that it can increase and reduce its size.
    //Arrays are optimized for primitives: there are separate IntArray, DoubleArray, CharArray etc.
    //Lists in general do not have implementations optimized for primitives, though some libraries (outside JDK) provide primitive-optimized lists.

   // val li= listOf("jack","john","rita")
    //but you won't have the access to add function in list. To add data change it to mutable list as shown below
    val li= mutableListOf("jack","john","rita")
    println("\nList\n")
    for(list in li){
        println(list)
    }
    li.add("Kay")
    println("\nList after adding a new value to the list\n")
    for(list in li)
    {
        println(list)
    }

    // Maps
    // to add data to maps you need to make the mutable just like list as mentioned in the above code
    //maps are like dictionary in swift
    //it has key and its relative values
    // key can be anything it doesn't need to be consecutive.
    // for example you want to save countries in a map then you can use codes as keys like IND for India, CA for Canada
    //it is defined as val = mapof(key to value,key to value,...)

    val map = mapOf(1 to "Karan",2 to "Ankita",3 to "Sandeep",4 to "Vrinda")
    println("\nMap with key and value\n")
    // using forEach function t and u are referred to key and value respectively which can be changed
    map.forEach { t, u ->
        println("$t -> $u")
    }

    val map1 = mutableMapOf(1 to "Jake",2 to "Kee",3 to "Joe")
    map1.put(4,"Rena")
    map1.put(6,"Renne")

    print("\nMap after adding 2 new elements\n")
    map1.forEach { key, value -> println("$key -> $value")
    }

// using collections with functions
//we can pass the collection to a function as a parameter
// you can use list for list and mutable list as done below
// same goes of map



    fun col(greeting: String,itemsToGreet: List<String>)
    {
    itemsToGreet.forEach { itemsToGreet ->
        println("$greeting $itemsToGreet")
    }
    }

    col("Hello",li)




/*
I FOUND 2 DIFFERENT WAYS OF USING VARARG PARAMETERS IN A FUNCTION.
SO I AM CONFUSED RIGHT NOW
BUT I WROTE DOWN THE BOTH WAYS.
I THINKS 2ND ONE MAKES MORE SENSE.


THIS IS FIRST EXPLANATION
Sometimes we don't want to use one parameter of a function.
* for example in the function col which is defined above we don't want to pass the list.
* for that there are 2 different ways
* 1st is you can pass a empty list
* like col("Hi",listof())
* but this is not a good way of handling it
*
* 2nd is that you can modify the function arguments so that they can be optional
* for that you can use vararg keyword while defining the function. AS SHOWN BELOW
* But vararg will convert the argument in an array of the specified type of arguments
* for example string is used as a data type in the second parameter of the below created function
* so now it will be changed to array of string type after adding vararg to the parameter */

/*
THIS IS 2ND EXPLANATION
Sometimes we need a function where we can pass n number of parameters, and the value of n can be decided at runtime.
Kotlin provides us to achieve the same by defining a parameter of a function as vararg.
We can pass n number of parameters to a vararg variable of the defined datatype or even of a generic type.

----->For Example<------
We need a function which takes n number as inputs and returns the average of all the inputs.
If the size of n variables is not fixed, we usually convert it into an array or list and pass it to function.

So now to handle this without converting into array or list
We can use VARAGR parameters
We can pass n number of inputs to the same function and can get the result back.
Inside the function, the parameter is available as an Array object and
we can perform all normal array operations on it.

*/

    fun new_func(greeting: String, vararg ItemsTOGreet: String){
    ItemsTOGreet.forEach { ItemsTOGreet ->
        println("$greeting $ItemsTOGreet")
    }
    }
/*Now when we will call function new_func
* we can pass the multiple values in the second parameter AS SHOWN BELOW*/
    new_func("Hi","Karan","Paras","Ankita","Sandeep")

/*
* So now in real world case we will get the array values from a network or Database
* but your can't simply pass the array of data in the parameter.
*
* EXAMPLE is given below you can uncomment to see the error it gives when you pass array in 2nd argument
*  */

 //   val dataArray = arrayOf("Kotlin","java","C++")
 //    new_func("Hi",dataArray)

    /*
    * TO SOLVE THE ABOVE GIVEN ISSUE
    * you need to use SPREAD OPERATOR(*)
    * you have to put * in front of the array name
    * AS SHOWN BELOW
    * */

    val dataArray = arrayOf("Kotlin","java","C++")
     new_func("New",*dataArray)

//Please see the SECOND KOTLIN file for learning more kotlin
}
