# ANIMALS REST

### Author
Germán Amézquita Becerra
2024 Septiembre

## Description

This project returns a list of animals with the following endpoint:

1. `animal/all`   
   Returns list with all animals.
2.  `animal/range/?from={number}&to={number}`
   Returns the animals located in the file between those positions.


## use endpoint

Example 1: 
`http://localhost:8081/animal/range?from=1&to=40`
`http://localhost:8081/animal/range?from=1&to=409`

Example 2: 
`http://localhost:8081/animal/all`



## Compilation

```
mvn clean install
```

## package jar
```
mvn clean package
```

---

## New Featurtes

These features are for practice and preparation for evaluation. Please create the following endpoint:

1. List of animals that belong to a category, 
 `animal/category/{categoty}`

2. List of animals whose names have less than n letters
 `animal/name-length/{numberOfLetters}`


## use new endpoint

Example 1: 
- `http://localhost:8081/animal/category/Mamíferos`
- `http://localhost:8081/animal/category/Lost`

Example 2: 
- `http://localhost:8081/animal/name-length/4`
