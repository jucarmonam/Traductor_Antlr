// Generated from C:/Users/carju/Desktop/LenguajesProgramacion/AntlrFolder/traductor/grammar\MyGrammar.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MyGrammarParser}.
 */
public interface MyGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#inicio}.
	 * @param ctx the parse tree
	 */
	void enterInicio(MyGrammarParser.InicioContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#inicio}.
	 * @param ctx the parse tree
	 */
	void exitInicio(MyGrammarParser.InicioContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#estructura}.
	 * @param ctx the parse tree
	 */
	void enterEstructura(MyGrammarParser.EstructuraContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#estructura}.
	 * @param ctx the parse tree
	 */
	void exitEstructura(MyGrammarParser.EstructuraContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#funcion}.
	 * @param ctx the parse tree
	 */
	void enterFuncion(MyGrammarParser.FuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#funcion}.
	 * @param ctx the parse tree
	 */
	void exitFuncion(MyGrammarParser.FuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#retornar}.
	 * @param ctx the parse tree
	 */
	void enterRetornar(MyGrammarParser.RetornarContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#retornar}.
	 * @param ctx the parse tree
	 */
	void exitRetornar(MyGrammarParser.RetornarContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(MyGrammarParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(MyGrammarParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(MyGrammarParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(MyGrammarParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#comands}.
	 * @param ctx the parse tree
	 */
	void enterComands(MyGrammarParser.ComandsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#comands}.
	 * @param ctx the parse tree
	 */
	void exitComands(MyGrammarParser.ComandsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#comand}.
	 * @param ctx the parse tree
	 */
	void enterComand(MyGrammarParser.ComandContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#comand}.
	 * @param ctx the parse tree
	 */
	void exitComand(MyGrammarParser.ComandContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#leer}.
	 * @param ctx the parse tree
	 */
	void enterLeer(MyGrammarParser.LeerContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#leer}.
	 * @param ctx the parse tree
	 */
	void exitLeer(MyGrammarParser.LeerContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#idr}.
	 * @param ctx the parse tree
	 */
	void enterIdr(MyGrammarParser.IdrContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#idr}.
	 * @param ctx the parse tree
	 */
	void exitIdr(MyGrammarParser.IdrContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#imprimir}.
	 * @param ctx the parse tree
	 */
	void enterImprimir(MyGrammarParser.ImprimirContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#imprimir}.
	 * @param ctx the parse tree
	 */
	void exitImprimir(MyGrammarParser.ImprimirContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#imprimir_}.
	 * @param ctx the parse tree
	 */
	void enterImprimir_(MyGrammarParser.Imprimir_Context ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#imprimir_}.
	 * @param ctx the parse tree
	 */
	void exitImprimir_(MyGrammarParser.Imprimir_Context ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(MyGrammarParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(MyGrammarParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#call_funcion}.
	 * @param ctx the parse tree
	 */
	void enterCall_funcion(MyGrammarParser.Call_funcionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#call_funcion}.
	 * @param ctx the parse tree
	 */
	void exitCall_funcion(MyGrammarParser.Call_funcionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(MyGrammarParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(MyGrammarParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(MyGrammarParser.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(MyGrammarParser.AsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#asignacion_id}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion_id(MyGrammarParser.Asignacion_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#asignacion_id}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion_id(MyGrammarParser.Asignacion_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#valor}.
	 * @param ctx the parse tree
	 */
	void enterValor(MyGrammarParser.ValorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#valor}.
	 * @param ctx the parse tree
	 */
	void exitValor(MyGrammarParser.ValorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#si}.
	 * @param ctx the parse tree
	 */
	void enterSi(MyGrammarParser.SiContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#si}.
	 * @param ctx the parse tree
	 */
	void exitSi(MyGrammarParser.SiContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#si_no}.
	 * @param ctx the parse tree
	 */
	void enterSi_no(MyGrammarParser.Si_noContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#si_no}.
	 * @param ctx the parse tree
	 */
	void exitSi_no(MyGrammarParser.Si_noContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#func_id}.
	 * @param ctx the parse tree
	 */
	void enterFunc_id(MyGrammarParser.Func_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#func_id}.
	 * @param ctx the parse tree
	 */
	void exitFunc_id(MyGrammarParser.Func_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#par_fun}.
	 * @param ctx the parse tree
	 */
	void enterPar_fun(MyGrammarParser.Par_funContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#par_fun}.
	 * @param ctx the parse tree
	 */
	void exitPar_fun(MyGrammarParser.Par_funContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#mientras}.
	 * @param ctx the parse tree
	 */
	void enterMientras(MyGrammarParser.MientrasContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#mientras}.
	 * @param ctx the parse tree
	 */
	void exitMientras(MyGrammarParser.MientrasContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#hacer_mientras}.
	 * @param ctx the parse tree
	 */
	void enterHacer_mientras(MyGrammarParser.Hacer_mientrasContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#hacer_mientras}.
	 * @param ctx the parse tree
	 */
	void exitHacer_mientras(MyGrammarParser.Hacer_mientrasContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#para}.
	 * @param ctx the parse tree
	 */
	void enterPara(MyGrammarParser.ParaContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#para}.
	 * @param ctx the parse tree
	 */
	void exitPara(MyGrammarParser.ParaContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#seleccionar}.
	 * @param ctx the parse tree
	 */
	void enterSeleccionar(MyGrammarParser.SeleccionarContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#seleccionar}.
	 * @param ctx the parse tree
	 */
	void exitSeleccionar(MyGrammarParser.SeleccionarContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#casos}.
	 * @param ctx the parse tree
	 */
	void enterCasos(MyGrammarParser.CasosContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#casos}.
	 * @param ctx the parse tree
	 */
	void exitCasos(MyGrammarParser.CasosContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#romper}.
	 * @param ctx the parse tree
	 */
	void enterRomper(MyGrammarParser.RomperContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#romper}.
	 * @param ctx the parse tree
	 */
	void exitRomper(MyGrammarParser.RomperContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(MyGrammarParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(MyGrammarParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#operador_binario}.
	 * @param ctx the parse tree
	 */
	void enterOperador_binario(MyGrammarParser.Operador_binarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#operador_binario}.
	 * @param ctx the parse tree
	 */
	void exitOperador_binario(MyGrammarParser.Operador_binarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#operador_neg}.
	 * @param ctx the parse tree
	 */
	void enterOperador_neg(MyGrammarParser.Operador_negContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#operador_neg}.
	 * @param ctx the parse tree
	 */
	void exitOperador_neg(MyGrammarParser.Operador_negContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#primitive}.
	 * @param ctx the parse tree
	 */
	void enterPrimitive(MyGrammarParser.PrimitiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#primitive}.
	 * @param ctx the parse tree
	 */
	void exitPrimitive(MyGrammarParser.PrimitiveContext ctx);
}