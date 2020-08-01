package com.processor;

import javax.annotation.processing.*;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.Modifier;
import javax.lang.model.element.PackageElement;
import javax.lang.model.element.TypeElement;
import javax.tools.Diagnostic;
import javax.tools.Diagnostic.Kind;
import javax.tools.JavaFileObject;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


//@SupportedAnnotationTypes({ "annotation.Getter" })
//@SupportedSourceVersion(SourceVersion.RELEASE_6)
public class GetterProcessor extends AbstractProcessor {
  @Override
  public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
//    processingEnv.getMessager().printMessage(Kind.WARNING, "Test");

//    for (Element element : roundEnv.getElementsAnnotatedWith(Getter.class)) {
//      if(element.getKind().isClass()){
//        for(Element enclosed : element.getEnclosedElements()){
//          if(enclosed.getKind().isField() & enclosed.getModifiers().contains(Modifier.PUBLIC)){
//
//          }
//        }
//      }
//    }
    for (Element element : roundEnv.getElementsAnnotatedWith(Getter.class)) {
      JavaFileObject builderClass = null;
      PackageElement packageElement = (PackageElement)element.getEnclosingElement();
      BufferedWriter bufferedWriter = null;
      try {
        String builderName = element.getSimpleName().toString() /*+ "Builder"*/;
        builderClass = processingEnv.getFiler().createSourceFile(builderName);
        bufferedWriter = new BufferedWriter(builderClass.openWriter());
//        bufferedWriter.append("package ");
//        bufferedWriter.append(packageElement.getQualifiedName().toString());
//        bufferedWriter.append(";");
//        bufferedWriter.newLine();
        if (element.getKind().isClass()) {
          for (Element enclosed : element.getEnclosedElements()) {
            if (enclosed.getKind().isField() & (enclosed.getModifiers().contains(Modifier.PUBLIC))) {
              bufferedWriter.newLine();
              bufferedWriter.newLine();
              bufferedWriter.append("public ");
              bufferedWriter.append(enclosed.asType().toString());
              bufferedWriter.append(builderName);
              bufferedWriter.append(" get");
              bufferedWriter.append(enclosed.getSimpleName().toString());
              bufferedWriter.append("(");
//              bufferedWriter.append(enclosed.asType().toString());
              bufferedWriter.append("){");
              bufferedWriter.newLine();
              bufferedWriter.append("return this.object.");
              bufferedWriter.append(enclosed.getSimpleName().toString());
//              bufferedWriter.append(" = ");
//              bufferedWriter.append("param;");
              bufferedWriter.newLine();
              bufferedWriter.append("}");
            }
          }
        }
        bufferedWriter.close();
      } catch (IOException e) {
        processingEnv.getMessager().printMessage(Diagnostic.Kind.ERROR, e.toString());
      }

    }
      return false;
  }

  @Override
  public Set<String> getSupportedAnnotationTypes() {
    return new HashSet<>(Arrays.asList("com.processor.Getter"));
  }

  @Override
  public SourceVersion getSupportedSourceVersion() {
    return SourceVersion.RELEASE_8;
  }
}