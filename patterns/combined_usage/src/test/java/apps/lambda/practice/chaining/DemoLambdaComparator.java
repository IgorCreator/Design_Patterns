package apps.lambda.practice.chaining;

import apps.lambda.practice.chaining.func.Comparator;
import apps.lambda.practice.chaining.model.Person;
import org.junit.jupiter.api.Test;

import java.util.function.Function;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DemoLambdaComparator {

    @Test
    public void testComparatorByName(){
        Person mary = new Person("Mary", 28);
        Person john = new Person("John", 22);
        Person tom = new Person("Tom", 45);
        Person becky = new Person("Becky", 34);

        Comparator<Person> cmpName = (p1, p2) -> {
            String name1 = p1.getName();
            String name2 = p2.getName();
            return name1.compareTo(name2);
        };

        assertTrue(cmpName.compare(mary, john) > 0);
        assertTrue(cmpName.compare(tom, becky) > 0);
        assertFalse(cmpName.compare(john, tom) > 0);
    }

    @Test
    public void testComparatorByNameWithFunction(){
        Person mary = new Person("Mary", 28);
        Person john = new Person("John", 22);
        Person tom = new Person("Tom", 45);
        Person becky = new Person("Becky", 34);

        Function<Person, String> getName = p -> p.getName();

        Comparator<Person> cmpName = (p1, p2) -> {
            String name1 = getName.apply(p1);
            String name2 = getName.apply(p2);
            return name1.compareTo(name2);
        };

        assertTrue(cmpName.compare(mary, john) > 0);
        assertTrue(cmpName.compare(tom, becky) > 0);
        assertFalse(cmpName.compare(john, tom) > 0);
    }

    @Test
    public void testComparatorByNameWithStatic(){
        Person mary = new Person("Mary", 28);
        Person john = new Person("John", 22);
        Person tom = new Person("Tom", 45);
        Person becky = new Person("Becky", 34);

        Function<Person, String> getName = Person::getName;
        Comparator<Person> cmpName = Comparator.comparing(getName);

        assertTrue(cmpName.compare(mary, john) > 0);
        assertTrue(cmpName.compare(tom, becky) > 0);
        assertFalse(cmpName.compare(john, tom) > 0);
    }

    @Test
    public void testReversedComparator(){
        Person mary = new Person("Mary", 28);
        Person john = new Person("John", 22);
        Person tom = new Person("Tom", 45);
        Person becky = new Person("Becky", 34);

        Function<Person, String> getName = Person::getName;
        Comparator<Person> cmpName = Comparator.comparing(getName);
        Comparator<Person> cmpNameReversed = cmpName.reversed();

        assertFalse(cmpNameReversed.compare(mary, john) > 0);
        assertFalse(cmpNameReversed.compare(tom, becky) > 0);
        assertTrue(cmpNameReversed.compare(john, tom) > 0);
    }

    @Test
    public void testComparatorByAge(){
        Person mary = new Person("Mary", 28);
        Person john = new Person("John", 22);
        Person tom = new Person("Tom", 45);
        Person becky = new Person("Becky", 34);

        Function<Person, Integer> getAge = Person::getAge;
        Comparator<Person> cmpAge = Comparator.comparing(getAge);

        assertTrue(cmpAge.compare(mary, john) > 0);
        assertTrue(cmpAge.compare(tom, becky) > 0);
        assertFalse(cmpAge.compare(john, tom) > 0);
    }
}
