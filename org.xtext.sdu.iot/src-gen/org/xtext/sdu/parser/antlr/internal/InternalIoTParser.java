package org.xtext.sdu.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.sdu.services.IoTGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalIoTParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'SensorTypes'", "','", "'Sensor'", "'of'", "'type'", "'SensorGroup'", "'include'", "'SensorGetMethod'", "'for'", "'('", "')'", "'DeviceTypes'", "'Device'", "'contains'", "'device'", "'group'", "'ServerTypes'", "'Server'", "'listens'", "'on'", "'and'", "'DestinationTypes'", "'Destination'", "'Fetch'", "'data'", "'from'", "'to'", "'destination'", "'server'", "'condition'", "'triggered'", "'every'", "'if'", "'else'", "'ms'", "'s'", "'m'", "'h'", "'||'", "'&&'", "'<'", "'<='", "'=='", "'>='", "'>'", "'true'", "'false'", "'.'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalIoTParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalIoTParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalIoTParser.tokenNames; }
    public String getGrammarFileName() { return "InternalIoT.g"; }



     	private IoTGrammarAccess grammarAccess;

        public InternalIoTParser(TokenStream input, IoTGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "System";
       	}

       	@Override
       	protected IoTGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleSystem"
    // InternalIoT.g:64:1: entryRuleSystem returns [EObject current=null] : iv_ruleSystem= ruleSystem EOF ;
    public final EObject entryRuleSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystem = null;


        try {
            // InternalIoT.g:64:47: (iv_ruleSystem= ruleSystem EOF )
            // InternalIoT.g:65:2: iv_ruleSystem= ruleSystem EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSystemRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSystem=ruleSystem();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSystem; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSystem"


    // $ANTLR start "ruleSystem"
    // InternalIoT.g:71:1: ruleSystem returns [EObject current=null] : ( ( (lv_system_0_1= ruleSensorTypes | lv_system_0_2= ruleSensor | lv_system_0_3= ruleSensorGroup | lv_system_0_4= ruleSensorGetMethod | lv_system_0_5= ruleDeviceTypes | lv_system_0_6= ruleDevice | lv_system_0_7= ruleServerTypes | lv_system_0_8= ruleServer | lv_system_0_9= ruleDestinationTypes | lv_system_0_10= ruleDestination | lv_system_0_11= ruleFetchData ) ) )+ ;
    public final EObject ruleSystem() throws RecognitionException {
        EObject current = null;

        EObject lv_system_0_1 = null;

        EObject lv_system_0_2 = null;

        EObject lv_system_0_3 = null;

        EObject lv_system_0_4 = null;

        EObject lv_system_0_5 = null;

        EObject lv_system_0_6 = null;

        EObject lv_system_0_7 = null;

        EObject lv_system_0_8 = null;

        EObject lv_system_0_9 = null;

        EObject lv_system_0_10 = null;

        EObject lv_system_0_11 = null;



        	enterRule();

        try {
            // InternalIoT.g:77:2: ( ( ( (lv_system_0_1= ruleSensorTypes | lv_system_0_2= ruleSensor | lv_system_0_3= ruleSensorGroup | lv_system_0_4= ruleSensorGetMethod | lv_system_0_5= ruleDeviceTypes | lv_system_0_6= ruleDevice | lv_system_0_7= ruleServerTypes | lv_system_0_8= ruleServer | lv_system_0_9= ruleDestinationTypes | lv_system_0_10= ruleDestination | lv_system_0_11= ruleFetchData ) ) )+ )
            // InternalIoT.g:78:2: ( ( (lv_system_0_1= ruleSensorTypes | lv_system_0_2= ruleSensor | lv_system_0_3= ruleSensorGroup | lv_system_0_4= ruleSensorGetMethod | lv_system_0_5= ruleDeviceTypes | lv_system_0_6= ruleDevice | lv_system_0_7= ruleServerTypes | lv_system_0_8= ruleServer | lv_system_0_9= ruleDestinationTypes | lv_system_0_10= ruleDestination | lv_system_0_11= ruleFetchData ) ) )+
            {
            // InternalIoT.g:78:2: ( ( (lv_system_0_1= ruleSensorTypes | lv_system_0_2= ruleSensor | lv_system_0_3= ruleSensorGroup | lv_system_0_4= ruleSensorGetMethod | lv_system_0_5= ruleDeviceTypes | lv_system_0_6= ruleDevice | lv_system_0_7= ruleServerTypes | lv_system_0_8= ruleServer | lv_system_0_9= ruleDestinationTypes | lv_system_0_10= ruleDestination | lv_system_0_11= ruleFetchData ) ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==11||LA2_0==13||LA2_0==16||LA2_0==18||(LA2_0>=22 && LA2_0<=23)||(LA2_0>=27 && LA2_0<=28)||(LA2_0>=32 && LA2_0<=34)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalIoT.g:79:3: ( (lv_system_0_1= ruleSensorTypes | lv_system_0_2= ruleSensor | lv_system_0_3= ruleSensorGroup | lv_system_0_4= ruleSensorGetMethod | lv_system_0_5= ruleDeviceTypes | lv_system_0_6= ruleDevice | lv_system_0_7= ruleServerTypes | lv_system_0_8= ruleServer | lv_system_0_9= ruleDestinationTypes | lv_system_0_10= ruleDestination | lv_system_0_11= ruleFetchData ) )
            	    {
            	    // InternalIoT.g:79:3: ( (lv_system_0_1= ruleSensorTypes | lv_system_0_2= ruleSensor | lv_system_0_3= ruleSensorGroup | lv_system_0_4= ruleSensorGetMethod | lv_system_0_5= ruleDeviceTypes | lv_system_0_6= ruleDevice | lv_system_0_7= ruleServerTypes | lv_system_0_8= ruleServer | lv_system_0_9= ruleDestinationTypes | lv_system_0_10= ruleDestination | lv_system_0_11= ruleFetchData ) )
            	    // InternalIoT.g:80:4: (lv_system_0_1= ruleSensorTypes | lv_system_0_2= ruleSensor | lv_system_0_3= ruleSensorGroup | lv_system_0_4= ruleSensorGetMethod | lv_system_0_5= ruleDeviceTypes | lv_system_0_6= ruleDevice | lv_system_0_7= ruleServerTypes | lv_system_0_8= ruleServer | lv_system_0_9= ruleDestinationTypes | lv_system_0_10= ruleDestination | lv_system_0_11= ruleFetchData )
            	    {
            	    // InternalIoT.g:80:4: (lv_system_0_1= ruleSensorTypes | lv_system_0_2= ruleSensor | lv_system_0_3= ruleSensorGroup | lv_system_0_4= ruleSensorGetMethod | lv_system_0_5= ruleDeviceTypes | lv_system_0_6= ruleDevice | lv_system_0_7= ruleServerTypes | lv_system_0_8= ruleServer | lv_system_0_9= ruleDestinationTypes | lv_system_0_10= ruleDestination | lv_system_0_11= ruleFetchData )
            	    int alt1=11;
            	    switch ( input.LA(1) ) {
            	    case 11:
            	        {
            	        alt1=1;
            	        }
            	        break;
            	    case 13:
            	        {
            	        alt1=2;
            	        }
            	        break;
            	    case 16:
            	        {
            	        alt1=3;
            	        }
            	        break;
            	    case 18:
            	        {
            	        alt1=4;
            	        }
            	        break;
            	    case 22:
            	        {
            	        alt1=5;
            	        }
            	        break;
            	    case 23:
            	        {
            	        alt1=6;
            	        }
            	        break;
            	    case 27:
            	        {
            	        alt1=7;
            	        }
            	        break;
            	    case 28:
            	        {
            	        alt1=8;
            	        }
            	        break;
            	    case 32:
            	        {
            	        alt1=9;
            	        }
            	        break;
            	    case 33:
            	        {
            	        alt1=10;
            	        }
            	        break;
            	    case 34:
            	        {
            	        alt1=11;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 1, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt1) {
            	        case 1 :
            	            // InternalIoT.g:81:5: lv_system_0_1= ruleSensorTypes
            	            {
            	            if ( state.backtracking==0 ) {

            	              					newCompositeNode(grammarAccess.getSystemAccess().getSystemSensorTypesParserRuleCall_0_0());
            	              				
            	            }
            	            pushFollow(FOLLOW_3);
            	            lv_system_0_1=ruleSensorTypes();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					if (current==null) {
            	              						current = createModelElementForParent(grammarAccess.getSystemRule());
            	              					}
            	              					add(
            	              						current,
            	              						"system",
            	              						lv_system_0_1,
            	              						"org.xtext.sdu.IoT.SensorTypes");
            	              					afterParserOrEnumRuleCall();
            	              				
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalIoT.g:97:5: lv_system_0_2= ruleSensor
            	            {
            	            if ( state.backtracking==0 ) {

            	              					newCompositeNode(grammarAccess.getSystemAccess().getSystemSensorParserRuleCall_0_1());
            	              				
            	            }
            	            pushFollow(FOLLOW_3);
            	            lv_system_0_2=ruleSensor();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					if (current==null) {
            	              						current = createModelElementForParent(grammarAccess.getSystemRule());
            	              					}
            	              					add(
            	              						current,
            	              						"system",
            	              						lv_system_0_2,
            	              						"org.xtext.sdu.IoT.Sensor");
            	              					afterParserOrEnumRuleCall();
            	              				
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // InternalIoT.g:113:5: lv_system_0_3= ruleSensorGroup
            	            {
            	            if ( state.backtracking==0 ) {

            	              					newCompositeNode(grammarAccess.getSystemAccess().getSystemSensorGroupParserRuleCall_0_2());
            	              				
            	            }
            	            pushFollow(FOLLOW_3);
            	            lv_system_0_3=ruleSensorGroup();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					if (current==null) {
            	              						current = createModelElementForParent(grammarAccess.getSystemRule());
            	              					}
            	              					add(
            	              						current,
            	              						"system",
            	              						lv_system_0_3,
            	              						"org.xtext.sdu.IoT.SensorGroup");
            	              					afterParserOrEnumRuleCall();
            	              				
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // InternalIoT.g:129:5: lv_system_0_4= ruleSensorGetMethod
            	            {
            	            if ( state.backtracking==0 ) {

            	              					newCompositeNode(grammarAccess.getSystemAccess().getSystemSensorGetMethodParserRuleCall_0_3());
            	              				
            	            }
            	            pushFollow(FOLLOW_3);
            	            lv_system_0_4=ruleSensorGetMethod();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					if (current==null) {
            	              						current = createModelElementForParent(grammarAccess.getSystemRule());
            	              					}
            	              					add(
            	              						current,
            	              						"system",
            	              						lv_system_0_4,
            	              						"org.xtext.sdu.IoT.SensorGetMethod");
            	              					afterParserOrEnumRuleCall();
            	              				
            	            }

            	            }
            	            break;
            	        case 5 :
            	            // InternalIoT.g:145:5: lv_system_0_5= ruleDeviceTypes
            	            {
            	            if ( state.backtracking==0 ) {

            	              					newCompositeNode(grammarAccess.getSystemAccess().getSystemDeviceTypesParserRuleCall_0_4());
            	              				
            	            }
            	            pushFollow(FOLLOW_3);
            	            lv_system_0_5=ruleDeviceTypes();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					if (current==null) {
            	              						current = createModelElementForParent(grammarAccess.getSystemRule());
            	              					}
            	              					add(
            	              						current,
            	              						"system",
            	              						lv_system_0_5,
            	              						"org.xtext.sdu.IoT.DeviceTypes");
            	              					afterParserOrEnumRuleCall();
            	              				
            	            }

            	            }
            	            break;
            	        case 6 :
            	            // InternalIoT.g:161:5: lv_system_0_6= ruleDevice
            	            {
            	            if ( state.backtracking==0 ) {

            	              					newCompositeNode(grammarAccess.getSystemAccess().getSystemDeviceParserRuleCall_0_5());
            	              				
            	            }
            	            pushFollow(FOLLOW_3);
            	            lv_system_0_6=ruleDevice();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					if (current==null) {
            	              						current = createModelElementForParent(grammarAccess.getSystemRule());
            	              					}
            	              					add(
            	              						current,
            	              						"system",
            	              						lv_system_0_6,
            	              						"org.xtext.sdu.IoT.Device");
            	              					afterParserOrEnumRuleCall();
            	              				
            	            }

            	            }
            	            break;
            	        case 7 :
            	            // InternalIoT.g:177:5: lv_system_0_7= ruleServerTypes
            	            {
            	            if ( state.backtracking==0 ) {

            	              					newCompositeNode(grammarAccess.getSystemAccess().getSystemServerTypesParserRuleCall_0_6());
            	              				
            	            }
            	            pushFollow(FOLLOW_3);
            	            lv_system_0_7=ruleServerTypes();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					if (current==null) {
            	              						current = createModelElementForParent(grammarAccess.getSystemRule());
            	              					}
            	              					add(
            	              						current,
            	              						"system",
            	              						lv_system_0_7,
            	              						"org.xtext.sdu.IoT.ServerTypes");
            	              					afterParserOrEnumRuleCall();
            	              				
            	            }

            	            }
            	            break;
            	        case 8 :
            	            // InternalIoT.g:193:5: lv_system_0_8= ruleServer
            	            {
            	            if ( state.backtracking==0 ) {

            	              					newCompositeNode(grammarAccess.getSystemAccess().getSystemServerParserRuleCall_0_7());
            	              				
            	            }
            	            pushFollow(FOLLOW_3);
            	            lv_system_0_8=ruleServer();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					if (current==null) {
            	              						current = createModelElementForParent(grammarAccess.getSystemRule());
            	              					}
            	              					add(
            	              						current,
            	              						"system",
            	              						lv_system_0_8,
            	              						"org.xtext.sdu.IoT.Server");
            	              					afterParserOrEnumRuleCall();
            	              				
            	            }

            	            }
            	            break;
            	        case 9 :
            	            // InternalIoT.g:209:5: lv_system_0_9= ruleDestinationTypes
            	            {
            	            if ( state.backtracking==0 ) {

            	              					newCompositeNode(grammarAccess.getSystemAccess().getSystemDestinationTypesParserRuleCall_0_8());
            	              				
            	            }
            	            pushFollow(FOLLOW_3);
            	            lv_system_0_9=ruleDestinationTypes();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					if (current==null) {
            	              						current = createModelElementForParent(grammarAccess.getSystemRule());
            	              					}
            	              					add(
            	              						current,
            	              						"system",
            	              						lv_system_0_9,
            	              						"org.xtext.sdu.IoT.DestinationTypes");
            	              					afterParserOrEnumRuleCall();
            	              				
            	            }

            	            }
            	            break;
            	        case 10 :
            	            // InternalIoT.g:225:5: lv_system_0_10= ruleDestination
            	            {
            	            if ( state.backtracking==0 ) {

            	              					newCompositeNode(grammarAccess.getSystemAccess().getSystemDestinationParserRuleCall_0_9());
            	              				
            	            }
            	            pushFollow(FOLLOW_3);
            	            lv_system_0_10=ruleDestination();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					if (current==null) {
            	              						current = createModelElementForParent(grammarAccess.getSystemRule());
            	              					}
            	              					add(
            	              						current,
            	              						"system",
            	              						lv_system_0_10,
            	              						"org.xtext.sdu.IoT.Destination");
            	              					afterParserOrEnumRuleCall();
            	              				
            	            }

            	            }
            	            break;
            	        case 11 :
            	            // InternalIoT.g:241:5: lv_system_0_11= ruleFetchData
            	            {
            	            if ( state.backtracking==0 ) {

            	              					newCompositeNode(grammarAccess.getSystemAccess().getSystemFetchDataParserRuleCall_0_10());
            	              				
            	            }
            	            pushFollow(FOLLOW_3);
            	            lv_system_0_11=ruleFetchData();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					if (current==null) {
            	              						current = createModelElementForParent(grammarAccess.getSystemRule());
            	              					}
            	              					add(
            	              						current,
            	              						"system",
            	              						lv_system_0_11,
            	              						"org.xtext.sdu.IoT.FetchData");
            	              					afterParserOrEnumRuleCall();
            	              				
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSystem"


    // $ANTLR start "entryRuleSensorType"
    // InternalIoT.g:262:1: entryRuleSensorType returns [EObject current=null] : iv_ruleSensorType= ruleSensorType EOF ;
    public final EObject entryRuleSensorType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensorType = null;


        try {
            // InternalIoT.g:262:51: (iv_ruleSensorType= ruleSensorType EOF )
            // InternalIoT.g:263:2: iv_ruleSensorType= ruleSensorType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSensorTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSensorType=ruleSensorType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSensorType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSensorType"


    // $ANTLR start "ruleSensorType"
    // InternalIoT.g:269:1: ruleSensorType returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleSensorType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalIoT.g:275:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalIoT.g:276:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalIoT.g:276:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalIoT.g:277:3: (lv_name_0_0= RULE_ID )
            {
            // InternalIoT.g:277:3: (lv_name_0_0= RULE_ID )
            // InternalIoT.g:278:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_name_0_0, grammarAccess.getSensorTypeAccess().getNameIDTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getSensorTypeRule());
              				}
              				setWithLastConsumed(
              					current,
              					"name",
              					lv_name_0_0,
              					"org.eclipse.xtext.common.Terminals.ID");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSensorType"


    // $ANTLR start "entryRuleSensorTypes"
    // InternalIoT.g:297:1: entryRuleSensorTypes returns [EObject current=null] : iv_ruleSensorTypes= ruleSensorTypes EOF ;
    public final EObject entryRuleSensorTypes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensorTypes = null;


        try {
            // InternalIoT.g:297:52: (iv_ruleSensorTypes= ruleSensorTypes EOF )
            // InternalIoT.g:298:2: iv_ruleSensorTypes= ruleSensorTypes EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSensorTypesRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSensorTypes=ruleSensorTypes();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSensorTypes; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSensorTypes"


    // $ANTLR start "ruleSensorTypes"
    // InternalIoT.g:304:1: ruleSensorTypes returns [EObject current=null] : (otherlv_0= 'SensorTypes' ( (lv_types_1_0= ruleSensorType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleSensorType ) ) )* ) ;
    public final EObject ruleSensorTypes() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_types_1_0 = null;

        EObject lv_types_3_0 = null;



        	enterRule();

        try {
            // InternalIoT.g:310:2: ( (otherlv_0= 'SensorTypes' ( (lv_types_1_0= ruleSensorType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleSensorType ) ) )* ) )
            // InternalIoT.g:311:2: (otherlv_0= 'SensorTypes' ( (lv_types_1_0= ruleSensorType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleSensorType ) ) )* )
            {
            // InternalIoT.g:311:2: (otherlv_0= 'SensorTypes' ( (lv_types_1_0= ruleSensorType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleSensorType ) ) )* )
            // InternalIoT.g:312:3: otherlv_0= 'SensorTypes' ( (lv_types_1_0= ruleSensorType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleSensorType ) ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSensorTypesAccess().getSensorTypesKeyword_0());
              		
            }
            // InternalIoT.g:316:3: ( (lv_types_1_0= ruleSensorType ) )
            // InternalIoT.g:317:4: (lv_types_1_0= ruleSensorType )
            {
            // InternalIoT.g:317:4: (lv_types_1_0= ruleSensorType )
            // InternalIoT.g:318:5: lv_types_1_0= ruleSensorType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSensorTypesAccess().getTypesSensorTypeParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_5);
            lv_types_1_0=ruleSensorType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSensorTypesRule());
              					}
              					add(
              						current,
              						"types",
              						lv_types_1_0,
              						"org.xtext.sdu.IoT.SensorType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalIoT.g:335:3: (otherlv_2= ',' ( (lv_types_3_0= ruleSensorType ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==12) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalIoT.g:336:4: otherlv_2= ',' ( (lv_types_3_0= ruleSensorType ) )
            	    {
            	    otherlv_2=(Token)match(input,12,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getSensorTypesAccess().getCommaKeyword_2_0());
            	      			
            	    }
            	    // InternalIoT.g:340:4: ( (lv_types_3_0= ruleSensorType ) )
            	    // InternalIoT.g:341:5: (lv_types_3_0= ruleSensorType )
            	    {
            	    // InternalIoT.g:341:5: (lv_types_3_0= ruleSensorType )
            	    // InternalIoT.g:342:6: lv_types_3_0= ruleSensorType
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getSensorTypesAccess().getTypesSensorTypeParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_5);
            	    lv_types_3_0=ruleSensorType();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getSensorTypesRule());
            	      						}
            	      						add(
            	      							current,
            	      							"types",
            	      							lv_types_3_0,
            	      							"org.xtext.sdu.IoT.SensorType");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSensorTypes"


    // $ANTLR start "entryRuleSensor"
    // InternalIoT.g:364:1: entryRuleSensor returns [EObject current=null] : iv_ruleSensor= ruleSensor EOF ;
    public final EObject entryRuleSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensor = null;


        try {
            // InternalIoT.g:364:47: (iv_ruleSensor= ruleSensor EOF )
            // InternalIoT.g:365:2: iv_ruleSensor= ruleSensor EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSensorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSensor=ruleSensor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSensor; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSensor"


    // $ANTLR start "ruleSensor"
    // InternalIoT.g:371:1: ruleSensor returns [EObject current=null] : (otherlv_0= 'Sensor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'of' otherlv_3= 'type' ( (otherlv_4= RULE_ID ) ) ) ;
    public final EObject ruleSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalIoT.g:377:2: ( (otherlv_0= 'Sensor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'of' otherlv_3= 'type' ( (otherlv_4= RULE_ID ) ) ) )
            // InternalIoT.g:378:2: (otherlv_0= 'Sensor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'of' otherlv_3= 'type' ( (otherlv_4= RULE_ID ) ) )
            {
            // InternalIoT.g:378:2: (otherlv_0= 'Sensor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'of' otherlv_3= 'type' ( (otherlv_4= RULE_ID ) ) )
            // InternalIoT.g:379:3: otherlv_0= 'Sensor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'of' otherlv_3= 'type' ( (otherlv_4= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSensorAccess().getSensorKeyword_0());
              		
            }
            // InternalIoT.g:383:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalIoT.g:384:4: (lv_name_1_0= RULE_ID )
            {
            // InternalIoT.g:384:4: (lv_name_1_0= RULE_ID )
            // InternalIoT.g:385:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getSensorAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getSensorRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getSensorAccess().getOfKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,15,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getSensorAccess().getTypeKeyword_3());
              		
            }
            // InternalIoT.g:409:3: ( (otherlv_4= RULE_ID ) )
            // InternalIoT.g:410:4: (otherlv_4= RULE_ID )
            {
            // InternalIoT.g:410:4: (otherlv_4= RULE_ID )
            // InternalIoT.g:411:5: otherlv_4= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getSensorRule());
              					}
              				
            }
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_4, grammarAccess.getSensorAccess().getTypeSensorTypeCrossReference_4_0());
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSensor"


    // $ANTLR start "entryRuleSensorGroup"
    // InternalIoT.g:426:1: entryRuleSensorGroup returns [EObject current=null] : iv_ruleSensorGroup= ruleSensorGroup EOF ;
    public final EObject entryRuleSensorGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensorGroup = null;


        try {
            // InternalIoT.g:426:52: (iv_ruleSensorGroup= ruleSensorGroup EOF )
            // InternalIoT.g:427:2: iv_ruleSensorGroup= ruleSensorGroup EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSensorGroupRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSensorGroup=ruleSensorGroup();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSensorGroup; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSensorGroup"


    // $ANTLR start "ruleSensorGroup"
    // InternalIoT.g:433:1: ruleSensorGroup returns [EObject current=null] : (otherlv_0= 'SensorGroup' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'include' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* ) ;
    public final EObject ruleSensorGroup() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalIoT.g:439:2: ( (otherlv_0= 'SensorGroup' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'include' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* ) )
            // InternalIoT.g:440:2: (otherlv_0= 'SensorGroup' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'include' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )
            {
            // InternalIoT.g:440:2: (otherlv_0= 'SensorGroup' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'include' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )
            // InternalIoT.g:441:3: otherlv_0= 'SensorGroup' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'include' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )*
            {
            otherlv_0=(Token)match(input,16,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSensorGroupAccess().getSensorGroupKeyword_0());
              		
            }
            // InternalIoT.g:445:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalIoT.g:446:4: (lv_name_1_0= RULE_ID )
            {
            // InternalIoT.g:446:4: (lv_name_1_0= RULE_ID )
            // InternalIoT.g:447:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getSensorGroupAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getSensorGroupRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getSensorGroupAccess().getIncludeKeyword_2());
              		
            }
            // InternalIoT.g:467:3: ( (otherlv_3= RULE_ID ) )
            // InternalIoT.g:468:4: (otherlv_3= RULE_ID )
            {
            // InternalIoT.g:468:4: (otherlv_3= RULE_ID )
            // InternalIoT.g:469:5: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getSensorGroupRule());
              					}
              				
            }
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_3, grammarAccess.getSensorGroupAccess().getSensorsSensorCrossReference_3_0());
              				
            }

            }


            }

            // InternalIoT.g:480:3: (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==12) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalIoT.g:481:4: otherlv_4= ',' ( (otherlv_5= RULE_ID ) )
            	    {
            	    otherlv_4=(Token)match(input,12,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_4, grammarAccess.getSensorGroupAccess().getCommaKeyword_4_0());
            	      			
            	    }
            	    // InternalIoT.g:485:4: ( (otherlv_5= RULE_ID ) )
            	    // InternalIoT.g:486:5: (otherlv_5= RULE_ID )
            	    {
            	    // InternalIoT.g:486:5: (otherlv_5= RULE_ID )
            	    // InternalIoT.g:487:6: otherlv_5= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getSensorGroupRule());
            	      						}
            	      					
            	    }
            	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(otherlv_5, grammarAccess.getSensorGroupAccess().getSensorsSensorCrossReference_4_1_0());
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSensorGroup"


    // $ANTLR start "entryRuleSensorGetMethod"
    // InternalIoT.g:503:1: entryRuleSensorGetMethod returns [EObject current=null] : iv_ruleSensorGetMethod= ruleSensorGetMethod EOF ;
    public final EObject entryRuleSensorGetMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensorGetMethod = null;


        try {
            // InternalIoT.g:503:56: (iv_ruleSensorGetMethod= ruleSensorGetMethod EOF )
            // InternalIoT.g:504:2: iv_ruleSensorGetMethod= ruleSensorGetMethod EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSensorGetMethodRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSensorGetMethod=ruleSensorGetMethod();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSensorGetMethod; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSensorGetMethod"


    // $ANTLR start "ruleSensorGetMethod"
    // InternalIoT.g:510:1: ruleSensorGetMethod returns [EObject current=null] : (otherlv_0= 'SensorGetMethod' ( (lv_method_1_0= ruleMethod ) ) otherlv_2= 'for' otherlv_3= 'type' ( (otherlv_4= RULE_ID ) ) ) ;
    public final EObject ruleSensorGetMethod() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_method_1_0 = null;



        	enterRule();

        try {
            // InternalIoT.g:516:2: ( (otherlv_0= 'SensorGetMethod' ( (lv_method_1_0= ruleMethod ) ) otherlv_2= 'for' otherlv_3= 'type' ( (otherlv_4= RULE_ID ) ) ) )
            // InternalIoT.g:517:2: (otherlv_0= 'SensorGetMethod' ( (lv_method_1_0= ruleMethod ) ) otherlv_2= 'for' otherlv_3= 'type' ( (otherlv_4= RULE_ID ) ) )
            {
            // InternalIoT.g:517:2: (otherlv_0= 'SensorGetMethod' ( (lv_method_1_0= ruleMethod ) ) otherlv_2= 'for' otherlv_3= 'type' ( (otherlv_4= RULE_ID ) ) )
            // InternalIoT.g:518:3: otherlv_0= 'SensorGetMethod' ( (lv_method_1_0= ruleMethod ) ) otherlv_2= 'for' otherlv_3= 'type' ( (otherlv_4= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSensorGetMethodAccess().getSensorGetMethodKeyword_0());
              		
            }
            // InternalIoT.g:522:3: ( (lv_method_1_0= ruleMethod ) )
            // InternalIoT.g:523:4: (lv_method_1_0= ruleMethod )
            {
            // InternalIoT.g:523:4: (lv_method_1_0= ruleMethod )
            // InternalIoT.g:524:5: lv_method_1_0= ruleMethod
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSensorGetMethodAccess().getMethodMethodParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_9);
            lv_method_1_0=ruleMethod();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSensorGetMethodRule());
              					}
              					set(
              						current,
              						"method",
              						lv_method_1_0,
              						"org.xtext.sdu.IoT.Method");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getSensorGetMethodAccess().getForKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,15,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getSensorGetMethodAccess().getTypeKeyword_3());
              		
            }
            // InternalIoT.g:549:3: ( (otherlv_4= RULE_ID ) )
            // InternalIoT.g:550:4: (otherlv_4= RULE_ID )
            {
            // InternalIoT.g:550:4: (otherlv_4= RULE_ID )
            // InternalIoT.g:551:5: otherlv_4= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getSensorGetMethodRule());
              					}
              				
            }
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_4, grammarAccess.getSensorGetMethodAccess().getTypeSensorTypeCrossReference_4_0());
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSensorGetMethod"


    // $ANTLR start "entryRuleMethod"
    // InternalIoT.g:566:1: entryRuleMethod returns [EObject current=null] : iv_ruleMethod= ruleMethod EOF ;
    public final EObject entryRuleMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethod = null;


        try {
            // InternalIoT.g:566:47: (iv_ruleMethod= ruleMethod EOF )
            // InternalIoT.g:567:2: iv_ruleMethod= ruleMethod EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMethodRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMethod=ruleMethod();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMethod; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMethod"


    // $ANTLR start "ruleMethod"
    // InternalIoT.g:573:1: ruleMethod returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parameters_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_parameters_4_0= RULE_ID ) ) )* )? otherlv_5= ')' ) ;
    public final EObject ruleMethod() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_parameters_2_0=null;
        Token otherlv_3=null;
        Token lv_parameters_4_0=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalIoT.g:579:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parameters_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_parameters_4_0= RULE_ID ) ) )* )? otherlv_5= ')' ) )
            // InternalIoT.g:580:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parameters_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_parameters_4_0= RULE_ID ) ) )* )? otherlv_5= ')' )
            {
            // InternalIoT.g:580:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parameters_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_parameters_4_0= RULE_ID ) ) )* )? otherlv_5= ')' )
            // InternalIoT.g:581:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_parameters_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_parameters_4_0= RULE_ID ) ) )* )? otherlv_5= ')'
            {
            // InternalIoT.g:581:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalIoT.g:582:4: (lv_name_0_0= RULE_ID )
            {
            // InternalIoT.g:582:4: (lv_name_0_0= RULE_ID )
            // InternalIoT.g:583:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_0_0, grammarAccess.getMethodAccess().getNameIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getMethodRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_0_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getMethodAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalIoT.g:603:3: ( ( (lv_parameters_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_parameters_4_0= RULE_ID ) ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalIoT.g:604:4: ( (lv_parameters_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_parameters_4_0= RULE_ID ) ) )*
                    {
                    // InternalIoT.g:604:4: ( (lv_parameters_2_0= RULE_ID ) )
                    // InternalIoT.g:605:5: (lv_parameters_2_0= RULE_ID )
                    {
                    // InternalIoT.g:605:5: (lv_parameters_2_0= RULE_ID )
                    // InternalIoT.g:606:6: lv_parameters_2_0= RULE_ID
                    {
                    lv_parameters_2_0=(Token)match(input,RULE_ID,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_parameters_2_0, grammarAccess.getMethodAccess().getParametersIDTerminalRuleCall_2_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getMethodRule());
                      						}
                      						addWithLastConsumed(
                      							current,
                      							"parameters",
                      							lv_parameters_2_0,
                      							"org.eclipse.xtext.common.Terminals.ID");
                      					
                    }

                    }


                    }

                    // InternalIoT.g:622:4: (otherlv_3= ',' ( (lv_parameters_4_0= RULE_ID ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==12) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalIoT.g:623:5: otherlv_3= ',' ( (lv_parameters_4_0= RULE_ID ) )
                    	    {
                    	    otherlv_3=(Token)match(input,12,FOLLOW_4); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getMethodAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalIoT.g:627:5: ( (lv_parameters_4_0= RULE_ID ) )
                    	    // InternalIoT.g:628:6: (lv_parameters_4_0= RULE_ID )
                    	    {
                    	    // InternalIoT.g:628:6: (lv_parameters_4_0= RULE_ID )
                    	    // InternalIoT.g:629:7: lv_parameters_4_0= RULE_ID
                    	    {
                    	    lv_parameters_4_0=(Token)match(input,RULE_ID,FOLLOW_12); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							newLeafNode(lv_parameters_4_0, grammarAccess.getMethodAccess().getParametersIDTerminalRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElement(grammarAccess.getMethodRule());
                    	      							}
                    	      							addWithLastConsumed(
                    	      								current,
                    	      								"parameters",
                    	      								lv_parameters_4_0,
                    	      								"org.eclipse.xtext.common.Terminals.ID");
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getMethodAccess().getRightParenthesisKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMethod"


    // $ANTLR start "entryRuleDeviceType"
    // InternalIoT.g:655:1: entryRuleDeviceType returns [EObject current=null] : iv_ruleDeviceType= ruleDeviceType EOF ;
    public final EObject entryRuleDeviceType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeviceType = null;


        try {
            // InternalIoT.g:655:51: (iv_ruleDeviceType= ruleDeviceType EOF )
            // InternalIoT.g:656:2: iv_ruleDeviceType= ruleDeviceType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDeviceTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDeviceType=ruleDeviceType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDeviceType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeviceType"


    // $ANTLR start "ruleDeviceType"
    // InternalIoT.g:662:1: ruleDeviceType returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleDeviceType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalIoT.g:668:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalIoT.g:669:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalIoT.g:669:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalIoT.g:670:3: (lv_name_0_0= RULE_ID )
            {
            // InternalIoT.g:670:3: (lv_name_0_0= RULE_ID )
            // InternalIoT.g:671:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_name_0_0, grammarAccess.getDeviceTypeAccess().getNameIDTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getDeviceTypeRule());
              				}
              				setWithLastConsumed(
              					current,
              					"name",
              					lv_name_0_0,
              					"org.eclipse.xtext.common.Terminals.ID");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeviceType"


    // $ANTLR start "entryRuleDeviceTypes"
    // InternalIoT.g:690:1: entryRuleDeviceTypes returns [EObject current=null] : iv_ruleDeviceTypes= ruleDeviceTypes EOF ;
    public final EObject entryRuleDeviceTypes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeviceTypes = null;


        try {
            // InternalIoT.g:690:52: (iv_ruleDeviceTypes= ruleDeviceTypes EOF )
            // InternalIoT.g:691:2: iv_ruleDeviceTypes= ruleDeviceTypes EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDeviceTypesRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDeviceTypes=ruleDeviceTypes();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDeviceTypes; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeviceTypes"


    // $ANTLR start "ruleDeviceTypes"
    // InternalIoT.g:697:1: ruleDeviceTypes returns [EObject current=null] : (otherlv_0= 'DeviceTypes' ( (lv_types_1_0= ruleDeviceType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleDeviceType ) ) )* ) ;
    public final EObject ruleDeviceTypes() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_types_1_0 = null;

        EObject lv_types_3_0 = null;



        	enterRule();

        try {
            // InternalIoT.g:703:2: ( (otherlv_0= 'DeviceTypes' ( (lv_types_1_0= ruleDeviceType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleDeviceType ) ) )* ) )
            // InternalIoT.g:704:2: (otherlv_0= 'DeviceTypes' ( (lv_types_1_0= ruleDeviceType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleDeviceType ) ) )* )
            {
            // InternalIoT.g:704:2: (otherlv_0= 'DeviceTypes' ( (lv_types_1_0= ruleDeviceType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleDeviceType ) ) )* )
            // InternalIoT.g:705:3: otherlv_0= 'DeviceTypes' ( (lv_types_1_0= ruleDeviceType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleDeviceType ) ) )*
            {
            otherlv_0=(Token)match(input,22,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDeviceTypesAccess().getDeviceTypesKeyword_0());
              		
            }
            // InternalIoT.g:709:3: ( (lv_types_1_0= ruleDeviceType ) )
            // InternalIoT.g:710:4: (lv_types_1_0= ruleDeviceType )
            {
            // InternalIoT.g:710:4: (lv_types_1_0= ruleDeviceType )
            // InternalIoT.g:711:5: lv_types_1_0= ruleDeviceType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDeviceTypesAccess().getTypesDeviceTypeParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_5);
            lv_types_1_0=ruleDeviceType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDeviceTypesRule());
              					}
              					add(
              						current,
              						"types",
              						lv_types_1_0,
              						"org.xtext.sdu.IoT.DeviceType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalIoT.g:728:3: (otherlv_2= ',' ( (lv_types_3_0= ruleDeviceType ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==12) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalIoT.g:729:4: otherlv_2= ',' ( (lv_types_3_0= ruleDeviceType ) )
            	    {
            	    otherlv_2=(Token)match(input,12,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getDeviceTypesAccess().getCommaKeyword_2_0());
            	      			
            	    }
            	    // InternalIoT.g:733:4: ( (lv_types_3_0= ruleDeviceType ) )
            	    // InternalIoT.g:734:5: (lv_types_3_0= ruleDeviceType )
            	    {
            	    // InternalIoT.g:734:5: (lv_types_3_0= ruleDeviceType )
            	    // InternalIoT.g:735:6: lv_types_3_0= ruleDeviceType
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDeviceTypesAccess().getTypesDeviceTypeParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_5);
            	    lv_types_3_0=ruleDeviceType();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getDeviceTypesRule());
            	      						}
            	      						add(
            	      							current,
            	      							"types",
            	      							lv_types_3_0,
            	      							"org.xtext.sdu.IoT.DeviceType");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeviceTypes"


    // $ANTLR start "entryRuleDevice"
    // InternalIoT.g:757:1: entryRuleDevice returns [EObject current=null] : iv_ruleDevice= ruleDevice EOF ;
    public final EObject entryRuleDevice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDevice = null;


        try {
            // InternalIoT.g:757:47: (iv_ruleDevice= ruleDevice EOF )
            // InternalIoT.g:758:2: iv_ruleDevice= ruleDevice EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDeviceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDevice=ruleDevice();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDevice; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDevice"


    // $ANTLR start "ruleDevice"
    // InternalIoT.g:764:1: ruleDevice returns [EObject current=null] : (otherlv_0= 'Device' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'of' otherlv_3= 'type' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'contains' ( (otherlv_6= 'device' ( (otherlv_7= RULE_ID ) ) ) | (otherlv_8= 'group' ( (otherlv_9= RULE_ID ) ) ) ) ) ;
    public final EObject ruleDevice() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;


        	enterRule();

        try {
            // InternalIoT.g:770:2: ( (otherlv_0= 'Device' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'of' otherlv_3= 'type' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'contains' ( (otherlv_6= 'device' ( (otherlv_7= RULE_ID ) ) ) | (otherlv_8= 'group' ( (otherlv_9= RULE_ID ) ) ) ) ) )
            // InternalIoT.g:771:2: (otherlv_0= 'Device' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'of' otherlv_3= 'type' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'contains' ( (otherlv_6= 'device' ( (otherlv_7= RULE_ID ) ) ) | (otherlv_8= 'group' ( (otherlv_9= RULE_ID ) ) ) ) )
            {
            // InternalIoT.g:771:2: (otherlv_0= 'Device' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'of' otherlv_3= 'type' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'contains' ( (otherlv_6= 'device' ( (otherlv_7= RULE_ID ) ) ) | (otherlv_8= 'group' ( (otherlv_9= RULE_ID ) ) ) ) )
            // InternalIoT.g:772:3: otherlv_0= 'Device' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'of' otherlv_3= 'type' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'contains' ( (otherlv_6= 'device' ( (otherlv_7= RULE_ID ) ) ) | (otherlv_8= 'group' ( (otherlv_9= RULE_ID ) ) ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDeviceAccess().getDeviceKeyword_0());
              		
            }
            // InternalIoT.g:776:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalIoT.g:777:4: (lv_name_1_0= RULE_ID )
            {
            // InternalIoT.g:777:4: (lv_name_1_0= RULE_ID )
            // InternalIoT.g:778:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getDeviceAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDeviceRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getDeviceAccess().getOfKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,15,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getDeviceAccess().getTypeKeyword_3());
              		
            }
            // InternalIoT.g:802:3: ( (otherlv_4= RULE_ID ) )
            // InternalIoT.g:803:4: (otherlv_4= RULE_ID )
            {
            // InternalIoT.g:803:4: (otherlv_4= RULE_ID )
            // InternalIoT.g:804:5: otherlv_4= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDeviceRule());
              					}
              				
            }
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_4, grammarAccess.getDeviceAccess().getTypeDeviceTypeCrossReference_4_0());
              				
            }

            }


            }

            otherlv_5=(Token)match(input,24,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getDeviceAccess().getContainsKeyword_5());
              		
            }
            // InternalIoT.g:819:3: ( (otherlv_6= 'device' ( (otherlv_7= RULE_ID ) ) ) | (otherlv_8= 'group' ( (otherlv_9= RULE_ID ) ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==25) ) {
                alt8=1;
            }
            else if ( (LA8_0==26) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalIoT.g:820:4: (otherlv_6= 'device' ( (otherlv_7= RULE_ID ) ) )
                    {
                    // InternalIoT.g:820:4: (otherlv_6= 'device' ( (otherlv_7= RULE_ID ) ) )
                    // InternalIoT.g:821:5: otherlv_6= 'device' ( (otherlv_7= RULE_ID ) )
                    {
                    otherlv_6=(Token)match(input,25,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_6, grammarAccess.getDeviceAccess().getDeviceKeyword_6_0_0());
                      				
                    }
                    // InternalIoT.g:825:5: ( (otherlv_7= RULE_ID ) )
                    // InternalIoT.g:826:6: (otherlv_7= RULE_ID )
                    {
                    // InternalIoT.g:826:6: (otherlv_7= RULE_ID )
                    // InternalIoT.g:827:7: otherlv_7= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getDeviceRule());
                      							}
                      						
                    }
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							newLeafNode(otherlv_7, grammarAccess.getDeviceAccess().getDevicesDeviceCrossReference_6_0_1_0());
                      						
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalIoT.g:840:4: (otherlv_8= 'group' ( (otherlv_9= RULE_ID ) ) )
                    {
                    // InternalIoT.g:840:4: (otherlv_8= 'group' ( (otherlv_9= RULE_ID ) ) )
                    // InternalIoT.g:841:5: otherlv_8= 'group' ( (otherlv_9= RULE_ID ) )
                    {
                    otherlv_8=(Token)match(input,26,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_8, grammarAccess.getDeviceAccess().getGroupKeyword_6_1_0());
                      				
                    }
                    // InternalIoT.g:845:5: ( (otherlv_9= RULE_ID ) )
                    // InternalIoT.g:846:6: (otherlv_9= RULE_ID )
                    {
                    // InternalIoT.g:846:6: (otherlv_9= RULE_ID )
                    // InternalIoT.g:847:7: otherlv_9= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getDeviceRule());
                      							}
                      						
                    }
                    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							newLeafNode(otherlv_9, grammarAccess.getDeviceAccess().getDevicesSensorGroupCrossReference_6_1_1_0());
                      						
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDevice"


    // $ANTLR start "entryRuleServerType"
    // InternalIoT.g:864:1: entryRuleServerType returns [EObject current=null] : iv_ruleServerType= ruleServerType EOF ;
    public final EObject entryRuleServerType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServerType = null;


        try {
            // InternalIoT.g:864:51: (iv_ruleServerType= ruleServerType EOF )
            // InternalIoT.g:865:2: iv_ruleServerType= ruleServerType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getServerTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleServerType=ruleServerType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleServerType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleServerType"


    // $ANTLR start "ruleServerType"
    // InternalIoT.g:871:1: ruleServerType returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleServerType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalIoT.g:877:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalIoT.g:878:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalIoT.g:878:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalIoT.g:879:3: (lv_name_0_0= RULE_ID )
            {
            // InternalIoT.g:879:3: (lv_name_0_0= RULE_ID )
            // InternalIoT.g:880:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_name_0_0, grammarAccess.getServerTypeAccess().getNameIDTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getServerTypeRule());
              				}
              				setWithLastConsumed(
              					current,
              					"name",
              					lv_name_0_0,
              					"org.eclipse.xtext.common.Terminals.ID");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleServerType"


    // $ANTLR start "entryRuleServerTypes"
    // InternalIoT.g:899:1: entryRuleServerTypes returns [EObject current=null] : iv_ruleServerTypes= ruleServerTypes EOF ;
    public final EObject entryRuleServerTypes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServerTypes = null;


        try {
            // InternalIoT.g:899:52: (iv_ruleServerTypes= ruleServerTypes EOF )
            // InternalIoT.g:900:2: iv_ruleServerTypes= ruleServerTypes EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getServerTypesRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleServerTypes=ruleServerTypes();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleServerTypes; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleServerTypes"


    // $ANTLR start "ruleServerTypes"
    // InternalIoT.g:906:1: ruleServerTypes returns [EObject current=null] : (otherlv_0= 'ServerTypes' ( (lv_types_1_0= ruleServerType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleServerType ) ) )* ) ;
    public final EObject ruleServerTypes() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_types_1_0 = null;

        EObject lv_types_3_0 = null;



        	enterRule();

        try {
            // InternalIoT.g:912:2: ( (otherlv_0= 'ServerTypes' ( (lv_types_1_0= ruleServerType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleServerType ) ) )* ) )
            // InternalIoT.g:913:2: (otherlv_0= 'ServerTypes' ( (lv_types_1_0= ruleServerType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleServerType ) ) )* )
            {
            // InternalIoT.g:913:2: (otherlv_0= 'ServerTypes' ( (lv_types_1_0= ruleServerType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleServerType ) ) )* )
            // InternalIoT.g:914:3: otherlv_0= 'ServerTypes' ( (lv_types_1_0= ruleServerType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleServerType ) ) )*
            {
            otherlv_0=(Token)match(input,27,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getServerTypesAccess().getServerTypesKeyword_0());
              		
            }
            // InternalIoT.g:918:3: ( (lv_types_1_0= ruleServerType ) )
            // InternalIoT.g:919:4: (lv_types_1_0= ruleServerType )
            {
            // InternalIoT.g:919:4: (lv_types_1_0= ruleServerType )
            // InternalIoT.g:920:5: lv_types_1_0= ruleServerType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getServerTypesAccess().getTypesServerTypeParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_5);
            lv_types_1_0=ruleServerType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getServerTypesRule());
              					}
              					add(
              						current,
              						"types",
              						lv_types_1_0,
              						"org.xtext.sdu.IoT.ServerType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalIoT.g:937:3: (otherlv_2= ',' ( (lv_types_3_0= ruleServerType ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==12) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalIoT.g:938:4: otherlv_2= ',' ( (lv_types_3_0= ruleServerType ) )
            	    {
            	    otherlv_2=(Token)match(input,12,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getServerTypesAccess().getCommaKeyword_2_0());
            	      			
            	    }
            	    // InternalIoT.g:942:4: ( (lv_types_3_0= ruleServerType ) )
            	    // InternalIoT.g:943:5: (lv_types_3_0= ruleServerType )
            	    {
            	    // InternalIoT.g:943:5: (lv_types_3_0= ruleServerType )
            	    // InternalIoT.g:944:6: lv_types_3_0= ruleServerType
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getServerTypesAccess().getTypesServerTypeParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_5);
            	    lv_types_3_0=ruleServerType();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getServerTypesRule());
            	      						}
            	      						add(
            	      							current,
            	      							"types",
            	      							lv_types_3_0,
            	      							"org.xtext.sdu.IoT.ServerType");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleServerTypes"


    // $ANTLR start "entryRuleServer"
    // InternalIoT.g:966:1: entryRuleServer returns [EObject current=null] : iv_ruleServer= ruleServer EOF ;
    public final EObject entryRuleServer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServer = null;


        try {
            // InternalIoT.g:966:47: (iv_ruleServer= ruleServer EOF )
            // InternalIoT.g:967:2: iv_ruleServer= ruleServer EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getServerRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleServer=ruleServer();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleServer; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleServer"


    // $ANTLR start "ruleServer"
    // InternalIoT.g:973:1: ruleServer returns [EObject current=null] : (otherlv_0= 'Server' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'of' otherlv_3= 'type' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'listens' otherlv_6= 'on' ( (lv_ip_7_0= ruleIp ) ) otherlv_8= 'and' ( (lv_port_9_0= rulePortnumber ) ) ) ;
    public final EObject ruleServer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_ip_7_0 = null;

        EObject lv_port_9_0 = null;



        	enterRule();

        try {
            // InternalIoT.g:979:2: ( (otherlv_0= 'Server' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'of' otherlv_3= 'type' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'listens' otherlv_6= 'on' ( (lv_ip_7_0= ruleIp ) ) otherlv_8= 'and' ( (lv_port_9_0= rulePortnumber ) ) ) )
            // InternalIoT.g:980:2: (otherlv_0= 'Server' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'of' otherlv_3= 'type' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'listens' otherlv_6= 'on' ( (lv_ip_7_0= ruleIp ) ) otherlv_8= 'and' ( (lv_port_9_0= rulePortnumber ) ) )
            {
            // InternalIoT.g:980:2: (otherlv_0= 'Server' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'of' otherlv_3= 'type' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'listens' otherlv_6= 'on' ( (lv_ip_7_0= ruleIp ) ) otherlv_8= 'and' ( (lv_port_9_0= rulePortnumber ) ) )
            // InternalIoT.g:981:3: otherlv_0= 'Server' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'of' otherlv_3= 'type' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'listens' otherlv_6= 'on' ( (lv_ip_7_0= ruleIp ) ) otherlv_8= 'and' ( (lv_port_9_0= rulePortnumber ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getServerAccess().getServerKeyword_0());
              		
            }
            // InternalIoT.g:985:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalIoT.g:986:4: (lv_name_1_0= RULE_ID )
            {
            // InternalIoT.g:986:4: (lv_name_1_0= RULE_ID )
            // InternalIoT.g:987:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getServerAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getServerRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getServerAccess().getOfKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,15,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getServerAccess().getTypeKeyword_3());
              		
            }
            // InternalIoT.g:1011:3: ( (otherlv_4= RULE_ID ) )
            // InternalIoT.g:1012:4: (otherlv_4= RULE_ID )
            {
            // InternalIoT.g:1012:4: (otherlv_4= RULE_ID )
            // InternalIoT.g:1013:5: otherlv_4= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getServerRule());
              					}
              				
            }
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_4, grammarAccess.getServerAccess().getTypeServerTypeCrossReference_4_0());
              				
            }

            }


            }

            otherlv_5=(Token)match(input,29,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getServerAccess().getListensKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,30,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getServerAccess().getOnKeyword_6());
              		
            }
            // InternalIoT.g:1032:3: ( (lv_ip_7_0= ruleIp ) )
            // InternalIoT.g:1033:4: (lv_ip_7_0= ruleIp )
            {
            // InternalIoT.g:1033:4: (lv_ip_7_0= ruleIp )
            // InternalIoT.g:1034:5: lv_ip_7_0= ruleIp
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getServerAccess().getIpIpParserRuleCall_7_0());
              				
            }
            pushFollow(FOLLOW_18);
            lv_ip_7_0=ruleIp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getServerRule());
              					}
              					set(
              						current,
              						"ip",
              						lv_ip_7_0,
              						"org.xtext.sdu.IoT.Ip");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_8=(Token)match(input,31,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getServerAccess().getAndKeyword_8());
              		
            }
            // InternalIoT.g:1055:3: ( (lv_port_9_0= rulePortnumber ) )
            // InternalIoT.g:1056:4: (lv_port_9_0= rulePortnumber )
            {
            // InternalIoT.g:1056:4: (lv_port_9_0= rulePortnumber )
            // InternalIoT.g:1057:5: lv_port_9_0= rulePortnumber
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getServerAccess().getPortPortnumberParserRuleCall_9_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_port_9_0=rulePortnumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getServerRule());
              					}
              					set(
              						current,
              						"port",
              						lv_port_9_0,
              						"org.xtext.sdu.IoT.Portnumber");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleServer"


    // $ANTLR start "entryRuleDestinationType"
    // InternalIoT.g:1078:1: entryRuleDestinationType returns [EObject current=null] : iv_ruleDestinationType= ruleDestinationType EOF ;
    public final EObject entryRuleDestinationType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDestinationType = null;


        try {
            // InternalIoT.g:1078:56: (iv_ruleDestinationType= ruleDestinationType EOF )
            // InternalIoT.g:1079:2: iv_ruleDestinationType= ruleDestinationType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDestinationTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDestinationType=ruleDestinationType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDestinationType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDestinationType"


    // $ANTLR start "ruleDestinationType"
    // InternalIoT.g:1085:1: ruleDestinationType returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleDestinationType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalIoT.g:1091:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalIoT.g:1092:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalIoT.g:1092:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalIoT.g:1093:3: (lv_name_0_0= RULE_ID )
            {
            // InternalIoT.g:1093:3: (lv_name_0_0= RULE_ID )
            // InternalIoT.g:1094:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_name_0_0, grammarAccess.getDestinationTypeAccess().getNameIDTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getDestinationTypeRule());
              				}
              				setWithLastConsumed(
              					current,
              					"name",
              					lv_name_0_0,
              					"org.eclipse.xtext.common.Terminals.ID");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDestinationType"


    // $ANTLR start "entryRuleDestinationTypes"
    // InternalIoT.g:1113:1: entryRuleDestinationTypes returns [EObject current=null] : iv_ruleDestinationTypes= ruleDestinationTypes EOF ;
    public final EObject entryRuleDestinationTypes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDestinationTypes = null;


        try {
            // InternalIoT.g:1113:57: (iv_ruleDestinationTypes= ruleDestinationTypes EOF )
            // InternalIoT.g:1114:2: iv_ruleDestinationTypes= ruleDestinationTypes EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDestinationTypesRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDestinationTypes=ruleDestinationTypes();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDestinationTypes; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDestinationTypes"


    // $ANTLR start "ruleDestinationTypes"
    // InternalIoT.g:1120:1: ruleDestinationTypes returns [EObject current=null] : (otherlv_0= 'DestinationTypes' ( (lv_types_1_0= ruleDestinationType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleDestinationType ) ) )* ) ;
    public final EObject ruleDestinationTypes() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_types_1_0 = null;

        EObject lv_types_3_0 = null;



        	enterRule();

        try {
            // InternalIoT.g:1126:2: ( (otherlv_0= 'DestinationTypes' ( (lv_types_1_0= ruleDestinationType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleDestinationType ) ) )* ) )
            // InternalIoT.g:1127:2: (otherlv_0= 'DestinationTypes' ( (lv_types_1_0= ruleDestinationType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleDestinationType ) ) )* )
            {
            // InternalIoT.g:1127:2: (otherlv_0= 'DestinationTypes' ( (lv_types_1_0= ruleDestinationType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleDestinationType ) ) )* )
            // InternalIoT.g:1128:3: otherlv_0= 'DestinationTypes' ( (lv_types_1_0= ruleDestinationType ) ) (otherlv_2= ',' ( (lv_types_3_0= ruleDestinationType ) ) )*
            {
            otherlv_0=(Token)match(input,32,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDestinationTypesAccess().getDestinationTypesKeyword_0());
              		
            }
            // InternalIoT.g:1132:3: ( (lv_types_1_0= ruleDestinationType ) )
            // InternalIoT.g:1133:4: (lv_types_1_0= ruleDestinationType )
            {
            // InternalIoT.g:1133:4: (lv_types_1_0= ruleDestinationType )
            // InternalIoT.g:1134:5: lv_types_1_0= ruleDestinationType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDestinationTypesAccess().getTypesDestinationTypeParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_5);
            lv_types_1_0=ruleDestinationType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDestinationTypesRule());
              					}
              					add(
              						current,
              						"types",
              						lv_types_1_0,
              						"org.xtext.sdu.IoT.DestinationType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalIoT.g:1151:3: (otherlv_2= ',' ( (lv_types_3_0= ruleDestinationType ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==12) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalIoT.g:1152:4: otherlv_2= ',' ( (lv_types_3_0= ruleDestinationType ) )
            	    {
            	    otherlv_2=(Token)match(input,12,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getDestinationTypesAccess().getCommaKeyword_2_0());
            	      			
            	    }
            	    // InternalIoT.g:1156:4: ( (lv_types_3_0= ruleDestinationType ) )
            	    // InternalIoT.g:1157:5: (lv_types_3_0= ruleDestinationType )
            	    {
            	    // InternalIoT.g:1157:5: (lv_types_3_0= ruleDestinationType )
            	    // InternalIoT.g:1158:6: lv_types_3_0= ruleDestinationType
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDestinationTypesAccess().getTypesDestinationTypeParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_5);
            	    lv_types_3_0=ruleDestinationType();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getDestinationTypesRule());
            	      						}
            	      						add(
            	      							current,
            	      							"types",
            	      							lv_types_3_0,
            	      							"org.xtext.sdu.IoT.DestinationType");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDestinationTypes"


    // $ANTLR start "entryRuleDestination"
    // InternalIoT.g:1180:1: entryRuleDestination returns [EObject current=null] : iv_ruleDestination= ruleDestination EOF ;
    public final EObject entryRuleDestination() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDestination = null;


        try {
            // InternalIoT.g:1180:52: (iv_ruleDestination= ruleDestination EOF )
            // InternalIoT.g:1181:2: iv_ruleDestination= ruleDestination EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDestinationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDestination=ruleDestination();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDestination; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDestination"


    // $ANTLR start "ruleDestination"
    // InternalIoT.g:1187:1: ruleDestination returns [EObject current=null] : (otherlv_0= 'Destination' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'of' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleDestination() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalIoT.g:1193:2: ( (otherlv_0= 'Destination' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'of' ( (otherlv_3= RULE_ID ) ) ) )
            // InternalIoT.g:1194:2: (otherlv_0= 'Destination' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'of' ( (otherlv_3= RULE_ID ) ) )
            {
            // InternalIoT.g:1194:2: (otherlv_0= 'Destination' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'of' ( (otherlv_3= RULE_ID ) ) )
            // InternalIoT.g:1195:3: otherlv_0= 'Destination' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'of' ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDestinationAccess().getDestinationKeyword_0());
              		
            }
            // InternalIoT.g:1199:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalIoT.g:1200:4: (lv_name_1_0= RULE_ID )
            {
            // InternalIoT.g:1200:4: (lv_name_1_0= RULE_ID )
            // InternalIoT.g:1201:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getDestinationAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDestinationRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getDestinationAccess().getOfKeyword_2());
              		
            }
            // InternalIoT.g:1221:3: ( (otherlv_3= RULE_ID ) )
            // InternalIoT.g:1222:4: (otherlv_3= RULE_ID )
            {
            // InternalIoT.g:1222:4: (otherlv_3= RULE_ID )
            // InternalIoT.g:1223:5: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDestinationRule());
              					}
              				
            }
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_3, grammarAccess.getDestinationAccess().getTypeDestinationTypeCrossReference_3_0());
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDestination"


    // $ANTLR start "entryRuleFetchData"
    // InternalIoT.g:1238:1: entryRuleFetchData returns [EObject current=null] : iv_ruleFetchData= ruleFetchData EOF ;
    public final EObject entryRuleFetchData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFetchData = null;


        try {
            // InternalIoT.g:1238:50: (iv_ruleFetchData= ruleFetchData EOF )
            // InternalIoT.g:1239:2: iv_ruleFetchData= ruleFetchData EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFetchDataRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFetchData=ruleFetchData();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFetchData; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFetchData"


    // $ANTLR start "ruleFetchData"
    // InternalIoT.g:1245:1: ruleFetchData returns [EObject current=null] : (otherlv_0= 'Fetch' otherlv_1= 'data' otherlv_2= 'from' ( (otherlv_3= 'type' ( (otherlv_4= RULE_ID ) ) ) | (otherlv_5= 'group' ( (otherlv_6= RULE_ID ) ) ) ) otherlv_7= 'for' otherlv_8= 'device' ( (otherlv_9= RULE_ID ) ) otherlv_10= 'to' ( (otherlv_11= 'destination' ( (otherlv_12= RULE_ID ) ) ) | (otherlv_13= 'server' ( (otherlv_14= RULE_ID ) ) ) ) ( ( ( 'condition' )=>otherlv_15= 'condition' ) ( (lv_condition_16_0= ruleFetchDataCondition ) ) )? ( ( ( 'triggered' )=>otherlv_17= 'triggered' ) ( (lv_triggered_18_0= ruleFetchDataExpression ) ) )? ) ;
    public final EObject ruleFetchData() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        EObject lv_condition_16_0 = null;

        EObject lv_triggered_18_0 = null;



        	enterRule();

        try {
            // InternalIoT.g:1251:2: ( (otherlv_0= 'Fetch' otherlv_1= 'data' otherlv_2= 'from' ( (otherlv_3= 'type' ( (otherlv_4= RULE_ID ) ) ) | (otherlv_5= 'group' ( (otherlv_6= RULE_ID ) ) ) ) otherlv_7= 'for' otherlv_8= 'device' ( (otherlv_9= RULE_ID ) ) otherlv_10= 'to' ( (otherlv_11= 'destination' ( (otherlv_12= RULE_ID ) ) ) | (otherlv_13= 'server' ( (otherlv_14= RULE_ID ) ) ) ) ( ( ( 'condition' )=>otherlv_15= 'condition' ) ( (lv_condition_16_0= ruleFetchDataCondition ) ) )? ( ( ( 'triggered' )=>otherlv_17= 'triggered' ) ( (lv_triggered_18_0= ruleFetchDataExpression ) ) )? ) )
            // InternalIoT.g:1252:2: (otherlv_0= 'Fetch' otherlv_1= 'data' otherlv_2= 'from' ( (otherlv_3= 'type' ( (otherlv_4= RULE_ID ) ) ) | (otherlv_5= 'group' ( (otherlv_6= RULE_ID ) ) ) ) otherlv_7= 'for' otherlv_8= 'device' ( (otherlv_9= RULE_ID ) ) otherlv_10= 'to' ( (otherlv_11= 'destination' ( (otherlv_12= RULE_ID ) ) ) | (otherlv_13= 'server' ( (otherlv_14= RULE_ID ) ) ) ) ( ( ( 'condition' )=>otherlv_15= 'condition' ) ( (lv_condition_16_0= ruleFetchDataCondition ) ) )? ( ( ( 'triggered' )=>otherlv_17= 'triggered' ) ( (lv_triggered_18_0= ruleFetchDataExpression ) ) )? )
            {
            // InternalIoT.g:1252:2: (otherlv_0= 'Fetch' otherlv_1= 'data' otherlv_2= 'from' ( (otherlv_3= 'type' ( (otherlv_4= RULE_ID ) ) ) | (otherlv_5= 'group' ( (otherlv_6= RULE_ID ) ) ) ) otherlv_7= 'for' otherlv_8= 'device' ( (otherlv_9= RULE_ID ) ) otherlv_10= 'to' ( (otherlv_11= 'destination' ( (otherlv_12= RULE_ID ) ) ) | (otherlv_13= 'server' ( (otherlv_14= RULE_ID ) ) ) ) ( ( ( 'condition' )=>otherlv_15= 'condition' ) ( (lv_condition_16_0= ruleFetchDataCondition ) ) )? ( ( ( 'triggered' )=>otherlv_17= 'triggered' ) ( (lv_triggered_18_0= ruleFetchDataExpression ) ) )? )
            // InternalIoT.g:1253:3: otherlv_0= 'Fetch' otherlv_1= 'data' otherlv_2= 'from' ( (otherlv_3= 'type' ( (otherlv_4= RULE_ID ) ) ) | (otherlv_5= 'group' ( (otherlv_6= RULE_ID ) ) ) ) otherlv_7= 'for' otherlv_8= 'device' ( (otherlv_9= RULE_ID ) ) otherlv_10= 'to' ( (otherlv_11= 'destination' ( (otherlv_12= RULE_ID ) ) ) | (otherlv_13= 'server' ( (otherlv_14= RULE_ID ) ) ) ) ( ( ( 'condition' )=>otherlv_15= 'condition' ) ( (lv_condition_16_0= ruleFetchDataCondition ) ) )? ( ( ( 'triggered' )=>otherlv_17= 'triggered' ) ( (lv_triggered_18_0= ruleFetchDataExpression ) ) )?
            {
            otherlv_0=(Token)match(input,34,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getFetchDataAccess().getFetchKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,35,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getFetchDataAccess().getDataKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,36,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getFetchDataAccess().getFromKeyword_2());
              		
            }
            // InternalIoT.g:1265:3: ( (otherlv_3= 'type' ( (otherlv_4= RULE_ID ) ) ) | (otherlv_5= 'group' ( (otherlv_6= RULE_ID ) ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==15) ) {
                alt11=1;
            }
            else if ( (LA11_0==26) ) {
                alt11=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalIoT.g:1266:4: (otherlv_3= 'type' ( (otherlv_4= RULE_ID ) ) )
                    {
                    // InternalIoT.g:1266:4: (otherlv_3= 'type' ( (otherlv_4= RULE_ID ) ) )
                    // InternalIoT.g:1267:5: otherlv_3= 'type' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,15,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_3, grammarAccess.getFetchDataAccess().getTypeKeyword_3_0_0());
                      				
                    }
                    // InternalIoT.g:1271:5: ( (otherlv_4= RULE_ID ) )
                    // InternalIoT.g:1272:6: (otherlv_4= RULE_ID )
                    {
                    // InternalIoT.g:1272:6: (otherlv_4= RULE_ID )
                    // InternalIoT.g:1273:7: otherlv_4= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getFetchDataRule());
                      							}
                      						
                    }
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							newLeafNode(otherlv_4, grammarAccess.getFetchDataAccess().getFilterSensorTypeCrossReference_3_0_1_0());
                      						
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalIoT.g:1286:4: (otherlv_5= 'group' ( (otherlv_6= RULE_ID ) ) )
                    {
                    // InternalIoT.g:1286:4: (otherlv_5= 'group' ( (otherlv_6= RULE_ID ) ) )
                    // InternalIoT.g:1287:5: otherlv_5= 'group' ( (otherlv_6= RULE_ID ) )
                    {
                    otherlv_5=(Token)match(input,26,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getFetchDataAccess().getGroupKeyword_3_1_0());
                      				
                    }
                    // InternalIoT.g:1291:5: ( (otherlv_6= RULE_ID ) )
                    // InternalIoT.g:1292:6: (otherlv_6= RULE_ID )
                    {
                    // InternalIoT.g:1292:6: (otherlv_6= RULE_ID )
                    // InternalIoT.g:1293:7: otherlv_6= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getFetchDataRule());
                      							}
                      						
                    }
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							newLeafNode(otherlv_6, grammarAccess.getFetchDataAccess().getFilterSensorGroupCrossReference_3_1_1_0());
                      						
                    }

                    }


                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,19,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getFetchDataAccess().getForKeyword_4());
              		
            }
            otherlv_8=(Token)match(input,25,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getFetchDataAccess().getDeviceKeyword_5());
              		
            }
            // InternalIoT.g:1314:3: ( (otherlv_9= RULE_ID ) )
            // InternalIoT.g:1315:4: (otherlv_9= RULE_ID )
            {
            // InternalIoT.g:1315:4: (otherlv_9= RULE_ID )
            // InternalIoT.g:1316:5: otherlv_9= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getFetchDataRule());
              					}
              				
            }
            otherlv_9=(Token)match(input,RULE_ID,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_9, grammarAccess.getFetchDataAccess().getDeviceDeviceCrossReference_6_0());
              				
            }

            }


            }

            otherlv_10=(Token)match(input,37,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getFetchDataAccess().getToKeyword_7());
              		
            }
            // InternalIoT.g:1331:3: ( (otherlv_11= 'destination' ( (otherlv_12= RULE_ID ) ) ) | (otherlv_13= 'server' ( (otherlv_14= RULE_ID ) ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==38) ) {
                alt12=1;
            }
            else if ( (LA12_0==39) ) {
                alt12=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalIoT.g:1332:4: (otherlv_11= 'destination' ( (otherlv_12= RULE_ID ) ) )
                    {
                    // InternalIoT.g:1332:4: (otherlv_11= 'destination' ( (otherlv_12= RULE_ID ) ) )
                    // InternalIoT.g:1333:5: otherlv_11= 'destination' ( (otherlv_12= RULE_ID ) )
                    {
                    otherlv_11=(Token)match(input,38,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_11, grammarAccess.getFetchDataAccess().getDestinationKeyword_8_0_0());
                      				
                    }
                    // InternalIoT.g:1337:5: ( (otherlv_12= RULE_ID ) )
                    // InternalIoT.g:1338:6: (otherlv_12= RULE_ID )
                    {
                    // InternalIoT.g:1338:6: (otherlv_12= RULE_ID )
                    // InternalIoT.g:1339:7: otherlv_12= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getFetchDataRule());
                      							}
                      						
                    }
                    otherlv_12=(Token)match(input,RULE_ID,FOLLOW_25); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							newLeafNode(otherlv_12, grammarAccess.getFetchDataAccess().getDestinationDestinationCrossReference_8_0_1_0());
                      						
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalIoT.g:1352:4: (otherlv_13= 'server' ( (otherlv_14= RULE_ID ) ) )
                    {
                    // InternalIoT.g:1352:4: (otherlv_13= 'server' ( (otherlv_14= RULE_ID ) ) )
                    // InternalIoT.g:1353:5: otherlv_13= 'server' ( (otherlv_14= RULE_ID ) )
                    {
                    otherlv_13=(Token)match(input,39,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_13, grammarAccess.getFetchDataAccess().getServerKeyword_8_1_0());
                      				
                    }
                    // InternalIoT.g:1357:5: ( (otherlv_14= RULE_ID ) )
                    // InternalIoT.g:1358:6: (otherlv_14= RULE_ID )
                    {
                    // InternalIoT.g:1358:6: (otherlv_14= RULE_ID )
                    // InternalIoT.g:1359:7: otherlv_14= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getFetchDataRule());
                      							}
                      						
                    }
                    otherlv_14=(Token)match(input,RULE_ID,FOLLOW_25); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							newLeafNode(otherlv_14, grammarAccess.getFetchDataAccess().getDestinationServerCrossReference_8_1_1_0());
                      						
                    }

                    }


                    }


                    }


                    }
                    break;

            }

            // InternalIoT.g:1372:3: ( ( ( 'condition' )=>otherlv_15= 'condition' ) ( (lv_condition_16_0= ruleFetchDataCondition ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==40) && (synpred1_InternalIoT())) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalIoT.g:1373:4: ( ( 'condition' )=>otherlv_15= 'condition' ) ( (lv_condition_16_0= ruleFetchDataCondition ) )
                    {
                    // InternalIoT.g:1373:4: ( ( 'condition' )=>otherlv_15= 'condition' )
                    // InternalIoT.g:1374:5: ( 'condition' )=>otherlv_15= 'condition'
                    {
                    otherlv_15=(Token)match(input,40,FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_15, grammarAccess.getFetchDataAccess().getConditionKeyword_9_0());
                      				
                    }

                    }

                    // InternalIoT.g:1380:4: ( (lv_condition_16_0= ruleFetchDataCondition ) )
                    // InternalIoT.g:1381:5: (lv_condition_16_0= ruleFetchDataCondition )
                    {
                    // InternalIoT.g:1381:5: (lv_condition_16_0= ruleFetchDataCondition )
                    // InternalIoT.g:1382:6: lv_condition_16_0= ruleFetchDataCondition
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getFetchDataAccess().getConditionFetchDataConditionParserRuleCall_9_1_0());
                      					
                    }
                    pushFollow(FOLLOW_27);
                    lv_condition_16_0=ruleFetchDataCondition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getFetchDataRule());
                      						}
                      						set(
                      							current,
                      							"condition",
                      							lv_condition_16_0,
                      							"org.xtext.sdu.IoT.FetchDataCondition");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalIoT.g:1400:3: ( ( ( 'triggered' )=>otherlv_17= 'triggered' ) ( (lv_triggered_18_0= ruleFetchDataExpression ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==41) && (synpred2_InternalIoT())) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalIoT.g:1401:4: ( ( 'triggered' )=>otherlv_17= 'triggered' ) ( (lv_triggered_18_0= ruleFetchDataExpression ) )
                    {
                    // InternalIoT.g:1401:4: ( ( 'triggered' )=>otherlv_17= 'triggered' )
                    // InternalIoT.g:1402:5: ( 'triggered' )=>otherlv_17= 'triggered'
                    {
                    otherlv_17=(Token)match(input,41,FOLLOW_28); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_17, grammarAccess.getFetchDataAccess().getTriggeredKeyword_10_0());
                      				
                    }

                    }

                    // InternalIoT.g:1408:4: ( (lv_triggered_18_0= ruleFetchDataExpression ) )
                    // InternalIoT.g:1409:5: (lv_triggered_18_0= ruleFetchDataExpression )
                    {
                    // InternalIoT.g:1409:5: (lv_triggered_18_0= ruleFetchDataExpression )
                    // InternalIoT.g:1410:6: lv_triggered_18_0= ruleFetchDataExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getFetchDataAccess().getTriggeredFetchDataExpressionParserRuleCall_10_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_triggered_18_0=ruleFetchDataExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getFetchDataRule());
                      						}
                      						set(
                      							current,
                      							"triggered",
                      							lv_triggered_18_0,
                      							"org.xtext.sdu.IoT.FetchDataExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFetchData"


    // $ANTLR start "entryRuleFetchDataExpression"
    // InternalIoT.g:1432:1: entryRuleFetchDataExpression returns [EObject current=null] : iv_ruleFetchDataExpression= ruleFetchDataExpression EOF ;
    public final EObject entryRuleFetchDataExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFetchDataExpression = null;


        try {
            // InternalIoT.g:1432:60: (iv_ruleFetchDataExpression= ruleFetchDataExpression EOF )
            // InternalIoT.g:1433:2: iv_ruleFetchDataExpression= ruleFetchDataExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFetchDataExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFetchDataExpression=ruleFetchDataExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFetchDataExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFetchDataExpression"


    // $ANTLR start "ruleFetchDataExpression"
    // InternalIoT.g:1439:1: ruleFetchDataExpression returns [EObject current=null] : (otherlv_0= 'every' ( (lv_duration_1_0= ruleTime ) ) ( (lv_timeUnit_2_0= ruleTimeUnit ) ) ) ;
    public final EObject ruleFetchDataExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_duration_1_0 = null;

        AntlrDatatypeRuleToken lv_timeUnit_2_0 = null;



        	enterRule();

        try {
            // InternalIoT.g:1445:2: ( (otherlv_0= 'every' ( (lv_duration_1_0= ruleTime ) ) ( (lv_timeUnit_2_0= ruleTimeUnit ) ) ) )
            // InternalIoT.g:1446:2: (otherlv_0= 'every' ( (lv_duration_1_0= ruleTime ) ) ( (lv_timeUnit_2_0= ruleTimeUnit ) ) )
            {
            // InternalIoT.g:1446:2: (otherlv_0= 'every' ( (lv_duration_1_0= ruleTime ) ) ( (lv_timeUnit_2_0= ruleTimeUnit ) ) )
            // InternalIoT.g:1447:3: otherlv_0= 'every' ( (lv_duration_1_0= ruleTime ) ) ( (lv_timeUnit_2_0= ruleTimeUnit ) )
            {
            otherlv_0=(Token)match(input,42,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getFetchDataExpressionAccess().getEveryKeyword_0());
              		
            }
            // InternalIoT.g:1451:3: ( (lv_duration_1_0= ruleTime ) )
            // InternalIoT.g:1452:4: (lv_duration_1_0= ruleTime )
            {
            // InternalIoT.g:1452:4: (lv_duration_1_0= ruleTime )
            // InternalIoT.g:1453:5: lv_duration_1_0= ruleTime
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFetchDataExpressionAccess().getDurationTimeParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_29);
            lv_duration_1_0=ruleTime();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getFetchDataExpressionRule());
              					}
              					set(
              						current,
              						"duration",
              						lv_duration_1_0,
              						"org.xtext.sdu.IoT.Time");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalIoT.g:1470:3: ( (lv_timeUnit_2_0= ruleTimeUnit ) )
            // InternalIoT.g:1471:4: (lv_timeUnit_2_0= ruleTimeUnit )
            {
            // InternalIoT.g:1471:4: (lv_timeUnit_2_0= ruleTimeUnit )
            // InternalIoT.g:1472:5: lv_timeUnit_2_0= ruleTimeUnit
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFetchDataExpressionAccess().getTimeUnitTimeUnitParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_timeUnit_2_0=ruleTimeUnit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getFetchDataExpressionRule());
              					}
              					set(
              						current,
              						"timeUnit",
              						lv_timeUnit_2_0,
              						"org.xtext.sdu.IoT.TimeUnit");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFetchDataExpression"


    // $ANTLR start "entryRuleFetchDataCondition"
    // InternalIoT.g:1493:1: entryRuleFetchDataCondition returns [EObject current=null] : iv_ruleFetchDataCondition= ruleFetchDataCondition EOF ;
    public final EObject entryRuleFetchDataCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFetchDataCondition = null;


        try {
            // InternalIoT.g:1493:59: (iv_ruleFetchDataCondition= ruleFetchDataCondition EOF )
            // InternalIoT.g:1494:2: iv_ruleFetchDataCondition= ruleFetchDataCondition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFetchDataConditionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFetchDataCondition=ruleFetchDataCondition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFetchDataCondition; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFetchDataCondition"


    // $ANTLR start "ruleFetchDataCondition"
    // InternalIoT.g:1500:1: ruleFetchDataCondition returns [EObject current=null] : (otherlv_0= 'if' (otherlv_1= '(' ( (lv_condition_2_0= ruleCondition ) ) otherlv_3= ')' ) ( ( ( 'else' )=>otherlv_4= 'else' ) ( (lv_else_5_0= ruleFetchDataCondition ) ) )? ) ;
    public final EObject ruleFetchDataCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_condition_2_0 = null;

        EObject lv_else_5_0 = null;



        	enterRule();

        try {
            // InternalIoT.g:1506:2: ( (otherlv_0= 'if' (otherlv_1= '(' ( (lv_condition_2_0= ruleCondition ) ) otherlv_3= ')' ) ( ( ( 'else' )=>otherlv_4= 'else' ) ( (lv_else_5_0= ruleFetchDataCondition ) ) )? ) )
            // InternalIoT.g:1507:2: (otherlv_0= 'if' (otherlv_1= '(' ( (lv_condition_2_0= ruleCondition ) ) otherlv_3= ')' ) ( ( ( 'else' )=>otherlv_4= 'else' ) ( (lv_else_5_0= ruleFetchDataCondition ) ) )? )
            {
            // InternalIoT.g:1507:2: (otherlv_0= 'if' (otherlv_1= '(' ( (lv_condition_2_0= ruleCondition ) ) otherlv_3= ')' ) ( ( ( 'else' )=>otherlv_4= 'else' ) ( (lv_else_5_0= ruleFetchDataCondition ) ) )? )
            // InternalIoT.g:1508:3: otherlv_0= 'if' (otherlv_1= '(' ( (lv_condition_2_0= ruleCondition ) ) otherlv_3= ')' ) ( ( ( 'else' )=>otherlv_4= 'else' ) ( (lv_else_5_0= ruleFetchDataCondition ) ) )?
            {
            otherlv_0=(Token)match(input,43,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getFetchDataConditionAccess().getIfKeyword_0());
              		
            }
            // InternalIoT.g:1512:3: (otherlv_1= '(' ( (lv_condition_2_0= ruleCondition ) ) otherlv_3= ')' )
            // InternalIoT.g:1513:4: otherlv_1= '(' ( (lv_condition_2_0= ruleCondition ) ) otherlv_3= ')'
            {
            otherlv_1=(Token)match(input,20,FOLLOW_30); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_1, grammarAccess.getFetchDataConditionAccess().getLeftParenthesisKeyword_1_0());
              			
            }
            // InternalIoT.g:1517:4: ( (lv_condition_2_0= ruleCondition ) )
            // InternalIoT.g:1518:5: (lv_condition_2_0= ruleCondition )
            {
            // InternalIoT.g:1518:5: (lv_condition_2_0= ruleCondition )
            // InternalIoT.g:1519:6: lv_condition_2_0= ruleCondition
            {
            if ( state.backtracking==0 ) {

              						newCompositeNode(grammarAccess.getFetchDataConditionAccess().getConditionConditionParserRuleCall_1_1_0());
              					
            }
            pushFollow(FOLLOW_31);
            lv_condition_2_0=ruleCondition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              						if (current==null) {
              							current = createModelElementForParent(grammarAccess.getFetchDataConditionRule());
              						}
              						set(
              							current,
              							"condition",
              							lv_condition_2_0,
              							"org.xtext.sdu.IoT.Condition");
              						afterParserOrEnumRuleCall();
              					
            }

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_32); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_3, grammarAccess.getFetchDataConditionAccess().getRightParenthesisKeyword_1_2());
              			
            }

            }

            // InternalIoT.g:1541:3: ( ( ( 'else' )=>otherlv_4= 'else' ) ( (lv_else_5_0= ruleFetchDataCondition ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==44) && (synpred3_InternalIoT())) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalIoT.g:1542:4: ( ( 'else' )=>otherlv_4= 'else' ) ( (lv_else_5_0= ruleFetchDataCondition ) )
                    {
                    // InternalIoT.g:1542:4: ( ( 'else' )=>otherlv_4= 'else' )
                    // InternalIoT.g:1543:5: ( 'else' )=>otherlv_4= 'else'
                    {
                    otherlv_4=(Token)match(input,44,FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_4, grammarAccess.getFetchDataConditionAccess().getElseKeyword_2_0());
                      				
                    }

                    }

                    // InternalIoT.g:1549:4: ( (lv_else_5_0= ruleFetchDataCondition ) )
                    // InternalIoT.g:1550:5: (lv_else_5_0= ruleFetchDataCondition )
                    {
                    // InternalIoT.g:1550:5: (lv_else_5_0= ruleFetchDataCondition )
                    // InternalIoT.g:1551:6: lv_else_5_0= ruleFetchDataCondition
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getFetchDataConditionAccess().getElseFetchDataConditionParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_else_5_0=ruleFetchDataCondition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getFetchDataConditionRule());
                      						}
                      						set(
                      							current,
                      							"else",
                      							lv_else_5_0,
                      							"org.xtext.sdu.IoT.FetchDataCondition");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFetchDataCondition"


    // $ANTLR start "entryRuleTimeUnit"
    // InternalIoT.g:1573:1: entryRuleTimeUnit returns [String current=null] : iv_ruleTimeUnit= ruleTimeUnit EOF ;
    public final String entryRuleTimeUnit() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTimeUnit = null;


        try {
            // InternalIoT.g:1573:48: (iv_ruleTimeUnit= ruleTimeUnit EOF )
            // InternalIoT.g:1574:2: iv_ruleTimeUnit= ruleTimeUnit EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTimeUnitRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTimeUnit=ruleTimeUnit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTimeUnit.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTimeUnit"


    // $ANTLR start "ruleTimeUnit"
    // InternalIoT.g:1580:1: ruleTimeUnit returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'ms' | kw= 's' | kw= 'm' | kw= 'h' ) ;
    public final AntlrDatatypeRuleToken ruleTimeUnit() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalIoT.g:1586:2: ( (kw= 'ms' | kw= 's' | kw= 'm' | kw= 'h' ) )
            // InternalIoT.g:1587:2: (kw= 'ms' | kw= 's' | kw= 'm' | kw= 'h' )
            {
            // InternalIoT.g:1587:2: (kw= 'ms' | kw= 's' | kw= 'm' | kw= 'h' )
            int alt16=4;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt16=1;
                }
                break;
            case 46:
                {
                alt16=2;
                }
                break;
            case 47:
                {
                alt16=3;
                }
                break;
            case 48:
                {
                alt16=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalIoT.g:1588:3: kw= 'ms'
                    {
                    kw=(Token)match(input,45,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getTimeUnitAccess().getMsKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalIoT.g:1594:3: kw= 's'
                    {
                    kw=(Token)match(input,46,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getTimeUnitAccess().getSKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalIoT.g:1600:3: kw= 'm'
                    {
                    kw=(Token)match(input,47,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getTimeUnitAccess().getMKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalIoT.g:1606:3: kw= 'h'
                    {
                    kw=(Token)match(input,48,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getTimeUnitAccess().getHKeyword_3());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTimeUnit"


    // $ANTLR start "entryRuleCondition"
    // InternalIoT.g:1615:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalIoT.g:1615:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalIoT.g:1616:2: iv_ruleCondition= ruleCondition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConditionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCondition=ruleCondition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCondition; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalIoT.g:1622:1: ruleCondition returns [EObject current=null] : this_OrCondition_0= ruleOrCondition ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        EObject this_OrCondition_0 = null;



        	enterRule();

        try {
            // InternalIoT.g:1628:2: (this_OrCondition_0= ruleOrCondition )
            // InternalIoT.g:1629:2: this_OrCondition_0= ruleOrCondition
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getConditionAccess().getOrConditionParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_OrCondition_0=ruleOrCondition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_OrCondition_0;
              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleOrCondition"
    // InternalIoT.g:1640:1: entryRuleOrCondition returns [EObject current=null] : iv_ruleOrCondition= ruleOrCondition EOF ;
    public final EObject entryRuleOrCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrCondition = null;


        try {
            // InternalIoT.g:1640:52: (iv_ruleOrCondition= ruleOrCondition EOF )
            // InternalIoT.g:1641:2: iv_ruleOrCondition= ruleOrCondition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrConditionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOrCondition=ruleOrCondition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrCondition; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOrCondition"


    // $ANTLR start "ruleOrCondition"
    // InternalIoT.g:1647:1: ruleOrCondition returns [EObject current=null] : (this_AndCondition_0= ruleAndCondition ( () otherlv_2= '||' ( (lv_right_3_0= ruleAndCondition ) ) )* ) ;
    public final EObject ruleOrCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_AndCondition_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalIoT.g:1653:2: ( (this_AndCondition_0= ruleAndCondition ( () otherlv_2= '||' ( (lv_right_3_0= ruleAndCondition ) ) )* ) )
            // InternalIoT.g:1654:2: (this_AndCondition_0= ruleAndCondition ( () otherlv_2= '||' ( (lv_right_3_0= ruleAndCondition ) ) )* )
            {
            // InternalIoT.g:1654:2: (this_AndCondition_0= ruleAndCondition ( () otherlv_2= '||' ( (lv_right_3_0= ruleAndCondition ) ) )* )
            // InternalIoT.g:1655:3: this_AndCondition_0= ruleAndCondition ( () otherlv_2= '||' ( (lv_right_3_0= ruleAndCondition ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getOrConditionAccess().getAndConditionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_33);
            this_AndCondition_0=ruleAndCondition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_AndCondition_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalIoT.g:1663:3: ( () otherlv_2= '||' ( (lv_right_3_0= ruleAndCondition ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==49) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalIoT.g:1664:4: () otherlv_2= '||' ( (lv_right_3_0= ruleAndCondition ) )
            	    {
            	    // InternalIoT.g:1664:4: ()
            	    // InternalIoT.g:1665:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getOrConditionAccess().getOrConditionLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    otherlv_2=(Token)match(input,49,FOLLOW_30); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getOrConditionAccess().getVerticalLineVerticalLineKeyword_1_1());
            	      			
            	    }
            	    // InternalIoT.g:1675:4: ( (lv_right_3_0= ruleAndCondition ) )
            	    // InternalIoT.g:1676:5: (lv_right_3_0= ruleAndCondition )
            	    {
            	    // InternalIoT.g:1676:5: (lv_right_3_0= ruleAndCondition )
            	    // InternalIoT.g:1677:6: lv_right_3_0= ruleAndCondition
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getOrConditionAccess().getRightAndConditionParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_33);
            	    lv_right_3_0=ruleAndCondition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getOrConditionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"org.xtext.sdu.IoT.AndCondition");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOrCondition"


    // $ANTLR start "entryRuleAndCondition"
    // InternalIoT.g:1699:1: entryRuleAndCondition returns [EObject current=null] : iv_ruleAndCondition= ruleAndCondition EOF ;
    public final EObject entryRuleAndCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndCondition = null;


        try {
            // InternalIoT.g:1699:53: (iv_ruleAndCondition= ruleAndCondition EOF )
            // InternalIoT.g:1700:2: iv_ruleAndCondition= ruleAndCondition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAndConditionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAndCondition=ruleAndCondition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAndCondition; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAndCondition"


    // $ANTLR start "ruleAndCondition"
    // InternalIoT.g:1706:1: ruleAndCondition returns [EObject current=null] : (this_ComparisonCondition_0= ruleComparisonCondition ( () otherlv_2= '&&' ( (lv_right_3_0= ruleComparisonCondition ) ) )* ) ;
    public final EObject ruleAndCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_ComparisonCondition_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalIoT.g:1712:2: ( (this_ComparisonCondition_0= ruleComparisonCondition ( () otherlv_2= '&&' ( (lv_right_3_0= ruleComparisonCondition ) ) )* ) )
            // InternalIoT.g:1713:2: (this_ComparisonCondition_0= ruleComparisonCondition ( () otherlv_2= '&&' ( (lv_right_3_0= ruleComparisonCondition ) ) )* )
            {
            // InternalIoT.g:1713:2: (this_ComparisonCondition_0= ruleComparisonCondition ( () otherlv_2= '&&' ( (lv_right_3_0= ruleComparisonCondition ) ) )* )
            // InternalIoT.g:1714:3: this_ComparisonCondition_0= ruleComparisonCondition ( () otherlv_2= '&&' ( (lv_right_3_0= ruleComparisonCondition ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAndConditionAccess().getComparisonConditionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_34);
            this_ComparisonCondition_0=ruleComparisonCondition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_ComparisonCondition_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalIoT.g:1722:3: ( () otherlv_2= '&&' ( (lv_right_3_0= ruleComparisonCondition ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==50) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalIoT.g:1723:4: () otherlv_2= '&&' ( (lv_right_3_0= ruleComparisonCondition ) )
            	    {
            	    // InternalIoT.g:1723:4: ()
            	    // InternalIoT.g:1724:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getAndConditionAccess().getAndConditionLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    otherlv_2=(Token)match(input,50,FOLLOW_30); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getAndConditionAccess().getAmpersandAmpersandKeyword_1_1());
            	      			
            	    }
            	    // InternalIoT.g:1734:4: ( (lv_right_3_0= ruleComparisonCondition ) )
            	    // InternalIoT.g:1735:5: (lv_right_3_0= ruleComparisonCondition )
            	    {
            	    // InternalIoT.g:1735:5: (lv_right_3_0= ruleComparisonCondition )
            	    // InternalIoT.g:1736:6: lv_right_3_0= ruleComparisonCondition
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAndConditionAccess().getRightComparisonConditionParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_34);
            	    lv_right_3_0=ruleComparisonCondition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getAndConditionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"org.xtext.sdu.IoT.ComparisonCondition");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAndCondition"


    // $ANTLR start "entryRuleComparisonCondition"
    // InternalIoT.g:1758:1: entryRuleComparisonCondition returns [EObject current=null] : iv_ruleComparisonCondition= ruleComparisonCondition EOF ;
    public final EObject entryRuleComparisonCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparisonCondition = null;


        try {
            // InternalIoT.g:1758:60: (iv_ruleComparisonCondition= ruleComparisonCondition EOF )
            // InternalIoT.g:1759:2: iv_ruleComparisonCondition= ruleComparisonCondition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComparisonConditionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleComparisonCondition=ruleComparisonCondition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComparisonCondition; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComparisonCondition"


    // $ANTLR start "ruleComparisonCondition"
    // InternalIoT.g:1765:1: ruleComparisonCondition returns [EObject current=null] : (this_PrimaryCondition_0= rulePrimaryCondition ( () ( ( (lv_operator_2_1= '<' | lv_operator_2_2= '<=' | lv_operator_2_3= '==' | lv_operator_2_4= '>=' | lv_operator_2_5= '>' ) ) ) ( (lv_right_3_0= rulePrimaryCondition ) ) )* ) ;
    public final EObject ruleComparisonCondition() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_1=null;
        Token lv_operator_2_2=null;
        Token lv_operator_2_3=null;
        Token lv_operator_2_4=null;
        Token lv_operator_2_5=null;
        EObject this_PrimaryCondition_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalIoT.g:1771:2: ( (this_PrimaryCondition_0= rulePrimaryCondition ( () ( ( (lv_operator_2_1= '<' | lv_operator_2_2= '<=' | lv_operator_2_3= '==' | lv_operator_2_4= '>=' | lv_operator_2_5= '>' ) ) ) ( (lv_right_3_0= rulePrimaryCondition ) ) )* ) )
            // InternalIoT.g:1772:2: (this_PrimaryCondition_0= rulePrimaryCondition ( () ( ( (lv_operator_2_1= '<' | lv_operator_2_2= '<=' | lv_operator_2_3= '==' | lv_operator_2_4= '>=' | lv_operator_2_5= '>' ) ) ) ( (lv_right_3_0= rulePrimaryCondition ) ) )* )
            {
            // InternalIoT.g:1772:2: (this_PrimaryCondition_0= rulePrimaryCondition ( () ( ( (lv_operator_2_1= '<' | lv_operator_2_2= '<=' | lv_operator_2_3= '==' | lv_operator_2_4= '>=' | lv_operator_2_5= '>' ) ) ) ( (lv_right_3_0= rulePrimaryCondition ) ) )* )
            // InternalIoT.g:1773:3: this_PrimaryCondition_0= rulePrimaryCondition ( () ( ( (lv_operator_2_1= '<' | lv_operator_2_2= '<=' | lv_operator_2_3= '==' | lv_operator_2_4= '>=' | lv_operator_2_5= '>' ) ) ) ( (lv_right_3_0= rulePrimaryCondition ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getComparisonConditionAccess().getPrimaryConditionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_35);
            this_PrimaryCondition_0=rulePrimaryCondition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_PrimaryCondition_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalIoT.g:1781:3: ( () ( ( (lv_operator_2_1= '<' | lv_operator_2_2= '<=' | lv_operator_2_3= '==' | lv_operator_2_4= '>=' | lv_operator_2_5= '>' ) ) ) ( (lv_right_3_0= rulePrimaryCondition ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=51 && LA20_0<=55)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalIoT.g:1782:4: () ( ( (lv_operator_2_1= '<' | lv_operator_2_2= '<=' | lv_operator_2_3= '==' | lv_operator_2_4= '>=' | lv_operator_2_5= '>' ) ) ) ( (lv_right_3_0= rulePrimaryCondition ) )
            	    {
            	    // InternalIoT.g:1782:4: ()
            	    // InternalIoT.g:1783:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getComparisonConditionAccess().getComparisonConditionLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalIoT.g:1789:4: ( ( (lv_operator_2_1= '<' | lv_operator_2_2= '<=' | lv_operator_2_3= '==' | lv_operator_2_4= '>=' | lv_operator_2_5= '>' ) ) )
            	    // InternalIoT.g:1790:5: ( (lv_operator_2_1= '<' | lv_operator_2_2= '<=' | lv_operator_2_3= '==' | lv_operator_2_4= '>=' | lv_operator_2_5= '>' ) )
            	    {
            	    // InternalIoT.g:1790:5: ( (lv_operator_2_1= '<' | lv_operator_2_2= '<=' | lv_operator_2_3= '==' | lv_operator_2_4= '>=' | lv_operator_2_5= '>' ) )
            	    // InternalIoT.g:1791:6: (lv_operator_2_1= '<' | lv_operator_2_2= '<=' | lv_operator_2_3= '==' | lv_operator_2_4= '>=' | lv_operator_2_5= '>' )
            	    {
            	    // InternalIoT.g:1791:6: (lv_operator_2_1= '<' | lv_operator_2_2= '<=' | lv_operator_2_3= '==' | lv_operator_2_4= '>=' | lv_operator_2_5= '>' )
            	    int alt19=5;
            	    switch ( input.LA(1) ) {
            	    case 51:
            	        {
            	        alt19=1;
            	        }
            	        break;
            	    case 52:
            	        {
            	        alt19=2;
            	        }
            	        break;
            	    case 53:
            	        {
            	        alt19=3;
            	        }
            	        break;
            	    case 54:
            	        {
            	        alt19=4;
            	        }
            	        break;
            	    case 55:
            	        {
            	        alt19=5;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 19, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt19) {
            	        case 1 :
            	            // InternalIoT.g:1792:7: lv_operator_2_1= '<'
            	            {
            	            lv_operator_2_1=(Token)match(input,51,FOLLOW_30); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_operator_2_1, grammarAccess.getComparisonConditionAccess().getOperatorLessThanSignKeyword_1_1_0_0());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getComparisonConditionRule());
            	              							}
            	              							setWithLastConsumed(current, "operator", lv_operator_2_1, null);
            	              						
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalIoT.g:1803:7: lv_operator_2_2= '<='
            	            {
            	            lv_operator_2_2=(Token)match(input,52,FOLLOW_30); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_operator_2_2, grammarAccess.getComparisonConditionAccess().getOperatorLessThanSignEqualsSignKeyword_1_1_0_1());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getComparisonConditionRule());
            	              							}
            	              							setWithLastConsumed(current, "operator", lv_operator_2_2, null);
            	              						
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // InternalIoT.g:1814:7: lv_operator_2_3= '=='
            	            {
            	            lv_operator_2_3=(Token)match(input,53,FOLLOW_30); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_operator_2_3, grammarAccess.getComparisonConditionAccess().getOperatorEqualsSignEqualsSignKeyword_1_1_0_2());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getComparisonConditionRule());
            	              							}
            	              							setWithLastConsumed(current, "operator", lv_operator_2_3, null);
            	              						
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // InternalIoT.g:1825:7: lv_operator_2_4= '>='
            	            {
            	            lv_operator_2_4=(Token)match(input,54,FOLLOW_30); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_operator_2_4, grammarAccess.getComparisonConditionAccess().getOperatorGreaterThanSignEqualsSignKeyword_1_1_0_3());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getComparisonConditionRule());
            	              							}
            	              							setWithLastConsumed(current, "operator", lv_operator_2_4, null);
            	              						
            	            }

            	            }
            	            break;
            	        case 5 :
            	            // InternalIoT.g:1836:7: lv_operator_2_5= '>'
            	            {
            	            lv_operator_2_5=(Token)match(input,55,FOLLOW_30); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_operator_2_5, grammarAccess.getComparisonConditionAccess().getOperatorGreaterThanSignKeyword_1_1_0_4());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getComparisonConditionRule());
            	              							}
            	              							setWithLastConsumed(current, "operator", lv_operator_2_5, null);
            	              						
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalIoT.g:1849:4: ( (lv_right_3_0= rulePrimaryCondition ) )
            	    // InternalIoT.g:1850:5: (lv_right_3_0= rulePrimaryCondition )
            	    {
            	    // InternalIoT.g:1850:5: (lv_right_3_0= rulePrimaryCondition )
            	    // InternalIoT.g:1851:6: lv_right_3_0= rulePrimaryCondition
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getComparisonConditionAccess().getRightPrimaryConditionParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_35);
            	    lv_right_3_0=rulePrimaryCondition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getComparisonConditionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"org.xtext.sdu.IoT.PrimaryCondition");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComparisonCondition"


    // $ANTLR start "entryRulePrimaryCondition"
    // InternalIoT.g:1873:1: entryRulePrimaryCondition returns [EObject current=null] : iv_rulePrimaryCondition= rulePrimaryCondition EOF ;
    public final EObject entryRulePrimaryCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryCondition = null;


        try {
            // InternalIoT.g:1873:57: (iv_rulePrimaryCondition= rulePrimaryCondition EOF )
            // InternalIoT.g:1874:2: iv_rulePrimaryCondition= rulePrimaryCondition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryConditionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePrimaryCondition=rulePrimaryCondition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimaryCondition; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimaryCondition"


    // $ANTLR start "rulePrimaryCondition"
    // InternalIoT.g:1880:1: rulePrimaryCondition returns [EObject current=null] : ( (otherlv_0= '(' this_Condition_1= ruleCondition otherlv_2= ')' ) | this_LiteralBoolean_3= ruleLiteralBoolean | this_LiteralInteger_4= ruleLiteralInteger | this_LiteralMethod_5= ruleLiteralMethod ) ;
    public final EObject rulePrimaryCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Condition_1 = null;

        EObject this_LiteralBoolean_3 = null;

        EObject this_LiteralInteger_4 = null;

        EObject this_LiteralMethod_5 = null;



        	enterRule();

        try {
            // InternalIoT.g:1886:2: ( ( (otherlv_0= '(' this_Condition_1= ruleCondition otherlv_2= ')' ) | this_LiteralBoolean_3= ruleLiteralBoolean | this_LiteralInteger_4= ruleLiteralInteger | this_LiteralMethod_5= ruleLiteralMethod ) )
            // InternalIoT.g:1887:2: ( (otherlv_0= '(' this_Condition_1= ruleCondition otherlv_2= ')' ) | this_LiteralBoolean_3= ruleLiteralBoolean | this_LiteralInteger_4= ruleLiteralInteger | this_LiteralMethod_5= ruleLiteralMethod )
            {
            // InternalIoT.g:1887:2: ( (otherlv_0= '(' this_Condition_1= ruleCondition otherlv_2= ')' ) | this_LiteralBoolean_3= ruleLiteralBoolean | this_LiteralInteger_4= ruleLiteralInteger | this_LiteralMethod_5= ruleLiteralMethod )
            int alt21=4;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt21=1;
                }
                break;
            case 56:
            case 57:
                {
                alt21=2;
                }
                break;
            case RULE_INT:
                {
                alt21=3;
                }
                break;
            case RULE_ID:
                {
                alt21=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // InternalIoT.g:1888:3: (otherlv_0= '(' this_Condition_1= ruleCondition otherlv_2= ')' )
                    {
                    // InternalIoT.g:1888:3: (otherlv_0= '(' this_Condition_1= ruleCondition otherlv_2= ')' )
                    // InternalIoT.g:1889:4: otherlv_0= '(' this_Condition_1= ruleCondition otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,20,FOLLOW_30); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getPrimaryConditionAccess().getLeftParenthesisKeyword_0_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryConditionAccess().getConditionParserRuleCall_0_1());
                      			
                    }
                    pushFollow(FOLLOW_31);
                    this_Condition_1=ruleCondition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_Condition_1;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_2=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getPrimaryConditionAccess().getRightParenthesisKeyword_0_2());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalIoT.g:1907:3: this_LiteralBoolean_3= ruleLiteralBoolean
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimaryConditionAccess().getLiteralBooleanParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_LiteralBoolean_3=ruleLiteralBoolean();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_LiteralBoolean_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalIoT.g:1916:3: this_LiteralInteger_4= ruleLiteralInteger
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimaryConditionAccess().getLiteralIntegerParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_LiteralInteger_4=ruleLiteralInteger();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_LiteralInteger_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalIoT.g:1925:3: this_LiteralMethod_5= ruleLiteralMethod
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimaryConditionAccess().getLiteralMethodParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_LiteralMethod_5=ruleLiteralMethod();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_LiteralMethod_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimaryCondition"


    // $ANTLR start "entryRuleLiteralBoolean"
    // InternalIoT.g:1937:1: entryRuleLiteralBoolean returns [EObject current=null] : iv_ruleLiteralBoolean= ruleLiteralBoolean EOF ;
    public final EObject entryRuleLiteralBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralBoolean = null;


        try {
            // InternalIoT.g:1937:55: (iv_ruleLiteralBoolean= ruleLiteralBoolean EOF )
            // InternalIoT.g:1938:2: iv_ruleLiteralBoolean= ruleLiteralBoolean EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralBooleanRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLiteralBoolean=ruleLiteralBoolean();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteralBoolean; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLiteralBoolean"


    // $ANTLR start "ruleLiteralBoolean"
    // InternalIoT.g:1944:1: ruleLiteralBoolean returns [EObject current=null] : ( ( () ( (lv_value_1_0= 'true' ) ) ) | ( () ( (lv_value_3_0= 'false' ) ) ) ) ;
    public final EObject ruleLiteralBoolean() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token lv_value_3_0=null;


        	enterRule();

        try {
            // InternalIoT.g:1950:2: ( ( ( () ( (lv_value_1_0= 'true' ) ) ) | ( () ( (lv_value_3_0= 'false' ) ) ) ) )
            // InternalIoT.g:1951:2: ( ( () ( (lv_value_1_0= 'true' ) ) ) | ( () ( (lv_value_3_0= 'false' ) ) ) )
            {
            // InternalIoT.g:1951:2: ( ( () ( (lv_value_1_0= 'true' ) ) ) | ( () ( (lv_value_3_0= 'false' ) ) ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==56) ) {
                alt22=1;
            }
            else if ( (LA22_0==57) ) {
                alt22=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalIoT.g:1952:3: ( () ( (lv_value_1_0= 'true' ) ) )
                    {
                    // InternalIoT.g:1952:3: ( () ( (lv_value_1_0= 'true' ) ) )
                    // InternalIoT.g:1953:4: () ( (lv_value_1_0= 'true' ) )
                    {
                    // InternalIoT.g:1953:4: ()
                    // InternalIoT.g:1954:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getLiteralBooleanAccess().getLiteralBoolAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalIoT.g:1960:4: ( (lv_value_1_0= 'true' ) )
                    // InternalIoT.g:1961:5: (lv_value_1_0= 'true' )
                    {
                    // InternalIoT.g:1961:5: (lv_value_1_0= 'true' )
                    // InternalIoT.g:1962:6: lv_value_1_0= 'true'
                    {
                    lv_value_1_0=(Token)match(input,56,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_1_0, grammarAccess.getLiteralBooleanAccess().getValueTrueKeyword_0_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getLiteralBooleanRule());
                      						}
                      						setWithLastConsumed(current, "value", lv_value_1_0, "true");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalIoT.g:1976:3: ( () ( (lv_value_3_0= 'false' ) ) )
                    {
                    // InternalIoT.g:1976:3: ( () ( (lv_value_3_0= 'false' ) ) )
                    // InternalIoT.g:1977:4: () ( (lv_value_3_0= 'false' ) )
                    {
                    // InternalIoT.g:1977:4: ()
                    // InternalIoT.g:1978:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getLiteralBooleanAccess().getLiteralBoolAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalIoT.g:1984:4: ( (lv_value_3_0= 'false' ) )
                    // InternalIoT.g:1985:5: (lv_value_3_0= 'false' )
                    {
                    // InternalIoT.g:1985:5: (lv_value_3_0= 'false' )
                    // InternalIoT.g:1986:6: lv_value_3_0= 'false'
                    {
                    lv_value_3_0=(Token)match(input,57,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_3_0, grammarAccess.getLiteralBooleanAccess().getValueFalseKeyword_1_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getLiteralBooleanRule());
                      						}
                      						setWithLastConsumed(current, "value", lv_value_3_0, "false");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLiteralBoolean"


    // $ANTLR start "entryRuleLiteralMethod"
    // InternalIoT.g:2003:1: entryRuleLiteralMethod returns [EObject current=null] : iv_ruleLiteralMethod= ruleLiteralMethod EOF ;
    public final EObject entryRuleLiteralMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralMethod = null;


        try {
            // InternalIoT.g:2003:54: (iv_ruleLiteralMethod= ruleLiteralMethod EOF )
            // InternalIoT.g:2004:2: iv_ruleLiteralMethod= ruleLiteralMethod EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralMethodRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLiteralMethod=ruleLiteralMethod();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteralMethod; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLiteralMethod"


    // $ANTLR start "ruleLiteralMethod"
    // InternalIoT.g:2010:1: ruleLiteralMethod returns [EObject current=null] : this_Method_0= ruleMethod ;
    public final EObject ruleLiteralMethod() throws RecognitionException {
        EObject current = null;

        EObject this_Method_0 = null;



        	enterRule();

        try {
            // InternalIoT.g:2016:2: (this_Method_0= ruleMethod )
            // InternalIoT.g:2017:2: this_Method_0= ruleMethod
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getLiteralMethodAccess().getMethodParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_Method_0=ruleMethod();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_Method_0;
              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLiteralMethod"


    // $ANTLR start "entryRuleLiteralInteger"
    // InternalIoT.g:2028:1: entryRuleLiteralInteger returns [EObject current=null] : iv_ruleLiteralInteger= ruleLiteralInteger EOF ;
    public final EObject entryRuleLiteralInteger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralInteger = null;


        try {
            // InternalIoT.g:2028:55: (iv_ruleLiteralInteger= ruleLiteralInteger EOF )
            // InternalIoT.g:2029:2: iv_ruleLiteralInteger= ruleLiteralInteger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralIntegerRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLiteralInteger=ruleLiteralInteger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteralInteger; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLiteralInteger"


    // $ANTLR start "ruleLiteralInteger"
    // InternalIoT.g:2035:1: ruleLiteralInteger returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleLiteralInteger() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalIoT.g:2041:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) )
            // InternalIoT.g:2042:2: ( () ( (lv_value_1_0= RULE_INT ) ) )
            {
            // InternalIoT.g:2042:2: ( () ( (lv_value_1_0= RULE_INT ) ) )
            // InternalIoT.g:2043:3: () ( (lv_value_1_0= RULE_INT ) )
            {
            // InternalIoT.g:2043:3: ()
            // InternalIoT.g:2044:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getLiteralIntegerAccess().getLiteralNumberAction_0(),
              					current);
              			
            }

            }

            // InternalIoT.g:2050:3: ( (lv_value_1_0= RULE_INT ) )
            // InternalIoT.g:2051:4: (lv_value_1_0= RULE_INT )
            {
            // InternalIoT.g:2051:4: (lv_value_1_0= RULE_INT )
            // InternalIoT.g:2052:5: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_value_1_0, grammarAccess.getLiteralIntegerAccess().getValueINTTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getLiteralIntegerRule());
              					}
              					setWithLastConsumed(
              						current,
              						"value",
              						lv_value_1_0,
              						"org.eclipse.xtext.common.Terminals.INT");
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLiteralInteger"


    // $ANTLR start "entryRuleIp"
    // InternalIoT.g:2072:1: entryRuleIp returns [EObject current=null] : iv_ruleIp= ruleIp EOF ;
    public final EObject entryRuleIp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIp = null;


        try {
            // InternalIoT.g:2072:43: (iv_ruleIp= ruleIp EOF )
            // InternalIoT.g:2073:2: iv_ruleIp= ruleIp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIpRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIp=ruleIp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIp; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIp"


    // $ANTLR start "ruleIp"
    // InternalIoT.g:2079:1: ruleIp returns [EObject current=null] : ( () ( (lv_ip_1_0= RULE_INT ) ) otherlv_2= '.' ( (lv_ip_3_0= RULE_INT ) ) otherlv_4= '.' ( (lv_ip_5_0= RULE_INT ) ) otherlv_6= '.' ( (lv_ip_7_0= RULE_INT ) ) ) ;
    public final EObject ruleIp() throws RecognitionException {
        EObject current = null;

        Token lv_ip_1_0=null;
        Token otherlv_2=null;
        Token lv_ip_3_0=null;
        Token otherlv_4=null;
        Token lv_ip_5_0=null;
        Token otherlv_6=null;
        Token lv_ip_7_0=null;


        	enterRule();

        try {
            // InternalIoT.g:2085:2: ( ( () ( (lv_ip_1_0= RULE_INT ) ) otherlv_2= '.' ( (lv_ip_3_0= RULE_INT ) ) otherlv_4= '.' ( (lv_ip_5_0= RULE_INT ) ) otherlv_6= '.' ( (lv_ip_7_0= RULE_INT ) ) ) )
            // InternalIoT.g:2086:2: ( () ( (lv_ip_1_0= RULE_INT ) ) otherlv_2= '.' ( (lv_ip_3_0= RULE_INT ) ) otherlv_4= '.' ( (lv_ip_5_0= RULE_INT ) ) otherlv_6= '.' ( (lv_ip_7_0= RULE_INT ) ) )
            {
            // InternalIoT.g:2086:2: ( () ( (lv_ip_1_0= RULE_INT ) ) otherlv_2= '.' ( (lv_ip_3_0= RULE_INT ) ) otherlv_4= '.' ( (lv_ip_5_0= RULE_INT ) ) otherlv_6= '.' ( (lv_ip_7_0= RULE_INT ) ) )
            // InternalIoT.g:2087:3: () ( (lv_ip_1_0= RULE_INT ) ) otherlv_2= '.' ( (lv_ip_3_0= RULE_INT ) ) otherlv_4= '.' ( (lv_ip_5_0= RULE_INT ) ) otherlv_6= '.' ( (lv_ip_7_0= RULE_INT ) )
            {
            // InternalIoT.g:2087:3: ()
            // InternalIoT.g:2088:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getIpAccess().getIpAction_0(),
              					current);
              			
            }

            }

            // InternalIoT.g:2094:3: ( (lv_ip_1_0= RULE_INT ) )
            // InternalIoT.g:2095:4: (lv_ip_1_0= RULE_INT )
            {
            // InternalIoT.g:2095:4: (lv_ip_1_0= RULE_INT )
            // InternalIoT.g:2096:5: lv_ip_1_0= RULE_INT
            {
            lv_ip_1_0=(Token)match(input,RULE_INT,FOLLOW_36); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_ip_1_0, grammarAccess.getIpAccess().getIpINTTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getIpRule());
              					}
              					addWithLastConsumed(
              						current,
              						"ip",
              						lv_ip_1_0,
              						"org.eclipse.xtext.common.Terminals.INT");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,58,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getIpAccess().getFullStopKeyword_2());
              		
            }
            // InternalIoT.g:2116:3: ( (lv_ip_3_0= RULE_INT ) )
            // InternalIoT.g:2117:4: (lv_ip_3_0= RULE_INT )
            {
            // InternalIoT.g:2117:4: (lv_ip_3_0= RULE_INT )
            // InternalIoT.g:2118:5: lv_ip_3_0= RULE_INT
            {
            lv_ip_3_0=(Token)match(input,RULE_INT,FOLLOW_36); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_ip_3_0, grammarAccess.getIpAccess().getIpINTTerminalRuleCall_3_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getIpRule());
              					}
              					addWithLastConsumed(
              						current,
              						"ip",
              						lv_ip_3_0,
              						"org.eclipse.xtext.common.Terminals.INT");
              				
            }

            }


            }

            otherlv_4=(Token)match(input,58,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getIpAccess().getFullStopKeyword_4());
              		
            }
            // InternalIoT.g:2138:3: ( (lv_ip_5_0= RULE_INT ) )
            // InternalIoT.g:2139:4: (lv_ip_5_0= RULE_INT )
            {
            // InternalIoT.g:2139:4: (lv_ip_5_0= RULE_INT )
            // InternalIoT.g:2140:5: lv_ip_5_0= RULE_INT
            {
            lv_ip_5_0=(Token)match(input,RULE_INT,FOLLOW_36); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_ip_5_0, grammarAccess.getIpAccess().getIpINTTerminalRuleCall_5_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getIpRule());
              					}
              					addWithLastConsumed(
              						current,
              						"ip",
              						lv_ip_5_0,
              						"org.eclipse.xtext.common.Terminals.INT");
              				
            }

            }


            }

            otherlv_6=(Token)match(input,58,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getIpAccess().getFullStopKeyword_6());
              		
            }
            // InternalIoT.g:2160:3: ( (lv_ip_7_0= RULE_INT ) )
            // InternalIoT.g:2161:4: (lv_ip_7_0= RULE_INT )
            {
            // InternalIoT.g:2161:4: (lv_ip_7_0= RULE_INT )
            // InternalIoT.g:2162:5: lv_ip_7_0= RULE_INT
            {
            lv_ip_7_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_ip_7_0, grammarAccess.getIpAccess().getIpINTTerminalRuleCall_7_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getIpRule());
              					}
              					addWithLastConsumed(
              						current,
              						"ip",
              						lv_ip_7_0,
              						"org.eclipse.xtext.common.Terminals.INT");
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIp"


    // $ANTLR start "entryRulePortnumber"
    // InternalIoT.g:2182:1: entryRulePortnumber returns [EObject current=null] : iv_rulePortnumber= rulePortnumber EOF ;
    public final EObject entryRulePortnumber() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePortnumber = null;


        try {
            // InternalIoT.g:2182:51: (iv_rulePortnumber= rulePortnumber EOF )
            // InternalIoT.g:2183:2: iv_rulePortnumber= rulePortnumber EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPortnumberRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePortnumber=rulePortnumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePortnumber; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePortnumber"


    // $ANTLR start "rulePortnumber"
    // InternalIoT.g:2189:1: rulePortnumber returns [EObject current=null] : ( () ( (lv_number_1_0= RULE_INT ) ) ) ;
    public final EObject rulePortnumber() throws RecognitionException {
        EObject current = null;

        Token lv_number_1_0=null;


        	enterRule();

        try {
            // InternalIoT.g:2195:2: ( ( () ( (lv_number_1_0= RULE_INT ) ) ) )
            // InternalIoT.g:2196:2: ( () ( (lv_number_1_0= RULE_INT ) ) )
            {
            // InternalIoT.g:2196:2: ( () ( (lv_number_1_0= RULE_INT ) ) )
            // InternalIoT.g:2197:3: () ( (lv_number_1_0= RULE_INT ) )
            {
            // InternalIoT.g:2197:3: ()
            // InternalIoT.g:2198:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getPortnumberAccess().getPortnumberAction_0(),
              					current);
              			
            }

            }

            // InternalIoT.g:2204:3: ( (lv_number_1_0= RULE_INT ) )
            // InternalIoT.g:2205:4: (lv_number_1_0= RULE_INT )
            {
            // InternalIoT.g:2205:4: (lv_number_1_0= RULE_INT )
            // InternalIoT.g:2206:5: lv_number_1_0= RULE_INT
            {
            lv_number_1_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_number_1_0, grammarAccess.getPortnumberAccess().getNumberINTTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getPortnumberRule());
              					}
              					setWithLastConsumed(
              						current,
              						"number",
              						lv_number_1_0,
              						"org.eclipse.xtext.common.Terminals.INT");
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePortnumber"


    // $ANTLR start "entryRuleTime"
    // InternalIoT.g:2226:1: entryRuleTime returns [EObject current=null] : iv_ruleTime= ruleTime EOF ;
    public final EObject entryRuleTime() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTime = null;


        try {
            // InternalIoT.g:2226:45: (iv_ruleTime= ruleTime EOF )
            // InternalIoT.g:2227:2: iv_ruleTime= ruleTime EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTimeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTime=ruleTime();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTime; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTime"


    // $ANTLR start "ruleTime"
    // InternalIoT.g:2233:1: ruleTime returns [EObject current=null] : ( (lv_time_0_0= RULE_INT ) ) ;
    public final EObject ruleTime() throws RecognitionException {
        EObject current = null;

        Token lv_time_0_0=null;


        	enterRule();

        try {
            // InternalIoT.g:2239:2: ( ( (lv_time_0_0= RULE_INT ) ) )
            // InternalIoT.g:2240:2: ( (lv_time_0_0= RULE_INT ) )
            {
            // InternalIoT.g:2240:2: ( (lv_time_0_0= RULE_INT ) )
            // InternalIoT.g:2241:3: (lv_time_0_0= RULE_INT )
            {
            // InternalIoT.g:2241:3: (lv_time_0_0= RULE_INT )
            // InternalIoT.g:2242:4: lv_time_0_0= RULE_INT
            {
            lv_time_0_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_time_0_0, grammarAccess.getTimeAccess().getTimeINTTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getTimeRule());
              				}
              				setWithLastConsumed(
              					current,
              					"time",
              					lv_time_0_0,
              					"org.eclipse.xtext.common.Terminals.INT");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTime"

    // $ANTLR start synpred1_InternalIoT
    public final void synpred1_InternalIoT_fragment() throws RecognitionException {   
        // InternalIoT.g:1374:5: ( 'condition' )
        // InternalIoT.g:1374:6: 'condition'
        {
        match(input,40,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalIoT

    // $ANTLR start synpred2_InternalIoT
    public final void synpred2_InternalIoT_fragment() throws RecognitionException {   
        // InternalIoT.g:1402:5: ( 'triggered' )
        // InternalIoT.g:1402:6: 'triggered'
        {
        match(input,41,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_InternalIoT

    // $ANTLR start synpred3_InternalIoT
    public final void synpred3_InternalIoT_fragment() throws RecognitionException {   
        // InternalIoT.g:1543:5: ( 'else' )
        // InternalIoT.g:1543:6: 'else'
        {
        match(input,44,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_InternalIoT

    // Delegated rules

    public final boolean synpred2_InternalIoT() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalIoT_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalIoT() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalIoT_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalIoT() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalIoT_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000718C52802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000201000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004008000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x000000C000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000030000000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0001E00000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0300000000100030L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x00F8000000000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0400000000000000L});

}