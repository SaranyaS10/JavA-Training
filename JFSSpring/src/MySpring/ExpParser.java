package MySpring;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class ExpParser {

	public static void main( String[] args ) {
	ExpressionParser expressionParser = new SpelExpressionParser();
	Expression expression =  expressionParser.parseExpression("Any string");
	String result =  (String) expression.getValue();
    System.out.println(result);
	}
}
