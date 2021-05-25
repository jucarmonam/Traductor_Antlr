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
	 * Enter a parse tree produced by {@link MyGrammarParser#estruct}.
	 * @param ctx the parse tree
	 */
	void enterEstruct(MyGrammarParser.EstructContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#estruct}.
	 * @param ctx the parse tree
	 */
	void exitEstruct(MyGrammarParser.EstructContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(MyGrammarParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(MyGrammarParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#return}.
	 * @param ctx the parse tree
	 */
	void enterReturn(MyGrammarParser.ReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#return}.
	 * @param ctx the parse tree
	 */
	void exitReturn(MyGrammarParser.ReturnContext ctx);
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
	 * Enter a parse tree produced by {@link MyGrammarParser#read}.
	 * @param ctx the parse tree
	 */
	void enterRead(MyGrammarParser.ReadContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#read}.
	 * @param ctx the parse tree
	 */
	void exitRead(MyGrammarParser.ReadContext ctx);
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
	 * Enter a parse tree produced by {@link MyGrammarParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(MyGrammarParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(MyGrammarParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#print_}.
	 * @param ctx the parse tree
	 */
	void enterPrint_(MyGrammarParser.Print_Context ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#print_}.
	 * @param ctx the parse tree
	 */
	void exitPrint_(MyGrammarParser.Print_Context ctx);
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
	 * Enter a parse tree produced by {@link MyGrammarParser#call_function}.
	 * @param ctx the parse tree
	 */
	void enterCall_function(MyGrammarParser.Call_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#call_function}.
	 * @param ctx the parse tree
	 */
	void exitCall_function(MyGrammarParser.Call_functionContext ctx);
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
	 * Enter a parse tree produced by {@link MyGrammarParser#id_pos_estruct}.
	 * @param ctx the parse tree
	 */
	void enterId_pos_estruct(MyGrammarParser.Id_pos_estructContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#id_pos_estruct}.
	 * @param ctx the parse tree
	 */
	void exitId_pos_estruct(MyGrammarParser.Id_pos_estructContext ctx);
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
	 * Enter a parse tree produced by {@link MyGrammarParser#if}.
	 * @param ctx the parse tree
	 */
	void enterIf(MyGrammarParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#if}.
	 * @param ctx the parse tree
	 */
	void exitIf(MyGrammarParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#else}.
	 * @param ctx the parse tree
	 */
	void enterElse(MyGrammarParser.ElseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#else}.
	 * @param ctx the parse tree
	 */
	void exitElse(MyGrammarParser.ElseContext ctx);
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
	 * Enter a parse tree produced by {@link MyGrammarParser#while}.
	 * @param ctx the parse tree
	 */
	void enterWhile(MyGrammarParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#while}.
	 * @param ctx the parse tree
	 */
	void exitWhile(MyGrammarParser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#do_while}.
	 * @param ctx the parse tree
	 */
	void enterDo_while(MyGrammarParser.Do_whileContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#do_while}.
	 * @param ctx the parse tree
	 */
	void exitDo_while(MyGrammarParser.Do_whileContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#for}.
	 * @param ctx the parse tree
	 */
	void enterFor(MyGrammarParser.ForContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#for}.
	 * @param ctx the parse tree
	 */
	void exitFor(MyGrammarParser.ForContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#switch}.
	 * @param ctx the parse tree
	 */
	void enterSwitch(MyGrammarParser.SwitchContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#switch}.
	 * @param ctx the parse tree
	 */
	void exitSwitch(MyGrammarParser.SwitchContext ctx);
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