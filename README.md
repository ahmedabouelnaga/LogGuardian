# LogGuardian
## Table of Contents
- [Overview](#overview)
- [Features](#features)
- [How to Run](#how-to-run)
- [Files in the Repository](#files-in-the-repository)

---

## Overview

LogGuardian reads server log files, identifies failed login attempts, and outputs IP addresses that have failed to log in three or more times. This helps identify potential malicious actors based on repeated invalid attempts.

### Implementation Highlights

- Processes log files using Java's `String.split` method to parse each line.
- Extracts IP addresses and tracks the count of failed login attempts.
- Outputs IP addresses with three or more failures to a specified output file.

---

## Features

1. **Log Parsing**:
   - Reads a log file line by line.
   - Identifies lines with failed login attempts based on specific keywords (e.g., "Invalid").
   - Extracts IP addresses from the log entries.

2. **Failure Tracking**:
   - Maintains a count of failed login attempts for each IP address.
   - Tracks only IP addresses that fail to log in three or more times.

3. **Output File**:
   - Writes the list of flagged IP addresses to a specified output file.

---

## How to Run

1. **Compile the Program**:
   ```bash
   javac Fail2Ban.java
## Run the Program

2. **Run the Program**:
   ```bash
   java Fail2Ban <log_file> <output_file>
Example:
java Fail2Ban logs_processed.txt output.txt

## Files in the Repository

1. `Fail2Ban.java`: Main program logic for parsing logs and generating output.
2. `logs_processed.txt`: Sample log file for testing.
3. `output.txt`: Example output file containing flagged IP addresses.
4. `README.txt`: Explains the implementation and provides additional instructions.
