import java.util.HashMap;

public class traductor extends MyGrammarBaseListener{
   /** Transalte to c++ */


    private int tabs = 0;
    private HashMap<String, String> primi = new HashMap<>();
    private HashMap<String, String> booleanos = new HashMap<>();
    private boolean entraPara = false;
    private boolean asigPara = false;

    public void cambiarTab(boolean aumenta){
       tabs = aumenta ? tabs+1 : tabs-1;
    }

    public void imprimirTab(){
        for(int i = 0; i < tabs;  i++){
            System.out.print("\t");
        }
    }

    @Override
    public void enterInicio(MyGrammarParser.InicioContext ctx) {
        System.out.println("#include <bits/stdc++.h>");
        System.out.println("using namespace std;");
        System.out.println();
        primi.put("booleano", "bool");
        primi.put("caracter", "char");
        primi.put("entero", "int");
        primi.put("real", "float");
        primi.put("cadena", "string");
        booleanos.put("verdadero", "true");
        booleanos.put("falso", "false");
    }

    @Override public void enterEstructura(MyGrammarParser.EstructuraContext ctx) {
        if(ctx.ID()!=null){
            String id = ctx.ID().getText();
            System.out.println("struct "+ id + "{");
            cambiarTab(true);
        }
    }

    @Override
    public void exitEstructura(MyGrammarParser.EstructuraContext ctx) {
        System.out.println("};");
        System.out.println();
        cambiarTab(false);
    }

    @Override
    public void enterDeclaractionEstruct(MyGrammarParser.DeclaractionEstructContext ctx) {
        String type = ctx.type().getText();
        if(primi.containsKey(type)){
            type = primi.get(type);
        }
        imprimirTab();
        System.out.print(type + " ");
        if(ctx.ID(0) != null){
            System.out.print(ctx.ID(0));
            for (int i = 1; i < ctx.ID().size(); i++){
                System.out.print(", "+ctx.ID(i));
            }
            System.out.println(";");
        }
    }

    @Override
    public void exitDeclaractionEstruct(MyGrammarParser.DeclaractionEstructContext ctx) {
    }

    @Override
    public void enterFuncion(MyGrammarParser.FuncionContext ctx) {
        String type = ctx.type().getText();
        if(primi.containsKey(type)){
            type = primi.get(type);
        }
        System.out.print(type + " " + ctx.ID() + "(");
        cambiarTab(true);
    }

    @Override
    public void exitFuncion(MyGrammarParser.FuncionContext ctx) {
        System.out.println("}");
        System.out.println();
        cambiarTab(false);
    }

    @Override
    public void enterParameters(MyGrammarParser.ParametersContext ctx) {
        if(ctx.type().size() > 0){
            String t = ctx.type(0).getText();
            if(primi.containsKey(t)){
                t = primi.get(t);
            }
            System.out.print(t + " " + ctx.ID(0));
            for(int i = 1; i < ctx.type().size(); i++){
                String type = ctx.type(i).getText();
                if(primi.containsKey(type)){
                    type = primi.get(type);
                }
                System.out.print(", " + type + " " + ctx.ID(i));
            }
        }
        System.out.println(") " + "{");
    }

    @Override
    public void exitParameters(MyGrammarParser.ParametersContext ctx) {    }

    @Override
    public void enterRetornar(MyGrammarParser.RetornarContext ctx) {
        String valor = ctx.valor().getText();
        if(booleanos.containsKey(valor)){
            valor = booleanos.get(valor);
        }
        imprimirTab();
        System.out.println("return " + valor+";");
    }

    @Override
    public void exitRetornar(MyGrammarParser.RetornarContext ctx) {
        super.exitRetornar(ctx);
    }

    @Override
    public void enterMain(MyGrammarParser.MainContext ctx) {
        System.out.println("int main() {");
        cambiarTab(true);
    }

    @Override
    public void exitMain(MyGrammarParser.MainContext ctx) {
        System.out.println("}");
        cambiarTab(false);
    }

    @Override
    public void enterComands(MyGrammarParser.ComandsContext ctx) {

    }

    @Override
    public void exitComands(MyGrammarParser.ComandsContext ctx) {

    }

    @Override
    public void enterComand(MyGrammarParser.ComandContext ctx) {
        entraPara = false;
    }

    @Override
    public void exitComand(MyGrammarParser.ComandContext ctx) {
        entraPara = false;
    }

    @Override
    public void enterLeer(MyGrammarParser.LeerContext ctx) {
        imprimirTab();
        System.out.println("cin>>"+ctx.idr().getText()+";");
    }

    @Override
    public void exitLeer(MyGrammarParser.LeerContext ctx) {

    }

    @Override
    public void enterImprimir(MyGrammarParser.ImprimirContext ctx) {
        imprimirTab();
        System.out.print("cout");
    }

    @Override
    public void exitImprimir(MyGrammarParser.ImprimirContext ctx) {
        System.out.println("<<endl;");
    }

    @Override
    public void enterImprimir_(MyGrammarParser.Imprimir_Context ctx) {
       for(int i = 0; i < ctx.valor().size(); i++){
           System.out.print("<<" + ctx.valor(i).getText());
       }
    }

    @Override
    public void exitImprimir_(MyGrammarParser.Imprimir_Context ctx) {
        super.exitImprimir_(ctx);
    }

    @Override
    public void enterDeclaration(MyGrammarParser.DeclarationContext ctx) {
        if(!entraPara){
            if(!asigPara){
                imprimirTab();
            }
            if(ctx.primitive() != null){
                for(int i = 0; i < ctx.ID().size(); i++){
                    if(i == 0){
                        String primitivo = primi.get(ctx.primitive().getText());
                        String id = ctx.ID(i).getText();
                        if(ctx.asignacion(i).valor() != null){
                            String v = ctx.asignacion(i).valor().getText();
                            if(booleanos.containsKey(v)){
                                v = booleanos.get(v);
                            }
                            System.out.print(primitivo + " " + id + " = " + v);
                        }else{
                            System.out.print(primitivo + " " + id);
                        }
                    }else{
                        String ide = ctx.ID(i).getText();
                        if(ctx.asignacion(i).valor() != null){
                            String valor = ctx.asignacion(i).valor().getText();
                            if(booleanos.containsKey(valor)){
                                valor = booleanos.get(valor);
                            }
                            System.out.print(", " + ide  + " = " + valor);
                        }else{
                            System.out.print(", " + ide );
                        }
                    }
                }
            }else{
                String id = ctx.ID(0).getText();
                System.out.print(id);
            }
        }
    }

    @Override
    public void exitDeclaration(MyGrammarParser.DeclarationContext ctx) {
        if(asigPara){
            System.out.print(";");
        }
        if(!entraPara && !asigPara){
            System.out.println(";");
        }
    }

    @Override
    public void enterAsignacion_id(MyGrammarParser.Asignacion_idContext ctx) {
        if(!entraPara){
            if(ctx.valor() != null){
                if(ctx.ID().size() > 0){
                    for(int i = 0; i < ctx.ID().size(); i++){
                        System.out.print("." + ctx.ID(i));
                    }
                }
                String valor = ctx.valor().getText();
                if(booleanos.containsKey(valor)){
                    valor = booleanos.get(valor);
                }
                System.out.print(" = " + valor);
            }else{
                String id = ctx.ID(0).getText();
                System.out.print(" " + id);
            }
        }
    }

    @Override
    public void exitAsignacion_id(MyGrammarParser.Asignacion_idContext ctx) {
        super.exitAsignacion_id(ctx);
    }

    @Override
    public void enterValor(MyGrammarParser.ValorContext ctx) {
    }

    @Override
    public void exitValor(MyGrammarParser.ValorContext ctx) {
        super.exitValor(ctx);
    }

    @Override
    public void enterSi(MyGrammarParser.SiContext ctx) {
        imprimirTab();
        System.out.print("if (");
        for(int i = 0; i < ctx.valor().size(); i++){
            String op = "";
            if(ctx.operador_logico(i) != null){
                op = ctx.operador_logico(i).getText();
            }

            String v1 = ctx.valor(i).getText();
            if(booleanos.containsKey(v1)){
                v1 = booleanos.get(v1);
            }

            System.out.print(" " + v1 + " " + op);
        }
        System.out.println(") {");
        cambiarTab(true);
    }

    @Override
    public void exitSi(MyGrammarParser.SiContext ctx) {
        if(ctx.si_no() == null){
            cambiarTab(false);
            imprimirTab();
            System.out.println("}");
        }
    }

    @Override
    public void enterSi_no(MyGrammarParser.Si_noContext ctx) {
        if(ctx.comands() != null){
            cambiarTab(false);
            imprimirTab();
            System.out.println("} else {");
            cambiarTab(true);
        }
    }

    @Override
    public void exitSi_no(MyGrammarParser.Si_noContext ctx) {
        cambiarTab(false);
        imprimirTab();
        System.out.println("}");
    }

    @Override
    public void enterFunc_id(MyGrammarParser.Func_idContext ctx) {
        imprimirTab();
        System.out.print(ctx.ID() + "(");
    }

    @Override
    public void exitFunc_id(MyGrammarParser.Func_idContext ctx) {
        System.out.println(");");
    }

    @Override
    public void enterPar_fun(MyGrammarParser.Par_funContext ctx) {
        if(ctx.valor() != null){
            String valor = ctx.valor(0).getText();
            System.out.print(valor);
            for(int i = 1; i < ctx.valor().size(); i++){
                System.out.print(", " + ctx.valor(i).getText());
            }
        }
    }

    @Override
    public void exitPar_fun(MyGrammarParser.Par_funContext ctx) {
    }

    @Override
    public void enterMientras(MyGrammarParser.MientrasContext ctx) {
        imprimirTab();
        System.out.print("while (");
        for(int i = 0; i < ctx.valor().size(); i++){
            String op = "";
            if(ctx.operador_logico(i) != null){
                op = ctx.operador_logico(i).getText();
            }

            String v1 = ctx.valor(i).getText();
            if(booleanos.containsKey(v1)){
                v1 = booleanos.get(v1);
            }

            System.out.print(" " + v1 + " " + op);
        }
        System.out.println(") {");
        cambiarTab(true);
    }

    @Override
    public void exitMientras(MyGrammarParser.MientrasContext ctx) {
        cambiarTab(false);
        imprimirTab();
        System.out.println("}");
    }

    @Override
    public void enterHacer_mientras(MyGrammarParser.Hacer_mientrasContext ctx){
        imprimirTab();
        System.out.println("do{");
        cambiarTab(true);
    }

    @Override
    public void exitHacer_mientras(MyGrammarParser.Hacer_mientrasContext ctx){
        cambiarTab(false);
        imprimirTab();
        System.out.print("}while ( ");
        for(int i = 0; i < ctx.valor().size(); i++){
            String op = "";
            if(ctx.operador_logico(i) != null){
                op = ctx.operador_logico(i).getText();
            }

            String v1 = ctx.valor(i).getText();
            if(booleanos.containsKey(v1)){
                v1 = booleanos.get(v1);
            }

            System.out.print(" " + v1 + " " + op);
        }
        System.out.println(" );");
    }

    @Override public void enterPara(MyGrammarParser.ParaContext ctx) {
        entraPara = false;
        imprimirTab();
        System.out.print("for(");
        asigPara=true;
        enterDeclaration(ctx.declaration());
        if(ctx.declaration().asignacion_id() != null){
            enterAsignacion_id(ctx.declaration().asignacion_id());
        }
        exitDeclaration(ctx.declaration());
        for(int i = 0; i < ctx.valor().size(); i++){
            String op = "";
            if(ctx.operador_logico(i) != null){
                op = ctx.operador_logico(i).getText();
            }

            String v1 = ctx.valor(i).getText();
            if(booleanos.containsKey(v1)){
                v1 = booleanos.get(v1);
            }
            System.out.print(" " + v1 + " " + op);
        }
        String aumento = "";
        if(ctx.INT() != null){
            aumento = ctx.INT().getText();
        }else{
            aumento = ctx.ID().getText();
        }
        System.out.println(";"+ " " + ctx.declaration().ID(0).getText() + " += " + aumento +"){");
        entraPara = true;
        asigPara=false;
        cambiarTab(true);
    }

    @Override public void exitPara(MyGrammarParser.ParaContext ctx) {
        cambiarTab(false);
        imprimirTab();
        System.out.println("}");
        entraPara = false;
    }

    @Override public void enterSeleccionar(MyGrammarParser.SeleccionarContext ctx) {
        imprimirTab();
        String valor = ctx.valor().getText();
        if(booleanos.containsKey(valor)){
            valor = booleanos.get(valor);
        }
        System.out.println("switch (" + valor + ") {");
        cambiarTab(true);
    }

    @Override public void exitSeleccionar(MyGrammarParser.SeleccionarContext ctx) {
        cambiarTab(false);
        imprimirTab();
        System.out.println("}");
    }

    @Override public void enterCasos(MyGrammarParser.CasosContext ctx) {
    }

    @Override public void exitCasos(MyGrammarParser.CasosContext ctx) {
    }

    @Override public void enterCasos_(MyGrammarParser.Casos_Context ctx) {
        imprimirTab();
        System.out.println("case " + ctx.valor().getText() + ":");
        cambiarTab(true);
    }

    @Override public void exitCasos_(MyGrammarParser.Casos_Context ctx) {
        cambiarTab(false);
    }

    @Override public void enterDefecto(MyGrammarParser.DefectoContext ctx) {
        imprimirTab();
        System.out.println("default:");
    }

    @Override public void exitDefecto(MyGrammarParser.DefectoContext ctx) { }

    @Override public void enterRomper(MyGrammarParser.RomperContext ctx) {
        imprimirTab();
        System.out.println("break;");
    }

    @Override public void exitRomper(MyGrammarParser.RomperContext ctx) { }
}
