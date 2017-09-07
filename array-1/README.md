# Arrays and Loops

## Creating an Array: 
To create an integer array whose variable name is `myArray` of size 5:

```java
int[] myArray = new int[5];
```

## Identifying the Array and its Elements

Once created and identified, the array can be accessed by its variable name, `myArray`.

Elements of the array can also be accessed with the combination of the array variable name and the corresponding index number.  For example, to access the first, `0`, element in the array named `myArray`:

```java
myArray[0]
```

## Size of the Array and the Range of Indexes

The size of the array determines which indexes can be used to access the array elements.  For example, if the length of the array
## For Each Index Loop:

Arrays elements can be accessed by their position, their index value.  For example, to access all the elements of an array:

```java
// For-All
// Do something for every element

public void forAll(int[] nums) {
  for (int i=0; i<nums.length; i++) {
    System.out.println( nums[i] );
  }
}
```

Individual array elements are identified by using array name and an index.  For example:

The first element of the array is 

```java
arrayName[0]
```



