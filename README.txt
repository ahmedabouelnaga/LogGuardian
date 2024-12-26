I created a Hastable to store ip addresses and their number of failed logins

I opened a file for reading
Created a scanner object to read the file "logs_processed.txt"
Read the file till there is no line
I incremented the count of ip addresses in the Hastable if the ip address already exists
Created a new key value pairs with ip addresses and the # of failed attempts
Closed the scanner object
Opened output.txt for writing
write ip address to the file output.txt file if # of failed attempts are more than 3
then I closed the file