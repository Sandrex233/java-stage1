# Task 1


## File uploading

Dear student, in this task you should upload data from `Profile.txt` file, parse and map on class `Profile` **using only `java.io` assets.
Using other options for uploading are prohibited. For other purposes you can use only what you have already studied
from previous stages and modules.**

Example of `Profile.txt` in the folder `resources` with profile data:

```
Name: Anna
Age: 25
Email: anna@mailserver.com
Phone: 1234567890
```

Also, you have class `FileReader` with method `getDataFromFile(File file)` which bring `File` object and should
return `Profile` object with data from the file.
As a small tip we recommend you follow the next logic:

```
1. Reading file data into string
2. Parse this string for key-value pairs
3. Create Profile
```

- Feel free for creating additional methods and classes, but keep in mind that `getDataFromFile` method will be invoked
by tests in order check validity of your solution. 
- Uploading logic(input streams) should be only in `FileReader` class. 
- Don't change folder hierarchy. Don't change method signature.
- Please, write your code according to java **code style, formation, best practices**. If you are not sure in formation, you can use default `Intelij IDEA` code formatting (`ctrl + alt + L`).

Good luck :)


