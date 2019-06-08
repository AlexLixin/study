/************************************************************************
 *
 * Initial Creation:
 *    Author      LXI
 *    Created on  May 29, 2019
 *
 ************************************************************************/
package xml;

//: xml/People.java
//{Requires: nu.xom.Node; You must install
//the XOM library from http://www.xom.nu }
//{RunFirst: Person}
import nu.xom.*;
import java.util.*;

public class People extends ArrayList<Person> {
    /**
     * COMMENT - Add concise description of the purpose of this field.
     *           Description should go beyond the field's name.
     *
     * Comment for <code>serialVersionUID</code>
     */
    private static final long serialVersionUID = 1L;

    public People(String fileName) throws Exception {
        Document doc = new Builder().build(fileName);
        Elements elements = doc.getRootElement().getChildElements();
        for (int i = 0; i < elements.size(); i++)
            add(new Person(elements.get(i)));
    }

    public static void main(String[] args) throws Exception {
        People p = new People("People.xml");
        System.out.println(p);
    }
} /* Output:
  [Dr. Bunsen Honeydew, Gonzo The Great, Phillip J. Fry]
  *///:~