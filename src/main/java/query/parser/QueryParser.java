// Generated from D:/mitre/causality-query/src/main/java/query/parser\QueryParser.g4 by ANTLR 4.9.2

    package query.parser;
    import java.math.BigDecimal;
    import query.backtracking.*;
    import query.search.*;
    import executor.*;
    import java.util.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class QueryParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SEMICOLON=1, COMMA=2, ASTERISK=3, LEFTBRACKET=4, RIGHTBRACKET=5, LEFTBRACE=6, 
		RIGHTBRACE=7, LEFTSQUARE=8, RIGHTSQUARE=9, AND=10, OR=11, NOT=12, IN=13, 
		FROM=14, WITH=15, BACK=16, FORWARD=17, TRACK=18, SEARCH=19, AS=20, DISPLAY=21, 
		EXPORT=22, RETURN=23, SELECT=24, CONNECTDB=25, DB=26, WHERE=27, INCLUDE=28, 
		EXCLUDE=29, NODES=30, EDGES=31, LIMIT=32, TIME=33, STEP=34, MS=35, SECOND=36, 
		MINUTE=37, TYPE=38, NAME=39, PATH=40, DSTIP=41, DSTPORT=42, SRCIP=43, 
		SRCPORT=44, PID=45, EXENAME=46, EXEPATH=47, CMDLINE=48, OPTYPE=49, IDSTR=50, 
		SRCID=51, DSTID=52, STARTTIME=53, ENDTIME=54, AMOUNT=55, PROCESS=56, FILE=57, 
		NETWORK=58, READ=59, WRITE=60, EXECVE=61, NULL=62, ARROW=63, EQ=64, NEQ=65, 
		GT=66, GEQ=67, LT=68, LEQ=69, LIKE=70, UNION=71, INTERSECTION=72, DIFFERENCE=73, 
		LOGAND=74, LOGOR=75, INT=76, STRING=77, ID=78, NEWLINE=79, WS=80, COMMENT=81, 
		LINE_COMMENT=82;
	public static final int
		RULE_start = 0, RULE_connectStmt = 1, RULE_assignStmt = 2, RULE_searchStmt = 3, 
		RULE_displayStmt = 4, RULE_exportStmt = 5, RULE_nodeMatchTerm = 6, RULE_relatTerm = 7, 
		RULE_returnTerm = 8, RULE_nodeAttributes = 9, RULE_logicOpt = 10, RULE_relatConst = 11, 
		RULE_relatExpr = 12, RULE_dataSource = 13, RULE_graphExpr = 14, RULE_trackExpr = 15, 
		RULE_direction = 16, RULE_startTerm = 17, RULE_filterTerm = 18, RULE_typeFilterTerm = 19, 
		RULE_limitTerm = 20, RULE_constraintExpr = 21, RULE_expr = 22, RULE_binaryExpr = 23, 
		RULE_strId = 24, RULE_numId = 25, RULE_entityType = 26, RULE_optType = 27, 
		RULE_eqOp = 28, RULE_numOp = 29;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "connectStmt", "assignStmt", "searchStmt", "displayStmt", "exportStmt", 
			"nodeMatchTerm", "relatTerm", "returnTerm", "nodeAttributes", "logicOpt", 
			"relatConst", "relatExpr", "dataSource", "graphExpr", "trackExpr", "direction", 
			"startTerm", "filterTerm", "typeFilterTerm", "limitTerm", "constraintExpr", 
			"expr", "binaryExpr", "strId", "numId", "entityType", "optType", "eqOp", 
			"numOp"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "','", "'*'", "'('", "')'", "'{'", "'}'", "'['", "']'", 
			"'and'", "'or'", "'not'", "'in'", "'from'", "'with'", "'back'", "'forward'", 
			"'track'", "'search'", "'as'", "'display'", "'export'", "'return'", "'select'", 
			"'connectdb'", "'db'", "'where'", "'include'", "'exclude'", "'nodes'", 
			"'edges'", "'limit'", "'time'", "'step'", "'ms'", "'s'", "'m'", "'type'", 
			"'name'", "'path'", "'dstip'", "'dstport'", "'srcip'", "'srcport'", "'pid'", 
			"'exename'", "'exepath'", "'cmdline'", "'optype'", "'id'", "'srcid'", 
			"'dstid'", "'starttime'", "'endtime'", "'amount'", "'process'", "'file'", 
			"'network'", "'read'", "'write'", "'execve'", "'null'", "'->'", "'='", 
			"'!='", "'>'", "'>='", "'<'", "'<='", "'like'", "'|'", "'&'", "'-'", 
			"'&&'", "'||'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SEMICOLON", "COMMA", "ASTERISK", "LEFTBRACKET", "RIGHTBRACKET", 
			"LEFTBRACE", "RIGHTBRACE", "LEFTSQUARE", "RIGHTSQUARE", "AND", "OR", 
			"NOT", "IN", "FROM", "WITH", "BACK", "FORWARD", "TRACK", "SEARCH", "AS", 
			"DISPLAY", "EXPORT", "RETURN", "SELECT", "CONNECTDB", "DB", "WHERE", 
			"INCLUDE", "EXCLUDE", "NODES", "EDGES", "LIMIT", "TIME", "STEP", "MS", 
			"SECOND", "MINUTE", "TYPE", "NAME", "PATH", "DSTIP", "DSTPORT", "SRCIP", 
			"SRCPORT", "PID", "EXENAME", "EXEPATH", "CMDLINE", "OPTYPE", "IDSTR", 
			"SRCID", "DSTID", "STARTTIME", "ENDTIME", "AMOUNT", "PROCESS", "FILE", 
			"NETWORK", "READ", "WRITE", "EXECVE", "NULL", "ARROW", "EQ", "NEQ", "GT", 
			"GEQ", "LT", "LEQ", "LIKE", "UNION", "INTERSECTION", "DIFFERENCE", "LOGAND", 
			"LOGOR", "INT", "STRING", "ID", "NEWLINE", "WS", "COMMENT", "LINE_COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "QueryParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    private ExecutionContext exeCtx;

	    public QueryParser(TokenStream input, ExecutionContext extCtx) {
	        this(input);
	        this.exeCtx = extCtx;
	    }

	    private ConstraintExpression combine(ConstraintExpression i, ConstraintExpression e) {
	        if (i == null && e == null) return null;
	        else if (i == null) return new NotExpression(e);
	        else if (e == null) return i;
	        else return new AndExpression(i, new NotExpression(e));
	    }

	public QueryParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public LinkedList<QueryStatement> stmts = new LinkedList<>();
		public List<ConnectStmtContext> connectStmt() {
			return getRuleContexts(ConnectStmtContext.class);
		}
		public ConnectStmtContext connectStmt(int i) {
			return getRuleContext(ConnectStmtContext.class,i);
		}
		public List<AssignStmtContext> assignStmt() {
			return getRuleContexts(AssignStmtContext.class);
		}
		public AssignStmtContext assignStmt(int i) {
			return getRuleContext(AssignStmtContext.class,i);
		}
		public List<SearchStmtContext> searchStmt() {
			return getRuleContexts(SearchStmtContext.class);
		}
		public SearchStmtContext searchStmt(int i) {
			return getRuleContext(SearchStmtContext.class,i);
		}
		public List<DisplayStmtContext> displayStmt() {
			return getRuleContexts(DisplayStmtContext.class);
		}
		public DisplayStmtContext displayStmt(int i) {
			return getRuleContext(DisplayStmtContext.class,i);
		}
		public List<ExportStmtContext> exportStmt() {
			return getRuleContexts(ExportStmtContext.class);
		}
		public ExportStmtContext exportStmt(int i) {
			return getRuleContext(ExportStmtContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 19)) & ~0x3f) == 0 && ((1L << (_la - 19)) & ((1L << (SEARCH - 19)) | (1L << (DISPLAY - 19)) | (1L << (EXPORT - 19)) | (1L << (CONNECTDB - 19)) | (1L << (ID - 19)))) != 0)) {
				{
				setState(65);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CONNECTDB:
					{
					setState(60);
					connectStmt();
					}
					break;
				case ID:
					{
					setState(61);
					assignStmt();
					}
					break;
				case SEARCH:
					{
					setState(62);
					searchStmt();
					}
					break;
				case DISPLAY:
					{
					setState(63);
					displayStmt();
					}
					break;
				case EXPORT:
					{
					setState(64);
					exportStmt();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConnectStmtContext extends ParserRuleContext {
		public Token STRING;
		public TerminalNode CONNECTDB() { return getToken(QueryParser.CONNECTDB, 0); }
		public TerminalNode STRING() { return getToken(QueryParser.STRING, 0); }
		public TerminalNode SEMICOLON() { return getToken(QueryParser.SEMICOLON, 0); }
		public ConnectStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_connectStmt; }
	}

	public final ConnectStmtContext connectStmt() throws RecognitionException {
		ConnectStmtContext _localctx = new ConnectStmtContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_connectStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(CONNECTDB);
			setState(71);
			((ConnectStmtContext)_localctx).STRING = match(STRING);
			setState(72);
			match(SEMICOLON);

			    String str = (((ConnectStmtContext)_localctx).STRING!=null?((ConnectStmtContext)_localctx).STRING.getText():null);
			    ((StartContext)getInvokingContext(0)).stmts.add(new ConnectDbStatement(exeCtx, str.substring(1, str.length() - 1)));

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignStmtContext extends ParserRuleContext {
		public Token ID;
		public GraphExprContext graphExpr;
		public TerminalNode ID() { return getToken(QueryParser.ID, 0); }
		public TerminalNode EQ() { return getToken(QueryParser.EQ, 0); }
		public GraphExprContext graphExpr() {
			return getRuleContext(GraphExprContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(QueryParser.SEMICOLON, 0); }
		public AssignStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignStmt; }
	}

	public final AssignStmtContext assignStmt() throws RecognitionException {
		AssignStmtContext _localctx = new AssignStmtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_assignStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			((AssignStmtContext)_localctx).ID = match(ID);
			setState(76);
			match(EQ);
			setState(77);
			((AssignStmtContext)_localctx).graphExpr = graphExpr(0);
			setState(78);
			match(SEMICOLON);

			    ((StartContext)getInvokingContext(0)).stmts.add(new AssignStatement(exeCtx, (((AssignStmtContext)_localctx).ID!=null?((AssignStmtContext)_localctx).ID.getText():null), ((AssignStmtContext)_localctx).graphExpr.gq));

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SearchStmtContext extends ParserRuleContext {
		public SearchConstraints sc;
		public DataSourceContext dataSource;
		public NodeMatchTermContext nodeMatchTerm;
		public RelatTermContext relatTerm;
		public ReturnTermContext returnTerm;
		public TerminalNode SEARCH() { return getToken(QueryParser.SEARCH, 0); }
		public TerminalNode FROM() { return getToken(QueryParser.FROM, 0); }
		public DataSourceContext dataSource() {
			return getRuleContext(DataSourceContext.class,0);
		}
		public NodeMatchTermContext nodeMatchTerm() {
			return getRuleContext(NodeMatchTermContext.class,0);
		}
		public RelatTermContext relatTerm() {
			return getRuleContext(RelatTermContext.class,0);
		}
		public ReturnTermContext returnTerm() {
			return getRuleContext(ReturnTermContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(QueryParser.SEMICOLON, 0); }
		public SearchStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_searchStmt; }
	}

	public final SearchStmtContext searchStmt() throws RecognitionException {
		SearchStmtContext _localctx = new SearchStmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_searchStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(SEARCH);
			setState(82);
			match(FROM);
			setState(83);
			((SearchStmtContext)_localctx).dataSource = dataSource();
			setState(84);
			((SearchStmtContext)_localctx).nodeMatchTerm = nodeMatchTerm();
			setState(85);
			((SearchStmtContext)_localctx).relatTerm = relatTerm();
			setState(86);
			((SearchStmtContext)_localctx).returnTerm = returnTerm();
			setState(87);
			match(SEMICOLON);

			        ((SearchStmtContext)_localctx).sc =  new SearchConstraints(((SearchStmtContext)_localctx).dataSource.source);
			        _localctx.sc.setNodeConstraints(((SearchStmtContext)_localctx).nodeMatchTerm.cm);
			        _localctx.sc.setEdges(((SearchStmtContext)_localctx).relatTerm.relations);
			        _localctx.sc.setEdgeConstraints(((SearchStmtContext)_localctx).relatTerm.opts);
			        _localctx.sc.setReturnName(((SearchStmtContext)_localctx).returnTerm.name, ((SearchStmtContext)_localctx).returnTerm.isDisplay);
			        ((StartContext)getInvokingContext(0)).stmts.add(new SearchStatement(exeCtx, _localctx.sc));
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DisplayStmtContext extends ParserRuleContext {
		public GraphExprContext graphExpr;
		public TerminalNode DISPLAY() { return getToken(QueryParser.DISPLAY, 0); }
		public GraphExprContext graphExpr() {
			return getRuleContext(GraphExprContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(QueryParser.SEMICOLON, 0); }
		public DisplayStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_displayStmt; }
	}

	public final DisplayStmtContext displayStmt() throws RecognitionException {
		DisplayStmtContext _localctx = new DisplayStmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_displayStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(DISPLAY);
			setState(91);
			((DisplayStmtContext)_localctx).graphExpr = graphExpr(0);
			setState(92);
			match(SEMICOLON);

			    ((StartContext)getInvokingContext(0)).stmts.add(new DisplayStatement(exeCtx, ((DisplayStmtContext)_localctx).graphExpr.gq));

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExportStmtContext extends ParserRuleContext {
		public GraphExprContext graphExpr;
		public Token STRING;
		public TerminalNode EXPORT() { return getToken(QueryParser.EXPORT, 0); }
		public GraphExprContext graphExpr() {
			return getRuleContext(GraphExprContext.class,0);
		}
		public TerminalNode AS() { return getToken(QueryParser.AS, 0); }
		public TerminalNode STRING() { return getToken(QueryParser.STRING, 0); }
		public TerminalNode SEMICOLON() { return getToken(QueryParser.SEMICOLON, 0); }
		public ExportStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exportStmt; }
	}

	public final ExportStmtContext exportStmt() throws RecognitionException {
		ExportStmtContext _localctx = new ExportStmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_exportStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(EXPORT);
			setState(96);
			((ExportStmtContext)_localctx).graphExpr = graphExpr(0);
			setState(97);
			match(AS);
			setState(98);
			((ExportStmtContext)_localctx).STRING = match(STRING);
			setState(99);
			match(SEMICOLON);

			    String str = (((ExportStmtContext)_localctx).STRING!=null?((ExportStmtContext)_localctx).STRING.getText():null);
			    ((StartContext)getInvokingContext(0)).stmts.add(new ExportStatement(exeCtx, ((ExportStmtContext)_localctx).graphExpr.gq, str.substring(1, str.length() - 1)));

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NodeMatchTermContext extends ParserRuleContext {
		public HashMap<String, ConstraintExpression> cm = new HashMap<String, ConstraintExpression>();
		public TerminalNode WHERE() { return getToken(QueryParser.WHERE, 0); }
		public NodeAttributesContext nodeAttributes() {
			return getRuleContext(NodeAttributesContext.class,0);
		}
		public NodeMatchTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nodeMatchTerm; }
	}

	public final NodeMatchTermContext nodeMatchTerm() throws RecognitionException {
		NodeMatchTermContext _localctx = new NodeMatchTermContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_nodeMatchTerm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(WHERE);
			setState(103);
			nodeAttributes(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelatTermContext extends ParserRuleContext {
		public ArrayList<ArrayList<String>> relations = new ArrayList<ArrayList<String>>();
		public ArrayList<List<String>> opts = new ArrayList<List<String>>();
		public TerminalNode WITH() { return getToken(QueryParser.WITH, 0); }
		public RelatConstContext relatConst() {
			return getRuleContext(RelatConstContext.class,0);
		}
		public RelatTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relatTerm; }
	}

	public final RelatTermContext relatTerm() throws RecognitionException {
		RelatTermContext _localctx = new RelatTermContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_relatTerm);
		try {
			setState(108);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WITH:
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				match(WITH);
				setState(106);
				relatConst(0);
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnTermContext extends ParserRuleContext {
		public String name;
		public Boolean isDisplay;
		public Token ID;
		public TerminalNode RETURN() { return getToken(QueryParser.RETURN, 0); }
		public TerminalNode ASTERISK() { return getToken(QueryParser.ASTERISK, 0); }
		public TerminalNode AS() { return getToken(QueryParser.AS, 0); }
		public TerminalNode ID() { return getToken(QueryParser.ID, 0); }
		public ReturnTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnTerm; }
	}

	public final ReturnTermContext returnTerm() throws RecognitionException {
		ReturnTermContext _localctx = new ReturnTermContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_returnTerm);
		try {
			setState(118);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				match(RETURN);
				setState(111);
				match(ASTERISK);

				        ((ReturnTermContext)_localctx).name =  "deprecated!";
				        ((ReturnTermContext)_localctx).isDisplay =  true;
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(113);
				match(RETURN);
				setState(114);
				match(ASTERISK);
				setState(115);
				match(AS);
				setState(116);
				((ReturnTermContext)_localctx).ID = match(ID);

				        ((ReturnTermContext)_localctx).name =  (((ReturnTermContext)_localctx).ID!=null?((ReturnTermContext)_localctx).ID.getText():null);
				        ((ReturnTermContext)_localctx).isDisplay =  false;
				    
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NodeAttributesContext extends ParserRuleContext {
		public String name;
		public ConstraintExpression ce;
		public NodeAttributesContext na1;
		public Token ID;
		public ExprContext expr;
		public NodeAttributesContext na2;
		public TerminalNode ID() { return getToken(QueryParser.ID, 0); }
		public TerminalNode LEFTBRACE() { return getToken(QueryParser.LEFTBRACE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RIGHTBRACE() { return getToken(QueryParser.RIGHTBRACE, 0); }
		public TerminalNode COMMA() { return getToken(QueryParser.COMMA, 0); }
		public List<NodeAttributesContext> nodeAttributes() {
			return getRuleContexts(NodeAttributesContext.class);
		}
		public NodeAttributesContext nodeAttributes(int i) {
			return getRuleContext(NodeAttributesContext.class,i);
		}
		public NodeAttributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nodeAttributes; }
	}

	public final NodeAttributesContext nodeAttributes() throws RecognitionException {
		return nodeAttributes(0);
	}

	private NodeAttributesContext nodeAttributes(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		NodeAttributesContext _localctx = new NodeAttributesContext(_ctx, _parentState);
		NodeAttributesContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_nodeAttributes, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(121);
			((NodeAttributesContext)_localctx).ID = match(ID);
			setState(122);
			match(LEFTBRACE);
			setState(123);
			((NodeAttributesContext)_localctx).expr = expr(0);
			setState(124);
			match(RIGHTBRACE);

			        ((NodeMatchTermContext)getInvokingContext(6)).cm.put((((NodeAttributesContext)_localctx).ID!=null?((NodeAttributesContext)_localctx).ID.getText():null), ((NodeAttributesContext)_localctx).expr.e);
			    
			}
			_ctx.stop = _input.LT(-1);
			setState(132);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new NodeAttributesContext(_parentctx, _parentState);
					_localctx.na1 = _prevctx;
					_localctx.na1 = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_nodeAttributes);
					setState(127);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(128);
					match(COMMA);
					setState(129);
					((NodeAttributesContext)_localctx).na2 = nodeAttributes(3);
					}
					} 
				}
				setState(134);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class LogicOptContext extends ParserRuleContext {
		public String opt;
		public String time;
		public String unit;
		public Token INT;
		public Token SECOND;
		public Token MINUTE;
		public Token MS;
		public TerminalNode LOGAND() { return getToken(QueryParser.LOGAND, 0); }
		public TerminalNode LEFTSQUARE() { return getToken(QueryParser.LEFTSQUARE, 0); }
		public TerminalNode LT() { return getToken(QueryParser.LT, 0); }
		public TerminalNode INT() { return getToken(QueryParser.INT, 0); }
		public TerminalNode SECOND() { return getToken(QueryParser.SECOND, 0); }
		public TerminalNode RIGHTSQUARE() { return getToken(QueryParser.RIGHTSQUARE, 0); }
		public TerminalNode MINUTE() { return getToken(QueryParser.MINUTE, 0); }
		public TerminalNode MS() { return getToken(QueryParser.MS, 0); }
		public TerminalNode LOGOR() { return getToken(QueryParser.LOGOR, 0); }
		public LogicOptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicOpt; }
	}

	public final LogicOptContext logicOpt() throws RecognitionException {
		LogicOptContext _localctx = new LogicOptContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_logicOpt);
		try {
			setState(158);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				match(LOGAND);
				setState(136);
				match(LEFTSQUARE);
				setState(137);
				match(LT);
				setState(138);
				((LogicOptContext)_localctx).INT = match(INT);
				setState(139);
				((LogicOptContext)_localctx).SECOND = match(SECOND);
				setState(140);
				match(RIGHTSQUARE);
				((LogicOptContext)_localctx).opt = "and"; ((LogicOptContext)_localctx).time = (((LogicOptContext)_localctx).INT!=null?((LogicOptContext)_localctx).INT.getText():null); ((LogicOptContext)_localctx).unit = (((LogicOptContext)_localctx).SECOND!=null?((LogicOptContext)_localctx).SECOND.getText():null);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(142);
				match(LOGAND);
				setState(143);
				match(LEFTSQUARE);
				setState(144);
				match(LT);
				setState(145);
				((LogicOptContext)_localctx).INT = match(INT);
				setState(146);
				((LogicOptContext)_localctx).MINUTE = match(MINUTE);
				setState(147);
				match(RIGHTSQUARE);
				((LogicOptContext)_localctx).opt = "and"; ((LogicOptContext)_localctx).time = (((LogicOptContext)_localctx).INT!=null?((LogicOptContext)_localctx).INT.getText():null); ((LogicOptContext)_localctx).unit = (((LogicOptContext)_localctx).MINUTE!=null?((LogicOptContext)_localctx).MINUTE.getText():null);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(149);
				match(LOGAND);
				setState(150);
				match(LEFTSQUARE);
				setState(151);
				match(LT);
				setState(152);
				((LogicOptContext)_localctx).INT = match(INT);
				setState(153);
				((LogicOptContext)_localctx).MS = match(MS);
				setState(154);
				match(RIGHTSQUARE);
				((LogicOptContext)_localctx).opt = "and"; ((LogicOptContext)_localctx).time = (((LogicOptContext)_localctx).INT!=null?((LogicOptContext)_localctx).INT.getText():null); ((LogicOptContext)_localctx).unit = (((LogicOptContext)_localctx).MS!=null?((LogicOptContext)_localctx).MS.getText():null);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(156);
				match(LOGOR);
				((LogicOptContext)_localctx).opt = "or"; ((LogicOptContext)_localctx).time = "0"; ((LogicOptContext)_localctx).unit = "null";
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelatConstContext extends ParserRuleContext {
		public RelatExprContext relatExpr;
		public LogicOptContext logicOpt;
		public RelatExprContext relatExpr() {
			return getRuleContext(RelatExprContext.class,0);
		}
		public List<RelatConstContext> relatConst() {
			return getRuleContexts(RelatConstContext.class);
		}
		public RelatConstContext relatConst(int i) {
			return getRuleContext(RelatConstContext.class,i);
		}
		public LogicOptContext logicOpt() {
			return getRuleContext(LogicOptContext.class,0);
		}
		public RelatConstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relatConst; }
	}

	public final RelatConstContext relatConst() throws RecognitionException {
		return relatConst(0);
	}

	private RelatConstContext relatConst(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RelatConstContext _localctx = new RelatConstContext(_ctx, _parentState);
		RelatConstContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_relatConst, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(161);
			((RelatConstContext)_localctx).relatExpr = relatExpr();

			        ((RelatTermContext)getInvokingContext(7)).relations.add(((RelatConstContext)_localctx).relatExpr.relation);
			    
			}
			_ctx.stop = _input.LT(-1);
			setState(171);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new RelatConstContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_relatConst);
					setState(164);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(165);
					((RelatConstContext)_localctx).logicOpt = logicOpt();
					setState(166);
					relatConst(3);

					                  List<String> al = Arrays.asList(((RelatConstContext)_localctx).logicOpt.opt, ((RelatConstContext)_localctx).logicOpt.time, ((RelatConstContext)_localctx).logicOpt.unit);
					                  ((RelatTermContext)getInvokingContext(7)).opts.add(al);
					              
					}
					} 
				}
				setState(173);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class RelatExprContext extends ParserRuleContext {
		public ArrayList<String> relation;
		public Token id1;
		public Token id2;
		public OptTypeContext optType;
		public TerminalNode ARROW() { return getToken(QueryParser.ARROW, 0); }
		public List<TerminalNode> ID() { return getTokens(QueryParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(QueryParser.ID, i);
		}
		public TerminalNode LEFTSQUARE() { return getToken(QueryParser.LEFTSQUARE, 0); }
		public OptTypeContext optType() {
			return getRuleContext(OptTypeContext.class,0);
		}
		public TerminalNode RIGHTSQUARE() { return getToken(QueryParser.RIGHTSQUARE, 0); }
		public RelatExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relatExpr; }
	}

	public final RelatExprContext relatExpr() throws RecognitionException {
		RelatExprContext _localctx = new RelatExprContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_relatExpr);
		int _la;
		try {
			setState(188);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(174);
				((RelatExprContext)_localctx).id1 = match(ID);
				setState(175);
				match(ARROW);
				setState(176);
				((RelatExprContext)_localctx).id2 = match(ID);
				((RelatExprContext)_localctx).relation =  new ArrayList<>(Arrays.asList((((RelatExprContext)_localctx).id1!=null?((RelatExprContext)_localctx).id1.getText():null), "null", (((RelatExprContext)_localctx).id2!=null?((RelatExprContext)_localctx).id2.getText():null)));
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(178);
				((RelatExprContext)_localctx).id1 = match(ID);
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFTSQUARE) {
					{
					setState(179);
					match(LEFTSQUARE);
					setState(180);
					((RelatExprContext)_localctx).optType = optType();
					setState(181);
					match(RIGHTSQUARE);
					}
				}

				setState(185);
				match(ARROW);
				setState(186);
				((RelatExprContext)_localctx).id2 = match(ID);
				((RelatExprContext)_localctx).relation =  new ArrayList<>(Arrays.asList((((RelatExprContext)_localctx).id1!=null?((RelatExprContext)_localctx).id1.getText():null), (((RelatExprContext)_localctx).optType!=null?_input.getText(((RelatExprContext)_localctx).optType.start,((RelatExprContext)_localctx).optType.stop):null), (((RelatExprContext)_localctx).id2!=null?((RelatExprContext)_localctx).id2.getText():null)));
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataSourceContext extends ParserRuleContext {
		public String source;
		public Token ID;
		public TerminalNode DB() { return getToken(QueryParser.DB, 0); }
		public TerminalNode LEFTBRACKET() { return getToken(QueryParser.LEFTBRACKET, 0); }
		public TerminalNode ID() { return getToken(QueryParser.ID, 0); }
		public TerminalNode RIGHTBRACKET() { return getToken(QueryParser.RIGHTBRACKET, 0); }
		public DataSourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataSource; }
	}

	public final DataSourceContext dataSource() throws RecognitionException {
		DataSourceContext _localctx = new DataSourceContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_dataSource);
		try {
			setState(197);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DB:
				enterOuterAlt(_localctx, 1);
				{
				setState(190);
				match(DB);
				setState(191);
				match(LEFTBRACKET);
				setState(192);
				((DataSourceContext)_localctx).ID = match(ID);
				setState(193);
				match(RIGHTBRACKET);

				        ((StartContext)getInvokingContext(0)).stmts.add(new ConnectDbStatement(exeCtx, (((DataSourceContext)_localctx).ID!=null?((DataSourceContext)_localctx).ID.getText():null)));
				        ((DataSourceContext)_localctx).source =  null;
				    
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(195);
				((DataSourceContext)_localctx).ID = match(ID);

				        ((DataSourceContext)_localctx).source =  (((DataSourceContext)_localctx).ID!=null?((DataSourceContext)_localctx).ID.getText():null);
				    
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GraphExprContext extends ParserRuleContext {
		public GraphQuery gq;
		public GraphExprContext l;
		public GraphExprContext graphExpr;
		public Token ID;
		public TrackExprContext trackExpr;
		public GraphExprContext r;
		public TerminalNode LEFTBRACKET() { return getToken(QueryParser.LEFTBRACKET, 0); }
		public List<GraphExprContext> graphExpr() {
			return getRuleContexts(GraphExprContext.class);
		}
		public GraphExprContext graphExpr(int i) {
			return getRuleContext(GraphExprContext.class,i);
		}
		public TerminalNode RIGHTBRACKET() { return getToken(QueryParser.RIGHTBRACKET, 0); }
		public TerminalNode ID() { return getToken(QueryParser.ID, 0); }
		public TrackExprContext trackExpr() {
			return getRuleContext(TrackExprContext.class,0);
		}
		public TerminalNode UNION() { return getToken(QueryParser.UNION, 0); }
		public TerminalNode INTERSECTION() { return getToken(QueryParser.INTERSECTION, 0); }
		public TerminalNode DIFFERENCE() { return getToken(QueryParser.DIFFERENCE, 0); }
		public GraphExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_graphExpr; }
	}

	public final GraphExprContext graphExpr() throws RecognitionException {
		return graphExpr(0);
	}

	private GraphExprContext graphExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		GraphExprContext _localctx = new GraphExprContext(_ctx, _parentState);
		GraphExprContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_graphExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFTBRACKET:
				{
				setState(200);
				match(LEFTBRACKET);
				setState(201);
				((GraphExprContext)_localctx).graphExpr = graphExpr(0);
				setState(202);
				match(RIGHTBRACKET);
				 ((GraphExprContext)_localctx).gq =  ((GraphExprContext)_localctx).graphExpr.gq; 
				}
				break;
			case ID:
				{
				setState(205);
				((GraphExprContext)_localctx).ID = match(ID);
				 ((GraphExprContext)_localctx).gq =  new VariableGraphQuery(exeCtx, (((GraphExprContext)_localctx).ID!=null?((GraphExprContext)_localctx).ID.getText():null)); 
				}
				break;
			case BACK:
			case FORWARD:
			case SEARCH:
				{
				setState(207);
				((GraphExprContext)_localctx).trackExpr = trackExpr();
				 ((GraphExprContext)_localctx).gq =  ((GraphExprContext)_localctx).trackExpr.gq; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(229);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(227);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new GraphExprContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_graphExpr);
						setState(212);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(213);
						match(UNION);
						setState(214);
						((GraphExprContext)_localctx).r = ((GraphExprContext)_localctx).graphExpr = graphExpr(5);
						 ((GraphExprContext)_localctx).gq =  new UnionGraphQuery(((GraphExprContext)_localctx).l.gq, ((GraphExprContext)_localctx).r.gq); 
						}
						break;
					case 2:
						{
						_localctx = new GraphExprContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_graphExpr);
						setState(217);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(218);
						match(INTERSECTION);
						setState(219);
						((GraphExprContext)_localctx).r = ((GraphExprContext)_localctx).graphExpr = graphExpr(4);
						 ((GraphExprContext)_localctx).gq =  new IntersectionGraphQuery(((GraphExprContext)_localctx).l.gq, ((GraphExprContext)_localctx).r.gq); 
						}
						break;
					case 3:
						{
						_localctx = new GraphExprContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_graphExpr);
						setState(222);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(223);
						match(DIFFERENCE);
						setState(224);
						((GraphExprContext)_localctx).r = ((GraphExprContext)_localctx).graphExpr = graphExpr(3);
						 ((GraphExprContext)_localctx).gq =  new DifferenceGraphQuery(((GraphExprContext)_localctx).l.gq, ((GraphExprContext)_localctx).r.gq); 
						}
						break;
					}
					} 
				}
				setState(231);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TrackExprContext extends ParserRuleContext {
		public GraphQuery gq;
		public BackTrackConstraints bc;
		public BackTrack bt;
		public DirectionContext direction;
		public StartTermContext startTerm;
		public DataSourceContext dataSource;
		public GraphExprContext graphExpr;
		public DirectionContext direction() {
			return getRuleContext(DirectionContext.class,0);
		}
		public TerminalNode TRACK() { return getToken(QueryParser.TRACK, 0); }
		public StartTermContext startTerm() {
			return getRuleContext(StartTermContext.class,0);
		}
		public TerminalNode FROM() { return getToken(QueryParser.FROM, 0); }
		public DataSourceContext dataSource() {
			return getRuleContext(DataSourceContext.class,0);
		}
		public FilterTermContext filterTerm() {
			return getRuleContext(FilterTermContext.class,0);
		}
		public LimitTermContext limitTerm() {
			return getRuleContext(LimitTermContext.class,0);
		}
		public TerminalNode SEARCH() { return getToken(QueryParser.SEARCH, 0); }
		public GraphExprContext graphExpr() {
			return getRuleContext(GraphExprContext.class,0);
		}
		public TrackExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trackExpr; }
	}

	public final TrackExprContext trackExpr() throws RecognitionException {
		TrackExprContext _localctx = new TrackExprContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_trackExpr);
		try {
			setState(249);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BACK:
			case FORWARD:
				enterOuterAlt(_localctx, 1);
				{
				setState(232);
				((TrackExprContext)_localctx).direction = direction();
				setState(233);
				match(TRACK);
				setState(234);
				((TrackExprContext)_localctx).startTerm = startTerm();
				setState(235);
				match(FROM);
				setState(236);
				((TrackExprContext)_localctx).dataSource = dataSource();

				        if (((TrackExprContext)_localctx).startTerm.graphID != null) {
				            // The POI is a graph
				            ((TrackExprContext)_localctx).bc =  new BackTrackConstraints(((TrackExprContext)_localctx).startTerm.graphID);
				        } else {
				            ((TrackExprContext)_localctx).bc =  new BackTrackConstraints(((TrackExprContext)_localctx).startTerm.ce);
				        }
				        _localctx.bc.setIgnoreConstraints(exeCtx.isIgnoreConstraints());
				    
				setState(238);
				filterTerm();
				setState(239);
				limitTerm();

				        if (((TrackExprContext)_localctx).dataSource.source == null) {
				            // The data source is a local graph
				            ((TrackExprContext)_localctx).bt =  exeCtx.isUseRecursive() ? new BackTrackRemoteRecursive() : new BackTrackRemote();
				        } else {
				            ((TrackExprContext)_localctx).bt =  new BackTrackLocal(exeCtx, ((TrackExprContext)_localctx).dataSource.source);
				        }
				        ((TrackExprContext)_localctx).gq =  new TrackGraphQuery(exeCtx, ((TrackExprContext)_localctx).direction.isBack, _localctx.bt, _localctx.bc);
				    
				}
				break;
			case SEARCH:
				enterOuterAlt(_localctx, 2);
				{
				setState(242);
				match(SEARCH);
				setState(243);
				match(FROM);
				setState(244);
				((TrackExprContext)_localctx).graphExpr = graphExpr(0);
				 ((TrackExprContext)_localctx).bc =  new BackTrackConstraints(); 
				setState(246);
				filterTerm();
				 ((TrackExprContext)_localctx).gq =  new SelectGraphQuery(((TrackExprContext)_localctx).graphExpr.gq, _localctx.bc); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DirectionContext extends ParserRuleContext {
		public boolean isBack;
		public TerminalNode BACK() { return getToken(QueryParser.BACK, 0); }
		public TerminalNode FORWARD() { return getToken(QueryParser.FORWARD, 0); }
		public DirectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_direction; }
	}

	public final DirectionContext direction() throws RecognitionException {
		DirectionContext _localctx = new DirectionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_direction);
		try {
			setState(255);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BACK:
				enterOuterAlt(_localctx, 1);
				{
				setState(251);
				match(BACK);
				 ((DirectionContext)_localctx).isBack =  true; 
				}
				break;
			case FORWARD:
				enterOuterAlt(_localctx, 2);
				{
				setState(253);
				match(FORWARD);
				 ((DirectionContext)_localctx).isBack =  false; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StartTermContext extends ParserRuleContext {
		public ConstraintExpression ce;
		public String graphID;
		public Token ID;
		public ConstraintExprContext constraintExpr;
		public TerminalNode ID() { return getToken(QueryParser.ID, 0); }
		public ConstraintExprContext constraintExpr() {
			return getRuleContext(ConstraintExprContext.class,0);
		}
		public StartTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_startTerm; }
	}

	public final StartTermContext startTerm() throws RecognitionException {
		StartTermContext _localctx = new StartTermContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_startTerm);
		try {
			setState(262);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(257);
				((StartTermContext)_localctx).ID = match(ID);
				 ((StartTermContext)_localctx).graphID =  (((StartTermContext)_localctx).ID!=null?((StartTermContext)_localctx).ID.getText():null); 
				}
				break;
			case WHERE:
				enterOuterAlt(_localctx, 2);
				{
				setState(259);
				((StartTermContext)_localctx).constraintExpr = constraintExpr();
				 ((StartTermContext)_localctx).ce =  ((StartTermContext)_localctx).constraintExpr.e; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FilterTermContext extends ParserRuleContext {
		public TypeFilterTermContext i;
		public TypeFilterTermContext e;
		public TerminalNode INCLUDE() { return getToken(QueryParser.INCLUDE, 0); }
		public List<TypeFilterTermContext> typeFilterTerm() {
			return getRuleContexts(TypeFilterTermContext.class);
		}
		public TypeFilterTermContext typeFilterTerm(int i) {
			return getRuleContext(TypeFilterTermContext.class,i);
		}
		public TerminalNode EXCLUDE() { return getToken(QueryParser.EXCLUDE, 0); }
		public FilterTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filterTerm; }
	}

	public final FilterTermContext filterTerm() throws RecognitionException {
		FilterTermContext _localctx = new FilterTermContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_filterTerm);
		try {
			setState(285);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(264);
				match(INCLUDE);
				setState(265);
				((FilterTermContext)_localctx).i = typeFilterTerm();

				               ((TrackExprContext)getInvokingContext(15)).bc.setNodeConstraints(((FilterTermContext)_localctx).i.n);
				               ((TrackExprContext)getInvokingContext(15)).bc.setEdgeConstraints(((FilterTermContext)_localctx).i.e);
				           
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(268);
				match(EXCLUDE);
				setState(269);
				((FilterTermContext)_localctx).e = typeFilterTerm();

				               if (((FilterTermContext)_localctx).e.n != null) ((TrackExprContext)getInvokingContext(15)).bc.setNodeConstraints(new NotExpression(((FilterTermContext)_localctx).e.n));
				               if (((FilterTermContext)_localctx).e.e != null) ((TrackExprContext)getInvokingContext(15)).bc.setEdgeConstraints(new NotExpression(((FilterTermContext)_localctx).e.e));
				           
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(272);
				match(INCLUDE);
				setState(273);
				((FilterTermContext)_localctx).i = typeFilterTerm();
				setState(274);
				match(EXCLUDE);
				setState(275);
				((FilterTermContext)_localctx).e = typeFilterTerm();

				               ((TrackExprContext)getInvokingContext(15)).bc.setNodeConstraints(combine(((FilterTermContext)_localctx).i.n, ((FilterTermContext)_localctx).e.n));
				               ((TrackExprContext)getInvokingContext(15)).bc.setEdgeConstraints(combine(((FilterTermContext)_localctx).i.e, ((FilterTermContext)_localctx).e.e));
				           
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(278);
				match(EXCLUDE);
				setState(279);
				((FilterTermContext)_localctx).e = typeFilterTerm();
				setState(280);
				match(INCLUDE);
				setState(281);
				((FilterTermContext)_localctx).i = typeFilterTerm();

				               ((TrackExprContext)getInvokingContext(15)).bc.setNodeConstraints(combine(((FilterTermContext)_localctx).i.n, ((FilterTermContext)_localctx).e.n));
				               ((TrackExprContext)getInvokingContext(15)).bc.setEdgeConstraints(combine(((FilterTermContext)_localctx).i.e, ((FilterTermContext)_localctx).e.e));
				           
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeFilterTermContext extends ParserRuleContext {
		public ConstraintExpression n;
		public ConstraintExpression e;
		public ConstraintExprContext ne;
		public ConstraintExprContext ee;
		public TerminalNode NODES() { return getToken(QueryParser.NODES, 0); }
		public List<ConstraintExprContext> constraintExpr() {
			return getRuleContexts(ConstraintExprContext.class);
		}
		public ConstraintExprContext constraintExpr(int i) {
			return getRuleContext(ConstraintExprContext.class,i);
		}
		public TerminalNode EDGES() { return getToken(QueryParser.EDGES, 0); }
		public TerminalNode COMMA() { return getToken(QueryParser.COMMA, 0); }
		public TypeFilterTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeFilterTerm; }
	}

	public final TypeFilterTermContext typeFilterTerm() throws RecognitionException {
		TypeFilterTermContext _localctx = new TypeFilterTermContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_typeFilterTerm);
		try {
			setState(309);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(287);
				match(NODES);
				setState(288);
				((TypeFilterTermContext)_localctx).ne = constraintExpr();
				 ((TypeFilterTermContext)_localctx).n =  ((TypeFilterTermContext)_localctx).ne.e; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(291);
				match(EDGES);
				setState(292);
				((TypeFilterTermContext)_localctx).ee = constraintExpr();
				 ((TypeFilterTermContext)_localctx).e =  ((TypeFilterTermContext)_localctx).ee.e; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(295);
				match(NODES);
				setState(296);
				((TypeFilterTermContext)_localctx).ne = constraintExpr();
				setState(297);
				match(COMMA);
				setState(298);
				match(EDGES);
				setState(299);
				((TypeFilterTermContext)_localctx).ee = constraintExpr();
				 ((TypeFilterTermContext)_localctx).n =  ((TypeFilterTermContext)_localctx).ne.e; ((TypeFilterTermContext)_localctx).e =  ((TypeFilterTermContext)_localctx).ee.e; 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(302);
				match(EDGES);
				setState(303);
				((TypeFilterTermContext)_localctx).ee = constraintExpr();
				setState(304);
				match(COMMA);
				setState(305);
				match(NODES);
				setState(306);
				((TypeFilterTermContext)_localctx).ne = constraintExpr();
				 ((TypeFilterTermContext)_localctx).n =  ((TypeFilterTermContext)_localctx).ne.e; ((TypeFilterTermContext)_localctx).e =  ((TypeFilterTermContext)_localctx).ee.e; 
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LimitTermContext extends ParserRuleContext {
		public Token s;
		public Token t;
		public TerminalNode LIMIT() { return getToken(QueryParser.LIMIT, 0); }
		public TerminalNode STEP() { return getToken(QueryParser.STEP, 0); }
		public List<TerminalNode> INT() { return getTokens(QueryParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(QueryParser.INT, i);
		}
		public TerminalNode TIME() { return getToken(QueryParser.TIME, 0); }
		public TerminalNode COMMA() { return getToken(QueryParser.COMMA, 0); }
		public LimitTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limitTerm; }
	}

	public final LimitTermContext limitTerm() throws RecognitionException {
		LimitTermContext _localctx = new LimitTermContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_limitTerm);
		try {
			setState(334);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(311);
				match(LIMIT);
				setState(312);
				match(STEP);
				setState(313);
				((LimitTermContext)_localctx).s = match(INT);
				 ((TrackExprContext)getInvokingContext(15)).bc.setStepConstraint((((LimitTermContext)_localctx).s!=null?Integer.valueOf(((LimitTermContext)_localctx).s.getText()):0)); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(315);
				match(LIMIT);
				setState(316);
				match(TIME);
				setState(317);
				((LimitTermContext)_localctx).t = match(INT);
				 ((TrackExprContext)getInvokingContext(15)).bc.setTimeConstraintSecs((((LimitTermContext)_localctx).t!=null?Integer.valueOf(((LimitTermContext)_localctx).t.getText()):0)); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(319);
				match(LIMIT);
				setState(320);
				match(STEP);
				setState(321);
				((LimitTermContext)_localctx).s = match(INT);
				setState(322);
				match(COMMA);
				setState(323);
				match(TIME);
				setState(324);
				((LimitTermContext)_localctx).t = match(INT);

				              ((TrackExprContext)getInvokingContext(15)).bc.setStepConstraint((((LimitTermContext)_localctx).s!=null?Integer.valueOf(((LimitTermContext)_localctx).s.getText()):0));
				              ((TrackExprContext)getInvokingContext(15)).bc.setTimeConstraintSecs((((LimitTermContext)_localctx).t!=null?Integer.valueOf(((LimitTermContext)_localctx).t.getText()):0));
				          
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(326);
				match(LIMIT);
				setState(327);
				match(TIME);
				setState(328);
				((LimitTermContext)_localctx).t = match(INT);
				setState(329);
				match(COMMA);
				setState(330);
				match(STEP);
				setState(331);
				((LimitTermContext)_localctx).s = match(INT);

				              ((TrackExprContext)getInvokingContext(15)).bc.setStepConstraint((((LimitTermContext)_localctx).s!=null?Integer.valueOf(((LimitTermContext)_localctx).s.getText()):0));
				              ((TrackExprContext)getInvokingContext(15)).bc.setTimeConstraintSecs((((LimitTermContext)_localctx).t!=null?Integer.valueOf(((LimitTermContext)_localctx).t.getText()):0));
				          
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstraintExprContext extends ParserRuleContext {
		public ConstraintExpression e;
		public ExprContext expr;
		public TerminalNode WHERE() { return getToken(QueryParser.WHERE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ConstraintExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraintExpr; }
	}

	public final ConstraintExprContext constraintExpr() throws RecognitionException {
		ConstraintExprContext _localctx = new ConstraintExprContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_constraintExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			match(WHERE);
			setState(337);
			((ConstraintExprContext)_localctx).expr = expr(0);
			 ((ConstraintExprContext)_localctx).e =  ((ConstraintExprContext)_localctx).expr.e; 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public ConstraintExpression e;
		public ExprContext e1;
		public ExprContext expr;
		public BinaryExprContext binaryExpr;
		public ExprContext e2;
		public TerminalNode LEFTBRACKET() { return getToken(QueryParser.LEFTBRACKET, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RIGHTBRACKET() { return getToken(QueryParser.RIGHTBRACKET, 0); }
		public TerminalNode NOT() { return getToken(QueryParser.NOT, 0); }
		public BinaryExprContext binaryExpr() {
			return getRuleContext(BinaryExprContext.class,0);
		}
		public TerminalNode AND() { return getToken(QueryParser.AND, 0); }
		public TerminalNode OR() { return getToken(QueryParser.OR, 0); }
		public TerminalNode COMMA() { return getToken(QueryParser.COMMA, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFTBRACKET:
				{
				setState(341);
				match(LEFTBRACKET);
				setState(342);
				((ExprContext)_localctx).expr = expr(0);
				setState(343);
				match(RIGHTBRACKET);
				 ((ExprContext)_localctx).e =  ((ExprContext)_localctx).expr.e; 
				}
				break;
			case NOT:
				{
				setState(346);
				match(NOT);
				setState(347);
				((ExprContext)_localctx).e1 = ((ExprContext)_localctx).expr = expr(5);
				 ((ExprContext)_localctx).e =  new NotExpression(((ExprContext)_localctx).e1.e); 
				}
				break;
			case TYPE:
			case NAME:
			case PATH:
			case DSTIP:
			case DSTPORT:
			case SRCIP:
			case SRCPORT:
			case PID:
			case EXENAME:
			case EXEPATH:
			case CMDLINE:
			case OPTYPE:
			case IDSTR:
			case SRCID:
			case DSTID:
			case STARTTIME:
			case ENDTIME:
			case AMOUNT:
				{
				setState(350);
				((ExprContext)_localctx).binaryExpr = binaryExpr();
				 ((ExprContext)_localctx).e =  ((ExprContext)_localctx).binaryExpr.b; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(372);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(370);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(355);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(356);
						match(AND);
						setState(357);
						((ExprContext)_localctx).e2 = ((ExprContext)_localctx).expr = expr(5);
						 ((ExprContext)_localctx).e =  new AndExpression(((ExprContext)_localctx).e1.e, ((ExprContext)_localctx).e2.e); 
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(360);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(361);
						match(OR);
						setState(362);
						((ExprContext)_localctx).e2 = ((ExprContext)_localctx).expr = expr(4);
						 ((ExprContext)_localctx).e =  new OrExpression(((ExprContext)_localctx).e1.e, ((ExprContext)_localctx).e2.e); 
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(365);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(366);
						match(COMMA);
						setState(367);
						((ExprContext)_localctx).e2 = ((ExprContext)_localctx).expr = expr(3);
						 ((ExprContext)_localctx).e =  new AndExpression(((ExprContext)_localctx).e1.e, ((ExprContext)_localctx).e2.e); 
						}
						break;
					}
					} 
				}
				setState(374);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class BinaryExprContext extends ParserRuleContext {
		public BinaryExpression b;
		public StrIdContext strId;
		public EqOpContext eqOp;
		public EntityTypeContext entityType;
		public Token STRING;
		public NumIdContext numId;
		public NumOpContext numOp;
		public Token INT;
		public StrIdContext strId() {
			return getRuleContext(StrIdContext.class,0);
		}
		public EqOpContext eqOp() {
			return getRuleContext(EqOpContext.class,0);
		}
		public EntityTypeContext entityType() {
			return getRuleContext(EntityTypeContext.class,0);
		}
		public TerminalNode STRING() { return getToken(QueryParser.STRING, 0); }
		public NumIdContext numId() {
			return getRuleContext(NumIdContext.class,0);
		}
		public NumOpContext numOp() {
			return getRuleContext(NumOpContext.class,0);
		}
		public TerminalNode INT() { return getToken(QueryParser.INT, 0); }
		public BinaryExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryExpr; }
	}

	public final BinaryExprContext binaryExpr() throws RecognitionException {
		BinaryExprContext _localctx = new BinaryExprContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_binaryExpr);
		try {
			setState(390);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(375);
				((BinaryExprContext)_localctx).strId = strId();
				setState(376);
				((BinaryExprContext)_localctx).eqOp = eqOp();
				setState(377);
				((BinaryExprContext)_localctx).entityType = entityType();

				              ((BinaryExprContext)_localctx).b =  new BinaryExpression((((BinaryExprContext)_localctx).strId!=null?_input.getText(((BinaryExprContext)_localctx).strId.start,((BinaryExprContext)_localctx).strId.stop):null), ((BinaryExprContext)_localctx).eqOp.v, (((BinaryExprContext)_localctx).entityType!=null?_input.getText(((BinaryExprContext)_localctx).entityType.start,((BinaryExprContext)_localctx).entityType.stop):null));
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(380);
				((BinaryExprContext)_localctx).strId = strId();
				setState(381);
				((BinaryExprContext)_localctx).eqOp = eqOp();
				setState(382);
				((BinaryExprContext)_localctx).STRING = match(STRING);

				        String str = (((BinaryExprContext)_localctx).STRING!=null?((BinaryExprContext)_localctx).STRING.getText():null);
				        str = str.substring(1, str.length() - 1);
				        boolean isLike = ((BinaryExprContext)_localctx).eqOp.v == BinaryOperator.Like;
				        ((BinaryExprContext)_localctx).b =  new BinaryExpression((((BinaryExprContext)_localctx).strId!=null?_input.getText(((BinaryExprContext)_localctx).strId.start,((BinaryExprContext)_localctx).strId.stop):null), ((BinaryExprContext)_localctx).eqOp.v, isLike ? "%" + str + "%" : str);
				    
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(385);
				((BinaryExprContext)_localctx).numId = numId();
				setState(386);
				((BinaryExprContext)_localctx).numOp = numOp();
				setState(387);
				((BinaryExprContext)_localctx).INT = match(INT);
				 ((BinaryExprContext)_localctx).b =  new BinaryExpression((((BinaryExprContext)_localctx).numId!=null?_input.getText(((BinaryExprContext)_localctx).numId.start,((BinaryExprContext)_localctx).numId.stop):null), ((BinaryExprContext)_localctx).numOp.v, new BigDecimal((((BinaryExprContext)_localctx).INT!=null?((BinaryExprContext)_localctx).INT.getText():null))); 
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StrIdContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(QueryParser.TYPE, 0); }
		public TerminalNode NAME() { return getToken(QueryParser.NAME, 0); }
		public TerminalNode PATH() { return getToken(QueryParser.PATH, 0); }
		public TerminalNode DSTIP() { return getToken(QueryParser.DSTIP, 0); }
		public TerminalNode SRCIP() { return getToken(QueryParser.SRCIP, 0); }
		public TerminalNode EXENAME() { return getToken(QueryParser.EXENAME, 0); }
		public TerminalNode EXEPATH() { return getToken(QueryParser.EXEPATH, 0); }
		public TerminalNode CMDLINE() { return getToken(QueryParser.CMDLINE, 0); }
		public TerminalNode OPTYPE() { return getToken(QueryParser.OPTYPE, 0); }
		public StrIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strId; }
	}

	public final StrIdContext strId() throws RecognitionException {
		StrIdContext _localctx = new StrIdContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_strId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TYPE) | (1L << NAME) | (1L << PATH) | (1L << DSTIP) | (1L << SRCIP) | (1L << EXENAME) | (1L << EXEPATH) | (1L << CMDLINE) | (1L << OPTYPE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumIdContext extends ParserRuleContext {
		public TerminalNode IDSTR() { return getToken(QueryParser.IDSTR, 0); }
		public TerminalNode SRCID() { return getToken(QueryParser.SRCID, 0); }
		public TerminalNode DSTID() { return getToken(QueryParser.DSTID, 0); }
		public TerminalNode STARTTIME() { return getToken(QueryParser.STARTTIME, 0); }
		public TerminalNode ENDTIME() { return getToken(QueryParser.ENDTIME, 0); }
		public TerminalNode AMOUNT() { return getToken(QueryParser.AMOUNT, 0); }
		public TerminalNode PID() { return getToken(QueryParser.PID, 0); }
		public TerminalNode DSTPORT() { return getToken(QueryParser.DSTPORT, 0); }
		public TerminalNode SRCPORT() { return getToken(QueryParser.SRCPORT, 0); }
		public NumIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numId; }
	}

	public final NumIdContext numId() throws RecognitionException {
		NumIdContext _localctx = new NumIdContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_numId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DSTPORT) | (1L << SRCPORT) | (1L << PID) | (1L << IDSTR) | (1L << SRCID) | (1L << DSTID) | (1L << STARTTIME) | (1L << ENDTIME) | (1L << AMOUNT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EntityTypeContext extends ParserRuleContext {
		public TerminalNode PROCESS() { return getToken(QueryParser.PROCESS, 0); }
		public TerminalNode FILE() { return getToken(QueryParser.FILE, 0); }
		public TerminalNode NETWORK() { return getToken(QueryParser.NETWORK, 0); }
		public EntityTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entityType; }
	}

	public final EntityTypeContext entityType() throws RecognitionException {
		EntityTypeContext _localctx = new EntityTypeContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_entityType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PROCESS) | (1L << FILE) | (1L << NETWORK))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptTypeContext extends ParserRuleContext {
		public TerminalNode READ() { return getToken(QueryParser.READ, 0); }
		public TerminalNode WRITE() { return getToken(QueryParser.WRITE, 0); }
		public TerminalNode EXECVE() { return getToken(QueryParser.EXECVE, 0); }
		public OptTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optType; }
	}

	public final OptTypeContext optType() throws RecognitionException {
		OptTypeContext _localctx = new OptTypeContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_optType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(398);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << READ) | (1L << WRITE) | (1L << EXECVE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EqOpContext extends ParserRuleContext {
		public BinaryOperator v;
		public TerminalNode EQ() { return getToken(QueryParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(QueryParser.NEQ, 0); }
		public TerminalNode LIKE() { return getToken(QueryParser.LIKE, 0); }
		public EqOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eqOp; }
	}

	public final EqOpContext eqOp() throws RecognitionException {
		EqOpContext _localctx = new EqOpContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_eqOp);
		try {
			setState(406);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EQ:
				enterOuterAlt(_localctx, 1);
				{
				setState(400);
				match(EQ);
				 ((EqOpContext)_localctx).v =  BinaryOperator.Equal; 
				}
				break;
			case NEQ:
				enterOuterAlt(_localctx, 2);
				{
				setState(402);
				match(NEQ);
				 ((EqOpContext)_localctx).v =  BinaryOperator.NotEqual; 
				}
				break;
			case LIKE:
				enterOuterAlt(_localctx, 3);
				{
				setState(404);
				match(LIKE);
				 ((EqOpContext)_localctx).v =  BinaryOperator.Like; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumOpContext extends ParserRuleContext {
		public BinaryOperator v;
		public EqOpContext eqOp;
		public EqOpContext eqOp() {
			return getRuleContext(EqOpContext.class,0);
		}
		public TerminalNode GT() { return getToken(QueryParser.GT, 0); }
		public TerminalNode GEQ() { return getToken(QueryParser.GEQ, 0); }
		public TerminalNode LT() { return getToken(QueryParser.LT, 0); }
		public TerminalNode LEQ() { return getToken(QueryParser.LEQ, 0); }
		public NumOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numOp; }
	}

	public final NumOpContext numOp() throws RecognitionException {
		NumOpContext _localctx = new NumOpContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_numOp);
		try {
			setState(419);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EQ:
			case NEQ:
			case LIKE:
				enterOuterAlt(_localctx, 1);
				{
				setState(408);
				((NumOpContext)_localctx).eqOp = eqOp();
				 ((NumOpContext)_localctx).v =  ((NumOpContext)_localctx).eqOp.v; 
				}
				break;
			case GT:
				enterOuterAlt(_localctx, 2);
				{
				setState(411);
				match(GT);
				 ((NumOpContext)_localctx).v =  BinaryOperator.MoreThan; 
				}
				break;
			case GEQ:
				enterOuterAlt(_localctx, 3);
				{
				setState(413);
				match(GEQ);
				 ((NumOpContext)_localctx).v =  BinaryOperator.MoreEqual; 
				}
				break;
			case LT:
				enterOuterAlt(_localctx, 4);
				{
				setState(415);
				match(LT);
				 ((NumOpContext)_localctx).v =  BinaryOperator.LessThan; 
				}
				break;
			case LEQ:
				enterOuterAlt(_localctx, 5);
				{
				setState(417);
				match(LEQ);
				 ((NumOpContext)_localctx).v =  BinaryOperator.LessEqual; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 9:
			return nodeAttributes_sempred((NodeAttributesContext)_localctx, predIndex);
		case 11:
			return relatConst_sempred((RelatConstContext)_localctx, predIndex);
		case 14:
			return graphExpr_sempred((GraphExprContext)_localctx, predIndex);
		case 22:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean nodeAttributes_sempred(NodeAttributesContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean relatConst_sempred(RelatConstContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean graphExpr_sempred(GraphExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 4);
		case 6:
			return precpred(_ctx, 3);
		case 7:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3T\u01a8\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\3\2\3"+
		"\2\3\2\3\2\7\2D\n\2\f\2\16\2G\13\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\5\to\n\t\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\5\ny\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\7\13\u0085\n\13\f\13\16\13\u0088\13\13\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\5\f\u00a1\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00ac\n\r\f\r\16"+
		"\r\u00af\13\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00ba"+
		"\n\16\3\16\3\16\3\16\5\16\u00bf\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\5\17\u00c8\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\5\20\u00d5\n\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\7\20\u00e6\n\20\f\20\16\20\u00e9\13\20\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\5\21\u00fc\n\21\3\22\3\22\3\22\3\22\5\22\u0102\n\22\3\23\3\23\3"+
		"\23\3\23\3\23\5\23\u0109\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24"+
		"\u0120\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0138\n\25\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0151\n\26\3\27\3\27\3\27"+
		"\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\5\30\u0164\n\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\7\30\u0175\n\30\f\30\16\30\u0178\13\30\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31"+
		"\u0189\n\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\5\36\u0199\n\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\5\37\u01a6\n\37\3\37\2\6\24\30\36. \2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\668:<\2\6\5\2(+--\60\63\5\2,,./\649"+
		"\3\2:<\3\2=?\2\u01b8\2E\3\2\2\2\4H\3\2\2\2\6M\3\2\2\2\bS\3\2\2\2\n\\\3"+
		"\2\2\2\fa\3\2\2\2\16h\3\2\2\2\20n\3\2\2\2\22x\3\2\2\2\24z\3\2\2\2\26\u00a0"+
		"\3\2\2\2\30\u00a2\3\2\2\2\32\u00be\3\2\2\2\34\u00c7\3\2\2\2\36\u00d4\3"+
		"\2\2\2 \u00fb\3\2\2\2\"\u0101\3\2\2\2$\u0108\3\2\2\2&\u011f\3\2\2\2(\u0137"+
		"\3\2\2\2*\u0150\3\2\2\2,\u0152\3\2\2\2.\u0163\3\2\2\2\60\u0188\3\2\2\2"+
		"\62\u018a\3\2\2\2\64\u018c\3\2\2\2\66\u018e\3\2\2\28\u0190\3\2\2\2:\u0198"+
		"\3\2\2\2<\u01a5\3\2\2\2>D\5\4\3\2?D\5\6\4\2@D\5\b\5\2AD\5\n\6\2BD\5\f"+
		"\7\2C>\3\2\2\2C?\3\2\2\2C@\3\2\2\2CA\3\2\2\2CB\3\2\2\2DG\3\2\2\2EC\3\2"+
		"\2\2EF\3\2\2\2F\3\3\2\2\2GE\3\2\2\2HI\7\33\2\2IJ\7O\2\2JK\7\3\2\2KL\b"+
		"\3\1\2L\5\3\2\2\2MN\7P\2\2NO\7B\2\2OP\5\36\20\2PQ\7\3\2\2QR\b\4\1\2R\7"+
		"\3\2\2\2ST\7\25\2\2TU\7\20\2\2UV\5\34\17\2VW\5\16\b\2WX\5\20\t\2XY\5\22"+
		"\n\2YZ\7\3\2\2Z[\b\5\1\2[\t\3\2\2\2\\]\7\27\2\2]^\5\36\20\2^_\7\3\2\2"+
		"_`\b\6\1\2`\13\3\2\2\2ab\7\30\2\2bc\5\36\20\2cd\7\26\2\2de\7O\2\2ef\7"+
		"\3\2\2fg\b\7\1\2g\r\3\2\2\2hi\7\35\2\2ij\5\24\13\2j\17\3\2\2\2kl\7\21"+
		"\2\2lo\5\30\r\2mo\3\2\2\2nk\3\2\2\2nm\3\2\2\2o\21\3\2\2\2pq\7\31\2\2q"+
		"r\7\5\2\2ry\b\n\1\2st\7\31\2\2tu\7\5\2\2uv\7\26\2\2vw\7P\2\2wy\b\n\1\2"+
		"xp\3\2\2\2xs\3\2\2\2y\23\3\2\2\2z{\b\13\1\2{|\7P\2\2|}\7\b\2\2}~\5.\30"+
		"\2~\177\7\t\2\2\177\u0080\b\13\1\2\u0080\u0086\3\2\2\2\u0081\u0082\f\4"+
		"\2\2\u0082\u0083\7\4\2\2\u0083\u0085\5\24\13\5\u0084\u0081\3\2\2\2\u0085"+
		"\u0088\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\25\3\2\2"+
		"\2\u0088\u0086\3\2\2\2\u0089\u008a\7L\2\2\u008a\u008b\7\n\2\2\u008b\u008c"+
		"\7F\2\2\u008c\u008d\7N\2\2\u008d\u008e\7&\2\2\u008e\u008f\7\13\2\2\u008f"+
		"\u00a1\b\f\1\2\u0090\u0091\7L\2\2\u0091\u0092\7\n\2\2\u0092\u0093\7F\2"+
		"\2\u0093\u0094\7N\2\2\u0094\u0095\7\'\2\2\u0095\u0096\7\13\2\2\u0096\u00a1"+
		"\b\f\1\2\u0097\u0098\7L\2\2\u0098\u0099\7\n\2\2\u0099\u009a\7F\2\2\u009a"+
		"\u009b\7N\2\2\u009b\u009c\7%\2\2\u009c\u009d\7\13\2\2\u009d\u00a1\b\f"+
		"\1\2\u009e\u009f\7M\2\2\u009f\u00a1\b\f\1\2\u00a0\u0089\3\2\2\2\u00a0"+
		"\u0090\3\2\2\2\u00a0\u0097\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1\27\3\2\2"+
		"\2\u00a2\u00a3\b\r\1\2\u00a3\u00a4\5\32\16\2\u00a4\u00a5\b\r\1\2\u00a5"+
		"\u00ad\3\2\2\2\u00a6\u00a7\f\4\2\2\u00a7\u00a8\5\26\f\2\u00a8\u00a9\5"+
		"\30\r\5\u00a9\u00aa\b\r\1\2\u00aa\u00ac\3\2\2\2\u00ab\u00a6\3\2\2\2\u00ac"+
		"\u00af\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\31\3\2\2"+
		"\2\u00af\u00ad\3\2\2\2\u00b0\u00b1\7P\2\2\u00b1\u00b2\7A\2\2\u00b2\u00b3"+
		"\7P\2\2\u00b3\u00bf\b\16\1\2\u00b4\u00b9\7P\2\2\u00b5\u00b6\7\n\2\2\u00b6"+
		"\u00b7\58\35\2\u00b7\u00b8\7\13\2\2\u00b8\u00ba\3\2\2\2\u00b9\u00b5\3"+
		"\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bc\7A\2\2\u00bc"+
		"\u00bd\7P\2\2\u00bd\u00bf\b\16\1\2\u00be\u00b0\3\2\2\2\u00be\u00b4\3\2"+
		"\2\2\u00bf\33\3\2\2\2\u00c0\u00c1\7\34\2\2\u00c1\u00c2\7\6\2\2\u00c2\u00c3"+
		"\7P\2\2\u00c3\u00c4\7\7\2\2\u00c4\u00c8\b\17\1\2\u00c5\u00c6\7P\2\2\u00c6"+
		"\u00c8\b\17\1\2\u00c7\u00c0\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8\35\3\2\2"+
		"\2\u00c9\u00ca\b\20\1\2\u00ca\u00cb\7\6\2\2\u00cb\u00cc\5\36\20\2\u00cc"+
		"\u00cd\7\7\2\2\u00cd\u00ce\b\20\1\2\u00ce\u00d5\3\2\2\2\u00cf\u00d0\7"+
		"P\2\2\u00d0\u00d5\b\20\1\2\u00d1\u00d2\5 \21\2\u00d2\u00d3\b\20\1\2\u00d3"+
		"\u00d5\3\2\2\2\u00d4\u00c9\3\2\2\2\u00d4\u00cf\3\2\2\2\u00d4\u00d1\3\2"+
		"\2\2\u00d5\u00e7\3\2\2\2\u00d6\u00d7\f\6\2\2\u00d7\u00d8\7I\2\2\u00d8"+
		"\u00d9\5\36\20\7\u00d9\u00da\b\20\1\2\u00da\u00e6\3\2\2\2\u00db\u00dc"+
		"\f\5\2\2\u00dc\u00dd\7J\2\2\u00dd\u00de\5\36\20\6\u00de\u00df\b\20\1\2"+
		"\u00df\u00e6\3\2\2\2\u00e0\u00e1\f\4\2\2\u00e1\u00e2\7K\2\2\u00e2\u00e3"+
		"\5\36\20\5\u00e3\u00e4\b\20\1\2\u00e4\u00e6\3\2\2\2\u00e5\u00d6\3\2\2"+
		"\2\u00e5\u00db\3\2\2\2\u00e5\u00e0\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7\u00e5"+
		"\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\37\3\2\2\2\u00e9\u00e7\3\2\2\2\u00ea"+
		"\u00eb\5\"\22\2\u00eb\u00ec\7\24\2\2\u00ec\u00ed\5$\23\2\u00ed\u00ee\7"+
		"\20\2\2\u00ee\u00ef\5\34\17\2\u00ef\u00f0\b\21\1\2\u00f0\u00f1\5&\24\2"+
		"\u00f1\u00f2\5*\26\2\u00f2\u00f3\b\21\1\2\u00f3\u00fc\3\2\2\2\u00f4\u00f5"+
		"\7\25\2\2\u00f5\u00f6\7\20\2\2\u00f6\u00f7\5\36\20\2\u00f7\u00f8\b\21"+
		"\1\2\u00f8\u00f9\5&\24\2\u00f9\u00fa\b\21\1\2\u00fa\u00fc\3\2\2\2\u00fb"+
		"\u00ea\3\2\2\2\u00fb\u00f4\3\2\2\2\u00fc!\3\2\2\2\u00fd\u00fe\7\22\2\2"+
		"\u00fe\u0102\b\22\1\2\u00ff\u0100\7\23\2\2\u0100\u0102\b\22\1\2\u0101"+
		"\u00fd\3\2\2\2\u0101\u00ff\3\2\2\2\u0102#\3\2\2\2\u0103\u0104\7P\2\2\u0104"+
		"\u0109\b\23\1\2\u0105\u0106\5,\27\2\u0106\u0107\b\23\1\2\u0107\u0109\3"+
		"\2\2\2\u0108\u0103\3\2\2\2\u0108\u0105\3\2\2\2\u0109%\3\2\2\2\u010a\u010b"+
		"\7\36\2\2\u010b\u010c\5(\25\2\u010c\u010d\b\24\1\2\u010d\u0120\3\2\2\2"+
		"\u010e\u010f\7\37\2\2\u010f\u0110\5(\25\2\u0110\u0111\b\24\1\2\u0111\u0120"+
		"\3\2\2\2\u0112\u0113\7\36\2\2\u0113\u0114\5(\25\2\u0114\u0115\7\37\2\2"+
		"\u0115\u0116\5(\25\2\u0116\u0117\b\24\1\2\u0117\u0120\3\2\2\2\u0118\u0119"+
		"\7\37\2\2\u0119\u011a\5(\25\2\u011a\u011b\7\36\2\2\u011b\u011c\5(\25\2"+
		"\u011c\u011d\b\24\1\2\u011d\u0120\3\2\2\2\u011e\u0120\3\2\2\2\u011f\u010a"+
		"\3\2\2\2\u011f\u010e\3\2\2\2\u011f\u0112\3\2\2\2\u011f\u0118\3\2\2\2\u011f"+
		"\u011e\3\2\2\2\u0120\'\3\2\2\2\u0121\u0122\7 \2\2\u0122\u0123\5,\27\2"+
		"\u0123\u0124\b\25\1\2\u0124\u0138\3\2\2\2\u0125\u0126\7!\2\2\u0126\u0127"+
		"\5,\27\2\u0127\u0128\b\25\1\2\u0128\u0138\3\2\2\2\u0129\u012a\7 \2\2\u012a"+
		"\u012b\5,\27\2\u012b\u012c\7\4\2\2\u012c\u012d\7!\2\2\u012d\u012e\5,\27"+
		"\2\u012e\u012f\b\25\1\2\u012f\u0138\3\2\2\2\u0130\u0131\7!\2\2\u0131\u0132"+
		"\5,\27\2\u0132\u0133\7\4\2\2\u0133\u0134\7 \2\2\u0134\u0135\5,\27\2\u0135"+
		"\u0136\b\25\1\2\u0136\u0138\3\2\2\2\u0137\u0121\3\2\2\2\u0137\u0125\3"+
		"\2\2\2\u0137\u0129\3\2\2\2\u0137\u0130\3\2\2\2\u0138)\3\2\2\2\u0139\u013a"+
		"\7\"\2\2\u013a\u013b\7$\2\2\u013b\u013c\7N\2\2\u013c\u0151\b\26\1\2\u013d"+
		"\u013e\7\"\2\2\u013e\u013f\7#\2\2\u013f\u0140\7N\2\2\u0140\u0151\b\26"+
		"\1\2\u0141\u0142\7\"\2\2\u0142\u0143\7$\2\2\u0143\u0144\7N\2\2\u0144\u0145"+
		"\7\4\2\2\u0145\u0146\7#\2\2\u0146\u0147\7N\2\2\u0147\u0151\b\26\1\2\u0148"+
		"\u0149\7\"\2\2\u0149\u014a\7#\2\2\u014a\u014b\7N\2\2\u014b\u014c\7\4\2"+
		"\2\u014c\u014d\7$\2\2\u014d\u014e\7N\2\2\u014e\u0151\b\26\1\2\u014f\u0151"+
		"\3\2\2\2\u0150\u0139\3\2\2\2\u0150\u013d\3\2\2\2\u0150\u0141\3\2\2\2\u0150"+
		"\u0148\3\2\2\2\u0150\u014f\3\2\2\2\u0151+\3\2\2\2\u0152\u0153\7\35\2\2"+
		"\u0153\u0154\5.\30\2\u0154\u0155\b\27\1\2\u0155-\3\2\2\2\u0156\u0157\b"+
		"\30\1\2\u0157\u0158\7\6\2\2\u0158\u0159\5.\30\2\u0159\u015a\7\7\2\2\u015a"+
		"\u015b\b\30\1\2\u015b\u0164\3\2\2\2\u015c\u015d\7\16\2\2\u015d\u015e\5"+
		".\30\7\u015e\u015f\b\30\1\2\u015f\u0164\3\2\2\2\u0160\u0161\5\60\31\2"+
		"\u0161\u0162\b\30\1\2\u0162\u0164\3\2\2\2\u0163\u0156\3\2\2\2\u0163\u015c"+
		"\3\2\2\2\u0163\u0160\3\2\2\2\u0164\u0176\3\2\2\2\u0165\u0166\f\6\2\2\u0166"+
		"\u0167\7\f\2\2\u0167\u0168\5.\30\7\u0168\u0169\b\30\1\2\u0169\u0175\3"+
		"\2\2\2\u016a\u016b\f\5\2\2\u016b\u016c\7\r\2\2\u016c\u016d\5.\30\6\u016d"+
		"\u016e\b\30\1\2\u016e\u0175\3\2\2\2\u016f\u0170\f\4\2\2\u0170\u0171\7"+
		"\4\2\2\u0171\u0172\5.\30\5\u0172\u0173\b\30\1\2\u0173\u0175\3\2\2\2\u0174"+
		"\u0165\3\2\2\2\u0174\u016a\3\2\2\2\u0174\u016f\3\2\2\2\u0175\u0178\3\2"+
		"\2\2\u0176\u0174\3\2\2\2\u0176\u0177\3\2\2\2\u0177/\3\2\2\2\u0178\u0176"+
		"\3\2\2\2\u0179\u017a\5\62\32\2\u017a\u017b\5:\36\2\u017b\u017c\5\66\34"+
		"\2\u017c\u017d\b\31\1\2\u017d\u0189\3\2\2\2\u017e\u017f\5\62\32\2\u017f"+
		"\u0180\5:\36\2\u0180\u0181\7O\2\2\u0181\u0182\b\31\1\2\u0182\u0189\3\2"+
		"\2\2\u0183\u0184\5\64\33\2\u0184\u0185\5<\37\2\u0185\u0186\7N\2\2\u0186"+
		"\u0187\b\31\1\2\u0187\u0189\3\2\2\2\u0188\u0179\3\2\2\2\u0188\u017e\3"+
		"\2\2\2\u0188\u0183\3\2\2\2\u0189\61\3\2\2\2\u018a\u018b\t\2\2\2\u018b"+
		"\63\3\2\2\2\u018c\u018d\t\3\2\2\u018d\65\3\2\2\2\u018e\u018f\t\4\2\2\u018f"+
		"\67\3\2\2\2\u0190\u0191\t\5\2\2\u01919\3\2\2\2\u0192\u0193\7B\2\2\u0193"+
		"\u0199\b\36\1\2\u0194\u0195\7C\2\2\u0195\u0199\b\36\1\2\u0196\u0197\7"+
		"H\2\2\u0197\u0199\b\36\1\2\u0198\u0192\3\2\2\2\u0198\u0194\3\2\2\2\u0198"+
		"\u0196\3\2\2\2\u0199;\3\2\2\2\u019a\u019b\5:\36\2\u019b\u019c\b\37\1\2"+
		"\u019c\u01a6\3\2\2\2\u019d\u019e\7D\2\2\u019e\u01a6\b\37\1\2\u019f\u01a0"+
		"\7E\2\2\u01a0\u01a6\b\37\1\2\u01a1\u01a2\7F\2\2\u01a2\u01a6\b\37\1\2\u01a3"+
		"\u01a4\7G\2\2\u01a4\u01a6\b\37\1\2\u01a5\u019a\3\2\2\2\u01a5\u019d\3\2"+
		"\2\2\u01a5\u019f\3\2\2\2\u01a5\u01a1\3\2\2\2\u01a5\u01a3\3\2\2\2\u01a6"+
		"=\3\2\2\2\33CEnx\u0086\u00a0\u00ad\u00b9\u00be\u00c7\u00d4\u00e5\u00e7"+
		"\u00fb\u0101\u0108\u011f\u0137\u0150\u0163\u0174\u0176\u0188\u0198\u01a5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}