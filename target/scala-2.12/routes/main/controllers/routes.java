
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/webapps/lab4solution/conf/routes
// @DATE:Sun Mar 04 14:36:31 GMT 2018

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseShoppingCtrl ShoppingCtrl = new controllers.ReverseShoppingCtrl(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAdminProductCtrl AdminProductCtrl = new controllers.ReverseAdminProductCtrl(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseProductCtrl ProductCtrl = new controllers.ReverseProductCtrl(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseShoppingCtrl ShoppingCtrl = new controllers.javascript.ReverseShoppingCtrl(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAdminProductCtrl AdminProductCtrl = new controllers.javascript.ReverseAdminProductCtrl(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseProductCtrl ProductCtrl = new controllers.javascript.ReverseProductCtrl(RoutesPrefix.byNamePrefix());
  }

}
