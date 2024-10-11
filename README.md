# CRUD API

The REST API performs CRUD operations on Student objects as described below.

## Installation
- Get the project
    - clone
  
        `git clone https://github.com/uncg-csc340/f24-crud-api-jpa.git`
    - download zip.
- Open the project in IntelliJ.
- [`/src/main/resources/application.properties`](https://github.com/uncg-csc340/f24-crud-api-jpa/blob/8f6ea1be819075df59ed06bd5b8975eccb636712/src/main/resources/application.properties) file  is the configuration for the MySQL database on your localhost.
  - the database name is on the `datasource.url` property between the last `/` and the `?`. In this case the database name is `f24-340`.
  - You MUST have the database up and running before running the project! 
    - Open your XAMPP Control Panel.
    - Start the Apache server.
    - Start MySQL.
    - Click on MySQL "Admin" to open up the DBMS.
    - Ensure the database that you need is available.
- Build and run the main class. You should see 2 new tables created in the aforementioned database.

## API Endpoints
Use POSTMAN to try the following endpoints:

## Get list of animals

### Request

    `GET http://localhost:8080/animals/`

   
### Response

     {
        "animalId": 1,
        "name": "Lion",
        "scientificName": "Panthera leo",
        "species": "mammal",
        "habitat": "savannas",
        "description": "The lion is a large wild cat native to Africa."
    },
    {
        "animalId": 2,
        "name": "Elephant",
        "scientificName": "Loxodonta africana",
        "species": "mammal",
        "habitat": "grasslands",
        "description": "The African elephant is the largest land animal, found in various habitats across Africa."
    },
    {
        "animalId": 3,
        "name": "Bald Eagle",
        "scientificName": "Haliaeetus leucocephalus",
        "species": "bird",
        "habitat": "forests",
        "description": "The bald eagle is a bird of prey found in North America, known for its distinctive white head."
    },
    {
        "animalId": 4,
        "name": "Great White Shark",
        "scientificName": "Carcharodon carcharias",
        "species": "fish",
        "habitat": "oceans",
        "description": "The great white shark is one of the ocean's top predators, found in coastal waters worldwide."
    },
    {
        "animalId": 5,
        "name": "Red Panda",
        "scientificName": "Ailurus fulgens",
        "species": "mammal",
        "habitat": "mountains",
        "description": "The red panda is a small mammal native to the eastern Himalayas and southwestern China."
    },
    {
        "animalId": 6,
        "name": "Kangaroo",
        "scientificName": "Macropus rufus",
        "species": "mammal",
        "habitat": "grasslands",
        "description": "The red kangaroo is the largest of all kangaroos and native to Australia."
    },
    {
        "animalId": 7,
        "name": "Blue Whale",
        "scientificName": "Balaenoptera musculus",
        "species": "mammal",
        "habitat": "oceans",
        "description": "The blue whale is the largest animal ever known to have lived, found in oceans worldwide."
    },
    {
        "animalId": 8,
        "name": "Green Sea Turtle",
        "scientificName": "Chelonia mydas",
        "species": "reptile",
        "habitat": "oceans",
        "description": "The green sea turtle is a large sea turtle that lives in tropical and subtropical seas around the world."
    },
    {
        "animalId": 9,
        "name": "Snow Leopard",
        "scientificName": "Panthera uncia",
        "species": "mammal",
        "habitat": "mountains",
        "description": "The snow leopard is a large cat native to the mountain ranges of Central and South Asia."
    },
    {
        "animalId": 10,
        "name": "Emperor Penguin",
        "scientificName": "Aptenodytes forsteri",
        "species": "bird",
        "habitat": "Antarctica",
        "description": "The emperor penguin is the largest of all penguins and native to Antarctica."
    }
]

## Get a specific animal

### Request

`GET http://localhost:8080/animals/1`

### Response

    {
    "animalId": 1,
    "name": "Lion",
    "scientificName": "Panthera leo",
    "species": "mammal",
    "habitat": "savannas",
    "description": "The lion is a large wild cat native to Africa."
    }

     
## Create a new animal

### Request

    `POST http://localhost:8080/animals`
    
    `http://localhost:8080/animals` 
    --data 
    '{
    "animal_Id": 1,
    "name": "Lion",
    "scientific_name": "Panthera leo",
    "species": "mammal",
    "habitat": "savannas",
    "description": "The lion is a large wild cat native to Africa."
    }'

   ### Response



## Get animals by species

### Request

    GET 'http://localhost:8080/animals/species/mammal'

   
### Response

     {
        "animalId": 1,
        "name": "Lion",
        "scientificName": "Panthera leo",
        "species": "mammal",
        "habitat": "savannas",
        "description": "The lion is a large wild cat native to Africa."
    },
    {
        "animalId": 2,
        "name": "Elephant",
        "scientificName": "Loxodonta africana",
        "species": "mammal",
        "habitat": "grasslands",
        "description": "The African elephant is the largest land animal, found in various habitats across Africa."
    },
    {
        "animalId": 5,
        "name": "Red Panda",
        "scientificName": "Ailurus fulgens",
        "species": "mammal",
        "habitat": "mountains",
        "description": "The red panda is a small mammal native to the eastern Himalayas and southwestern China."
    },
    {
        "animalId": 6,
        "name": "Kangaroo",
        "scientificName": "Macropus rufus",
        "species": "mammal",
        "habitat": "grasslands",
        "description": "The red kangaroo is the largest of all kangaroos and native to Australia."
    },
    {
        "animalId": 7,
        "name": "Blue Whale",
        "scientificName": "Balaenoptera musculus",
        "species": "mammal",
        "habitat": "oceans",
        "description": "The blue whale is the largest animal ever known to have lived, found in oceans worldwide."
    },
    {
        "animalId": 9,
        "name": "Snow Leopard",
        "scientificName": "Panthera uncia",
        "species": "mammal",
        "habitat": "mountains",
        "description": "The snow leopard is a large cat native to the mountain ranges of Central and South Asia."
    }
    ]
## Get Ocean Animals

### Request

    `GET http://localhost:8080/animals/habitat/oceans`

   
### Response

   
    {
        "animalId": 4,
        "name": "Great White Shark",
        "scientificName": "Carcharodon carcharias",
        "species": "fish",
        "habitat": "oceans",
        "description": "The great white shark is one of the ocean's top predators, found in coastal waters worldwide."
    },
    {
        "animalId": 7,
        "name": "Blue Whale",
        "scientificName": "Balaenoptera musculus",
        "species": "mammal",
        "habitat": "oceans",
        "description": "The blue whale is the largest animal ever known to have lived, found in oceans worldwide."
    },
    {
        "animalId": 8,
        "name": "Green Sea Turtle",
        "scientificName": "Chelonia mydas",
        "species": "reptile",
        "habitat": "oceans",
        "description": "The green sea turtle is a large sea turtle that lives in tropical and subtropical seas around the world."
    }
]

## Update an existing animal

### Request

    `PUT http://localhost:8080/animals/update/1`
    

## Delete an existing Student

### Request

    `DELETE http://localhost:8080/animals/delete/1`

