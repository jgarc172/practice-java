# Arrays and Loops

To access the elements of an array, there are several ways and patterns.

To aid in remembering which way or pattern to use, it is important that you can visualize the array itself.

## The First and Last elements in an Array
The first and last elements is  
The variable name of the array and the length of the array fully describe the array.
The length of the array helps you determine the number of elements in the array.  It also allows you to access any element by its position in the array.

For an array of length 3:

```java
int myArray = {7, 4, 5};
```

The property `myArray.length` is `3`.

The indexes are `0, 1, and 2`.

The `first` element is located at index `0`.





## Creating an Array: 
To create an integer array whose variable name is `myArray` of size `3`:

```java
int[] myArray = new int[]{7, 4, 5};
```

## Identifying the Array and its Elements

Once created and identified, the array can be accessed by its variable name, `myArray`.

Elements of the array can also be accessed (reading its value) with the combination of the array variable name and the corresponding index number.  For example, to access the first, `0`, element in the array named `myArray`:

```java
myArray[0]
```

## Size of the Array and the Range of Indexes

The size of the array determines which indexes can be used to access the array elements.  The size of the array can be obtained from the length property:

```java
int size = myArray.length;
``` 

### Array of length zero

An empty array or of size 0 has no element.  Therefore no index is valid.

### Array of length 1 or greater

The range of indexes that are valid can be determined.  The first element is index `0`, and the last element can be calculated from the `length` property.

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



