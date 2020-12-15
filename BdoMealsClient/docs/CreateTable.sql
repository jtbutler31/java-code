create database if not exists regis;

use regis;

DROP TABLE IF EXISTS QuantityOfInputs;


CREATE TABLE `QuantityOfInputs` (
  mealNameQuantity INTEGER NOT NULL,
  ingredient1NameQuantity INTEGER NOT NULL,
  ingredient2NameQuantity INTEGER NOT NULL,
  ingredient3NameQuantity INTEGER NOT NULL,
  ingredient4NameQuantity INTEGER NOT NULL,
  ingredient5NameQuantity INTEGER NOT NULL
);


INSERT INTO regis.QuantityOfInputs(mealNameQuantity, ingredient1NameQuantity, ingredient2NameQuantity, ingredient3NameQuantity, ingredient4NameQuantity, ingredient5NameQuantity) VALUES(
1,2,1,1,1,2);

INSERT INTO regis.QuantityOfInputs(mealNameQuantity, ingredient1NameQuantity, ingredient2NameQuantity, ingredient3NameQuantity, ingredient4NameQuantity, ingredient5NameQuantity) VALUES(
1,1,1,1,1,2);

INSERT INTO regis.QuantityOfInputs(mealNameQuantity, ingredient1NameQuantity, ingredient2NameQuantity, ingredient3NameQuantity, ingredient4NameQuantity, ingredient5NameQuantity) VALUES(
1,1,1,2,1,1);

INSERT INTO regis.QuantityOfInputs(mealNameQuantity, ingredient1NameQuantity, ingredient2NameQuantity, ingredient3NameQuantity, ingredient4NameQuantity, ingredient5NameQuantity) VALUES(
1,1,2,1,1,1);

INSERT INTO regis.QuantityOfInputs(mealNameQuantity, ingredient1NameQuantity, ingredient2NameQuantity, ingredient3NameQuantity, ingredient4NameQuantity, ingredient5NameQuantity) VALUES(
1,1,2,2,1,1);

INSERT INTO regis.QuantityOfInputs(mealNameQuantity, ingredient1NameQuantity, ingredient2NameQuantity, ingredient3NameQuantity, ingredient4NameQuantity, ingredient5NameQuantity) VALUES(
1,2,2,1,1,1);

INSERT INTO regis.QuantityOfInputs(mealNameQuantity, ingredient1NameQuantity, ingredient2NameQuantity, ingredient3NameQuantity, ingredient4NameQuantity, ingredient5NameQuantity) VALUES(
1,2,1,1,1,1);

INSERT INTO regis.QuantityOfInputs(mealNameQuantity, ingredient1NameQuantity, ingredient2NameQuantity, ingredient3NameQuantity, ingredient4NameQuantity, ingredient5NameQuantity) VALUES(
1,1,2,1,1,1);

INSERT INTO regis.QuantityOfInputs(mealNameQuantity, ingredient1NameQuantity, ingredient2NameQuantity, ingredient3NameQuantity, ingredient4NameQuantity, ingredient5NameQuantity) VALUES(
1,1,2,2,1,1);


DROP TABLE IF EXISTS ListOfMeals;

CREATE TABLE `ListOfMeals` (
  mealName VARCHAR(40) NOT NULL,
  ingredient1Name VARCHAR(40) NOT NULL,
  ingredient2Name VARCHAR(40) NOT NULL,
  ingredient3Name VARCHAR(40) NOT NULL,
  ingredient4Name VARCHAR(40) NOT NULL,
  ingredient5Name VARCHAR(40) NOT NULL
);


INSERT INTO regis.ListOfMeals(mealName, ingredient1Name, ingredient2Name, ingredient3Name, ingredient4Name, ingredient5Name) VALUES(
"Balenos Meal","Beer","Cheese Gratin","Meat Croquette","Smoked Fish Steak","Stir-Fried Vegetables");

INSERT INTO regis.ListOfMeals(mealName, ingredient1Name, ingredient2Name, ingredient3Name, ingredient4Name, ingredient5Name) VALUES(
"Calpheon Meal","Cheese Pie","Fish Fillet Salad","Meat Pasta","Milk Tea","Soft Bread");

INSERT INTO regis.ListOfMeals(mealName, ingredient1Name, ingredient2Name, ingredient3Name, ingredient4Name, ingredient5Name) VALUES(
"Kamasylvia Meal","Coconut Pasta","Fig Pie","Fruit Wine","Rainbow Button Cheese Melt","Rainbow Button Mushroom Sandwich");

INSERT INTO regis.ListOfMeals(mealName, ingredient1Name, ingredient2Name, ingredient3Name, ingredient4Name, ingredient5Name) VALUES(
"Margoria Seafood Meal","Butter-Roasted Lobster","Fruit Wine","Pan-Fried Oyster","Prawn Salad","Steamed Prawn");

INSERT INTO regis.ListOfMeals(mealName, ingredient1Name, ingredient2Name, ingredient3Name, ingredient4Name, ingredient5Name) VALUES(
"Mediah Meal","Dark Pudding","Exotic Herbal Wine","Grilled Sausage","Lean Meat Salad","Oatmeal");

INSERT INTO regis.ListOfMeals(mealName, ingredient1Name, ingredient2Name, ingredient3Name, ingredient4Name, ingredient5Name) VALUES(
"Serendia Meal","Boiled Bird Eggs","Fruit Wine","Ham Sandwich","Honeycomb Cookie","Meat Pie");

INSERT INTO regis.ListOfMeals(mealName, ingredient1Name, ingredient2Name, ingredient3Name, ingredient4Name, ingredient5Name) VALUES(
"Special Arehaza Meal","Coconut Cocktail","Coconut Fried Fish","Coconut Pasta","Meat Stew","Steak");

INSERT INTO ListOfMeals(mealName, ingredient1Name, ingredient2Name, ingredient3Name, ingredient4Name, ingredient5Name) VALUES(
"Special Drieghanese Meal","Ghormeh Sabzi","Honey Wine","Roast Marmot","Skewered Llama Cheese Melt","Stir-Fried Bracken");

INSERT INTO ListOfMeals(mealName, ingredient1Name, ingredient2Name, ingredient3Name, ingredient4Name, ingredient5Name) VALUES(
"Valencia Meal","Couscous","Date Palm Wine","Fig Pie","King of Jungle Hamburg","Teff Sandwich");
  


