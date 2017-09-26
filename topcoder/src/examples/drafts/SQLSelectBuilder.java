package examples.drafts;

/**
 * Created by vitalii.shevelin on 02.08.2016.
 */
public class SQLSelectBuilder {
    private StringBuilder startClause = new StringBuilder();
    private StringBuilder fieldsClause = new StringBuilder();
    private StringBuilder fromClause = new StringBuilder();
    private StringBuilder joinClause = new StringBuilder();
    private StringBuilder whereClause = new StringBuilder();
    private StringBuilder orderByClause = new StringBuilder();

    private SQLSelectBuilder(String expression){
        startClause.append(expression);
    }

    public static SQLSelectBuilder select() {
        return new SQLSelectBuilder("SELECT ");
    }

    public SQLSelectBuilder from(String table) {
        fieldsClause.append(table + ".*" );
        fromClause.append(" FROM " + table);
        return this;
    }

    public SQLSelectBuilder join(String table, String refField, String keyField) {
        fieldsClause.append(", " + table + ".*");
        joinClause.append(" JOIN " + table + " ON " + refField + " = " + table + "." + keyField);
        return this;
    }

    public SQLSelectBuilder where(String expression) {
        whereClause.append(" WHERE " + expression);
        return this;
    }

    public SQLSelectBuilder orderAsc(String column) {
        orderByClause.append(" ORDER BY " + column);
        return this;
    }



    public SQLSelectBuilder from(String[] tables) {
        for(String table : tables) {
            from(table);
        }
        return this;
    }

    public static void main(String[] args) {
        String q1 = SQLSelectBuilder.select()
                .from("COURSES")
                    .join("STATUS", "STATUS_ID", "ID")
                    .join("CONTENT_GROUP", "CONTENT_GROUP_ID", "ID")
                .build();

        String q2 = SQLSelectBuilder.select()
                .from("COURSES")
                    .join("STATUS", "STATUS_ID", "ID")
                    .join("COURSE_ORDER", "ID", "COURSE_ID")
                .where("COURSE_ORDER.COURSE_GROUP_ID = 1")
                .orderAsc("COURSE_ORDER.ORDERINAL_NUMBER")
                .build();

        System.out.println(q1);
        System.out.println(q2);

    }

    private String build() {
        StringBuilder result = new StringBuilder();
        result.append(startClause).append(fieldsClause).append(fromClause).append(joinClause).append(whereClause).append(orderByClause);
        return result.toString();
    }


}
