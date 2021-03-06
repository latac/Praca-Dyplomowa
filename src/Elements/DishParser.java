package Elements;

public class DishParser {
    public String createSaveQuery(Dish article) {
        String query = "";

        /**
         * Dodaj do tabeli "articles" wartości id, title i text.
         * id jest nullem, ponieważ pole id jest autoinkrementowane
         * przez bazę danych.
         * INSERT INTO articles VALUES (NULL, 'title', 'text');
         */
        return "insert into `dish` VALUES (null, ?)";

    }

    public String pobierzWszystkie() {
        return "select * from `dish`";
    }

    public String pobierzJeden() {
        return "select * from `dish` where id = ?";
    }

    public String dodajProduktDoDania() {
        return "insert into `dishingredients` VALUES (?, ?, ?)";
    }
    public String usunProduktZDania() {
        return "delete from `dishingredients` where idDish = ? and idProduct = ?";
    }

    public String UsunPowiazane() {
        return "delete from `dishingredients` where idDish = ?";
    }

    public String Usun() {
        return "delete from `dish` where id = ?";
    }


    public String Edytuj() {
        return "update `dish` SET name = ? where id = ?";
    }
    public String PobierzDaniaZPosilku(){
        return "select d.* from mealingredients as mi left join dish as d on mi.idDish = d.id left join meal m on mi.idMeal = m.id where m.id = ?";
    }
}
