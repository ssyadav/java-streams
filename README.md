What is Collection?
- To represent group of data/object as a single entity. Collection is a group of objects.


What is Stream?
- To process the data form the colletionwe use streams.

What is main methods of Stream?
- **filter**() : To selectively include elements from a stream based on a condition. It processes the stream and returns a new stream containing only the elements that satisfy the provided condition, without modifying the original stream.
  - numbers.stream().filter(number -> number % 2 == 0).toList();
  - numbers.stream().filter(number -> number % 2 == 0).collect(Collectors.toList()); 

<br>

- **map**() : To transforms each element in a stream by applying a specified function to it. The map() method returns a new stream consisting of the transformed elements.
- **reduce**() : To perform a reduction operation on the elements of a stream. It combines the stream elements into a single result by repeatedly applying a binary operation (such as addition, multiplication, or concatenation).
- **collect**() : To collect the stream elements to a collection or a single value.
- **forEach**() : To perform an action on each element of a stream. It is a terminal operation, which means that it returns void and does not return a new stream.
- **flatMap**() : To flatten a stream of collections into a single stream. It transforms each element of a stream of collections into a stream of elements and then concatenates all the generated streams into a single stream.
- **sorted**() : To sort the elements of a stream. It returns a new stream consisting of the sorted elements.
- **distinct**() : To remove duplicates from a stream. It returns a new stream containing only the distinct elements of the original stream.
- **limit**() : To reduce the size of a stream to a specified number of elements. It returns a new stream containing the first n elements of the original stream.
- **skip**() : To skip a specified number of elements from the beginning of a stream. It returns a new stream containing the remaining elements of the original stream after skipping the specified number of elements.
- **anyMatch**() : To check if any element of a stream satisfies a given condition. It returns true if at least one element satisfies the condition; otherwise, it returns false.
- **allMatch**() : To check if all elements of a stream satisfy a given condition. It returns true if all elements satisfy the condition; otherwise, it returns false.
- **noneMatch**() : To check if no elements of a stream satisfy a given condition. It returns true if no elements satisfy the condition; otherwise, it returns false.
- **findFirst**() : To find the first element of a stream. It returns an Optional containing the first element, or an empty Optional if the stream is empty.
- **findAny**() : To find any element of a stream. It returns an Optional containing any element of the stream, or an empty Optional if the stream is empty.
- **count**() : To count the number of elements in a stream. It returns the count as a long value.
- **min**() : To find the minimum element of a stream. It returns an Optional containing the minimum element, or an empty Optional if the stream is empty.
- **max**() : To find the maximum element of a stream. It returns an Optional containing the maximum element, or an empty Optional if the stream is empty.
- **toArray**() : To convert a stream to an array. It returns an array containing the elements of the stream.
- **of**() : To create a stream from a sequence of elements. It returns a stream consisting of the specified elements.
- **concat**() : To concatenate two streams into a single stream. It returns a new stream consisting of the elements of the first stream followed by the elements of the second stream.
- **empty**() : To create an empty stream. It returns an empty stream with no elements.
