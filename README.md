# SORT AND PSBB

## Table of Contents


## Background
First, Sorting the character from a string based on vowel and consonant characters. Second, speculate minimum number of buses need to rent if all members of each family should ride in the same busses.

## Installation
```
git clone https://github.com/MuffinCrunchy/sort-psbb.git
```

## Usage
```
cd ./sort-psbb
java -jar ./run/jarfile/sort-psbb.jar
```

## Features
### Sort Character
- Sort the letters according to the order they came out
- Separate between vowels and consonants
- Process as lowercase letters (whitespaces are ignored)

### PSBB
Speculate a minimum number of buses need to rent if all members of each family should ride in the same Busses.

### Example Output
```bash
Choose Problem:
1. Sort Character
2. PSBB
3. Exit
Enter your choice: 1
Input one line of words (S): Sample Case
Vowel Characters: aaee
Consonant Characters: ssmplc

Choose Problem:
1. Sort Character
2. PSBB
3. Exit
Enter your choice: 2
Input the number of families: 8
Input the number of members in the family (separated by a space): 2 3 4 4 2 1 3 1
Minimum bus required is : 5

Choose Problem:
1. Sort Character
2. PSBB
3. Exit
Enter your choice: 3
```

### About The Project
#### Project Structure
sort-psbb
├─ run
│  ├─ jarfile
│  │  ├─ sort-psbb.jar
├─ src
│  ├─ META-INF
│  │  ├─ MANIFEST.MF
│  ├─ Methods
│  │  ├─ PSBB.java
│  │  ├─ SortChart.java
├─ Main.java
.gitignore
README.md
sort-psbb.iml
