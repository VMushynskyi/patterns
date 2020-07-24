package patterns.decorator;


import org.openqa.selenium.support.pagefactory.DefaultFieldDecorator;
import org.openqa.selenium.support.pagefactory.ElementLocator;
import org.openqa.selenium.support.pagefactory.ElementLocatorFactory;
import patterns.decorator.elements.Button;
import patterns.decorator.elements.PageElement;
import patterns.decorator.elements.TextInput;

import java.lang.reflect.Field;

public class ElementDecorator extends DefaultFieldDecorator {

  public ElementDecorator(ElementLocatorFactory factory) {
    super(factory);
  }

  @Override
  public Object decorate(ClassLoader loader, Field field){

    ElementLocator locator =factory.createLocator(field);

    if(Button.class.isAssignableFrom(field.getType())){
      final Button button = new Button(proxyForLocator(loader,locator));
      return button;
    }
    else if (TextInput.class.isAssignableFrom(field.getType())){
      final TextInput textInput = new TextInput(proxyForLocator(loader,locator));
      return textInput;
    }
    else if (PageElement.class.isAssignableFrom(field.getType())){
      final PageElement pageElement = new PageElement(proxyForLocator(loader,locator));
      return pageElement;
    }
    else {
      return super.decorate(loader,field);
    }
  }
}
