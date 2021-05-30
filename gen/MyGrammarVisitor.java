// Generated from C:/Users/chasj/Desktop/JuanPablo/Traductor_Antlr/grammar\MyGrammar.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MyGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MyGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#inicio}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInicio(MyGrammarParser.InicioContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#estructura}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEstructura(MyGrammarParser.EstructuraContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#declaractionEstruct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaractionEstruct(MyGrammarParser.DeclaractionEstructContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncion(MyGrammarParser.FuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#retornar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRetornar(MyGrammarParser.RetornarContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(MyGrammarParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(MyGrammarParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#comands}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComands(MyGrammarParser.ComandsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#comand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComand(MyGrammarParser.ComandContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#leer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeer(MyGrammarParser.LeerContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#idr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdr(MyGrammarParser.IdrContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#imprimir}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImprimir(MyGrammarParser.ImprimirContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#imprimir_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImprimir_(MyGrammarParser.Imprimir_Context ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(MyGrammarParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#call_funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall_funcion(MyGrammarParser.Call_funcionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(MyGrammarParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(MyGrammarParser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#asignacion_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion_id(MyGrammarParser.Asignacion_idContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#valor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValor(MyGrammarParser.ValorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#si}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSi(MyGrammarParser.SiContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#si_no}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSi_no(MyGrammarParser.Si_noContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#func_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_id(MyGrammarParser.Func_idContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#par_fun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPar_fun(MyGrammarParser.Par_funContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#mientras}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMientras(MyGrammarParser.MientrasContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#hacer_mientras}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHacer_mientras(MyGrammarParser.Hacer_mientrasContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#para}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPara(MyGrammarParser.ParaContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#seleccionar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeleccionar(MyGrammarParser.SeleccionarContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#casos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCasos(MyGrammarParser.CasosContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#casos_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCasos_(MyGrammarParser.Casos_Context ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#defecto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefecto(MyGrammarParser.DefectoContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#romper}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRomper(MyGrammarParser.RomperContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(MyGrammarParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#operador_binario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperador_binario(MyGrammarParser.Operador_binarioContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#operador_logico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperador_logico(MyGrammarParser.Operador_logicoContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#operador_neg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperador_neg(MyGrammarParser.Operador_negContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#primitive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitive(MyGrammarParser.PrimitiveContext ctx);
}