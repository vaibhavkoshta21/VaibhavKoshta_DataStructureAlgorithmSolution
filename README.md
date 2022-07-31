# VaibhavKoshta_DataStructureAlgorithmSolution

The repository contains two problem statements:

1. In the project, a skyscraper is to be constructed where the user have to first enter the total number of floors in the skyscraper and then the factory provides certain sizes of floor equal to or less than total number of floors. The program is build the skyscraper if the maximum size floor is available and if the maximum size floor is not available then wait for the availaibility of the maximum size and then construct the skyscraper.

The input is of the following pattern:
First Line: contains the total floors N in the building
Second Line onwards: Contains N inputs in which the ith integer denotes the size of the floor
that will be given to architect by factories on the ith day.

The output is as shown:
Output
You are required to print N lines. Print the size of the floor in descending order, which can be
assembled.
If no floor can be assembled on the ith day, leave the line empty.
Sample Test Cases
TestCase 1
enter the total no of floors in the building
3
enter the floor size given on day : 1
3
enter the floor size given on day : 2
1
enter the floor size given on day : 3
2
The order of construction is as follows
Day: 1
3
Day: 2
Day: 3
2 1


2. The second project is about managing the transactions in a mnc where only binary search tree is used to store the transactions. The constraint is that the binary search tree should not contain any left node. In this project we have first created the binary search tree and then it converted into right skewed binary search tree by shifting the left node to the right of the root node such the smallest node in the left becomes the root node of the final right skewed binary search tree.
