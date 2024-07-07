package simple_formal_deep_concepts;

/*
 * more info: https://stackoverflow.com/questions/70684085/where-is-definition-of-method-java-lang-object-initv
 * and: https://docs.oracle.com/en/java/javase/11/tools/javap.html#GUID-BE20562C-912A-4F91-85CF-24909F212D7F
 */

// https://www.quora.com/Can-we-call-the-constructor-of-a-class-more-than-once-on-an-object-in-Java
//Just because you said "on an object in Java", I would say NO.
//
//A constructor is called only once per object instance.
//
//
//        Although, you may choose to call the constructor within the same class. You will have to call it with new key word. This will essentially create a new object instance and the constructor would be invoked by new instance. So we have two Objects here not ONE.
//
//Also, I have seen people saying we call constructor with new key word but essentially we only give an instruction to JVM to invoke a specific constructor while creating the object instance and it is JVM who actually calls the constructor.
//
//You as a developer can never "call" a constructor, but can call a trigger to "invoke" it. Calling a constructor is not as simple as calling a method in Java. JVM has to do many tasks before invoking it, a few of them would be (not in the same sequence):
//
//Locating and Loading the class via a Class loader
//        Evaluating required memory
//        Allocating the required memory
//        Invoking constructor
//        Etc.
//
//P.S: I am assuming her ewe don't want to call the overloaded constructor, which we can do using this(params...);
public class JavaClassLoaders {
    private int outerVal;
    private InnerJavaLoader innerJavaLoader;
    JavaClassLoaders(){
        //new JavaClassLoaders(5);
        //this(10);
        //System.out.println("Hadush Hailu!");

        //this.a = 20;
    }

    public static  class StaticInnerLoader{

    }
    public class InnerJavaLoader{
        private int innerVal = 3;
        InnerJavaLoader(){
            //this.innerVal = innerVal;
        }

        public int getInnerVal() {
            return innerVal;
        }
    }
    protected JavaClassLoaders(int a){
        this.outerVal = a;
        //innerJavaLoader = new InnerJavaLoader(30);
        //System.out.println("One argument constructor: " + a);
    }

    public int getOuterVal(){
        //new JavaClassLoaders();
        return outerVal;
    }

    public int getInnerVal(){
        return innerJavaLoader.getInnerVal();
    }

    public static void getClassName(){
        //System.out.println("Class Name: JavaClassLoader");
    }
    public static void main(String[] args) {
//        JavaClassLoaders javaClassLoaders = new JavaClassLoaders();
//        int oVal = javaClassLoaders.getOuterVal();
//        int iVal = javaClassLoaders.getInnerVal();
//        System.out.println(oVal + iVal);
//        System.out.println(javaClassLoaders);
//
//        JavaClassLoaders javaClassLoaders1 = new JavaClassLoaders();
//        int oVal1 = javaClassLoaders1.getOuterVal();
//        int iVal1 = javaClassLoaders1.getInnerVal();
//        System.out.println(javaClassLoaders1);
//
//        System.out.println(oVal1 + iVal1);
//
//        JavaClassLoaders.getClassName();
        JavaClassLoaders javaClassLoaders = new JavaClassLoaders();
        int iVal = javaClassLoaders.getOuterVal();
        System.out.println(iVal);
        JavaClassLoaders javaClassLoaders1 = new JavaClassLoaders();
        JavaClassLoaders.InnerJavaLoader innerJavaLoader = javaClassLoaders1.new InnerJavaLoader();

        JavaClassLoaders.StaticInnerLoader staticInnerLoader= new StaticInnerLoader();
    }
}
