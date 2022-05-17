//package tacos;
//
//import java.sql.ResultSet;
//import java.sql.SQLException;
//
//public class JdbcTemplate {
//    private JdbcTemplate jdbc;
//    @Override
//    public Ingredient findOne(String id){
//        return jdbc.queryForObject(
//                "select id, name, type from Ingredient where id = ?", this::mapRowToIngredient, id);
//        )
//    }
//    private Ingredient mapRowToIngredient(ResultSet rs, int rowNum) throws SQLException {
//        return new Ingredient(
//                rs.getString("id"),
//                rs.getString("name"),
//                rs.getString()
//        )
//    }
//}
