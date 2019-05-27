package org.xtext.sdu.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.sdu.services.IoTGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalIoTParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ms'", "'s'", "'m'", "'h'", "'<'", "'<='", "'=='", "'>='", "'>'", "'SensorTypes'", "','", "'Sensor'", "'of'", "'type'", "'SensorGroup'", "'include'", "'SensorGetMethod'", "'for'", "'('", "')'", "'DeviceTypes'", "'Device'", "'contains'", "'device'", "'group'", "'ServerTypes'", "'Server'", "'listens'", "'on'", "'and'", "'DestinationTypes'", "'Destination'", "'Fetch'", "'data'", "'from'", "'to'", "'destination'", "'server'", "'condition'", "'triggered'", "'every'", "'if'", "'else'", "'||'", "'&&'", "'.'", "'true'", "'false'"
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

    	public void setGrammarAccess(IoTGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleSystem"
    // InternalIoT.g:54:1: entryRuleSystem : ruleSystem EOF ;
    public final void entryRuleSystem() throws RecognitionException {
        try {
            // InternalIoT.g:55:1: ( ruleSystem EOF )
            // InternalIoT.g:56:1: ruleSystem EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSystem();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSystemRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSystem"


    // $ANTLR start "ruleSystem"
    // InternalIoT.g:63:1: ruleSystem : ( ( ( rule__System__SystemAssignment ) ) ( ( rule__System__SystemAssignment )* ) ) ;
    public final void ruleSystem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:67:2: ( ( ( ( rule__System__SystemAssignment ) ) ( ( rule__System__SystemAssignment )* ) ) )
            // InternalIoT.g:68:2: ( ( ( rule__System__SystemAssignment ) ) ( ( rule__System__SystemAssignment )* ) )
            {
            // InternalIoT.g:68:2: ( ( ( rule__System__SystemAssignment ) ) ( ( rule__System__SystemAssignment )* ) )
            // InternalIoT.g:69:3: ( ( rule__System__SystemAssignment ) ) ( ( rule__System__SystemAssignment )* )
            {
            // InternalIoT.g:69:3: ( ( rule__System__SystemAssignment ) )
            // InternalIoT.g:70:4: ( rule__System__SystemAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemAccess().getSystemAssignment()); 
            }
            // InternalIoT.g:71:4: ( rule__System__SystemAssignment )
            // InternalIoT.g:71:5: rule__System__SystemAssignment
            {
            pushFollow(FOLLOW_3);
            rule__System__SystemAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSystemAccess().getSystemAssignment()); 
            }

            }

            // InternalIoT.g:74:3: ( ( rule__System__SystemAssignment )* )
            // InternalIoT.g:75:4: ( rule__System__SystemAssignment )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemAccess().getSystemAssignment()); 
            }
            // InternalIoT.g:76:4: ( rule__System__SystemAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==20||LA1_0==22||LA1_0==25||LA1_0==27||(LA1_0>=31 && LA1_0<=32)||(LA1_0>=36 && LA1_0<=37)||(LA1_0>=41 && LA1_0<=43)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalIoT.g:76:5: rule__System__SystemAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__System__SystemAssignment();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSystemAccess().getSystemAssignment()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSystem"


    // $ANTLR start "entryRuleSensorType"
    // InternalIoT.g:86:1: entryRuleSensorType : ruleSensorType EOF ;
    public final void entryRuleSensorType() throws RecognitionException {
        try {
            // InternalIoT.g:87:1: ( ruleSensorType EOF )
            // InternalIoT.g:88:1: ruleSensorType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSensorTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSensorType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSensorTypeRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSensorType"


    // $ANTLR start "ruleSensorType"
    // InternalIoT.g:95:1: ruleSensorType : ( ( rule__SensorType__NameAssignment ) ) ;
    public final void ruleSensorType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:99:2: ( ( ( rule__SensorType__NameAssignment ) ) )
            // InternalIoT.g:100:2: ( ( rule__SensorType__NameAssignment ) )
            {
            // InternalIoT.g:100:2: ( ( rule__SensorType__NameAssignment ) )
            // InternalIoT.g:101:3: ( rule__SensorType__NameAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSensorTypeAccess().getNameAssignment()); 
            }
            // InternalIoT.g:102:3: ( rule__SensorType__NameAssignment )
            // InternalIoT.g:102:4: rule__SensorType__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__SensorType__NameAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSensorTypeAccess().getNameAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSensorType"


    // $ANTLR start "entryRuleSensorTypes"
    // InternalIoT.g:111:1: entryRuleSensorTypes : ruleSensorTypes EOF ;
    public final void entryRuleSensorTypes() throws RecognitionException {
        try {
            // InternalIoT.g:112:1: ( ruleSensorTypes EOF )
            // InternalIoT.g:113:1: ruleSensorTypes EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSensorTypesRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSensorTypes();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSensorTypesRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSensorTypes"


    // $ANTLR start "ruleSensorTypes"
    // InternalIoT.g:120:1: ruleSensorTypes : ( ( rule__SensorTypes__Group__0 ) ) ;
    public final void ruleSensorTypes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:124:2: ( ( ( rule__SensorTypes__Group__0 ) ) )
            // InternalIoT.g:125:2: ( ( rule__SensorTypes__Group__0 ) )
            {
            // InternalIoT.g:125:2: ( ( rule__SensorTypes__Group__0 ) )
            // InternalIoT.g:126:3: ( rule__SensorTypes__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSensorTypesAccess().getGroup()); 
            }
            // InternalIoT.g:127:3: ( rule__SensorTypes__Group__0 )
            // InternalIoT.g:127:4: rule__SensorTypes__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SensorTypes__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSensorTypesAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSensorTypes"


    // $ANTLR start "entryRuleSensor"
    // InternalIoT.g:136:1: entryRuleSensor : ruleSensor EOF ;
    public final void entryRuleSensor() throws RecognitionException {
        try {
            // InternalIoT.g:137:1: ( ruleSensor EOF )
            // InternalIoT.g:138:1: ruleSensor EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSensorRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSensor();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSensorRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSensor"


    // $ANTLR start "ruleSensor"
    // InternalIoT.g:145:1: ruleSensor : ( ( rule__Sensor__Group__0 ) ) ;
    public final void ruleSensor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:149:2: ( ( ( rule__Sensor__Group__0 ) ) )
            // InternalIoT.g:150:2: ( ( rule__Sensor__Group__0 ) )
            {
            // InternalIoT.g:150:2: ( ( rule__Sensor__Group__0 ) )
            // InternalIoT.g:151:3: ( rule__Sensor__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSensorAccess().getGroup()); 
            }
            // InternalIoT.g:152:3: ( rule__Sensor__Group__0 )
            // InternalIoT.g:152:4: rule__Sensor__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSensorAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSensor"


    // $ANTLR start "entryRuleSensorGroup"
    // InternalIoT.g:161:1: entryRuleSensorGroup : ruleSensorGroup EOF ;
    public final void entryRuleSensorGroup() throws RecognitionException {
        try {
            // InternalIoT.g:162:1: ( ruleSensorGroup EOF )
            // InternalIoT.g:163:1: ruleSensorGroup EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSensorGroupRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSensorGroup();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSensorGroupRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSensorGroup"


    // $ANTLR start "ruleSensorGroup"
    // InternalIoT.g:170:1: ruleSensorGroup : ( ( rule__SensorGroup__Group__0 ) ) ;
    public final void ruleSensorGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:174:2: ( ( ( rule__SensorGroup__Group__0 ) ) )
            // InternalIoT.g:175:2: ( ( rule__SensorGroup__Group__0 ) )
            {
            // InternalIoT.g:175:2: ( ( rule__SensorGroup__Group__0 ) )
            // InternalIoT.g:176:3: ( rule__SensorGroup__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSensorGroupAccess().getGroup()); 
            }
            // InternalIoT.g:177:3: ( rule__SensorGroup__Group__0 )
            // InternalIoT.g:177:4: rule__SensorGroup__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SensorGroup__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSensorGroupAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSensorGroup"


    // $ANTLR start "entryRuleSensorGetMethod"
    // InternalIoT.g:186:1: entryRuleSensorGetMethod : ruleSensorGetMethod EOF ;
    public final void entryRuleSensorGetMethod() throws RecognitionException {
        try {
            // InternalIoT.g:187:1: ( ruleSensorGetMethod EOF )
            // InternalIoT.g:188:1: ruleSensorGetMethod EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSensorGetMethodRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSensorGetMethod();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSensorGetMethodRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSensorGetMethod"


    // $ANTLR start "ruleSensorGetMethod"
    // InternalIoT.g:195:1: ruleSensorGetMethod : ( ( rule__SensorGetMethod__Group__0 ) ) ;
    public final void ruleSensorGetMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:199:2: ( ( ( rule__SensorGetMethod__Group__0 ) ) )
            // InternalIoT.g:200:2: ( ( rule__SensorGetMethod__Group__0 ) )
            {
            // InternalIoT.g:200:2: ( ( rule__SensorGetMethod__Group__0 ) )
            // InternalIoT.g:201:3: ( rule__SensorGetMethod__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSensorGetMethodAccess().getGroup()); 
            }
            // InternalIoT.g:202:3: ( rule__SensorGetMethod__Group__0 )
            // InternalIoT.g:202:4: rule__SensorGetMethod__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SensorGetMethod__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSensorGetMethodAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSensorGetMethod"


    // $ANTLR start "entryRuleMethod"
    // InternalIoT.g:211:1: entryRuleMethod : ruleMethod EOF ;
    public final void entryRuleMethod() throws RecognitionException {
        try {
            // InternalIoT.g:212:1: ( ruleMethod EOF )
            // InternalIoT.g:213:1: ruleMethod EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMethod();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMethod"


    // $ANTLR start "ruleMethod"
    // InternalIoT.g:220:1: ruleMethod : ( ( rule__Method__Group__0 ) ) ;
    public final void ruleMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:224:2: ( ( ( rule__Method__Group__0 ) ) )
            // InternalIoT.g:225:2: ( ( rule__Method__Group__0 ) )
            {
            // InternalIoT.g:225:2: ( ( rule__Method__Group__0 ) )
            // InternalIoT.g:226:3: ( rule__Method__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getGroup()); 
            }
            // InternalIoT.g:227:3: ( rule__Method__Group__0 )
            // InternalIoT.g:227:4: rule__Method__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Method__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMethod"


    // $ANTLR start "entryRuleDeviceType"
    // InternalIoT.g:236:1: entryRuleDeviceType : ruleDeviceType EOF ;
    public final void entryRuleDeviceType() throws RecognitionException {
        try {
            // InternalIoT.g:237:1: ( ruleDeviceType EOF )
            // InternalIoT.g:238:1: ruleDeviceType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeviceTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleDeviceType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeviceTypeRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDeviceType"


    // $ANTLR start "ruleDeviceType"
    // InternalIoT.g:245:1: ruleDeviceType : ( ( rule__DeviceType__NameAssignment ) ) ;
    public final void ruleDeviceType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:249:2: ( ( ( rule__DeviceType__NameAssignment ) ) )
            // InternalIoT.g:250:2: ( ( rule__DeviceType__NameAssignment ) )
            {
            // InternalIoT.g:250:2: ( ( rule__DeviceType__NameAssignment ) )
            // InternalIoT.g:251:3: ( rule__DeviceType__NameAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeviceTypeAccess().getNameAssignment()); 
            }
            // InternalIoT.g:252:3: ( rule__DeviceType__NameAssignment )
            // InternalIoT.g:252:4: rule__DeviceType__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__DeviceType__NameAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeviceTypeAccess().getNameAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDeviceType"


    // $ANTLR start "entryRuleDeviceTypes"
    // InternalIoT.g:261:1: entryRuleDeviceTypes : ruleDeviceTypes EOF ;
    public final void entryRuleDeviceTypes() throws RecognitionException {
        try {
            // InternalIoT.g:262:1: ( ruleDeviceTypes EOF )
            // InternalIoT.g:263:1: ruleDeviceTypes EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeviceTypesRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleDeviceTypes();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeviceTypesRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDeviceTypes"


    // $ANTLR start "ruleDeviceTypes"
    // InternalIoT.g:270:1: ruleDeviceTypes : ( ( rule__DeviceTypes__Group__0 ) ) ;
    public final void ruleDeviceTypes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:274:2: ( ( ( rule__DeviceTypes__Group__0 ) ) )
            // InternalIoT.g:275:2: ( ( rule__DeviceTypes__Group__0 ) )
            {
            // InternalIoT.g:275:2: ( ( rule__DeviceTypes__Group__0 ) )
            // InternalIoT.g:276:3: ( rule__DeviceTypes__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeviceTypesAccess().getGroup()); 
            }
            // InternalIoT.g:277:3: ( rule__DeviceTypes__Group__0 )
            // InternalIoT.g:277:4: rule__DeviceTypes__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DeviceTypes__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeviceTypesAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDeviceTypes"


    // $ANTLR start "entryRuleDevice"
    // InternalIoT.g:286:1: entryRuleDevice : ruleDevice EOF ;
    public final void entryRuleDevice() throws RecognitionException {
        try {
            // InternalIoT.g:287:1: ( ruleDevice EOF )
            // InternalIoT.g:288:1: ruleDevice EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeviceRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleDevice();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeviceRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDevice"


    // $ANTLR start "ruleDevice"
    // InternalIoT.g:295:1: ruleDevice : ( ( rule__Device__Group__0 ) ) ;
    public final void ruleDevice() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:299:2: ( ( ( rule__Device__Group__0 ) ) )
            // InternalIoT.g:300:2: ( ( rule__Device__Group__0 ) )
            {
            // InternalIoT.g:300:2: ( ( rule__Device__Group__0 ) )
            // InternalIoT.g:301:3: ( rule__Device__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeviceAccess().getGroup()); 
            }
            // InternalIoT.g:302:3: ( rule__Device__Group__0 )
            // InternalIoT.g:302:4: rule__Device__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Device__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeviceAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDevice"


    // $ANTLR start "entryRuleServerType"
    // InternalIoT.g:311:1: entryRuleServerType : ruleServerType EOF ;
    public final void entryRuleServerType() throws RecognitionException {
        try {
            // InternalIoT.g:312:1: ( ruleServerType EOF )
            // InternalIoT.g:313:1: ruleServerType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServerTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleServerType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getServerTypeRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleServerType"


    // $ANTLR start "ruleServerType"
    // InternalIoT.g:320:1: ruleServerType : ( ( rule__ServerType__NameAssignment ) ) ;
    public final void ruleServerType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:324:2: ( ( ( rule__ServerType__NameAssignment ) ) )
            // InternalIoT.g:325:2: ( ( rule__ServerType__NameAssignment ) )
            {
            // InternalIoT.g:325:2: ( ( rule__ServerType__NameAssignment ) )
            // InternalIoT.g:326:3: ( rule__ServerType__NameAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServerTypeAccess().getNameAssignment()); 
            }
            // InternalIoT.g:327:3: ( rule__ServerType__NameAssignment )
            // InternalIoT.g:327:4: rule__ServerType__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ServerType__NameAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getServerTypeAccess().getNameAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleServerType"


    // $ANTLR start "entryRuleServerTypes"
    // InternalIoT.g:336:1: entryRuleServerTypes : ruleServerTypes EOF ;
    public final void entryRuleServerTypes() throws RecognitionException {
        try {
            // InternalIoT.g:337:1: ( ruleServerTypes EOF )
            // InternalIoT.g:338:1: ruleServerTypes EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServerTypesRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleServerTypes();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getServerTypesRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleServerTypes"


    // $ANTLR start "ruleServerTypes"
    // InternalIoT.g:345:1: ruleServerTypes : ( ( rule__ServerTypes__Group__0 ) ) ;
    public final void ruleServerTypes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:349:2: ( ( ( rule__ServerTypes__Group__0 ) ) )
            // InternalIoT.g:350:2: ( ( rule__ServerTypes__Group__0 ) )
            {
            // InternalIoT.g:350:2: ( ( rule__ServerTypes__Group__0 ) )
            // InternalIoT.g:351:3: ( rule__ServerTypes__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServerTypesAccess().getGroup()); 
            }
            // InternalIoT.g:352:3: ( rule__ServerTypes__Group__0 )
            // InternalIoT.g:352:4: rule__ServerTypes__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ServerTypes__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getServerTypesAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleServerTypes"


    // $ANTLR start "entryRuleServer"
    // InternalIoT.g:361:1: entryRuleServer : ruleServer EOF ;
    public final void entryRuleServer() throws RecognitionException {
        try {
            // InternalIoT.g:362:1: ( ruleServer EOF )
            // InternalIoT.g:363:1: ruleServer EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServerRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleServer();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getServerRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleServer"


    // $ANTLR start "ruleServer"
    // InternalIoT.g:370:1: ruleServer : ( ( rule__Server__Group__0 ) ) ;
    public final void ruleServer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:374:2: ( ( ( rule__Server__Group__0 ) ) )
            // InternalIoT.g:375:2: ( ( rule__Server__Group__0 ) )
            {
            // InternalIoT.g:375:2: ( ( rule__Server__Group__0 ) )
            // InternalIoT.g:376:3: ( rule__Server__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServerAccess().getGroup()); 
            }
            // InternalIoT.g:377:3: ( rule__Server__Group__0 )
            // InternalIoT.g:377:4: rule__Server__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Server__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getServerAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleServer"


    // $ANTLR start "entryRuleDestinationType"
    // InternalIoT.g:386:1: entryRuleDestinationType : ruleDestinationType EOF ;
    public final void entryRuleDestinationType() throws RecognitionException {
        try {
            // InternalIoT.g:387:1: ( ruleDestinationType EOF )
            // InternalIoT.g:388:1: ruleDestinationType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDestinationTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleDestinationType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDestinationTypeRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDestinationType"


    // $ANTLR start "ruleDestinationType"
    // InternalIoT.g:395:1: ruleDestinationType : ( ( rule__DestinationType__NameAssignment ) ) ;
    public final void ruleDestinationType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:399:2: ( ( ( rule__DestinationType__NameAssignment ) ) )
            // InternalIoT.g:400:2: ( ( rule__DestinationType__NameAssignment ) )
            {
            // InternalIoT.g:400:2: ( ( rule__DestinationType__NameAssignment ) )
            // InternalIoT.g:401:3: ( rule__DestinationType__NameAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDestinationTypeAccess().getNameAssignment()); 
            }
            // InternalIoT.g:402:3: ( rule__DestinationType__NameAssignment )
            // InternalIoT.g:402:4: rule__DestinationType__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__DestinationType__NameAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDestinationTypeAccess().getNameAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDestinationType"


    // $ANTLR start "entryRuleDestinationTypes"
    // InternalIoT.g:411:1: entryRuleDestinationTypes : ruleDestinationTypes EOF ;
    public final void entryRuleDestinationTypes() throws RecognitionException {
        try {
            // InternalIoT.g:412:1: ( ruleDestinationTypes EOF )
            // InternalIoT.g:413:1: ruleDestinationTypes EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDestinationTypesRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleDestinationTypes();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDestinationTypesRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDestinationTypes"


    // $ANTLR start "ruleDestinationTypes"
    // InternalIoT.g:420:1: ruleDestinationTypes : ( ( rule__DestinationTypes__Group__0 ) ) ;
    public final void ruleDestinationTypes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:424:2: ( ( ( rule__DestinationTypes__Group__0 ) ) )
            // InternalIoT.g:425:2: ( ( rule__DestinationTypes__Group__0 ) )
            {
            // InternalIoT.g:425:2: ( ( rule__DestinationTypes__Group__0 ) )
            // InternalIoT.g:426:3: ( rule__DestinationTypes__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDestinationTypesAccess().getGroup()); 
            }
            // InternalIoT.g:427:3: ( rule__DestinationTypes__Group__0 )
            // InternalIoT.g:427:4: rule__DestinationTypes__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DestinationTypes__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDestinationTypesAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDestinationTypes"


    // $ANTLR start "entryRuleDestination"
    // InternalIoT.g:436:1: entryRuleDestination : ruleDestination EOF ;
    public final void entryRuleDestination() throws RecognitionException {
        try {
            // InternalIoT.g:437:1: ( ruleDestination EOF )
            // InternalIoT.g:438:1: ruleDestination EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDestinationRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleDestination();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDestinationRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDestination"


    // $ANTLR start "ruleDestination"
    // InternalIoT.g:445:1: ruleDestination : ( ( rule__Destination__Group__0 ) ) ;
    public final void ruleDestination() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:449:2: ( ( ( rule__Destination__Group__0 ) ) )
            // InternalIoT.g:450:2: ( ( rule__Destination__Group__0 ) )
            {
            // InternalIoT.g:450:2: ( ( rule__Destination__Group__0 ) )
            // InternalIoT.g:451:3: ( rule__Destination__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDestinationAccess().getGroup()); 
            }
            // InternalIoT.g:452:3: ( rule__Destination__Group__0 )
            // InternalIoT.g:452:4: rule__Destination__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Destination__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDestinationAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDestination"


    // $ANTLR start "entryRuleFetchData"
    // InternalIoT.g:461:1: entryRuleFetchData : ruleFetchData EOF ;
    public final void entryRuleFetchData() throws RecognitionException {
        try {
            // InternalIoT.g:462:1: ( ruleFetchData EOF )
            // InternalIoT.g:463:1: ruleFetchData EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFetchDataRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleFetchData();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFetchDataRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFetchData"


    // $ANTLR start "ruleFetchData"
    // InternalIoT.g:470:1: ruleFetchData : ( ( rule__FetchData__Group__0 ) ) ;
    public final void ruleFetchData() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:474:2: ( ( ( rule__FetchData__Group__0 ) ) )
            // InternalIoT.g:475:2: ( ( rule__FetchData__Group__0 ) )
            {
            // InternalIoT.g:475:2: ( ( rule__FetchData__Group__0 ) )
            // InternalIoT.g:476:3: ( rule__FetchData__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFetchDataAccess().getGroup()); 
            }
            // InternalIoT.g:477:3: ( rule__FetchData__Group__0 )
            // InternalIoT.g:477:4: rule__FetchData__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FetchData__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFetchDataAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFetchData"


    // $ANTLR start "entryRuleFetchDataExpression"
    // InternalIoT.g:486:1: entryRuleFetchDataExpression : ruleFetchDataExpression EOF ;
    public final void entryRuleFetchDataExpression() throws RecognitionException {
        try {
            // InternalIoT.g:487:1: ( ruleFetchDataExpression EOF )
            // InternalIoT.g:488:1: ruleFetchDataExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFetchDataExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleFetchDataExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFetchDataExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFetchDataExpression"


    // $ANTLR start "ruleFetchDataExpression"
    // InternalIoT.g:495:1: ruleFetchDataExpression : ( ( rule__FetchDataExpression__Group__0 ) ) ;
    public final void ruleFetchDataExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:499:2: ( ( ( rule__FetchDataExpression__Group__0 ) ) )
            // InternalIoT.g:500:2: ( ( rule__FetchDataExpression__Group__0 ) )
            {
            // InternalIoT.g:500:2: ( ( rule__FetchDataExpression__Group__0 ) )
            // InternalIoT.g:501:3: ( rule__FetchDataExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFetchDataExpressionAccess().getGroup()); 
            }
            // InternalIoT.g:502:3: ( rule__FetchDataExpression__Group__0 )
            // InternalIoT.g:502:4: rule__FetchDataExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FetchDataExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFetchDataExpressionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFetchDataExpression"


    // $ANTLR start "entryRuleFetchDataCondition"
    // InternalIoT.g:511:1: entryRuleFetchDataCondition : ruleFetchDataCondition EOF ;
    public final void entryRuleFetchDataCondition() throws RecognitionException {
        try {
            // InternalIoT.g:512:1: ( ruleFetchDataCondition EOF )
            // InternalIoT.g:513:1: ruleFetchDataCondition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFetchDataConditionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleFetchDataCondition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFetchDataConditionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFetchDataCondition"


    // $ANTLR start "ruleFetchDataCondition"
    // InternalIoT.g:520:1: ruleFetchDataCondition : ( ( rule__FetchDataCondition__Group__0 ) ) ;
    public final void ruleFetchDataCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:524:2: ( ( ( rule__FetchDataCondition__Group__0 ) ) )
            // InternalIoT.g:525:2: ( ( rule__FetchDataCondition__Group__0 ) )
            {
            // InternalIoT.g:525:2: ( ( rule__FetchDataCondition__Group__0 ) )
            // InternalIoT.g:526:3: ( rule__FetchDataCondition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFetchDataConditionAccess().getGroup()); 
            }
            // InternalIoT.g:527:3: ( rule__FetchDataCondition__Group__0 )
            // InternalIoT.g:527:4: rule__FetchDataCondition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FetchDataCondition__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFetchDataConditionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFetchDataCondition"


    // $ANTLR start "entryRuleTimeUnit"
    // InternalIoT.g:536:1: entryRuleTimeUnit : ruleTimeUnit EOF ;
    public final void entryRuleTimeUnit() throws RecognitionException {
        try {
            // InternalIoT.g:537:1: ( ruleTimeUnit EOF )
            // InternalIoT.g:538:1: ruleTimeUnit EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTimeUnitRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleTimeUnit();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTimeUnitRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTimeUnit"


    // $ANTLR start "ruleTimeUnit"
    // InternalIoT.g:545:1: ruleTimeUnit : ( ( rule__TimeUnit__Alternatives ) ) ;
    public final void ruleTimeUnit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:549:2: ( ( ( rule__TimeUnit__Alternatives ) ) )
            // InternalIoT.g:550:2: ( ( rule__TimeUnit__Alternatives ) )
            {
            // InternalIoT.g:550:2: ( ( rule__TimeUnit__Alternatives ) )
            // InternalIoT.g:551:3: ( rule__TimeUnit__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTimeUnitAccess().getAlternatives()); 
            }
            // InternalIoT.g:552:3: ( rule__TimeUnit__Alternatives )
            // InternalIoT.g:552:4: rule__TimeUnit__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TimeUnit__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTimeUnitAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTimeUnit"


    // $ANTLR start "entryRuleCondition"
    // InternalIoT.g:561:1: entryRuleCondition : ruleCondition EOF ;
    public final void entryRuleCondition() throws RecognitionException {
        try {
            // InternalIoT.g:562:1: ( ruleCondition EOF )
            // InternalIoT.g:563:1: ruleCondition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleCondition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalIoT.g:570:1: ruleCondition : ( ruleOrCondition ) ;
    public final void ruleCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:574:2: ( ( ruleOrCondition ) )
            // InternalIoT.g:575:2: ( ruleOrCondition )
            {
            // InternalIoT.g:575:2: ( ruleOrCondition )
            // InternalIoT.g:576:3: ruleOrCondition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getOrConditionParserRuleCall()); 
            }
            pushFollow(FOLLOW_2);
            ruleOrCondition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionAccess().getOrConditionParserRuleCall()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleOrCondition"
    // InternalIoT.g:586:1: entryRuleOrCondition : ruleOrCondition EOF ;
    public final void entryRuleOrCondition() throws RecognitionException {
        try {
            // InternalIoT.g:587:1: ( ruleOrCondition EOF )
            // InternalIoT.g:588:1: ruleOrCondition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrConditionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleOrCondition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrConditionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOrCondition"


    // $ANTLR start "ruleOrCondition"
    // InternalIoT.g:595:1: ruleOrCondition : ( ( rule__OrCondition__Group__0 ) ) ;
    public final void ruleOrCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:599:2: ( ( ( rule__OrCondition__Group__0 ) ) )
            // InternalIoT.g:600:2: ( ( rule__OrCondition__Group__0 ) )
            {
            // InternalIoT.g:600:2: ( ( rule__OrCondition__Group__0 ) )
            // InternalIoT.g:601:3: ( rule__OrCondition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrConditionAccess().getGroup()); 
            }
            // InternalIoT.g:602:3: ( rule__OrCondition__Group__0 )
            // InternalIoT.g:602:4: rule__OrCondition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OrCondition__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrConditionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOrCondition"


    // $ANTLR start "entryRuleAndCondition"
    // InternalIoT.g:611:1: entryRuleAndCondition : ruleAndCondition EOF ;
    public final void entryRuleAndCondition() throws RecognitionException {
        try {
            // InternalIoT.g:612:1: ( ruleAndCondition EOF )
            // InternalIoT.g:613:1: ruleAndCondition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndConditionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAndCondition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndConditionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAndCondition"


    // $ANTLR start "ruleAndCondition"
    // InternalIoT.g:620:1: ruleAndCondition : ( ( rule__AndCondition__Group__0 ) ) ;
    public final void ruleAndCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:624:2: ( ( ( rule__AndCondition__Group__0 ) ) )
            // InternalIoT.g:625:2: ( ( rule__AndCondition__Group__0 ) )
            {
            // InternalIoT.g:625:2: ( ( rule__AndCondition__Group__0 ) )
            // InternalIoT.g:626:3: ( rule__AndCondition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndConditionAccess().getGroup()); 
            }
            // InternalIoT.g:627:3: ( rule__AndCondition__Group__0 )
            // InternalIoT.g:627:4: rule__AndCondition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AndCondition__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndConditionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAndCondition"


    // $ANTLR start "entryRuleComparisonCondition"
    // InternalIoT.g:636:1: entryRuleComparisonCondition : ruleComparisonCondition EOF ;
    public final void entryRuleComparisonCondition() throws RecognitionException {
        try {
            // InternalIoT.g:637:1: ( ruleComparisonCondition EOF )
            // InternalIoT.g:638:1: ruleComparisonCondition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonConditionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleComparisonCondition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonConditionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleComparisonCondition"


    // $ANTLR start "ruleComparisonCondition"
    // InternalIoT.g:645:1: ruleComparisonCondition : ( ( rule__ComparisonCondition__Group__0 ) ) ;
    public final void ruleComparisonCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:649:2: ( ( ( rule__ComparisonCondition__Group__0 ) ) )
            // InternalIoT.g:650:2: ( ( rule__ComparisonCondition__Group__0 ) )
            {
            // InternalIoT.g:650:2: ( ( rule__ComparisonCondition__Group__0 ) )
            // InternalIoT.g:651:3: ( rule__ComparisonCondition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonConditionAccess().getGroup()); 
            }
            // InternalIoT.g:652:3: ( rule__ComparisonCondition__Group__0 )
            // InternalIoT.g:652:4: rule__ComparisonCondition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ComparisonCondition__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonConditionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComparisonCondition"


    // $ANTLR start "entryRulePrimaryCondition"
    // InternalIoT.g:661:1: entryRulePrimaryCondition : rulePrimaryCondition EOF ;
    public final void entryRulePrimaryCondition() throws RecognitionException {
        try {
            // InternalIoT.g:662:1: ( rulePrimaryCondition EOF )
            // InternalIoT.g:663:1: rulePrimaryCondition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryConditionRule()); 
            }
            pushFollow(FOLLOW_1);
            rulePrimaryCondition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryConditionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrimaryCondition"


    // $ANTLR start "rulePrimaryCondition"
    // InternalIoT.g:670:1: rulePrimaryCondition : ( ( rule__PrimaryCondition__Alternatives ) ) ;
    public final void rulePrimaryCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:674:2: ( ( ( rule__PrimaryCondition__Alternatives ) ) )
            // InternalIoT.g:675:2: ( ( rule__PrimaryCondition__Alternatives ) )
            {
            // InternalIoT.g:675:2: ( ( rule__PrimaryCondition__Alternatives ) )
            // InternalIoT.g:676:3: ( rule__PrimaryCondition__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryConditionAccess().getAlternatives()); 
            }
            // InternalIoT.g:677:3: ( rule__PrimaryCondition__Alternatives )
            // InternalIoT.g:677:4: rule__PrimaryCondition__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryCondition__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryConditionAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimaryCondition"


    // $ANTLR start "entryRuleLiteralBoolean"
    // InternalIoT.g:686:1: entryRuleLiteralBoolean : ruleLiteralBoolean EOF ;
    public final void entryRuleLiteralBoolean() throws RecognitionException {
        try {
            // InternalIoT.g:687:1: ( ruleLiteralBoolean EOF )
            // InternalIoT.g:688:1: ruleLiteralBoolean EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralBooleanRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleLiteralBoolean();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralBooleanRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLiteralBoolean"


    // $ANTLR start "ruleLiteralBoolean"
    // InternalIoT.g:695:1: ruleLiteralBoolean : ( ( rule__LiteralBoolean__Alternatives ) ) ;
    public final void ruleLiteralBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:699:2: ( ( ( rule__LiteralBoolean__Alternatives ) ) )
            // InternalIoT.g:700:2: ( ( rule__LiteralBoolean__Alternatives ) )
            {
            // InternalIoT.g:700:2: ( ( rule__LiteralBoolean__Alternatives ) )
            // InternalIoT.g:701:3: ( rule__LiteralBoolean__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralBooleanAccess().getAlternatives()); 
            }
            // InternalIoT.g:702:3: ( rule__LiteralBoolean__Alternatives )
            // InternalIoT.g:702:4: rule__LiteralBoolean__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__LiteralBoolean__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralBooleanAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLiteralBoolean"


    // $ANTLR start "entryRuleLiteralMethod"
    // InternalIoT.g:711:1: entryRuleLiteralMethod : ruleLiteralMethod EOF ;
    public final void entryRuleLiteralMethod() throws RecognitionException {
        try {
            // InternalIoT.g:712:1: ( ruleLiteralMethod EOF )
            // InternalIoT.g:713:1: ruleLiteralMethod EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralMethodRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleLiteralMethod();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralMethodRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLiteralMethod"


    // $ANTLR start "ruleLiteralMethod"
    // InternalIoT.g:720:1: ruleLiteralMethod : ( ruleMethod ) ;
    public final void ruleLiteralMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:724:2: ( ( ruleMethod ) )
            // InternalIoT.g:725:2: ( ruleMethod )
            {
            // InternalIoT.g:725:2: ( ruleMethod )
            // InternalIoT.g:726:3: ruleMethod
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralMethodAccess().getMethodParserRuleCall()); 
            }
            pushFollow(FOLLOW_2);
            ruleMethod();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralMethodAccess().getMethodParserRuleCall()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLiteralMethod"


    // $ANTLR start "entryRuleLiteralInteger"
    // InternalIoT.g:736:1: entryRuleLiteralInteger : ruleLiteralInteger EOF ;
    public final void entryRuleLiteralInteger() throws RecognitionException {
        try {
            // InternalIoT.g:737:1: ( ruleLiteralInteger EOF )
            // InternalIoT.g:738:1: ruleLiteralInteger EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralIntegerRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleLiteralInteger();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralIntegerRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLiteralInteger"


    // $ANTLR start "ruleLiteralInteger"
    // InternalIoT.g:745:1: ruleLiteralInteger : ( ( rule__LiteralInteger__Group__0 ) ) ;
    public final void ruleLiteralInteger() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:749:2: ( ( ( rule__LiteralInteger__Group__0 ) ) )
            // InternalIoT.g:750:2: ( ( rule__LiteralInteger__Group__0 ) )
            {
            // InternalIoT.g:750:2: ( ( rule__LiteralInteger__Group__0 ) )
            // InternalIoT.g:751:3: ( rule__LiteralInteger__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralIntegerAccess().getGroup()); 
            }
            // InternalIoT.g:752:3: ( rule__LiteralInteger__Group__0 )
            // InternalIoT.g:752:4: rule__LiteralInteger__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LiteralInteger__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralIntegerAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLiteralInteger"


    // $ANTLR start "entryRuleIp"
    // InternalIoT.g:761:1: entryRuleIp : ruleIp EOF ;
    public final void entryRuleIp() throws RecognitionException {
        try {
            // InternalIoT.g:762:1: ( ruleIp EOF )
            // InternalIoT.g:763:1: ruleIp EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIpRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleIp();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIpRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIp"


    // $ANTLR start "ruleIp"
    // InternalIoT.g:770:1: ruleIp : ( ( rule__Ip__Group__0 ) ) ;
    public final void ruleIp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:774:2: ( ( ( rule__Ip__Group__0 ) ) )
            // InternalIoT.g:775:2: ( ( rule__Ip__Group__0 ) )
            {
            // InternalIoT.g:775:2: ( ( rule__Ip__Group__0 ) )
            // InternalIoT.g:776:3: ( rule__Ip__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIpAccess().getGroup()); 
            }
            // InternalIoT.g:777:3: ( rule__Ip__Group__0 )
            // InternalIoT.g:777:4: rule__Ip__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Ip__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIpAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIp"


    // $ANTLR start "entryRulePortnumber"
    // InternalIoT.g:786:1: entryRulePortnumber : rulePortnumber EOF ;
    public final void entryRulePortnumber() throws RecognitionException {
        try {
            // InternalIoT.g:787:1: ( rulePortnumber EOF )
            // InternalIoT.g:788:1: rulePortnumber EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPortnumberRule()); 
            }
            pushFollow(FOLLOW_1);
            rulePortnumber();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPortnumberRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePortnumber"


    // $ANTLR start "rulePortnumber"
    // InternalIoT.g:795:1: rulePortnumber : ( ( rule__Portnumber__Group__0 ) ) ;
    public final void rulePortnumber() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:799:2: ( ( ( rule__Portnumber__Group__0 ) ) )
            // InternalIoT.g:800:2: ( ( rule__Portnumber__Group__0 ) )
            {
            // InternalIoT.g:800:2: ( ( rule__Portnumber__Group__0 ) )
            // InternalIoT.g:801:3: ( rule__Portnumber__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPortnumberAccess().getGroup()); 
            }
            // InternalIoT.g:802:3: ( rule__Portnumber__Group__0 )
            // InternalIoT.g:802:4: rule__Portnumber__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Portnumber__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPortnumberAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePortnumber"


    // $ANTLR start "entryRuleTime"
    // InternalIoT.g:811:1: entryRuleTime : ruleTime EOF ;
    public final void entryRuleTime() throws RecognitionException {
        try {
            // InternalIoT.g:812:1: ( ruleTime EOF )
            // InternalIoT.g:813:1: ruleTime EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTimeRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleTime();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTimeRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTime"


    // $ANTLR start "ruleTime"
    // InternalIoT.g:820:1: ruleTime : ( ( rule__Time__TimeAssignment ) ) ;
    public final void ruleTime() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:824:2: ( ( ( rule__Time__TimeAssignment ) ) )
            // InternalIoT.g:825:2: ( ( rule__Time__TimeAssignment ) )
            {
            // InternalIoT.g:825:2: ( ( rule__Time__TimeAssignment ) )
            // InternalIoT.g:826:3: ( rule__Time__TimeAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTimeAccess().getTimeAssignment()); 
            }
            // InternalIoT.g:827:3: ( rule__Time__TimeAssignment )
            // InternalIoT.g:827:4: rule__Time__TimeAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Time__TimeAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTimeAccess().getTimeAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTime"


    // $ANTLR start "rule__System__SystemAlternatives_0"
    // InternalIoT.g:835:1: rule__System__SystemAlternatives_0 : ( ( ruleSensorTypes ) | ( ruleSensor ) | ( ruleSensorGroup ) | ( ruleSensorGetMethod ) | ( ruleDeviceTypes ) | ( ruleDevice ) | ( ruleServerTypes ) | ( ruleServer ) | ( ruleDestinationTypes ) | ( ruleDestination ) | ( ruleFetchData ) );
    public final void rule__System__SystemAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:839:1: ( ( ruleSensorTypes ) | ( ruleSensor ) | ( ruleSensorGroup ) | ( ruleSensorGetMethod ) | ( ruleDeviceTypes ) | ( ruleDevice ) | ( ruleServerTypes ) | ( ruleServer ) | ( ruleDestinationTypes ) | ( ruleDestination ) | ( ruleFetchData ) )
            int alt2=11;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt2=1;
                }
                break;
            case 22:
                {
                alt2=2;
                }
                break;
            case 25:
                {
                alt2=3;
                }
                break;
            case 27:
                {
                alt2=4;
                }
                break;
            case 31:
                {
                alt2=5;
                }
                break;
            case 32:
                {
                alt2=6;
                }
                break;
            case 36:
                {
                alt2=7;
                }
                break;
            case 37:
                {
                alt2=8;
                }
                break;
            case 41:
                {
                alt2=9;
                }
                break;
            case 42:
                {
                alt2=10;
                }
                break;
            case 43:
                {
                alt2=11;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalIoT.g:840:2: ( ruleSensorTypes )
                    {
                    // InternalIoT.g:840:2: ( ruleSensorTypes )
                    // InternalIoT.g:841:3: ruleSensorTypes
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSystemAccess().getSystemSensorTypesParserRuleCall_0_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleSensorTypes();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSystemAccess().getSystemSensorTypesParserRuleCall_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalIoT.g:846:2: ( ruleSensor )
                    {
                    // InternalIoT.g:846:2: ( ruleSensor )
                    // InternalIoT.g:847:3: ruleSensor
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSystemAccess().getSystemSensorParserRuleCall_0_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleSensor();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSystemAccess().getSystemSensorParserRuleCall_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalIoT.g:852:2: ( ruleSensorGroup )
                    {
                    // InternalIoT.g:852:2: ( ruleSensorGroup )
                    // InternalIoT.g:853:3: ruleSensorGroup
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSystemAccess().getSystemSensorGroupParserRuleCall_0_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleSensorGroup();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSystemAccess().getSystemSensorGroupParserRuleCall_0_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalIoT.g:858:2: ( ruleSensorGetMethod )
                    {
                    // InternalIoT.g:858:2: ( ruleSensorGetMethod )
                    // InternalIoT.g:859:3: ruleSensorGetMethod
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSystemAccess().getSystemSensorGetMethodParserRuleCall_0_3()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleSensorGetMethod();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSystemAccess().getSystemSensorGetMethodParserRuleCall_0_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalIoT.g:864:2: ( ruleDeviceTypes )
                    {
                    // InternalIoT.g:864:2: ( ruleDeviceTypes )
                    // InternalIoT.g:865:3: ruleDeviceTypes
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSystemAccess().getSystemDeviceTypesParserRuleCall_0_4()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleDeviceTypes();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSystemAccess().getSystemDeviceTypesParserRuleCall_0_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalIoT.g:870:2: ( ruleDevice )
                    {
                    // InternalIoT.g:870:2: ( ruleDevice )
                    // InternalIoT.g:871:3: ruleDevice
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSystemAccess().getSystemDeviceParserRuleCall_0_5()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleDevice();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSystemAccess().getSystemDeviceParserRuleCall_0_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalIoT.g:876:2: ( ruleServerTypes )
                    {
                    // InternalIoT.g:876:2: ( ruleServerTypes )
                    // InternalIoT.g:877:3: ruleServerTypes
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSystemAccess().getSystemServerTypesParserRuleCall_0_6()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleServerTypes();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSystemAccess().getSystemServerTypesParserRuleCall_0_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalIoT.g:882:2: ( ruleServer )
                    {
                    // InternalIoT.g:882:2: ( ruleServer )
                    // InternalIoT.g:883:3: ruleServer
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSystemAccess().getSystemServerParserRuleCall_0_7()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleServer();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSystemAccess().getSystemServerParserRuleCall_0_7()); 
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalIoT.g:888:2: ( ruleDestinationTypes )
                    {
                    // InternalIoT.g:888:2: ( ruleDestinationTypes )
                    // InternalIoT.g:889:3: ruleDestinationTypes
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSystemAccess().getSystemDestinationTypesParserRuleCall_0_8()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleDestinationTypes();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSystemAccess().getSystemDestinationTypesParserRuleCall_0_8()); 
                    }

                    }


                    }
                    break;
                case 10 :
                    // InternalIoT.g:894:2: ( ruleDestination )
                    {
                    // InternalIoT.g:894:2: ( ruleDestination )
                    // InternalIoT.g:895:3: ruleDestination
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSystemAccess().getSystemDestinationParserRuleCall_0_9()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleDestination();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSystemAccess().getSystemDestinationParserRuleCall_0_9()); 
                    }

                    }


                    }
                    break;
                case 11 :
                    // InternalIoT.g:900:2: ( ruleFetchData )
                    {
                    // InternalIoT.g:900:2: ( ruleFetchData )
                    // InternalIoT.g:901:3: ruleFetchData
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSystemAccess().getSystemFetchDataParserRuleCall_0_10()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleFetchData();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSystemAccess().getSystemFetchDataParserRuleCall_0_10()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__SystemAlternatives_0"


    // $ANTLR start "rule__Device__Alternatives_6"
    // InternalIoT.g:910:1: rule__Device__Alternatives_6 : ( ( ( rule__Device__Group_6_0__0 ) ) | ( ( rule__Device__Group_6_1__0 ) ) );
    public final void rule__Device__Alternatives_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:914:1: ( ( ( rule__Device__Group_6_0__0 ) ) | ( ( rule__Device__Group_6_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==34) ) {
                alt3=1;
            }
            else if ( (LA3_0==35) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalIoT.g:915:2: ( ( rule__Device__Group_6_0__0 ) )
                    {
                    // InternalIoT.g:915:2: ( ( rule__Device__Group_6_0__0 ) )
                    // InternalIoT.g:916:3: ( rule__Device__Group_6_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDeviceAccess().getGroup_6_0()); 
                    }
                    // InternalIoT.g:917:3: ( rule__Device__Group_6_0__0 )
                    // InternalIoT.g:917:4: rule__Device__Group_6_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Device__Group_6_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDeviceAccess().getGroup_6_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalIoT.g:921:2: ( ( rule__Device__Group_6_1__0 ) )
                    {
                    // InternalIoT.g:921:2: ( ( rule__Device__Group_6_1__0 ) )
                    // InternalIoT.g:922:3: ( rule__Device__Group_6_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDeviceAccess().getGroup_6_1()); 
                    }
                    // InternalIoT.g:923:3: ( rule__Device__Group_6_1__0 )
                    // InternalIoT.g:923:4: rule__Device__Group_6_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Device__Group_6_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDeviceAccess().getGroup_6_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Alternatives_6"


    // $ANTLR start "rule__FetchData__Alternatives_3"
    // InternalIoT.g:931:1: rule__FetchData__Alternatives_3 : ( ( ( rule__FetchData__Group_3_0__0 ) ) | ( ( rule__FetchData__Group_3_1__0 ) ) );
    public final void rule__FetchData__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:935:1: ( ( ( rule__FetchData__Group_3_0__0 ) ) | ( ( rule__FetchData__Group_3_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==24) ) {
                alt4=1;
            }
            else if ( (LA4_0==35) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalIoT.g:936:2: ( ( rule__FetchData__Group_3_0__0 ) )
                    {
                    // InternalIoT.g:936:2: ( ( rule__FetchData__Group_3_0__0 ) )
                    // InternalIoT.g:937:3: ( rule__FetchData__Group_3_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFetchDataAccess().getGroup_3_0()); 
                    }
                    // InternalIoT.g:938:3: ( rule__FetchData__Group_3_0__0 )
                    // InternalIoT.g:938:4: rule__FetchData__Group_3_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FetchData__Group_3_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFetchDataAccess().getGroup_3_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalIoT.g:942:2: ( ( rule__FetchData__Group_3_1__0 ) )
                    {
                    // InternalIoT.g:942:2: ( ( rule__FetchData__Group_3_1__0 ) )
                    // InternalIoT.g:943:3: ( rule__FetchData__Group_3_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFetchDataAccess().getGroup_3_1()); 
                    }
                    // InternalIoT.g:944:3: ( rule__FetchData__Group_3_1__0 )
                    // InternalIoT.g:944:4: rule__FetchData__Group_3_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FetchData__Group_3_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFetchDataAccess().getGroup_3_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FetchData__Alternatives_3"


    // $ANTLR start "rule__FetchData__Alternatives_8"
    // InternalIoT.g:952:1: rule__FetchData__Alternatives_8 : ( ( ( rule__FetchData__Group_8_0__0 ) ) | ( ( rule__FetchData__Group_8_1__0 ) ) );
    public final void rule__FetchData__Alternatives_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:956:1: ( ( ( rule__FetchData__Group_8_0__0 ) ) | ( ( rule__FetchData__Group_8_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==47) ) {
                alt5=1;
            }
            else if ( (LA5_0==48) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalIoT.g:957:2: ( ( rule__FetchData__Group_8_0__0 ) )
                    {
                    // InternalIoT.g:957:2: ( ( rule__FetchData__Group_8_0__0 ) )
                    // InternalIoT.g:958:3: ( rule__FetchData__Group_8_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFetchDataAccess().getGroup_8_0()); 
                    }
                    // InternalIoT.g:959:3: ( rule__FetchData__Group_8_0__0 )
                    // InternalIoT.g:959:4: rule__FetchData__Group_8_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FetchData__Group_8_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFetchDataAccess().getGroup_8_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalIoT.g:963:2: ( ( rule__FetchData__Group_8_1__0 ) )
                    {
                    // InternalIoT.g:963:2: ( ( rule__FetchData__Group_8_1__0 ) )
                    // InternalIoT.g:964:3: ( rule__FetchData__Group_8_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFetchDataAccess().getGroup_8_1()); 
                    }
                    // InternalIoT.g:965:3: ( rule__FetchData__Group_8_1__0 )
                    // InternalIoT.g:965:4: rule__FetchData__Group_8_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FetchData__Group_8_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFetchDataAccess().getGroup_8_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FetchData__Alternatives_8"


    // $ANTLR start "rule__TimeUnit__Alternatives"
    // InternalIoT.g:973:1: rule__TimeUnit__Alternatives : ( ( 'ms' ) | ( 's' ) | ( 'm' ) | ( 'h' ) );
    public final void rule__TimeUnit__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:977:1: ( ( 'ms' ) | ( 's' ) | ( 'm' ) | ( 'h' ) )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt6=1;
                }
                break;
            case 12:
                {
                alt6=2;
                }
                break;
            case 13:
                {
                alt6=3;
                }
                break;
            case 14:
                {
                alt6=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalIoT.g:978:2: ( 'ms' )
                    {
                    // InternalIoT.g:978:2: ( 'ms' )
                    // InternalIoT.g:979:3: 'ms'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTimeUnitAccess().getMsKeyword_0()); 
                    }
                    match(input,11,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTimeUnitAccess().getMsKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalIoT.g:984:2: ( 's' )
                    {
                    // InternalIoT.g:984:2: ( 's' )
                    // InternalIoT.g:985:3: 's'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTimeUnitAccess().getSKeyword_1()); 
                    }
                    match(input,12,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTimeUnitAccess().getSKeyword_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalIoT.g:990:2: ( 'm' )
                    {
                    // InternalIoT.g:990:2: ( 'm' )
                    // InternalIoT.g:991:3: 'm'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTimeUnitAccess().getMKeyword_2()); 
                    }
                    match(input,13,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTimeUnitAccess().getMKeyword_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalIoT.g:996:2: ( 'h' )
                    {
                    // InternalIoT.g:996:2: ( 'h' )
                    // InternalIoT.g:997:3: 'h'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTimeUnitAccess().getHKeyword_3()); 
                    }
                    match(input,14,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTimeUnitAccess().getHKeyword_3()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeUnit__Alternatives"


    // $ANTLR start "rule__ComparisonCondition__OperatorAlternatives_1_1_0"
    // InternalIoT.g:1006:1: rule__ComparisonCondition__OperatorAlternatives_1_1_0 : ( ( '<' ) | ( '<=' ) | ( '==' ) | ( '>=' ) | ( '>' ) );
    public final void rule__ComparisonCondition__OperatorAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1010:1: ( ( '<' ) | ( '<=' ) | ( '==' ) | ( '>=' ) | ( '>' ) )
            int alt7=5;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt7=1;
                }
                break;
            case 16:
                {
                alt7=2;
                }
                break;
            case 17:
                {
                alt7=3;
                }
                break;
            case 18:
                {
                alt7=4;
                }
                break;
            case 19:
                {
                alt7=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalIoT.g:1011:2: ( '<' )
                    {
                    // InternalIoT.g:1011:2: ( '<' )
                    // InternalIoT.g:1012:3: '<'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparisonConditionAccess().getOperatorLessThanSignKeyword_1_1_0_0()); 
                    }
                    match(input,15,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparisonConditionAccess().getOperatorLessThanSignKeyword_1_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalIoT.g:1017:2: ( '<=' )
                    {
                    // InternalIoT.g:1017:2: ( '<=' )
                    // InternalIoT.g:1018:3: '<='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparisonConditionAccess().getOperatorLessThanSignEqualsSignKeyword_1_1_0_1()); 
                    }
                    match(input,16,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparisonConditionAccess().getOperatorLessThanSignEqualsSignKeyword_1_1_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalIoT.g:1023:2: ( '==' )
                    {
                    // InternalIoT.g:1023:2: ( '==' )
                    // InternalIoT.g:1024:3: '=='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparisonConditionAccess().getOperatorEqualsSignEqualsSignKeyword_1_1_0_2()); 
                    }
                    match(input,17,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparisonConditionAccess().getOperatorEqualsSignEqualsSignKeyword_1_1_0_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalIoT.g:1029:2: ( '>=' )
                    {
                    // InternalIoT.g:1029:2: ( '>=' )
                    // InternalIoT.g:1030:3: '>='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparisonConditionAccess().getOperatorGreaterThanSignEqualsSignKeyword_1_1_0_3()); 
                    }
                    match(input,18,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparisonConditionAccess().getOperatorGreaterThanSignEqualsSignKeyword_1_1_0_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalIoT.g:1035:2: ( '>' )
                    {
                    // InternalIoT.g:1035:2: ( '>' )
                    // InternalIoT.g:1036:3: '>'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparisonConditionAccess().getOperatorGreaterThanSignKeyword_1_1_0_4()); 
                    }
                    match(input,19,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparisonConditionAccess().getOperatorGreaterThanSignKeyword_1_1_0_4()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonCondition__OperatorAlternatives_1_1_0"


    // $ANTLR start "rule__PrimaryCondition__Alternatives"
    // InternalIoT.g:1045:1: rule__PrimaryCondition__Alternatives : ( ( ( rule__PrimaryCondition__Group_0__0 ) ) | ( ruleLiteralBoolean ) | ( ruleLiteralInteger ) | ( ruleLiteralMethod ) );
    public final void rule__PrimaryCondition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1049:1: ( ( ( rule__PrimaryCondition__Group_0__0 ) ) | ( ruleLiteralBoolean ) | ( ruleLiteralInteger ) | ( ruleLiteralMethod ) )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt8=1;
                }
                break;
            case 57:
            case 58:
                {
                alt8=2;
                }
                break;
            case RULE_INT:
                {
                alt8=3;
                }
                break;
            case RULE_ID:
                {
                alt8=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalIoT.g:1050:2: ( ( rule__PrimaryCondition__Group_0__0 ) )
                    {
                    // InternalIoT.g:1050:2: ( ( rule__PrimaryCondition__Group_0__0 ) )
                    // InternalIoT.g:1051:3: ( rule__PrimaryCondition__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryConditionAccess().getGroup_0()); 
                    }
                    // InternalIoT.g:1052:3: ( rule__PrimaryCondition__Group_0__0 )
                    // InternalIoT.g:1052:4: rule__PrimaryCondition__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimaryCondition__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryConditionAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalIoT.g:1056:2: ( ruleLiteralBoolean )
                    {
                    // InternalIoT.g:1056:2: ( ruleLiteralBoolean )
                    // InternalIoT.g:1057:3: ruleLiteralBoolean
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryConditionAccess().getLiteralBooleanParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleLiteralBoolean();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryConditionAccess().getLiteralBooleanParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalIoT.g:1062:2: ( ruleLiteralInteger )
                    {
                    // InternalIoT.g:1062:2: ( ruleLiteralInteger )
                    // InternalIoT.g:1063:3: ruleLiteralInteger
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryConditionAccess().getLiteralIntegerParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleLiteralInteger();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryConditionAccess().getLiteralIntegerParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalIoT.g:1068:2: ( ruleLiteralMethod )
                    {
                    // InternalIoT.g:1068:2: ( ruleLiteralMethod )
                    // InternalIoT.g:1069:3: ruleLiteralMethod
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryConditionAccess().getLiteralMethodParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleLiteralMethod();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryConditionAccess().getLiteralMethodParserRuleCall_3()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryCondition__Alternatives"


    // $ANTLR start "rule__LiteralBoolean__Alternatives"
    // InternalIoT.g:1078:1: rule__LiteralBoolean__Alternatives : ( ( ( rule__LiteralBoolean__Group_0__0 ) ) | ( ( rule__LiteralBoolean__Group_1__0 ) ) );
    public final void rule__LiteralBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1082:1: ( ( ( rule__LiteralBoolean__Group_0__0 ) ) | ( ( rule__LiteralBoolean__Group_1__0 ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==57) ) {
                alt9=1;
            }
            else if ( (LA9_0==58) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalIoT.g:1083:2: ( ( rule__LiteralBoolean__Group_0__0 ) )
                    {
                    // InternalIoT.g:1083:2: ( ( rule__LiteralBoolean__Group_0__0 ) )
                    // InternalIoT.g:1084:3: ( rule__LiteralBoolean__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralBooleanAccess().getGroup_0()); 
                    }
                    // InternalIoT.g:1085:3: ( rule__LiteralBoolean__Group_0__0 )
                    // InternalIoT.g:1085:4: rule__LiteralBoolean__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LiteralBoolean__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLiteralBooleanAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalIoT.g:1089:2: ( ( rule__LiteralBoolean__Group_1__0 ) )
                    {
                    // InternalIoT.g:1089:2: ( ( rule__LiteralBoolean__Group_1__0 ) )
                    // InternalIoT.g:1090:3: ( rule__LiteralBoolean__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralBooleanAccess().getGroup_1()); 
                    }
                    // InternalIoT.g:1091:3: ( rule__LiteralBoolean__Group_1__0 )
                    // InternalIoT.g:1091:4: rule__LiteralBoolean__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LiteralBoolean__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLiteralBooleanAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiteralBoolean__Alternatives"


    // $ANTLR start "rule__SensorTypes__Group__0"
    // InternalIoT.g:1099:1: rule__SensorTypes__Group__0 : rule__SensorTypes__Group__0__Impl rule__SensorTypes__Group__1 ;
    public final void rule__SensorTypes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1103:1: ( rule__SensorTypes__Group__0__Impl rule__SensorTypes__Group__1 )
            // InternalIoT.g:1104:2: rule__SensorTypes__Group__0__Impl rule__SensorTypes__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__SensorTypes__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SensorTypes__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorTypes__Group__0"


    // $ANTLR start "rule__SensorTypes__Group__0__Impl"
    // InternalIoT.g:1111:1: rule__SensorTypes__Group__0__Impl : ( 'SensorTypes' ) ;
    public final void rule__SensorTypes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1115:1: ( ( 'SensorTypes' ) )
            // InternalIoT.g:1116:1: ( 'SensorTypes' )
            {
            // InternalIoT.g:1116:1: ( 'SensorTypes' )
            // InternalIoT.g:1117:2: 'SensorTypes'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSensorTypesAccess().getSensorTypesKeyword_0()); 
            }
            match(input,20,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSensorTypesAccess().getSensorTypesKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorTypes__Group__0__Impl"


    // $ANTLR start "rule__SensorTypes__Group__1"
    // InternalIoT.g:1126:1: rule__SensorTypes__Group__1 : rule__SensorTypes__Group__1__Impl rule__SensorTypes__Group__2 ;
    public final void rule__SensorTypes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1130:1: ( rule__SensorTypes__Group__1__Impl rule__SensorTypes__Group__2 )
            // InternalIoT.g:1131:2: rule__SensorTypes__Group__1__Impl rule__SensorTypes__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__SensorTypes__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SensorTypes__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorTypes__Group__1"


    // $ANTLR start "rule__SensorTypes__Group__1__Impl"
    // InternalIoT.g:1138:1: rule__SensorTypes__Group__1__Impl : ( ( rule__SensorTypes__TypesAssignment_1 ) ) ;
    public final void rule__SensorTypes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1142:1: ( ( ( rule__SensorTypes__TypesAssignment_1 ) ) )
            // InternalIoT.g:1143:1: ( ( rule__SensorTypes__TypesAssignment_1 ) )
            {
            // InternalIoT.g:1143:1: ( ( rule__SensorTypes__TypesAssignment_1 ) )
            // InternalIoT.g:1144:2: ( rule__SensorTypes__TypesAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSensorTypesAccess().getTypesAssignment_1()); 
            }
            // InternalIoT.g:1145:2: ( rule__SensorTypes__TypesAssignment_1 )
            // InternalIoT.g:1145:3: rule__SensorTypes__TypesAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SensorTypes__TypesAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSensorTypesAccess().getTypesAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorTypes__Group__1__Impl"


    // $ANTLR start "rule__SensorTypes__Group__2"
    // InternalIoT.g:1153:1: rule__SensorTypes__Group__2 : rule__SensorTypes__Group__2__Impl ;
    public final void rule__SensorTypes__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1157:1: ( rule__SensorTypes__Group__2__Impl )
            // InternalIoT.g:1158:2: rule__SensorTypes__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SensorTypes__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorTypes__Group__2"


    // $ANTLR start "rule__SensorTypes__Group__2__Impl"
    // InternalIoT.g:1164:1: rule__SensorTypes__Group__2__Impl : ( ( rule__SensorTypes__Group_2__0 )* ) ;
    public final void rule__SensorTypes__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1168:1: ( ( ( rule__SensorTypes__Group_2__0 )* ) )
            // InternalIoT.g:1169:1: ( ( rule__SensorTypes__Group_2__0 )* )
            {
            // InternalIoT.g:1169:1: ( ( rule__SensorTypes__Group_2__0 )* )
            // InternalIoT.g:1170:2: ( rule__SensorTypes__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSensorTypesAccess().getGroup_2()); 
            }
            // InternalIoT.g:1171:2: ( rule__SensorTypes__Group_2__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==21) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalIoT.g:1171:3: rule__SensorTypes__Group_2__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__SensorTypes__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSensorTypesAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorTypes__Group__2__Impl"


    // $ANTLR start "rule__SensorTypes__Group_2__0"
    // InternalIoT.g:1180:1: rule__SensorTypes__Group_2__0 : rule__SensorTypes__Group_2__0__Impl rule__SensorTypes__Group_2__1 ;
    public final void rule__SensorTypes__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1184:1: ( rule__SensorTypes__Group_2__0__Impl rule__SensorTypes__Group_2__1 )
            // InternalIoT.g:1185:2: rule__SensorTypes__Group_2__0__Impl rule__SensorTypes__Group_2__1
            {
            pushFollow(FOLLOW_4);
            rule__SensorTypes__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SensorTypes__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorTypes__Group_2__0"


    // $ANTLR start "rule__SensorTypes__Group_2__0__Impl"
    // InternalIoT.g:1192:1: rule__SensorTypes__Group_2__0__Impl : ( ',' ) ;
    public final void rule__SensorTypes__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1196:1: ( ( ',' ) )
            // InternalIoT.g:1197:1: ( ',' )
            {
            // InternalIoT.g:1197:1: ( ',' )
            // InternalIoT.g:1198:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSensorTypesAccess().getCommaKeyword_2_0()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSensorTypesAccess().getCommaKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorTypes__Group_2__0__Impl"


    // $ANTLR start "rule__SensorTypes__Group_2__1"
    // InternalIoT.g:1207:1: rule__SensorTypes__Group_2__1 : rule__SensorTypes__Group_2__1__Impl ;
    public final void rule__SensorTypes__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1211:1: ( rule__SensorTypes__Group_2__1__Impl )
            // InternalIoT.g:1212:2: rule__SensorTypes__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SensorTypes__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorTypes__Group_2__1"


    // $ANTLR start "rule__SensorTypes__Group_2__1__Impl"
    // InternalIoT.g:1218:1: rule__SensorTypes__Group_2__1__Impl : ( ( rule__SensorTypes__TypesAssignment_2_1 ) ) ;
    public final void rule__SensorTypes__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1222:1: ( ( ( rule__SensorTypes__TypesAssignment_2_1 ) ) )
            // InternalIoT.g:1223:1: ( ( rule__SensorTypes__TypesAssignment_2_1 ) )
            {
            // InternalIoT.g:1223:1: ( ( rule__SensorTypes__TypesAssignment_2_1 ) )
            // InternalIoT.g:1224:2: ( rule__SensorTypes__TypesAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSensorTypesAccess().getTypesAssignment_2_1()); 
            }
            // InternalIoT.g:1225:2: ( rule__SensorTypes__TypesAssignment_2_1 )
            // InternalIoT.g:1225:3: rule__SensorTypes__TypesAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__SensorTypes__TypesAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSensorTypesAccess().getTypesAssignment_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorTypes__Group_2__1__Impl"


    // $ANTLR start "rule__Sensor__Group__0"
    // InternalIoT.g:1234:1: rule__Sensor__Group__0 : rule__Sensor__Group__0__Impl rule__Sensor__Group__1 ;
    public final void rule__Sensor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1238:1: ( rule__Sensor__Group__0__Impl rule__Sensor__Group__1 )
            // InternalIoT.g:1239:2: rule__Sensor__Group__0__Impl rule__Sensor__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Sensor__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Sensor__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__0"


    // $ANTLR start "rule__Sensor__Group__0__Impl"
    // InternalIoT.g:1246:1: rule__Sensor__Group__0__Impl : ( 'Sensor' ) ;
    public final void rule__Sensor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1250:1: ( ( 'Sensor' ) )
            // InternalIoT.g:1251:1: ( 'Sensor' )
            {
            // InternalIoT.g:1251:1: ( 'Sensor' )
            // InternalIoT.g:1252:2: 'Sensor'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSensorAccess().getSensorKeyword_0()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSensorAccess().getSensorKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__0__Impl"


    // $ANTLR start "rule__Sensor__Group__1"
    // InternalIoT.g:1261:1: rule__Sensor__Group__1 : rule__Sensor__Group__1__Impl rule__Sensor__Group__2 ;
    public final void rule__Sensor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1265:1: ( rule__Sensor__Group__1__Impl rule__Sensor__Group__2 )
            // InternalIoT.g:1266:2: rule__Sensor__Group__1__Impl rule__Sensor__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Sensor__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Sensor__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__1"


    // $ANTLR start "rule__Sensor__Group__1__Impl"
    // InternalIoT.g:1273:1: rule__Sensor__Group__1__Impl : ( ( rule__Sensor__NameAssignment_1 ) ) ;
    public final void rule__Sensor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1277:1: ( ( ( rule__Sensor__NameAssignment_1 ) ) )
            // InternalIoT.g:1278:1: ( ( rule__Sensor__NameAssignment_1 ) )
            {
            // InternalIoT.g:1278:1: ( ( rule__Sensor__NameAssignment_1 ) )
            // InternalIoT.g:1279:2: ( rule__Sensor__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSensorAccess().getNameAssignment_1()); 
            }
            // InternalIoT.g:1280:2: ( rule__Sensor__NameAssignment_1 )
            // InternalIoT.g:1280:3: rule__Sensor__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSensorAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__1__Impl"


    // $ANTLR start "rule__Sensor__Group__2"
    // InternalIoT.g:1288:1: rule__Sensor__Group__2 : rule__Sensor__Group__2__Impl rule__Sensor__Group__3 ;
    public final void rule__Sensor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1292:1: ( rule__Sensor__Group__2__Impl rule__Sensor__Group__3 )
            // InternalIoT.g:1293:2: rule__Sensor__Group__2__Impl rule__Sensor__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Sensor__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Sensor__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__2"


    // $ANTLR start "rule__Sensor__Group__2__Impl"
    // InternalIoT.g:1300:1: rule__Sensor__Group__2__Impl : ( 'of' ) ;
    public final void rule__Sensor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1304:1: ( ( 'of' ) )
            // InternalIoT.g:1305:1: ( 'of' )
            {
            // InternalIoT.g:1305:1: ( 'of' )
            // InternalIoT.g:1306:2: 'of'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSensorAccess().getOfKeyword_2()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSensorAccess().getOfKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__2__Impl"


    // $ANTLR start "rule__Sensor__Group__3"
    // InternalIoT.g:1315:1: rule__Sensor__Group__3 : rule__Sensor__Group__3__Impl rule__Sensor__Group__4 ;
    public final void rule__Sensor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1319:1: ( rule__Sensor__Group__3__Impl rule__Sensor__Group__4 )
            // InternalIoT.g:1320:2: rule__Sensor__Group__3__Impl rule__Sensor__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__Sensor__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Sensor__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__3"


    // $ANTLR start "rule__Sensor__Group__3__Impl"
    // InternalIoT.g:1327:1: rule__Sensor__Group__3__Impl : ( 'type' ) ;
    public final void rule__Sensor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1331:1: ( ( 'type' ) )
            // InternalIoT.g:1332:1: ( 'type' )
            {
            // InternalIoT.g:1332:1: ( 'type' )
            // InternalIoT.g:1333:2: 'type'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSensorAccess().getTypeKeyword_3()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSensorAccess().getTypeKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__3__Impl"


    // $ANTLR start "rule__Sensor__Group__4"
    // InternalIoT.g:1342:1: rule__Sensor__Group__4 : rule__Sensor__Group__4__Impl ;
    public final void rule__Sensor__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1346:1: ( rule__Sensor__Group__4__Impl )
            // InternalIoT.g:1347:2: rule__Sensor__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__4"


    // $ANTLR start "rule__Sensor__Group__4__Impl"
    // InternalIoT.g:1353:1: rule__Sensor__Group__4__Impl : ( ( rule__Sensor__TypeAssignment_4 ) ) ;
    public final void rule__Sensor__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1357:1: ( ( ( rule__Sensor__TypeAssignment_4 ) ) )
            // InternalIoT.g:1358:1: ( ( rule__Sensor__TypeAssignment_4 ) )
            {
            // InternalIoT.g:1358:1: ( ( rule__Sensor__TypeAssignment_4 ) )
            // InternalIoT.g:1359:2: ( rule__Sensor__TypeAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSensorAccess().getTypeAssignment_4()); 
            }
            // InternalIoT.g:1360:2: ( rule__Sensor__TypeAssignment_4 )
            // InternalIoT.g:1360:3: rule__Sensor__TypeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__TypeAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSensorAccess().getTypeAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__4__Impl"


    // $ANTLR start "rule__SensorGroup__Group__0"
    // InternalIoT.g:1369:1: rule__SensorGroup__Group__0 : rule__SensorGroup__Group__0__Impl rule__SensorGroup__Group__1 ;
    public final void rule__SensorGroup__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1373:1: ( rule__SensorGroup__Group__0__Impl rule__SensorGroup__Group__1 )
            // InternalIoT.g:1374:2: rule__SensorGroup__Group__0__Impl rule__SensorGroup__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__SensorGroup__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SensorGroup__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorGroup__Group__0"


    // $ANTLR start "rule__SensorGroup__Group__0__Impl"
    // InternalIoT.g:1381:1: rule__SensorGroup__Group__0__Impl : ( 'SensorGroup' ) ;
    public final void rule__SensorGroup__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1385:1: ( ( 'SensorGroup' ) )
            // InternalIoT.g:1386:1: ( 'SensorGroup' )
            {
            // InternalIoT.g:1386:1: ( 'SensorGroup' )
            // InternalIoT.g:1387:2: 'SensorGroup'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSensorGroupAccess().getSensorGroupKeyword_0()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSensorGroupAccess().getSensorGroupKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorGroup__Group__0__Impl"


    // $ANTLR start "rule__SensorGroup__Group__1"
    // InternalIoT.g:1396:1: rule__SensorGroup__Group__1 : rule__SensorGroup__Group__1__Impl rule__SensorGroup__Group__2 ;
    public final void rule__SensorGroup__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1400:1: ( rule__SensorGroup__Group__1__Impl rule__SensorGroup__Group__2 )
            // InternalIoT.g:1401:2: rule__SensorGroup__Group__1__Impl rule__SensorGroup__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__SensorGroup__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SensorGroup__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorGroup__Group__1"


    // $ANTLR start "rule__SensorGroup__Group__1__Impl"
    // InternalIoT.g:1408:1: rule__SensorGroup__Group__1__Impl : ( ( rule__SensorGroup__NameAssignment_1 ) ) ;
    public final void rule__SensorGroup__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1412:1: ( ( ( rule__SensorGroup__NameAssignment_1 ) ) )
            // InternalIoT.g:1413:1: ( ( rule__SensorGroup__NameAssignment_1 ) )
            {
            // InternalIoT.g:1413:1: ( ( rule__SensorGroup__NameAssignment_1 ) )
            // InternalIoT.g:1414:2: ( rule__SensorGroup__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSensorGroupAccess().getNameAssignment_1()); 
            }
            // InternalIoT.g:1415:2: ( rule__SensorGroup__NameAssignment_1 )
            // InternalIoT.g:1415:3: rule__SensorGroup__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SensorGroup__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSensorGroupAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorGroup__Group__1__Impl"


    // $ANTLR start "rule__SensorGroup__Group__2"
    // InternalIoT.g:1423:1: rule__SensorGroup__Group__2 : rule__SensorGroup__Group__2__Impl rule__SensorGroup__Group__3 ;
    public final void rule__SensorGroup__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1427:1: ( rule__SensorGroup__Group__2__Impl rule__SensorGroup__Group__3 )
            // InternalIoT.g:1428:2: rule__SensorGroup__Group__2__Impl rule__SensorGroup__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__SensorGroup__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SensorGroup__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorGroup__Group__2"


    // $ANTLR start "rule__SensorGroup__Group__2__Impl"
    // InternalIoT.g:1435:1: rule__SensorGroup__Group__2__Impl : ( 'include' ) ;
    public final void rule__SensorGroup__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1439:1: ( ( 'include' ) )
            // InternalIoT.g:1440:1: ( 'include' )
            {
            // InternalIoT.g:1440:1: ( 'include' )
            // InternalIoT.g:1441:2: 'include'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSensorGroupAccess().getIncludeKeyword_2()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSensorGroupAccess().getIncludeKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorGroup__Group__2__Impl"


    // $ANTLR start "rule__SensorGroup__Group__3"
    // InternalIoT.g:1450:1: rule__SensorGroup__Group__3 : rule__SensorGroup__Group__3__Impl rule__SensorGroup__Group__4 ;
    public final void rule__SensorGroup__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1454:1: ( rule__SensorGroup__Group__3__Impl rule__SensorGroup__Group__4 )
            // InternalIoT.g:1455:2: rule__SensorGroup__Group__3__Impl rule__SensorGroup__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__SensorGroup__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SensorGroup__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorGroup__Group__3"


    // $ANTLR start "rule__SensorGroup__Group__3__Impl"
    // InternalIoT.g:1462:1: rule__SensorGroup__Group__3__Impl : ( ( rule__SensorGroup__SensorsAssignment_3 ) ) ;
    public final void rule__SensorGroup__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1466:1: ( ( ( rule__SensorGroup__SensorsAssignment_3 ) ) )
            // InternalIoT.g:1467:1: ( ( rule__SensorGroup__SensorsAssignment_3 ) )
            {
            // InternalIoT.g:1467:1: ( ( rule__SensorGroup__SensorsAssignment_3 ) )
            // InternalIoT.g:1468:2: ( rule__SensorGroup__SensorsAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSensorGroupAccess().getSensorsAssignment_3()); 
            }
            // InternalIoT.g:1469:2: ( rule__SensorGroup__SensorsAssignment_3 )
            // InternalIoT.g:1469:3: rule__SensorGroup__SensorsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__SensorGroup__SensorsAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSensorGroupAccess().getSensorsAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorGroup__Group__3__Impl"


    // $ANTLR start "rule__SensorGroup__Group__4"
    // InternalIoT.g:1477:1: rule__SensorGroup__Group__4 : rule__SensorGroup__Group__4__Impl ;
    public final void rule__SensorGroup__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1481:1: ( rule__SensorGroup__Group__4__Impl )
            // InternalIoT.g:1482:2: rule__SensorGroup__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SensorGroup__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorGroup__Group__4"


    // $ANTLR start "rule__SensorGroup__Group__4__Impl"
    // InternalIoT.g:1488:1: rule__SensorGroup__Group__4__Impl : ( ( rule__SensorGroup__Group_4__0 )* ) ;
    public final void rule__SensorGroup__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1492:1: ( ( ( rule__SensorGroup__Group_4__0 )* ) )
            // InternalIoT.g:1493:1: ( ( rule__SensorGroup__Group_4__0 )* )
            {
            // InternalIoT.g:1493:1: ( ( rule__SensorGroup__Group_4__0 )* )
            // InternalIoT.g:1494:2: ( rule__SensorGroup__Group_4__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSensorGroupAccess().getGroup_4()); 
            }
            // InternalIoT.g:1495:2: ( rule__SensorGroup__Group_4__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==21) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalIoT.g:1495:3: rule__SensorGroup__Group_4__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__SensorGroup__Group_4__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSensorGroupAccess().getGroup_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorGroup__Group__4__Impl"


    // $ANTLR start "rule__SensorGroup__Group_4__0"
    // InternalIoT.g:1504:1: rule__SensorGroup__Group_4__0 : rule__SensorGroup__Group_4__0__Impl rule__SensorGroup__Group_4__1 ;
    public final void rule__SensorGroup__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1508:1: ( rule__SensorGroup__Group_4__0__Impl rule__SensorGroup__Group_4__1 )
            // InternalIoT.g:1509:2: rule__SensorGroup__Group_4__0__Impl rule__SensorGroup__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__SensorGroup__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SensorGroup__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorGroup__Group_4__0"


    // $ANTLR start "rule__SensorGroup__Group_4__0__Impl"
    // InternalIoT.g:1516:1: rule__SensorGroup__Group_4__0__Impl : ( ',' ) ;
    public final void rule__SensorGroup__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1520:1: ( ( ',' ) )
            // InternalIoT.g:1521:1: ( ',' )
            {
            // InternalIoT.g:1521:1: ( ',' )
            // InternalIoT.g:1522:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSensorGroupAccess().getCommaKeyword_4_0()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSensorGroupAccess().getCommaKeyword_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorGroup__Group_4__0__Impl"


    // $ANTLR start "rule__SensorGroup__Group_4__1"
    // InternalIoT.g:1531:1: rule__SensorGroup__Group_4__1 : rule__SensorGroup__Group_4__1__Impl ;
    public final void rule__SensorGroup__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1535:1: ( rule__SensorGroup__Group_4__1__Impl )
            // InternalIoT.g:1536:2: rule__SensorGroup__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SensorGroup__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorGroup__Group_4__1"


    // $ANTLR start "rule__SensorGroup__Group_4__1__Impl"
    // InternalIoT.g:1542:1: rule__SensorGroup__Group_4__1__Impl : ( ( rule__SensorGroup__SensorsAssignment_4_1 ) ) ;
    public final void rule__SensorGroup__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1546:1: ( ( ( rule__SensorGroup__SensorsAssignment_4_1 ) ) )
            // InternalIoT.g:1547:1: ( ( rule__SensorGroup__SensorsAssignment_4_1 ) )
            {
            // InternalIoT.g:1547:1: ( ( rule__SensorGroup__SensorsAssignment_4_1 ) )
            // InternalIoT.g:1548:2: ( rule__SensorGroup__SensorsAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSensorGroupAccess().getSensorsAssignment_4_1()); 
            }
            // InternalIoT.g:1549:2: ( rule__SensorGroup__SensorsAssignment_4_1 )
            // InternalIoT.g:1549:3: rule__SensorGroup__SensorsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__SensorGroup__SensorsAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSensorGroupAccess().getSensorsAssignment_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorGroup__Group_4__1__Impl"


    // $ANTLR start "rule__SensorGetMethod__Group__0"
    // InternalIoT.g:1558:1: rule__SensorGetMethod__Group__0 : rule__SensorGetMethod__Group__0__Impl rule__SensorGetMethod__Group__1 ;
    public final void rule__SensorGetMethod__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1562:1: ( rule__SensorGetMethod__Group__0__Impl rule__SensorGetMethod__Group__1 )
            // InternalIoT.g:1563:2: rule__SensorGetMethod__Group__0__Impl rule__SensorGetMethod__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__SensorGetMethod__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SensorGetMethod__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorGetMethod__Group__0"


    // $ANTLR start "rule__SensorGetMethod__Group__0__Impl"
    // InternalIoT.g:1570:1: rule__SensorGetMethod__Group__0__Impl : ( 'SensorGetMethod' ) ;
    public final void rule__SensorGetMethod__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1574:1: ( ( 'SensorGetMethod' ) )
            // InternalIoT.g:1575:1: ( 'SensorGetMethod' )
            {
            // InternalIoT.g:1575:1: ( 'SensorGetMethod' )
            // InternalIoT.g:1576:2: 'SensorGetMethod'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSensorGetMethodAccess().getSensorGetMethodKeyword_0()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSensorGetMethodAccess().getSensorGetMethodKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorGetMethod__Group__0__Impl"


    // $ANTLR start "rule__SensorGetMethod__Group__1"
    // InternalIoT.g:1585:1: rule__SensorGetMethod__Group__1 : rule__SensorGetMethod__Group__1__Impl rule__SensorGetMethod__Group__2 ;
    public final void rule__SensorGetMethod__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1589:1: ( rule__SensorGetMethod__Group__1__Impl rule__SensorGetMethod__Group__2 )
            // InternalIoT.g:1590:2: rule__SensorGetMethod__Group__1__Impl rule__SensorGetMethod__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__SensorGetMethod__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SensorGetMethod__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorGetMethod__Group__1"


    // $ANTLR start "rule__SensorGetMethod__Group__1__Impl"
    // InternalIoT.g:1597:1: rule__SensorGetMethod__Group__1__Impl : ( ( rule__SensorGetMethod__MethodAssignment_1 ) ) ;
    public final void rule__SensorGetMethod__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1601:1: ( ( ( rule__SensorGetMethod__MethodAssignment_1 ) ) )
            // InternalIoT.g:1602:1: ( ( rule__SensorGetMethod__MethodAssignment_1 ) )
            {
            // InternalIoT.g:1602:1: ( ( rule__SensorGetMethod__MethodAssignment_1 ) )
            // InternalIoT.g:1603:2: ( rule__SensorGetMethod__MethodAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSensorGetMethodAccess().getMethodAssignment_1()); 
            }
            // InternalIoT.g:1604:2: ( rule__SensorGetMethod__MethodAssignment_1 )
            // InternalIoT.g:1604:3: rule__SensorGetMethod__MethodAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SensorGetMethod__MethodAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSensorGetMethodAccess().getMethodAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorGetMethod__Group__1__Impl"


    // $ANTLR start "rule__SensorGetMethod__Group__2"
    // InternalIoT.g:1612:1: rule__SensorGetMethod__Group__2 : rule__SensorGetMethod__Group__2__Impl rule__SensorGetMethod__Group__3 ;
    public final void rule__SensorGetMethod__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1616:1: ( rule__SensorGetMethod__Group__2__Impl rule__SensorGetMethod__Group__3 )
            // InternalIoT.g:1617:2: rule__SensorGetMethod__Group__2__Impl rule__SensorGetMethod__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__SensorGetMethod__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SensorGetMethod__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorGetMethod__Group__2"


    // $ANTLR start "rule__SensorGetMethod__Group__2__Impl"
    // InternalIoT.g:1624:1: rule__SensorGetMethod__Group__2__Impl : ( 'for' ) ;
    public final void rule__SensorGetMethod__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1628:1: ( ( 'for' ) )
            // InternalIoT.g:1629:1: ( 'for' )
            {
            // InternalIoT.g:1629:1: ( 'for' )
            // InternalIoT.g:1630:2: 'for'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSensorGetMethodAccess().getForKeyword_2()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSensorGetMethodAccess().getForKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorGetMethod__Group__2__Impl"


    // $ANTLR start "rule__SensorGetMethod__Group__3"
    // InternalIoT.g:1639:1: rule__SensorGetMethod__Group__3 : rule__SensorGetMethod__Group__3__Impl rule__SensorGetMethod__Group__4 ;
    public final void rule__SensorGetMethod__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1643:1: ( rule__SensorGetMethod__Group__3__Impl rule__SensorGetMethod__Group__4 )
            // InternalIoT.g:1644:2: rule__SensorGetMethod__Group__3__Impl rule__SensorGetMethod__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__SensorGetMethod__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SensorGetMethod__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorGetMethod__Group__3"


    // $ANTLR start "rule__SensorGetMethod__Group__3__Impl"
    // InternalIoT.g:1651:1: rule__SensorGetMethod__Group__3__Impl : ( 'type' ) ;
    public final void rule__SensorGetMethod__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1655:1: ( ( 'type' ) )
            // InternalIoT.g:1656:1: ( 'type' )
            {
            // InternalIoT.g:1656:1: ( 'type' )
            // InternalIoT.g:1657:2: 'type'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSensorGetMethodAccess().getTypeKeyword_3()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSensorGetMethodAccess().getTypeKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorGetMethod__Group__3__Impl"


    // $ANTLR start "rule__SensorGetMethod__Group__4"
    // InternalIoT.g:1666:1: rule__SensorGetMethod__Group__4 : rule__SensorGetMethod__Group__4__Impl ;
    public final void rule__SensorGetMethod__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1670:1: ( rule__SensorGetMethod__Group__4__Impl )
            // InternalIoT.g:1671:2: rule__SensorGetMethod__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SensorGetMethod__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorGetMethod__Group__4"


    // $ANTLR start "rule__SensorGetMethod__Group__4__Impl"
    // InternalIoT.g:1677:1: rule__SensorGetMethod__Group__4__Impl : ( ( rule__SensorGetMethod__TypeAssignment_4 ) ) ;
    public final void rule__SensorGetMethod__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1681:1: ( ( ( rule__SensorGetMethod__TypeAssignment_4 ) ) )
            // InternalIoT.g:1682:1: ( ( rule__SensorGetMethod__TypeAssignment_4 ) )
            {
            // InternalIoT.g:1682:1: ( ( rule__SensorGetMethod__TypeAssignment_4 ) )
            // InternalIoT.g:1683:2: ( rule__SensorGetMethod__TypeAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSensorGetMethodAccess().getTypeAssignment_4()); 
            }
            // InternalIoT.g:1684:2: ( rule__SensorGetMethod__TypeAssignment_4 )
            // InternalIoT.g:1684:3: rule__SensorGetMethod__TypeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__SensorGetMethod__TypeAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSensorGetMethodAccess().getTypeAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorGetMethod__Group__4__Impl"


    // $ANTLR start "rule__Method__Group__0"
    // InternalIoT.g:1693:1: rule__Method__Group__0 : rule__Method__Group__0__Impl rule__Method__Group__1 ;
    public final void rule__Method__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1697:1: ( rule__Method__Group__0__Impl rule__Method__Group__1 )
            // InternalIoT.g:1698:2: rule__Method__Group__0__Impl rule__Method__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Method__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Method__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__0"


    // $ANTLR start "rule__Method__Group__0__Impl"
    // InternalIoT.g:1705:1: rule__Method__Group__0__Impl : ( ( rule__Method__NameAssignment_0 ) ) ;
    public final void rule__Method__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1709:1: ( ( ( rule__Method__NameAssignment_0 ) ) )
            // InternalIoT.g:1710:1: ( ( rule__Method__NameAssignment_0 ) )
            {
            // InternalIoT.g:1710:1: ( ( rule__Method__NameAssignment_0 ) )
            // InternalIoT.g:1711:2: ( rule__Method__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getNameAssignment_0()); 
            }
            // InternalIoT.g:1712:2: ( rule__Method__NameAssignment_0 )
            // InternalIoT.g:1712:3: rule__Method__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Method__NameAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getNameAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__0__Impl"


    // $ANTLR start "rule__Method__Group__1"
    // InternalIoT.g:1720:1: rule__Method__Group__1 : rule__Method__Group__1__Impl rule__Method__Group__2 ;
    public final void rule__Method__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1724:1: ( rule__Method__Group__1__Impl rule__Method__Group__2 )
            // InternalIoT.g:1725:2: rule__Method__Group__1__Impl rule__Method__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__Method__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Method__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__1"


    // $ANTLR start "rule__Method__Group__1__Impl"
    // InternalIoT.g:1732:1: rule__Method__Group__1__Impl : ( '(' ) ;
    public final void rule__Method__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1736:1: ( ( '(' ) )
            // InternalIoT.g:1737:1: ( '(' )
            {
            // InternalIoT.g:1737:1: ( '(' )
            // InternalIoT.g:1738:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getLeftParenthesisKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__1__Impl"


    // $ANTLR start "rule__Method__Group__2"
    // InternalIoT.g:1747:1: rule__Method__Group__2 : rule__Method__Group__2__Impl rule__Method__Group__3 ;
    public final void rule__Method__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1751:1: ( rule__Method__Group__2__Impl rule__Method__Group__3 )
            // InternalIoT.g:1752:2: rule__Method__Group__2__Impl rule__Method__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__Method__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Method__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__2"


    // $ANTLR start "rule__Method__Group__2__Impl"
    // InternalIoT.g:1759:1: rule__Method__Group__2__Impl : ( ( rule__Method__Group_2__0 )? ) ;
    public final void rule__Method__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1763:1: ( ( ( rule__Method__Group_2__0 )? ) )
            // InternalIoT.g:1764:1: ( ( rule__Method__Group_2__0 )? )
            {
            // InternalIoT.g:1764:1: ( ( rule__Method__Group_2__0 )? )
            // InternalIoT.g:1765:2: ( rule__Method__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getGroup_2()); 
            }
            // InternalIoT.g:1766:2: ( rule__Method__Group_2__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalIoT.g:1766:3: rule__Method__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Method__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__2__Impl"


    // $ANTLR start "rule__Method__Group__3"
    // InternalIoT.g:1774:1: rule__Method__Group__3 : rule__Method__Group__3__Impl ;
    public final void rule__Method__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1778:1: ( rule__Method__Group__3__Impl )
            // InternalIoT.g:1779:2: rule__Method__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Method__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__3"


    // $ANTLR start "rule__Method__Group__3__Impl"
    // InternalIoT.g:1785:1: rule__Method__Group__3__Impl : ( ')' ) ;
    public final void rule__Method__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1789:1: ( ( ')' ) )
            // InternalIoT.g:1790:1: ( ')' )
            {
            // InternalIoT.g:1790:1: ( ')' )
            // InternalIoT.g:1791:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getRightParenthesisKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__3__Impl"


    // $ANTLR start "rule__Method__Group_2__0"
    // InternalIoT.g:1801:1: rule__Method__Group_2__0 : rule__Method__Group_2__0__Impl rule__Method__Group_2__1 ;
    public final void rule__Method__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1805:1: ( rule__Method__Group_2__0__Impl rule__Method__Group_2__1 )
            // InternalIoT.g:1806:2: rule__Method__Group_2__0__Impl rule__Method__Group_2__1
            {
            pushFollow(FOLLOW_5);
            rule__Method__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Method__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_2__0"


    // $ANTLR start "rule__Method__Group_2__0__Impl"
    // InternalIoT.g:1813:1: rule__Method__Group_2__0__Impl : ( ( rule__Method__ParametersAssignment_2_0 ) ) ;
    public final void rule__Method__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1817:1: ( ( ( rule__Method__ParametersAssignment_2_0 ) ) )
            // InternalIoT.g:1818:1: ( ( rule__Method__ParametersAssignment_2_0 ) )
            {
            // InternalIoT.g:1818:1: ( ( rule__Method__ParametersAssignment_2_0 ) )
            // InternalIoT.g:1819:2: ( rule__Method__ParametersAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getParametersAssignment_2_0()); 
            }
            // InternalIoT.g:1820:2: ( rule__Method__ParametersAssignment_2_0 )
            // InternalIoT.g:1820:3: rule__Method__ParametersAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Method__ParametersAssignment_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getParametersAssignment_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_2__0__Impl"


    // $ANTLR start "rule__Method__Group_2__1"
    // InternalIoT.g:1828:1: rule__Method__Group_2__1 : rule__Method__Group_2__1__Impl ;
    public final void rule__Method__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1832:1: ( rule__Method__Group_2__1__Impl )
            // InternalIoT.g:1833:2: rule__Method__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Method__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_2__1"


    // $ANTLR start "rule__Method__Group_2__1__Impl"
    // InternalIoT.g:1839:1: rule__Method__Group_2__1__Impl : ( ( rule__Method__Group_2_1__0 )* ) ;
    public final void rule__Method__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1843:1: ( ( ( rule__Method__Group_2_1__0 )* ) )
            // InternalIoT.g:1844:1: ( ( rule__Method__Group_2_1__0 )* )
            {
            // InternalIoT.g:1844:1: ( ( rule__Method__Group_2_1__0 )* )
            // InternalIoT.g:1845:2: ( rule__Method__Group_2_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getGroup_2_1()); 
            }
            // InternalIoT.g:1846:2: ( rule__Method__Group_2_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==21) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalIoT.g:1846:3: rule__Method__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Method__Group_2_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getGroup_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_2__1__Impl"


    // $ANTLR start "rule__Method__Group_2_1__0"
    // InternalIoT.g:1855:1: rule__Method__Group_2_1__0 : rule__Method__Group_2_1__0__Impl rule__Method__Group_2_1__1 ;
    public final void rule__Method__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1859:1: ( rule__Method__Group_2_1__0__Impl rule__Method__Group_2_1__1 )
            // InternalIoT.g:1860:2: rule__Method__Group_2_1__0__Impl rule__Method__Group_2_1__1
            {
            pushFollow(FOLLOW_4);
            rule__Method__Group_2_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Method__Group_2_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_2_1__0"


    // $ANTLR start "rule__Method__Group_2_1__0__Impl"
    // InternalIoT.g:1867:1: rule__Method__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__Method__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1871:1: ( ( ',' ) )
            // InternalIoT.g:1872:1: ( ',' )
            {
            // InternalIoT.g:1872:1: ( ',' )
            // InternalIoT.g:1873:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getCommaKeyword_2_1_0()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getCommaKeyword_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_2_1__0__Impl"


    // $ANTLR start "rule__Method__Group_2_1__1"
    // InternalIoT.g:1882:1: rule__Method__Group_2_1__1 : rule__Method__Group_2_1__1__Impl ;
    public final void rule__Method__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1886:1: ( rule__Method__Group_2_1__1__Impl )
            // InternalIoT.g:1887:2: rule__Method__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Method__Group_2_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_2_1__1"


    // $ANTLR start "rule__Method__Group_2_1__1__Impl"
    // InternalIoT.g:1893:1: rule__Method__Group_2_1__1__Impl : ( ( rule__Method__ParametersAssignment_2_1_1 ) ) ;
    public final void rule__Method__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1897:1: ( ( ( rule__Method__ParametersAssignment_2_1_1 ) ) )
            // InternalIoT.g:1898:1: ( ( rule__Method__ParametersAssignment_2_1_1 ) )
            {
            // InternalIoT.g:1898:1: ( ( rule__Method__ParametersAssignment_2_1_1 ) )
            // InternalIoT.g:1899:2: ( rule__Method__ParametersAssignment_2_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getParametersAssignment_2_1_1()); 
            }
            // InternalIoT.g:1900:2: ( rule__Method__ParametersAssignment_2_1_1 )
            // InternalIoT.g:1900:3: rule__Method__ParametersAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Method__ParametersAssignment_2_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getParametersAssignment_2_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_2_1__1__Impl"


    // $ANTLR start "rule__DeviceTypes__Group__0"
    // InternalIoT.g:1909:1: rule__DeviceTypes__Group__0 : rule__DeviceTypes__Group__0__Impl rule__DeviceTypes__Group__1 ;
    public final void rule__DeviceTypes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1913:1: ( rule__DeviceTypes__Group__0__Impl rule__DeviceTypes__Group__1 )
            // InternalIoT.g:1914:2: rule__DeviceTypes__Group__0__Impl rule__DeviceTypes__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__DeviceTypes__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DeviceTypes__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceTypes__Group__0"


    // $ANTLR start "rule__DeviceTypes__Group__0__Impl"
    // InternalIoT.g:1921:1: rule__DeviceTypes__Group__0__Impl : ( 'DeviceTypes' ) ;
    public final void rule__DeviceTypes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1925:1: ( ( 'DeviceTypes' ) )
            // InternalIoT.g:1926:1: ( 'DeviceTypes' )
            {
            // InternalIoT.g:1926:1: ( 'DeviceTypes' )
            // InternalIoT.g:1927:2: 'DeviceTypes'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeviceTypesAccess().getDeviceTypesKeyword_0()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeviceTypesAccess().getDeviceTypesKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceTypes__Group__0__Impl"


    // $ANTLR start "rule__DeviceTypes__Group__1"
    // InternalIoT.g:1936:1: rule__DeviceTypes__Group__1 : rule__DeviceTypes__Group__1__Impl rule__DeviceTypes__Group__2 ;
    public final void rule__DeviceTypes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1940:1: ( rule__DeviceTypes__Group__1__Impl rule__DeviceTypes__Group__2 )
            // InternalIoT.g:1941:2: rule__DeviceTypes__Group__1__Impl rule__DeviceTypes__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__DeviceTypes__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DeviceTypes__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceTypes__Group__1"


    // $ANTLR start "rule__DeviceTypes__Group__1__Impl"
    // InternalIoT.g:1948:1: rule__DeviceTypes__Group__1__Impl : ( ( rule__DeviceTypes__TypesAssignment_1 ) ) ;
    public final void rule__DeviceTypes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1952:1: ( ( ( rule__DeviceTypes__TypesAssignment_1 ) ) )
            // InternalIoT.g:1953:1: ( ( rule__DeviceTypes__TypesAssignment_1 ) )
            {
            // InternalIoT.g:1953:1: ( ( rule__DeviceTypes__TypesAssignment_1 ) )
            // InternalIoT.g:1954:2: ( rule__DeviceTypes__TypesAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeviceTypesAccess().getTypesAssignment_1()); 
            }
            // InternalIoT.g:1955:2: ( rule__DeviceTypes__TypesAssignment_1 )
            // InternalIoT.g:1955:3: rule__DeviceTypes__TypesAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DeviceTypes__TypesAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeviceTypesAccess().getTypesAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceTypes__Group__1__Impl"


    // $ANTLR start "rule__DeviceTypes__Group__2"
    // InternalIoT.g:1963:1: rule__DeviceTypes__Group__2 : rule__DeviceTypes__Group__2__Impl ;
    public final void rule__DeviceTypes__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1967:1: ( rule__DeviceTypes__Group__2__Impl )
            // InternalIoT.g:1968:2: rule__DeviceTypes__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DeviceTypes__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceTypes__Group__2"


    // $ANTLR start "rule__DeviceTypes__Group__2__Impl"
    // InternalIoT.g:1974:1: rule__DeviceTypes__Group__2__Impl : ( ( rule__DeviceTypes__Group_2__0 )* ) ;
    public final void rule__DeviceTypes__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1978:1: ( ( ( rule__DeviceTypes__Group_2__0 )* ) )
            // InternalIoT.g:1979:1: ( ( rule__DeviceTypes__Group_2__0 )* )
            {
            // InternalIoT.g:1979:1: ( ( rule__DeviceTypes__Group_2__0 )* )
            // InternalIoT.g:1980:2: ( rule__DeviceTypes__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeviceTypesAccess().getGroup_2()); 
            }
            // InternalIoT.g:1981:2: ( rule__DeviceTypes__Group_2__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==21) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalIoT.g:1981:3: rule__DeviceTypes__Group_2__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__DeviceTypes__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeviceTypesAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceTypes__Group__2__Impl"


    // $ANTLR start "rule__DeviceTypes__Group_2__0"
    // InternalIoT.g:1990:1: rule__DeviceTypes__Group_2__0 : rule__DeviceTypes__Group_2__0__Impl rule__DeviceTypes__Group_2__1 ;
    public final void rule__DeviceTypes__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1994:1: ( rule__DeviceTypes__Group_2__0__Impl rule__DeviceTypes__Group_2__1 )
            // InternalIoT.g:1995:2: rule__DeviceTypes__Group_2__0__Impl rule__DeviceTypes__Group_2__1
            {
            pushFollow(FOLLOW_4);
            rule__DeviceTypes__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DeviceTypes__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceTypes__Group_2__0"


    // $ANTLR start "rule__DeviceTypes__Group_2__0__Impl"
    // InternalIoT.g:2002:1: rule__DeviceTypes__Group_2__0__Impl : ( ',' ) ;
    public final void rule__DeviceTypes__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2006:1: ( ( ',' ) )
            // InternalIoT.g:2007:1: ( ',' )
            {
            // InternalIoT.g:2007:1: ( ',' )
            // InternalIoT.g:2008:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeviceTypesAccess().getCommaKeyword_2_0()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeviceTypesAccess().getCommaKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceTypes__Group_2__0__Impl"


    // $ANTLR start "rule__DeviceTypes__Group_2__1"
    // InternalIoT.g:2017:1: rule__DeviceTypes__Group_2__1 : rule__DeviceTypes__Group_2__1__Impl ;
    public final void rule__DeviceTypes__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2021:1: ( rule__DeviceTypes__Group_2__1__Impl )
            // InternalIoT.g:2022:2: rule__DeviceTypes__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DeviceTypes__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceTypes__Group_2__1"


    // $ANTLR start "rule__DeviceTypes__Group_2__1__Impl"
    // InternalIoT.g:2028:1: rule__DeviceTypes__Group_2__1__Impl : ( ( rule__DeviceTypes__TypesAssignment_2_1 ) ) ;
    public final void rule__DeviceTypes__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2032:1: ( ( ( rule__DeviceTypes__TypesAssignment_2_1 ) ) )
            // InternalIoT.g:2033:1: ( ( rule__DeviceTypes__TypesAssignment_2_1 ) )
            {
            // InternalIoT.g:2033:1: ( ( rule__DeviceTypes__TypesAssignment_2_1 ) )
            // InternalIoT.g:2034:2: ( rule__DeviceTypes__TypesAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeviceTypesAccess().getTypesAssignment_2_1()); 
            }
            // InternalIoT.g:2035:2: ( rule__DeviceTypes__TypesAssignment_2_1 )
            // InternalIoT.g:2035:3: rule__DeviceTypes__TypesAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__DeviceTypes__TypesAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeviceTypesAccess().getTypesAssignment_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceTypes__Group_2__1__Impl"


    // $ANTLR start "rule__Device__Group__0"
    // InternalIoT.g:2044:1: rule__Device__Group__0 : rule__Device__Group__0__Impl rule__Device__Group__1 ;
    public final void rule__Device__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2048:1: ( rule__Device__Group__0__Impl rule__Device__Group__1 )
            // InternalIoT.g:2049:2: rule__Device__Group__0__Impl rule__Device__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Device__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Device__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group__0"


    // $ANTLR start "rule__Device__Group__0__Impl"
    // InternalIoT.g:2056:1: rule__Device__Group__0__Impl : ( 'Device' ) ;
    public final void rule__Device__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2060:1: ( ( 'Device' ) )
            // InternalIoT.g:2061:1: ( 'Device' )
            {
            // InternalIoT.g:2061:1: ( 'Device' )
            // InternalIoT.g:2062:2: 'Device'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeviceAccess().getDeviceKeyword_0()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeviceAccess().getDeviceKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group__0__Impl"


    // $ANTLR start "rule__Device__Group__1"
    // InternalIoT.g:2071:1: rule__Device__Group__1 : rule__Device__Group__1__Impl rule__Device__Group__2 ;
    public final void rule__Device__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2075:1: ( rule__Device__Group__1__Impl rule__Device__Group__2 )
            // InternalIoT.g:2076:2: rule__Device__Group__1__Impl rule__Device__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Device__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Device__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group__1"


    // $ANTLR start "rule__Device__Group__1__Impl"
    // InternalIoT.g:2083:1: rule__Device__Group__1__Impl : ( ( rule__Device__NameAssignment_1 ) ) ;
    public final void rule__Device__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2087:1: ( ( ( rule__Device__NameAssignment_1 ) ) )
            // InternalIoT.g:2088:1: ( ( rule__Device__NameAssignment_1 ) )
            {
            // InternalIoT.g:2088:1: ( ( rule__Device__NameAssignment_1 ) )
            // InternalIoT.g:2089:2: ( rule__Device__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeviceAccess().getNameAssignment_1()); 
            }
            // InternalIoT.g:2090:2: ( rule__Device__NameAssignment_1 )
            // InternalIoT.g:2090:3: rule__Device__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Device__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeviceAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group__1__Impl"


    // $ANTLR start "rule__Device__Group__2"
    // InternalIoT.g:2098:1: rule__Device__Group__2 : rule__Device__Group__2__Impl rule__Device__Group__3 ;
    public final void rule__Device__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2102:1: ( rule__Device__Group__2__Impl rule__Device__Group__3 )
            // InternalIoT.g:2103:2: rule__Device__Group__2__Impl rule__Device__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Device__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Device__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group__2"


    // $ANTLR start "rule__Device__Group__2__Impl"
    // InternalIoT.g:2110:1: rule__Device__Group__2__Impl : ( 'of' ) ;
    public final void rule__Device__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2114:1: ( ( 'of' ) )
            // InternalIoT.g:2115:1: ( 'of' )
            {
            // InternalIoT.g:2115:1: ( 'of' )
            // InternalIoT.g:2116:2: 'of'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeviceAccess().getOfKeyword_2()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeviceAccess().getOfKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group__2__Impl"


    // $ANTLR start "rule__Device__Group__3"
    // InternalIoT.g:2125:1: rule__Device__Group__3 : rule__Device__Group__3__Impl rule__Device__Group__4 ;
    public final void rule__Device__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2129:1: ( rule__Device__Group__3__Impl rule__Device__Group__4 )
            // InternalIoT.g:2130:2: rule__Device__Group__3__Impl rule__Device__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__Device__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Device__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group__3"


    // $ANTLR start "rule__Device__Group__3__Impl"
    // InternalIoT.g:2137:1: rule__Device__Group__3__Impl : ( 'type' ) ;
    public final void rule__Device__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2141:1: ( ( 'type' ) )
            // InternalIoT.g:2142:1: ( 'type' )
            {
            // InternalIoT.g:2142:1: ( 'type' )
            // InternalIoT.g:2143:2: 'type'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeviceAccess().getTypeKeyword_3()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeviceAccess().getTypeKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group__3__Impl"


    // $ANTLR start "rule__Device__Group__4"
    // InternalIoT.g:2152:1: rule__Device__Group__4 : rule__Device__Group__4__Impl rule__Device__Group__5 ;
    public final void rule__Device__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2156:1: ( rule__Device__Group__4__Impl rule__Device__Group__5 )
            // InternalIoT.g:2157:2: rule__Device__Group__4__Impl rule__Device__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__Device__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Device__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group__4"


    // $ANTLR start "rule__Device__Group__4__Impl"
    // InternalIoT.g:2164:1: rule__Device__Group__4__Impl : ( ( rule__Device__TypeAssignment_4 ) ) ;
    public final void rule__Device__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2168:1: ( ( ( rule__Device__TypeAssignment_4 ) ) )
            // InternalIoT.g:2169:1: ( ( rule__Device__TypeAssignment_4 ) )
            {
            // InternalIoT.g:2169:1: ( ( rule__Device__TypeAssignment_4 ) )
            // InternalIoT.g:2170:2: ( rule__Device__TypeAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeviceAccess().getTypeAssignment_4()); 
            }
            // InternalIoT.g:2171:2: ( rule__Device__TypeAssignment_4 )
            // InternalIoT.g:2171:3: rule__Device__TypeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Device__TypeAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeviceAccess().getTypeAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group__4__Impl"


    // $ANTLR start "rule__Device__Group__5"
    // InternalIoT.g:2179:1: rule__Device__Group__5 : rule__Device__Group__5__Impl rule__Device__Group__6 ;
    public final void rule__Device__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2183:1: ( rule__Device__Group__5__Impl rule__Device__Group__6 )
            // InternalIoT.g:2184:2: rule__Device__Group__5__Impl rule__Device__Group__6
            {
            pushFollow(FOLLOW_14);
            rule__Device__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Device__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group__5"


    // $ANTLR start "rule__Device__Group__5__Impl"
    // InternalIoT.g:2191:1: rule__Device__Group__5__Impl : ( 'contains' ) ;
    public final void rule__Device__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2195:1: ( ( 'contains' ) )
            // InternalIoT.g:2196:1: ( 'contains' )
            {
            // InternalIoT.g:2196:1: ( 'contains' )
            // InternalIoT.g:2197:2: 'contains'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeviceAccess().getContainsKeyword_5()); 
            }
            match(input,33,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeviceAccess().getContainsKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group__5__Impl"


    // $ANTLR start "rule__Device__Group__6"
    // InternalIoT.g:2206:1: rule__Device__Group__6 : rule__Device__Group__6__Impl ;
    public final void rule__Device__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2210:1: ( rule__Device__Group__6__Impl )
            // InternalIoT.g:2211:2: rule__Device__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Device__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group__6"


    // $ANTLR start "rule__Device__Group__6__Impl"
    // InternalIoT.g:2217:1: rule__Device__Group__6__Impl : ( ( rule__Device__Alternatives_6 ) ) ;
    public final void rule__Device__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2221:1: ( ( ( rule__Device__Alternatives_6 ) ) )
            // InternalIoT.g:2222:1: ( ( rule__Device__Alternatives_6 ) )
            {
            // InternalIoT.g:2222:1: ( ( rule__Device__Alternatives_6 ) )
            // InternalIoT.g:2223:2: ( rule__Device__Alternatives_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeviceAccess().getAlternatives_6()); 
            }
            // InternalIoT.g:2224:2: ( rule__Device__Alternatives_6 )
            // InternalIoT.g:2224:3: rule__Device__Alternatives_6
            {
            pushFollow(FOLLOW_2);
            rule__Device__Alternatives_6();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeviceAccess().getAlternatives_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group__6__Impl"


    // $ANTLR start "rule__Device__Group_6_0__0"
    // InternalIoT.g:2233:1: rule__Device__Group_6_0__0 : rule__Device__Group_6_0__0__Impl rule__Device__Group_6_0__1 ;
    public final void rule__Device__Group_6_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2237:1: ( rule__Device__Group_6_0__0__Impl rule__Device__Group_6_0__1 )
            // InternalIoT.g:2238:2: rule__Device__Group_6_0__0__Impl rule__Device__Group_6_0__1
            {
            pushFollow(FOLLOW_4);
            rule__Device__Group_6_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Device__Group_6_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group_6_0__0"


    // $ANTLR start "rule__Device__Group_6_0__0__Impl"
    // InternalIoT.g:2245:1: rule__Device__Group_6_0__0__Impl : ( 'device' ) ;
    public final void rule__Device__Group_6_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2249:1: ( ( 'device' ) )
            // InternalIoT.g:2250:1: ( 'device' )
            {
            // InternalIoT.g:2250:1: ( 'device' )
            // InternalIoT.g:2251:2: 'device'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeviceAccess().getDeviceKeyword_6_0_0()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeviceAccess().getDeviceKeyword_6_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group_6_0__0__Impl"


    // $ANTLR start "rule__Device__Group_6_0__1"
    // InternalIoT.g:2260:1: rule__Device__Group_6_0__1 : rule__Device__Group_6_0__1__Impl ;
    public final void rule__Device__Group_6_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2264:1: ( rule__Device__Group_6_0__1__Impl )
            // InternalIoT.g:2265:2: rule__Device__Group_6_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Device__Group_6_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group_6_0__1"


    // $ANTLR start "rule__Device__Group_6_0__1__Impl"
    // InternalIoT.g:2271:1: rule__Device__Group_6_0__1__Impl : ( ( rule__Device__DevicesAssignment_6_0_1 ) ) ;
    public final void rule__Device__Group_6_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2275:1: ( ( ( rule__Device__DevicesAssignment_6_0_1 ) ) )
            // InternalIoT.g:2276:1: ( ( rule__Device__DevicesAssignment_6_0_1 ) )
            {
            // InternalIoT.g:2276:1: ( ( rule__Device__DevicesAssignment_6_0_1 ) )
            // InternalIoT.g:2277:2: ( rule__Device__DevicesAssignment_6_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeviceAccess().getDevicesAssignment_6_0_1()); 
            }
            // InternalIoT.g:2278:2: ( rule__Device__DevicesAssignment_6_0_1 )
            // InternalIoT.g:2278:3: rule__Device__DevicesAssignment_6_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Device__DevicesAssignment_6_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeviceAccess().getDevicesAssignment_6_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group_6_0__1__Impl"


    // $ANTLR start "rule__Device__Group_6_1__0"
    // InternalIoT.g:2287:1: rule__Device__Group_6_1__0 : rule__Device__Group_6_1__0__Impl rule__Device__Group_6_1__1 ;
    public final void rule__Device__Group_6_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2291:1: ( rule__Device__Group_6_1__0__Impl rule__Device__Group_6_1__1 )
            // InternalIoT.g:2292:2: rule__Device__Group_6_1__0__Impl rule__Device__Group_6_1__1
            {
            pushFollow(FOLLOW_4);
            rule__Device__Group_6_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Device__Group_6_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group_6_1__0"


    // $ANTLR start "rule__Device__Group_6_1__0__Impl"
    // InternalIoT.g:2299:1: rule__Device__Group_6_1__0__Impl : ( 'group' ) ;
    public final void rule__Device__Group_6_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2303:1: ( ( 'group' ) )
            // InternalIoT.g:2304:1: ( 'group' )
            {
            // InternalIoT.g:2304:1: ( 'group' )
            // InternalIoT.g:2305:2: 'group'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeviceAccess().getGroupKeyword_6_1_0()); 
            }
            match(input,35,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeviceAccess().getGroupKeyword_6_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group_6_1__0__Impl"


    // $ANTLR start "rule__Device__Group_6_1__1"
    // InternalIoT.g:2314:1: rule__Device__Group_6_1__1 : rule__Device__Group_6_1__1__Impl ;
    public final void rule__Device__Group_6_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2318:1: ( rule__Device__Group_6_1__1__Impl )
            // InternalIoT.g:2319:2: rule__Device__Group_6_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Device__Group_6_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group_6_1__1"


    // $ANTLR start "rule__Device__Group_6_1__1__Impl"
    // InternalIoT.g:2325:1: rule__Device__Group_6_1__1__Impl : ( ( rule__Device__DevicesAssignment_6_1_1 ) ) ;
    public final void rule__Device__Group_6_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2329:1: ( ( ( rule__Device__DevicesAssignment_6_1_1 ) ) )
            // InternalIoT.g:2330:1: ( ( rule__Device__DevicesAssignment_6_1_1 ) )
            {
            // InternalIoT.g:2330:1: ( ( rule__Device__DevicesAssignment_6_1_1 ) )
            // InternalIoT.g:2331:2: ( rule__Device__DevicesAssignment_6_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeviceAccess().getDevicesAssignment_6_1_1()); 
            }
            // InternalIoT.g:2332:2: ( rule__Device__DevicesAssignment_6_1_1 )
            // InternalIoT.g:2332:3: rule__Device__DevicesAssignment_6_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Device__DevicesAssignment_6_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeviceAccess().getDevicesAssignment_6_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group_6_1__1__Impl"


    // $ANTLR start "rule__ServerTypes__Group__0"
    // InternalIoT.g:2341:1: rule__ServerTypes__Group__0 : rule__ServerTypes__Group__0__Impl rule__ServerTypes__Group__1 ;
    public final void rule__ServerTypes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2345:1: ( rule__ServerTypes__Group__0__Impl rule__ServerTypes__Group__1 )
            // InternalIoT.g:2346:2: rule__ServerTypes__Group__0__Impl rule__ServerTypes__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__ServerTypes__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ServerTypes__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServerTypes__Group__0"


    // $ANTLR start "rule__ServerTypes__Group__0__Impl"
    // InternalIoT.g:2353:1: rule__ServerTypes__Group__0__Impl : ( 'ServerTypes' ) ;
    public final void rule__ServerTypes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2357:1: ( ( 'ServerTypes' ) )
            // InternalIoT.g:2358:1: ( 'ServerTypes' )
            {
            // InternalIoT.g:2358:1: ( 'ServerTypes' )
            // InternalIoT.g:2359:2: 'ServerTypes'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServerTypesAccess().getServerTypesKeyword_0()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getServerTypesAccess().getServerTypesKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServerTypes__Group__0__Impl"


    // $ANTLR start "rule__ServerTypes__Group__1"
    // InternalIoT.g:2368:1: rule__ServerTypes__Group__1 : rule__ServerTypes__Group__1__Impl rule__ServerTypes__Group__2 ;
    public final void rule__ServerTypes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2372:1: ( rule__ServerTypes__Group__1__Impl rule__ServerTypes__Group__2 )
            // InternalIoT.g:2373:2: rule__ServerTypes__Group__1__Impl rule__ServerTypes__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__ServerTypes__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ServerTypes__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServerTypes__Group__1"


    // $ANTLR start "rule__ServerTypes__Group__1__Impl"
    // InternalIoT.g:2380:1: rule__ServerTypes__Group__1__Impl : ( ( rule__ServerTypes__TypesAssignment_1 ) ) ;
    public final void rule__ServerTypes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2384:1: ( ( ( rule__ServerTypes__TypesAssignment_1 ) ) )
            // InternalIoT.g:2385:1: ( ( rule__ServerTypes__TypesAssignment_1 ) )
            {
            // InternalIoT.g:2385:1: ( ( rule__ServerTypes__TypesAssignment_1 ) )
            // InternalIoT.g:2386:2: ( rule__ServerTypes__TypesAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServerTypesAccess().getTypesAssignment_1()); 
            }
            // InternalIoT.g:2387:2: ( rule__ServerTypes__TypesAssignment_1 )
            // InternalIoT.g:2387:3: rule__ServerTypes__TypesAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ServerTypes__TypesAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getServerTypesAccess().getTypesAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServerTypes__Group__1__Impl"


    // $ANTLR start "rule__ServerTypes__Group__2"
    // InternalIoT.g:2395:1: rule__ServerTypes__Group__2 : rule__ServerTypes__Group__2__Impl ;
    public final void rule__ServerTypes__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2399:1: ( rule__ServerTypes__Group__2__Impl )
            // InternalIoT.g:2400:2: rule__ServerTypes__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ServerTypes__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServerTypes__Group__2"


    // $ANTLR start "rule__ServerTypes__Group__2__Impl"
    // InternalIoT.g:2406:1: rule__ServerTypes__Group__2__Impl : ( ( rule__ServerTypes__Group_2__0 )* ) ;
    public final void rule__ServerTypes__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2410:1: ( ( ( rule__ServerTypes__Group_2__0 )* ) )
            // InternalIoT.g:2411:1: ( ( rule__ServerTypes__Group_2__0 )* )
            {
            // InternalIoT.g:2411:1: ( ( rule__ServerTypes__Group_2__0 )* )
            // InternalIoT.g:2412:2: ( rule__ServerTypes__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServerTypesAccess().getGroup_2()); 
            }
            // InternalIoT.g:2413:2: ( rule__ServerTypes__Group_2__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==21) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalIoT.g:2413:3: rule__ServerTypes__Group_2__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__ServerTypes__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getServerTypesAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServerTypes__Group__2__Impl"


    // $ANTLR start "rule__ServerTypes__Group_2__0"
    // InternalIoT.g:2422:1: rule__ServerTypes__Group_2__0 : rule__ServerTypes__Group_2__0__Impl rule__ServerTypes__Group_2__1 ;
    public final void rule__ServerTypes__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2426:1: ( rule__ServerTypes__Group_2__0__Impl rule__ServerTypes__Group_2__1 )
            // InternalIoT.g:2427:2: rule__ServerTypes__Group_2__0__Impl rule__ServerTypes__Group_2__1
            {
            pushFollow(FOLLOW_4);
            rule__ServerTypes__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ServerTypes__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServerTypes__Group_2__0"


    // $ANTLR start "rule__ServerTypes__Group_2__0__Impl"
    // InternalIoT.g:2434:1: rule__ServerTypes__Group_2__0__Impl : ( ',' ) ;
    public final void rule__ServerTypes__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2438:1: ( ( ',' ) )
            // InternalIoT.g:2439:1: ( ',' )
            {
            // InternalIoT.g:2439:1: ( ',' )
            // InternalIoT.g:2440:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServerTypesAccess().getCommaKeyword_2_0()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getServerTypesAccess().getCommaKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServerTypes__Group_2__0__Impl"


    // $ANTLR start "rule__ServerTypes__Group_2__1"
    // InternalIoT.g:2449:1: rule__ServerTypes__Group_2__1 : rule__ServerTypes__Group_2__1__Impl ;
    public final void rule__ServerTypes__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2453:1: ( rule__ServerTypes__Group_2__1__Impl )
            // InternalIoT.g:2454:2: rule__ServerTypes__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ServerTypes__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServerTypes__Group_2__1"


    // $ANTLR start "rule__ServerTypes__Group_2__1__Impl"
    // InternalIoT.g:2460:1: rule__ServerTypes__Group_2__1__Impl : ( ( rule__ServerTypes__TypesAssignment_2_1 ) ) ;
    public final void rule__ServerTypes__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2464:1: ( ( ( rule__ServerTypes__TypesAssignment_2_1 ) ) )
            // InternalIoT.g:2465:1: ( ( rule__ServerTypes__TypesAssignment_2_1 ) )
            {
            // InternalIoT.g:2465:1: ( ( rule__ServerTypes__TypesAssignment_2_1 ) )
            // InternalIoT.g:2466:2: ( rule__ServerTypes__TypesAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServerTypesAccess().getTypesAssignment_2_1()); 
            }
            // InternalIoT.g:2467:2: ( rule__ServerTypes__TypesAssignment_2_1 )
            // InternalIoT.g:2467:3: rule__ServerTypes__TypesAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ServerTypes__TypesAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getServerTypesAccess().getTypesAssignment_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServerTypes__Group_2__1__Impl"


    // $ANTLR start "rule__Server__Group__0"
    // InternalIoT.g:2476:1: rule__Server__Group__0 : rule__Server__Group__0__Impl rule__Server__Group__1 ;
    public final void rule__Server__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2480:1: ( rule__Server__Group__0__Impl rule__Server__Group__1 )
            // InternalIoT.g:2481:2: rule__Server__Group__0__Impl rule__Server__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Server__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Server__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Server__Group__0"


    // $ANTLR start "rule__Server__Group__0__Impl"
    // InternalIoT.g:2488:1: rule__Server__Group__0__Impl : ( 'Server' ) ;
    public final void rule__Server__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2492:1: ( ( 'Server' ) )
            // InternalIoT.g:2493:1: ( 'Server' )
            {
            // InternalIoT.g:2493:1: ( 'Server' )
            // InternalIoT.g:2494:2: 'Server'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServerAccess().getServerKeyword_0()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getServerAccess().getServerKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Server__Group__0__Impl"


    // $ANTLR start "rule__Server__Group__1"
    // InternalIoT.g:2503:1: rule__Server__Group__1 : rule__Server__Group__1__Impl rule__Server__Group__2 ;
    public final void rule__Server__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2507:1: ( rule__Server__Group__1__Impl rule__Server__Group__2 )
            // InternalIoT.g:2508:2: rule__Server__Group__1__Impl rule__Server__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Server__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Server__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Server__Group__1"


    // $ANTLR start "rule__Server__Group__1__Impl"
    // InternalIoT.g:2515:1: rule__Server__Group__1__Impl : ( ( rule__Server__NameAssignment_1 ) ) ;
    public final void rule__Server__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2519:1: ( ( ( rule__Server__NameAssignment_1 ) ) )
            // InternalIoT.g:2520:1: ( ( rule__Server__NameAssignment_1 ) )
            {
            // InternalIoT.g:2520:1: ( ( rule__Server__NameAssignment_1 ) )
            // InternalIoT.g:2521:2: ( rule__Server__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServerAccess().getNameAssignment_1()); 
            }
            // InternalIoT.g:2522:2: ( rule__Server__NameAssignment_1 )
            // InternalIoT.g:2522:3: rule__Server__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Server__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getServerAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Server__Group__1__Impl"


    // $ANTLR start "rule__Server__Group__2"
    // InternalIoT.g:2530:1: rule__Server__Group__2 : rule__Server__Group__2__Impl rule__Server__Group__3 ;
    public final void rule__Server__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2534:1: ( rule__Server__Group__2__Impl rule__Server__Group__3 )
            // InternalIoT.g:2535:2: rule__Server__Group__2__Impl rule__Server__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Server__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Server__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Server__Group__2"


    // $ANTLR start "rule__Server__Group__2__Impl"
    // InternalIoT.g:2542:1: rule__Server__Group__2__Impl : ( 'of' ) ;
    public final void rule__Server__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2546:1: ( ( 'of' ) )
            // InternalIoT.g:2547:1: ( 'of' )
            {
            // InternalIoT.g:2547:1: ( 'of' )
            // InternalIoT.g:2548:2: 'of'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServerAccess().getOfKeyword_2()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getServerAccess().getOfKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Server__Group__2__Impl"


    // $ANTLR start "rule__Server__Group__3"
    // InternalIoT.g:2557:1: rule__Server__Group__3 : rule__Server__Group__3__Impl rule__Server__Group__4 ;
    public final void rule__Server__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2561:1: ( rule__Server__Group__3__Impl rule__Server__Group__4 )
            // InternalIoT.g:2562:2: rule__Server__Group__3__Impl rule__Server__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__Server__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Server__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Server__Group__3"


    // $ANTLR start "rule__Server__Group__3__Impl"
    // InternalIoT.g:2569:1: rule__Server__Group__3__Impl : ( 'type' ) ;
    public final void rule__Server__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2573:1: ( ( 'type' ) )
            // InternalIoT.g:2574:1: ( 'type' )
            {
            // InternalIoT.g:2574:1: ( 'type' )
            // InternalIoT.g:2575:2: 'type'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServerAccess().getTypeKeyword_3()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getServerAccess().getTypeKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Server__Group__3__Impl"


    // $ANTLR start "rule__Server__Group__4"
    // InternalIoT.g:2584:1: rule__Server__Group__4 : rule__Server__Group__4__Impl rule__Server__Group__5 ;
    public final void rule__Server__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2588:1: ( rule__Server__Group__4__Impl rule__Server__Group__5 )
            // InternalIoT.g:2589:2: rule__Server__Group__4__Impl rule__Server__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__Server__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Server__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Server__Group__4"


    // $ANTLR start "rule__Server__Group__4__Impl"
    // InternalIoT.g:2596:1: rule__Server__Group__4__Impl : ( ( rule__Server__TypeAssignment_4 ) ) ;
    public final void rule__Server__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2600:1: ( ( ( rule__Server__TypeAssignment_4 ) ) )
            // InternalIoT.g:2601:1: ( ( rule__Server__TypeAssignment_4 ) )
            {
            // InternalIoT.g:2601:1: ( ( rule__Server__TypeAssignment_4 ) )
            // InternalIoT.g:2602:2: ( rule__Server__TypeAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServerAccess().getTypeAssignment_4()); 
            }
            // InternalIoT.g:2603:2: ( rule__Server__TypeAssignment_4 )
            // InternalIoT.g:2603:3: rule__Server__TypeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Server__TypeAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getServerAccess().getTypeAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Server__Group__4__Impl"


    // $ANTLR start "rule__Server__Group__5"
    // InternalIoT.g:2611:1: rule__Server__Group__5 : rule__Server__Group__5__Impl rule__Server__Group__6 ;
    public final void rule__Server__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2615:1: ( rule__Server__Group__5__Impl rule__Server__Group__6 )
            // InternalIoT.g:2616:2: rule__Server__Group__5__Impl rule__Server__Group__6
            {
            pushFollow(FOLLOW_16);
            rule__Server__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Server__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Server__Group__5"


    // $ANTLR start "rule__Server__Group__5__Impl"
    // InternalIoT.g:2623:1: rule__Server__Group__5__Impl : ( 'listens' ) ;
    public final void rule__Server__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2627:1: ( ( 'listens' ) )
            // InternalIoT.g:2628:1: ( 'listens' )
            {
            // InternalIoT.g:2628:1: ( 'listens' )
            // InternalIoT.g:2629:2: 'listens'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServerAccess().getListensKeyword_5()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getServerAccess().getListensKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Server__Group__5__Impl"


    // $ANTLR start "rule__Server__Group__6"
    // InternalIoT.g:2638:1: rule__Server__Group__6 : rule__Server__Group__6__Impl rule__Server__Group__7 ;
    public final void rule__Server__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2642:1: ( rule__Server__Group__6__Impl rule__Server__Group__7 )
            // InternalIoT.g:2643:2: rule__Server__Group__6__Impl rule__Server__Group__7
            {
            pushFollow(FOLLOW_17);
            rule__Server__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Server__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Server__Group__6"


    // $ANTLR start "rule__Server__Group__6__Impl"
    // InternalIoT.g:2650:1: rule__Server__Group__6__Impl : ( 'on' ) ;
    public final void rule__Server__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2654:1: ( ( 'on' ) )
            // InternalIoT.g:2655:1: ( 'on' )
            {
            // InternalIoT.g:2655:1: ( 'on' )
            // InternalIoT.g:2656:2: 'on'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServerAccess().getOnKeyword_6()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getServerAccess().getOnKeyword_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Server__Group__6__Impl"


    // $ANTLR start "rule__Server__Group__7"
    // InternalIoT.g:2665:1: rule__Server__Group__7 : rule__Server__Group__7__Impl rule__Server__Group__8 ;
    public final void rule__Server__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2669:1: ( rule__Server__Group__7__Impl rule__Server__Group__8 )
            // InternalIoT.g:2670:2: rule__Server__Group__7__Impl rule__Server__Group__8
            {
            pushFollow(FOLLOW_18);
            rule__Server__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Server__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Server__Group__7"


    // $ANTLR start "rule__Server__Group__7__Impl"
    // InternalIoT.g:2677:1: rule__Server__Group__7__Impl : ( ( rule__Server__IpAssignment_7 ) ) ;
    public final void rule__Server__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2681:1: ( ( ( rule__Server__IpAssignment_7 ) ) )
            // InternalIoT.g:2682:1: ( ( rule__Server__IpAssignment_7 ) )
            {
            // InternalIoT.g:2682:1: ( ( rule__Server__IpAssignment_7 ) )
            // InternalIoT.g:2683:2: ( rule__Server__IpAssignment_7 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServerAccess().getIpAssignment_7()); 
            }
            // InternalIoT.g:2684:2: ( rule__Server__IpAssignment_7 )
            // InternalIoT.g:2684:3: rule__Server__IpAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Server__IpAssignment_7();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getServerAccess().getIpAssignment_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Server__Group__7__Impl"


    // $ANTLR start "rule__Server__Group__8"
    // InternalIoT.g:2692:1: rule__Server__Group__8 : rule__Server__Group__8__Impl rule__Server__Group__9 ;
    public final void rule__Server__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2696:1: ( rule__Server__Group__8__Impl rule__Server__Group__9 )
            // InternalIoT.g:2697:2: rule__Server__Group__8__Impl rule__Server__Group__9
            {
            pushFollow(FOLLOW_17);
            rule__Server__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Server__Group__9();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Server__Group__8"


    // $ANTLR start "rule__Server__Group__8__Impl"
    // InternalIoT.g:2704:1: rule__Server__Group__8__Impl : ( 'and' ) ;
    public final void rule__Server__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2708:1: ( ( 'and' ) )
            // InternalIoT.g:2709:1: ( 'and' )
            {
            // InternalIoT.g:2709:1: ( 'and' )
            // InternalIoT.g:2710:2: 'and'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServerAccess().getAndKeyword_8()); 
            }
            match(input,40,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getServerAccess().getAndKeyword_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Server__Group__8__Impl"


    // $ANTLR start "rule__Server__Group__9"
    // InternalIoT.g:2719:1: rule__Server__Group__9 : rule__Server__Group__9__Impl ;
    public final void rule__Server__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2723:1: ( rule__Server__Group__9__Impl )
            // InternalIoT.g:2724:2: rule__Server__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Server__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Server__Group__9"


    // $ANTLR start "rule__Server__Group__9__Impl"
    // InternalIoT.g:2730:1: rule__Server__Group__9__Impl : ( ( rule__Server__PortAssignment_9 ) ) ;
    public final void rule__Server__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2734:1: ( ( ( rule__Server__PortAssignment_9 ) ) )
            // InternalIoT.g:2735:1: ( ( rule__Server__PortAssignment_9 ) )
            {
            // InternalIoT.g:2735:1: ( ( rule__Server__PortAssignment_9 ) )
            // InternalIoT.g:2736:2: ( rule__Server__PortAssignment_9 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServerAccess().getPortAssignment_9()); 
            }
            // InternalIoT.g:2737:2: ( rule__Server__PortAssignment_9 )
            // InternalIoT.g:2737:3: rule__Server__PortAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__Server__PortAssignment_9();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getServerAccess().getPortAssignment_9()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Server__Group__9__Impl"


    // $ANTLR start "rule__DestinationTypes__Group__0"
    // InternalIoT.g:2746:1: rule__DestinationTypes__Group__0 : rule__DestinationTypes__Group__0__Impl rule__DestinationTypes__Group__1 ;
    public final void rule__DestinationTypes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2750:1: ( rule__DestinationTypes__Group__0__Impl rule__DestinationTypes__Group__1 )
            // InternalIoT.g:2751:2: rule__DestinationTypes__Group__0__Impl rule__DestinationTypes__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__DestinationTypes__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DestinationTypes__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DestinationTypes__Group__0"


    // $ANTLR start "rule__DestinationTypes__Group__0__Impl"
    // InternalIoT.g:2758:1: rule__DestinationTypes__Group__0__Impl : ( 'DestinationTypes' ) ;
    public final void rule__DestinationTypes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2762:1: ( ( 'DestinationTypes' ) )
            // InternalIoT.g:2763:1: ( 'DestinationTypes' )
            {
            // InternalIoT.g:2763:1: ( 'DestinationTypes' )
            // InternalIoT.g:2764:2: 'DestinationTypes'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDestinationTypesAccess().getDestinationTypesKeyword_0()); 
            }
            match(input,41,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDestinationTypesAccess().getDestinationTypesKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DestinationTypes__Group__0__Impl"


    // $ANTLR start "rule__DestinationTypes__Group__1"
    // InternalIoT.g:2773:1: rule__DestinationTypes__Group__1 : rule__DestinationTypes__Group__1__Impl rule__DestinationTypes__Group__2 ;
    public final void rule__DestinationTypes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2777:1: ( rule__DestinationTypes__Group__1__Impl rule__DestinationTypes__Group__2 )
            // InternalIoT.g:2778:2: rule__DestinationTypes__Group__1__Impl rule__DestinationTypes__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__DestinationTypes__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DestinationTypes__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DestinationTypes__Group__1"


    // $ANTLR start "rule__DestinationTypes__Group__1__Impl"
    // InternalIoT.g:2785:1: rule__DestinationTypes__Group__1__Impl : ( ( rule__DestinationTypes__TypesAssignment_1 ) ) ;
    public final void rule__DestinationTypes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2789:1: ( ( ( rule__DestinationTypes__TypesAssignment_1 ) ) )
            // InternalIoT.g:2790:1: ( ( rule__DestinationTypes__TypesAssignment_1 ) )
            {
            // InternalIoT.g:2790:1: ( ( rule__DestinationTypes__TypesAssignment_1 ) )
            // InternalIoT.g:2791:2: ( rule__DestinationTypes__TypesAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDestinationTypesAccess().getTypesAssignment_1()); 
            }
            // InternalIoT.g:2792:2: ( rule__DestinationTypes__TypesAssignment_1 )
            // InternalIoT.g:2792:3: rule__DestinationTypes__TypesAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DestinationTypes__TypesAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDestinationTypesAccess().getTypesAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DestinationTypes__Group__1__Impl"


    // $ANTLR start "rule__DestinationTypes__Group__2"
    // InternalIoT.g:2800:1: rule__DestinationTypes__Group__2 : rule__DestinationTypes__Group__2__Impl ;
    public final void rule__DestinationTypes__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2804:1: ( rule__DestinationTypes__Group__2__Impl )
            // InternalIoT.g:2805:2: rule__DestinationTypes__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DestinationTypes__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DestinationTypes__Group__2"


    // $ANTLR start "rule__DestinationTypes__Group__2__Impl"
    // InternalIoT.g:2811:1: rule__DestinationTypes__Group__2__Impl : ( ( rule__DestinationTypes__Group_2__0 )* ) ;
    public final void rule__DestinationTypes__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2815:1: ( ( ( rule__DestinationTypes__Group_2__0 )* ) )
            // InternalIoT.g:2816:1: ( ( rule__DestinationTypes__Group_2__0 )* )
            {
            // InternalIoT.g:2816:1: ( ( rule__DestinationTypes__Group_2__0 )* )
            // InternalIoT.g:2817:2: ( rule__DestinationTypes__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDestinationTypesAccess().getGroup_2()); 
            }
            // InternalIoT.g:2818:2: ( rule__DestinationTypes__Group_2__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==21) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalIoT.g:2818:3: rule__DestinationTypes__Group_2__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__DestinationTypes__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDestinationTypesAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DestinationTypes__Group__2__Impl"


    // $ANTLR start "rule__DestinationTypes__Group_2__0"
    // InternalIoT.g:2827:1: rule__DestinationTypes__Group_2__0 : rule__DestinationTypes__Group_2__0__Impl rule__DestinationTypes__Group_2__1 ;
    public final void rule__DestinationTypes__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2831:1: ( rule__DestinationTypes__Group_2__0__Impl rule__DestinationTypes__Group_2__1 )
            // InternalIoT.g:2832:2: rule__DestinationTypes__Group_2__0__Impl rule__DestinationTypes__Group_2__1
            {
            pushFollow(FOLLOW_4);
            rule__DestinationTypes__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DestinationTypes__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DestinationTypes__Group_2__0"


    // $ANTLR start "rule__DestinationTypes__Group_2__0__Impl"
    // InternalIoT.g:2839:1: rule__DestinationTypes__Group_2__0__Impl : ( ',' ) ;
    public final void rule__DestinationTypes__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2843:1: ( ( ',' ) )
            // InternalIoT.g:2844:1: ( ',' )
            {
            // InternalIoT.g:2844:1: ( ',' )
            // InternalIoT.g:2845:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDestinationTypesAccess().getCommaKeyword_2_0()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDestinationTypesAccess().getCommaKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DestinationTypes__Group_2__0__Impl"


    // $ANTLR start "rule__DestinationTypes__Group_2__1"
    // InternalIoT.g:2854:1: rule__DestinationTypes__Group_2__1 : rule__DestinationTypes__Group_2__1__Impl ;
    public final void rule__DestinationTypes__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2858:1: ( rule__DestinationTypes__Group_2__1__Impl )
            // InternalIoT.g:2859:2: rule__DestinationTypes__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DestinationTypes__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DestinationTypes__Group_2__1"


    // $ANTLR start "rule__DestinationTypes__Group_2__1__Impl"
    // InternalIoT.g:2865:1: rule__DestinationTypes__Group_2__1__Impl : ( ( rule__DestinationTypes__TypesAssignment_2_1 ) ) ;
    public final void rule__DestinationTypes__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2869:1: ( ( ( rule__DestinationTypes__TypesAssignment_2_1 ) ) )
            // InternalIoT.g:2870:1: ( ( rule__DestinationTypes__TypesAssignment_2_1 ) )
            {
            // InternalIoT.g:2870:1: ( ( rule__DestinationTypes__TypesAssignment_2_1 ) )
            // InternalIoT.g:2871:2: ( rule__DestinationTypes__TypesAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDestinationTypesAccess().getTypesAssignment_2_1()); 
            }
            // InternalIoT.g:2872:2: ( rule__DestinationTypes__TypesAssignment_2_1 )
            // InternalIoT.g:2872:3: rule__DestinationTypes__TypesAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__DestinationTypes__TypesAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDestinationTypesAccess().getTypesAssignment_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DestinationTypes__Group_2__1__Impl"


    // $ANTLR start "rule__Destination__Group__0"
    // InternalIoT.g:2881:1: rule__Destination__Group__0 : rule__Destination__Group__0__Impl rule__Destination__Group__1 ;
    public final void rule__Destination__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2885:1: ( rule__Destination__Group__0__Impl rule__Destination__Group__1 )
            // InternalIoT.g:2886:2: rule__Destination__Group__0__Impl rule__Destination__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Destination__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Destination__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Destination__Group__0"


    // $ANTLR start "rule__Destination__Group__0__Impl"
    // InternalIoT.g:2893:1: rule__Destination__Group__0__Impl : ( 'Destination' ) ;
    public final void rule__Destination__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2897:1: ( ( 'Destination' ) )
            // InternalIoT.g:2898:1: ( 'Destination' )
            {
            // InternalIoT.g:2898:1: ( 'Destination' )
            // InternalIoT.g:2899:2: 'Destination'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDestinationAccess().getDestinationKeyword_0()); 
            }
            match(input,42,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDestinationAccess().getDestinationKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Destination__Group__0__Impl"


    // $ANTLR start "rule__Destination__Group__1"
    // InternalIoT.g:2908:1: rule__Destination__Group__1 : rule__Destination__Group__1__Impl rule__Destination__Group__2 ;
    public final void rule__Destination__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2912:1: ( rule__Destination__Group__1__Impl rule__Destination__Group__2 )
            // InternalIoT.g:2913:2: rule__Destination__Group__1__Impl rule__Destination__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Destination__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Destination__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Destination__Group__1"


    // $ANTLR start "rule__Destination__Group__1__Impl"
    // InternalIoT.g:2920:1: rule__Destination__Group__1__Impl : ( ( rule__Destination__NameAssignment_1 ) ) ;
    public final void rule__Destination__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2924:1: ( ( ( rule__Destination__NameAssignment_1 ) ) )
            // InternalIoT.g:2925:1: ( ( rule__Destination__NameAssignment_1 ) )
            {
            // InternalIoT.g:2925:1: ( ( rule__Destination__NameAssignment_1 ) )
            // InternalIoT.g:2926:2: ( rule__Destination__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDestinationAccess().getNameAssignment_1()); 
            }
            // InternalIoT.g:2927:2: ( rule__Destination__NameAssignment_1 )
            // InternalIoT.g:2927:3: rule__Destination__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Destination__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDestinationAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Destination__Group__1__Impl"


    // $ANTLR start "rule__Destination__Group__2"
    // InternalIoT.g:2935:1: rule__Destination__Group__2 : rule__Destination__Group__2__Impl rule__Destination__Group__3 ;
    public final void rule__Destination__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2939:1: ( rule__Destination__Group__2__Impl rule__Destination__Group__3 )
            // InternalIoT.g:2940:2: rule__Destination__Group__2__Impl rule__Destination__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Destination__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Destination__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Destination__Group__2"


    // $ANTLR start "rule__Destination__Group__2__Impl"
    // InternalIoT.g:2947:1: rule__Destination__Group__2__Impl : ( 'of' ) ;
    public final void rule__Destination__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2951:1: ( ( 'of' ) )
            // InternalIoT.g:2952:1: ( 'of' )
            {
            // InternalIoT.g:2952:1: ( 'of' )
            // InternalIoT.g:2953:2: 'of'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDestinationAccess().getOfKeyword_2()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDestinationAccess().getOfKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Destination__Group__2__Impl"


    // $ANTLR start "rule__Destination__Group__3"
    // InternalIoT.g:2962:1: rule__Destination__Group__3 : rule__Destination__Group__3__Impl ;
    public final void rule__Destination__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2966:1: ( rule__Destination__Group__3__Impl )
            // InternalIoT.g:2967:2: rule__Destination__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Destination__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Destination__Group__3"


    // $ANTLR start "rule__Destination__Group__3__Impl"
    // InternalIoT.g:2973:1: rule__Destination__Group__3__Impl : ( ( rule__Destination__TypeAssignment_3 ) ) ;
    public final void rule__Destination__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2977:1: ( ( ( rule__Destination__TypeAssignment_3 ) ) )
            // InternalIoT.g:2978:1: ( ( rule__Destination__TypeAssignment_3 ) )
            {
            // InternalIoT.g:2978:1: ( ( rule__Destination__TypeAssignment_3 ) )
            // InternalIoT.g:2979:2: ( rule__Destination__TypeAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDestinationAccess().getTypeAssignment_3()); 
            }
            // InternalIoT.g:2980:2: ( rule__Destination__TypeAssignment_3 )
            // InternalIoT.g:2980:3: rule__Destination__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Destination__TypeAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDestinationAccess().getTypeAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Destination__Group__3__Impl"


    // $ANTLR start "rule__FetchData__Group__0"
    // InternalIoT.g:2989:1: rule__FetchData__Group__0 : rule__FetchData__Group__0__Impl rule__FetchData__Group__1 ;
    public final void rule__FetchData__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2993:1: ( rule__FetchData__Group__0__Impl rule__FetchData__Group__1 )
            // InternalIoT.g:2994:2: rule__FetchData__Group__0__Impl rule__FetchData__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__FetchData__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FetchData__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FetchData__Group__0"


    // $ANTLR start "rule__FetchData__Group__0__Impl"
    // InternalIoT.g:3001:1: rule__FetchData__Group__0__Impl : ( 'Fetch' ) ;
    public final void rule__FetchData__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3005:1: ( ( 'Fetch' ) )
            // InternalIoT.g:3006:1: ( 'Fetch' )
            {
            // InternalIoT.g:3006:1: ( 'Fetch' )
            // InternalIoT.g:3007:2: 'Fetch'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFetchDataAccess().getFetchKeyword_0()); 
            }
            match(input,43,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFetchDataAccess().getFetchKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FetchData__Group__0__Impl"


    // $ANTLR start "rule__FetchData__Group__1"
    // InternalIoT.g:3016:1: rule__FetchData__Group__1 : rule__FetchData__Group__1__Impl rule__FetchData__Group__2 ;
    public final void rule__FetchData__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3020:1: ( rule__FetchData__Group__1__Impl rule__FetchData__Group__2 )
            // InternalIoT.g:3021:2: rule__FetchData__Group__1__Impl rule__FetchData__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__FetchData__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FetchData__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FetchData__Group__1"


    // $ANTLR start "rule__FetchData__Group__1__Impl"
    // InternalIoT.g:3028:1: rule__FetchData__Group__1__Impl : ( 'data' ) ;
    public final void rule__FetchData__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3032:1: ( ( 'data' ) )
            // InternalIoT.g:3033:1: ( 'data' )
            {
            // InternalIoT.g:3033:1: ( 'data' )
            // InternalIoT.g:3034:2: 'data'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFetchDataAccess().getDataKeyword_1()); 
            }
            match(input,44,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFetchDataAccess().getDataKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FetchData__Group__1__Impl"


    // $ANTLR start "rule__FetchData__Group__2"
    // InternalIoT.g:3043:1: rule__FetchData__Group__2 : rule__FetchData__Group__2__Impl rule__FetchData__Group__3 ;
    public final void rule__FetchData__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3047:1: ( rule__FetchData__Group__2__Impl rule__FetchData__Group__3 )
            // InternalIoT.g:3048:2: rule__FetchData__Group__2__Impl rule__FetchData__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__FetchData__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FetchData__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FetchData__Group__2"


    // $ANTLR start "rule__FetchData__Group__2__Impl"
    // InternalIoT.g:3055:1: rule__FetchData__Group__2__Impl : ( 'from' ) ;
    public final void rule__FetchData__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3059:1: ( ( 'from' ) )
            // InternalIoT.g:3060:1: ( 'from' )
            {
            // InternalIoT.g:3060:1: ( 'from' )
            // InternalIoT.g:3061:2: 'from'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFetchDataAccess().getFromKeyword_2()); 
            }
            match(input,45,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFetchDataAccess().getFromKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FetchData__Group__2__Impl"


    // $ANTLR start "rule__FetchData__Group__3"
    // InternalIoT.g:3070:1: rule__FetchData__Group__3 : rule__FetchData__Group__3__Impl rule__FetchData__Group__4 ;
    public final void rule__FetchData__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3074:1: ( rule__FetchData__Group__3__Impl rule__FetchData__Group__4 )
            // InternalIoT.g:3075:2: rule__FetchData__Group__3__Impl rule__FetchData__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__FetchData__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FetchData__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FetchData__Group__3"


    // $ANTLR start "rule__FetchData__Group__3__Impl"
    // InternalIoT.g:3082:1: rule__FetchData__Group__3__Impl : ( ( rule__FetchData__Alternatives_3 ) ) ;
    public final void rule__FetchData__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3086:1: ( ( ( rule__FetchData__Alternatives_3 ) ) )
            // InternalIoT.g:3087:1: ( ( rule__FetchData__Alternatives_3 ) )
            {
            // InternalIoT.g:3087:1: ( ( rule__FetchData__Alternatives_3 ) )
            // InternalIoT.g:3088:2: ( rule__FetchData__Alternatives_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFetchDataAccess().getAlternatives_3()); 
            }
            // InternalIoT.g:3089:2: ( rule__FetchData__Alternatives_3 )
            // InternalIoT.g:3089:3: rule__FetchData__Alternatives_3
            {
            pushFollow(FOLLOW_2);
            rule__FetchData__Alternatives_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFetchDataAccess().getAlternatives_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FetchData__Group__3__Impl"


    // $ANTLR start "rule__FetchData__Group__4"
    // InternalIoT.g:3097:1: rule__FetchData__Group__4 : rule__FetchData__Group__4__Impl rule__FetchData__Group__5 ;
    public final void rule__FetchData__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3101:1: ( rule__FetchData__Group__4__Impl rule__FetchData__Group__5 )
            // InternalIoT.g:3102:2: rule__FetchData__Group__4__Impl rule__FetchData__Group__5
            {
            pushFollow(FOLLOW_22);
            rule__FetchData__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FetchData__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FetchData__Group__4"


    // $ANTLR start "rule__FetchData__Group__4__Impl"
    // InternalIoT.g:3109:1: rule__FetchData__Group__4__Impl : ( 'for' ) ;
    public final void rule__FetchData__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3113:1: ( ( 'for' ) )
            // InternalIoT.g:3114:1: ( 'for' )
            {
            // InternalIoT.g:3114:1: ( 'for' )
            // InternalIoT.g:3115:2: 'for'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFetchDataAccess().getForKeyword_4()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFetchDataAccess().getForKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FetchData__Group__4__Impl"


    // $ANTLR start "rule__FetchData__Group__5"
    // InternalIoT.g:3124:1: rule__FetchData__Group__5 : rule__FetchData__Group__5__Impl rule__FetchData__Group__6 ;
    public final void rule__FetchData__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3128:1: ( rule__FetchData__Group__5__Impl rule__FetchData__Group__6 )
            // InternalIoT.g:3129:2: rule__FetchData__Group__5__Impl rule__FetchData__Group__6
            {
            pushFollow(FOLLOW_4);
            rule__FetchData__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FetchData__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FetchData__Group__5"


    // $ANTLR start "rule__FetchData__Group__5__Impl"
    // InternalIoT.g:3136:1: rule__FetchData__Group__5__Impl : ( 'device' ) ;
    public final void rule__FetchData__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3140:1: ( ( 'device' ) )
            // InternalIoT.g:3141:1: ( 'device' )
            {
            // InternalIoT.g:3141:1: ( 'device' )
            // InternalIoT.g:3142:2: 'device'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFetchDataAccess().getDeviceKeyword_5()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFetchDataAccess().getDeviceKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FetchData__Group__5__Impl"


    // $ANTLR start "rule__FetchData__Group__6"
    // InternalIoT.g:3151:1: rule__FetchData__Group__6 : rule__FetchData__Group__6__Impl rule__FetchData__Group__7 ;
    public final void rule__FetchData__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3155:1: ( rule__FetchData__Group__6__Impl rule__FetchData__Group__7 )
            // InternalIoT.g:3156:2: rule__FetchData__Group__6__Impl rule__FetchData__Group__7
            {
            pushFollow(FOLLOW_23);
            rule__FetchData__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FetchData__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FetchData__Group__6"


    // $ANTLR start "rule__FetchData__Group__6__Impl"
    // InternalIoT.g:3163:1: rule__FetchData__Group__6__Impl : ( ( rule__FetchData__DeviceAssignment_6 ) ) ;
    public final void rule__FetchData__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3167:1: ( ( ( rule__FetchData__DeviceAssignment_6 ) ) )
            // InternalIoT.g:3168:1: ( ( rule__FetchData__DeviceAssignment_6 ) )
            {
            // InternalIoT.g:3168:1: ( ( rule__FetchData__DeviceAssignment_6 ) )
            // InternalIoT.g:3169:2: ( rule__FetchData__DeviceAssignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFetchDataAccess().getDeviceAssignment_6()); 
            }
            // InternalIoT.g:3170:2: ( rule__FetchData__DeviceAssignment_6 )
            // InternalIoT.g:3170:3: rule__FetchData__DeviceAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__FetchData__DeviceAssignment_6();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFetchDataAccess().getDeviceAssignment_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FetchData__Group__6__Impl"


    // $ANTLR start "rule__FetchData__Group__7"
    // InternalIoT.g:3178:1: rule__FetchData__Group__7 : rule__FetchData__Group__7__Impl rule__FetchData__Group__8 ;
    public final void rule__FetchData__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3182:1: ( rule__FetchData__Group__7__Impl rule__FetchData__Group__8 )
            // InternalIoT.g:3183:2: rule__FetchData__Group__7__Impl rule__FetchData__Group__8
            {
            pushFollow(FOLLOW_24);
            rule__FetchData__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FetchData__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FetchData__Group__7"


    // $ANTLR start "rule__FetchData__Group__7__Impl"
    // InternalIoT.g:3190:1: rule__FetchData__Group__7__Impl : ( 'to' ) ;
    public final void rule__FetchData__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3194:1: ( ( 'to' ) )
            // InternalIoT.g:3195:1: ( 'to' )
            {
            // InternalIoT.g:3195:1: ( 'to' )
            // InternalIoT.g:3196:2: 'to'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFetchDataAccess().getToKeyword_7()); 
            }
            match(input,46,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFetchDataAccess().getToKeyword_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FetchData__Group__7__Impl"


    // $ANTLR start "rule__FetchData__Group__8"
    // InternalIoT.g:3205:1: rule__FetchData__Group__8 : rule__FetchData__Group__8__Impl rule__FetchData__Group__9 ;
    public final void rule__FetchData__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3209:1: ( rule__FetchData__Group__8__Impl rule__FetchData__Group__9 )
            // InternalIoT.g:3210:2: rule__FetchData__Group__8__Impl rule__FetchData__Group__9
            {
            pushFollow(FOLLOW_25);
            rule__FetchData__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FetchData__Group__9();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FetchData__Group__8"


    // $ANTLR start "rule__FetchData__Group__8__Impl"
    // InternalIoT.g:3217:1: rule__FetchData__Group__8__Impl : ( ( rule__FetchData__Alternatives_8 ) ) ;
    public final void rule__FetchData__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3221:1: ( ( ( rule__FetchData__Alternatives_8 ) ) )
            // InternalIoT.g:3222:1: ( ( rule__FetchData__Alternatives_8 ) )
            {
            // InternalIoT.g:3222:1: ( ( rule__FetchData__Alternatives_8 ) )
            // InternalIoT.g:3223:2: ( rule__FetchData__Alternatives_8 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFetchDataAccess().getAlternatives_8()); 
            }
            // InternalIoT.g:3224:2: ( rule__FetchData__Alternatives_8 )
            // InternalIoT.g:3224:3: rule__FetchData__Alternatives_8
            {
            pushFollow(FOLLOW_2);
            rule__FetchData__Alternatives_8();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFetchDataAccess().getAlternatives_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FetchData__Group__8__Impl"


    // $ANTLR start "rule__FetchData__Group__9"
    // InternalIoT.g:3232:1: rule__FetchData__Group__9 : rule__FetchData__Group__9__Impl rule__FetchData__Group__10 ;
    public final void rule__FetchData__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3236:1: ( rule__FetchData__Group__9__Impl rule__FetchData__Group__10 )
            // InternalIoT.g:3237:2: rule__FetchData__Group__9__Impl rule__FetchData__Group__10
            {
            pushFollow(FOLLOW_25);
            rule__FetchData__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FetchData__Group__10();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FetchData__Group__9"


    // $ANTLR start "rule__FetchData__Group__9__Impl"
    // InternalIoT.g:3244:1: rule__FetchData__Group__9__Impl : ( ( rule__FetchData__Group_9__0 )? ) ;
    public final void rule__FetchData__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3248:1: ( ( ( rule__FetchData__Group_9__0 )? ) )
            // InternalIoT.g:3249:1: ( ( rule__FetchData__Group_9__0 )? )
            {
            // InternalIoT.g:3249:1: ( ( rule__FetchData__Group_9__0 )? )
            // InternalIoT.g:3250:2: ( rule__FetchData__Group_9__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFetchDataAccess().getGroup_9()); 
            }
            // InternalIoT.g:3251:2: ( rule__FetchData__Group_9__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==49) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalIoT.g:3251:3: rule__FetchData__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FetchData__Group_9__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFetchDataAccess().getGroup_9()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FetchData__Group__9__Impl"


    // $ANTLR start "rule__FetchData__Group__10"
    // InternalIoT.g:3259:1: rule__FetchData__Group__10 : rule__FetchData__Group__10__Impl ;
    public final void rule__FetchData__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3263:1: ( rule__FetchData__Group__10__Impl )
            // InternalIoT.g:3264:2: rule__FetchData__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FetchData__Group__10__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FetchData__Group__10"


    // $ANTLR start "rule__FetchData__Group__10__Impl"
    // InternalIoT.g:3270:1: rule__FetchData__Group__10__Impl : ( ( rule__FetchData__Group_10__0 )? ) ;
    public final void rule__FetchData__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3274:1: ( ( ( rule__FetchData__Group_10__0 )? ) )
            // InternalIoT.g:3275:1: ( ( rule__FetchData__Group_10__0 )? )
            {
            // InternalIoT.g:3275:1: ( ( rule__FetchData__Group_10__0 )? )
            // InternalIoT.g:3276:2: ( rule__FetchData__Group_10__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFetchDataAccess().getGroup_10()); 
            }
            // InternalIoT.g:3277:2: ( rule__FetchData__Group_10__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==50) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalIoT.g:3277:3: rule__FetchData__Group_10__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FetchData__Group_10__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFetchDataAccess().getGroup_10()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FetchData__Group__10__Impl"


    // $ANTLR start "rule__FetchData__Group_3_0__0"
    // InternalIoT.g:3286:1: rule__FetchData__Group_3_0__0 : rule__FetchData__Group_3_0__0__Impl rule__FetchData__Group_3_0__1 ;
    public final void rule__FetchData__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3290:1: ( rule__FetchData__Group_3_0__0__Impl rule__FetchData__Group_3_0__1 )
            // InternalIoT.g:3291:2: rule__FetchData__Group_3_0__0__Impl rule__FetchData__Group_3_0__1
            {
            pushFollow(FOLLOW_4);
            rule__FetchData__Group_3_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FetchData__Group_3_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FetchData__Group_3_0__0"


    // $ANTLR start "rule__FetchData__Group_3_0__0__Impl"
    // InternalIoT.g:3298:1: rule__FetchData__Group_3_0__0__Impl : ( 'type' ) ;
    public final void rule__FetchData__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3302:1: ( ( 'type' ) )
            // InternalIoT.g:3303:1: ( 'type' )
            {
            // InternalIoT.g:3303:1: ( 'type' )
            // InternalIoT.g:3304:2: 'type'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFetchDataAccess().getTypeKeyword_3_0_0()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFetchDataAccess().getTypeKeyword_3_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FetchData__Group_3_0__0__Impl"


    // $ANTLR start "rule__FetchData__Group_3_0__1"
    // InternalIoT.g:3313:1: rule__FetchData__Group_3_0__1 : rule__FetchData__Group_3_0__1__Impl ;
    public final void rule__FetchData__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3317:1: ( rule__FetchData__Group_3_0__1__Impl )
            // InternalIoT.g:3318:2: rule__FetchData__Group_3_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FetchData__Group_3_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FetchData__Group_3_0__1"


    // $ANTLR start "rule__FetchData__Group_3_0__1__Impl"
    // InternalIoT.g:3324:1: rule__FetchData__Group_3_0__1__Impl : ( ( rule__FetchData__FilterAssignment_3_0_1 ) ) ;
    public final void rule__FetchData__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3328:1: ( ( ( rule__FetchData__FilterAssignment_3_0_1 ) ) )
            // InternalIoT.g:3329:1: ( ( rule__FetchData__FilterAssignment_3_0_1 ) )
            {
            // InternalIoT.g:3329:1: ( ( rule__FetchData__FilterAssignment_3_0_1 ) )
            // InternalIoT.g:3330:2: ( rule__FetchData__FilterAssignment_3_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFetchDataAccess().getFilterAssignment_3_0_1()); 
            }
            // InternalIoT.g:3331:2: ( rule__FetchData__FilterAssignment_3_0_1 )
            // InternalIoT.g:3331:3: rule__FetchData__FilterAssignment_3_0_1
            {
            pushFollow(FOLLOW_2);
            rule__FetchData__FilterAssignment_3_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFetchDataAccess().getFilterAssignment_3_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FetchData__Group_3_0__1__Impl"


    // $ANTLR start "rule__FetchData__Group_3_1__0"
    // InternalIoT.g:3340:1: rule__FetchData__Group_3_1__0 : rule__FetchData__Group_3_1__0__Impl rule__FetchData__Group_3_1__1 ;
    public final void rule__FetchData__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3344:1: ( rule__FetchData__Group_3_1__0__Impl rule__FetchData__Group_3_1__1 )
            // InternalIoT.g:3345:2: rule__FetchData__Group_3_1__0__Impl rule__FetchData__Group_3_1__1
            {
            pushFollow(FOLLOW_4);
            rule__FetchData__Group_3_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FetchData__Group_3_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FetchData__Group_3_1__0"


    // $ANTLR start "rule__FetchData__Group_3_1__0__Impl"
    // InternalIoT.g:3352:1: rule__FetchData__Group_3_1__0__Impl : ( 'group' ) ;
    public final void rule__FetchData__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3356:1: ( ( 'group' ) )
            // InternalIoT.g:3357:1: ( 'group' )
            {
            // InternalIoT.g:3357:1: ( 'group' )
            // InternalIoT.g:3358:2: 'group'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFetchDataAccess().getGroupKeyword_3_1_0()); 
            }
            match(input,35,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFetchDataAccess().getGroupKeyword_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FetchData__Group_3_1__0__Impl"


    // $ANTLR start "rule__FetchData__Group_3_1__1"
    // InternalIoT.g:3367:1: rule__FetchData__Group_3_1__1 : rule__FetchData__Group_3_1__1__Impl ;
    public final void rule__FetchData__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3371:1: ( rule__FetchData__Group_3_1__1__Impl )
            // InternalIoT.g:3372:2: rule__FetchData__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FetchData__Group_3_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FetchData__Group_3_1__1"


    // $ANTLR start "rule__FetchData__Group_3_1__1__Impl"
    // InternalIoT.g:3378:1: rule__FetchData__Group_3_1__1__Impl : ( ( rule__FetchData__FilterAssignment_3_1_1 ) ) ;
    public final void rule__FetchData__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3382:1: ( ( ( rule__FetchData__FilterAssignment_3_1_1 ) ) )
            // InternalIoT.g:3383:1: ( ( rule__FetchData__FilterAssignment_3_1_1 ) )
            {
            // InternalIoT.g:3383:1: ( ( rule__FetchData__FilterAssignment_3_1_1 ) )
            // InternalIoT.g:3384:2: ( rule__FetchData__FilterAssignment_3_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFetchDataAccess().getFilterAssignment_3_1_1()); 
            }
            // InternalIoT.g:3385:2: ( rule__FetchData__FilterAssignment_3_1_1 )
            // InternalIoT.g:3385:3: rule__FetchData__FilterAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__FetchData__FilterAssignment_3_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFetchDataAccess().getFilterAssignment_3_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FetchData__Group_3_1__1__Impl"


    // $ANTLR start "rule__FetchData__Group_8_0__0"
    // InternalIoT.g:3394:1: rule__FetchData__Group_8_0__0 : rule__FetchData__Group_8_0__0__Impl rule__FetchData__Group_8_0__1 ;
    public final void rule__FetchData__Group_8_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3398:1: ( rule__FetchData__Group_8_0__0__Impl rule__FetchData__Group_8_0__1 )
            // InternalIoT.g:3399:2: rule__FetchData__Group_8_0__0__Impl rule__FetchData__Group_8_0__1
            {
            pushFollow(FOLLOW_4);
            rule__FetchData__Group_8_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FetchData__Group_8_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FetchData__Group_8_0__0"


    // $ANTLR start "rule__FetchData__Group_8_0__0__Impl"
    // InternalIoT.g:3406:1: rule__FetchData__Group_8_0__0__Impl : ( 'destination' ) ;
    public final void rule__FetchData__Group_8_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3410:1: ( ( 'destination' ) )
            // InternalIoT.g:3411:1: ( 'destination' )
            {
            // InternalIoT.g:3411:1: ( 'destination' )
            // InternalIoT.g:3412:2: 'destination'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFetchDataAccess().getDestinationKeyword_8_0_0()); 
            }
            match(input,47,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFetchDataAccess().getDestinationKeyword_8_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FetchData__Group_8_0__0__Impl"


    // $ANTLR start "rule__FetchData__Group_8_0__1"
    // InternalIoT.g:3421:1: rule__FetchData__Group_8_0__1 : rule__FetchData__Group_8_0__1__Impl ;
    public final void rule__FetchData__Group_8_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3425:1: ( rule__FetchData__Group_8_0__1__Impl )
            // InternalIoT.g:3426:2: rule__FetchData__Group_8_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FetchData__Group_8_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FetchData__Group_8_0__1"


    // $ANTLR start "rule__FetchData__Group_8_0__1__Impl"
    // InternalIoT.g:3432:1: rule__FetchData__Group_8_0__1__Impl : ( ( rule__FetchData__DestinationAssignment_8_0_1 ) ) ;
    public final void rule__FetchData__Group_8_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3436:1: ( ( ( rule__FetchData__DestinationAssignment_8_0_1 ) ) )
            // InternalIoT.g:3437:1: ( ( rule__FetchData__DestinationAssignment_8_0_1 ) )
            {
            // InternalIoT.g:3437:1: ( ( rule__FetchData__DestinationAssignment_8_0_1 ) )
            // InternalIoT.g:3438:2: ( rule__FetchData__DestinationAssignment_8_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFetchDataAccess().getDestinationAssignment_8_0_1()); 
            }
            // InternalIoT.g:3439:2: ( rule__FetchData__DestinationAssignment_8_0_1 )
            // InternalIoT.g:3439:3: rule__FetchData__DestinationAssignment_8_0_1
            {
            pushFollow(FOLLOW_2);
            rule__FetchData__DestinationAssignment_8_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFetchDataAccess().getDestinationAssignment_8_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FetchData__Group_8_0__1__Impl"


    // $ANTLR start "rule__FetchData__Group_8_1__0"
    // InternalIoT.g:3448:1: rule__FetchData__Group_8_1__0 : rule__FetchData__Group_8_1__0__Impl rule__FetchData__Group_8_1__1 ;
    public final void rule__FetchData__Group_8_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3452:1: ( rule__FetchData__Group_8_1__0__Impl rule__FetchData__Group_8_1__1 )
            // InternalIoT.g:3453:2: rule__FetchData__Group_8_1__0__Impl rule__FetchData__Group_8_1__1
            {
            pushFollow(FOLLOW_4);
            rule__FetchData__Group_8_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FetchData__Group_8_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FetchData__Group_8_1__0"


    // $ANTLR start "rule__FetchData__Group_8_1__0__Impl"
    // InternalIoT.g:3460:1: rule__FetchData__Group_8_1__0__Impl : ( 'server' ) ;
    public final void rule__FetchData__Group_8_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3464:1: ( ( 'server' ) )
            // InternalIoT.g:3465:1: ( 'server' )
            {
            // InternalIoT.g:3465:1: ( 'server' )
            // InternalIoT.g:3466:2: 'server'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFetchDataAccess().getServerKeyword_8_1_0()); 
            }
            match(input,48,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFetchDataAccess().getServerKeyword_8_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FetchData__Group_8_1__0__Impl"


    // $ANTLR start "rule__FetchData__Group_8_1__1"
    // InternalIoT.g:3475:1: rule__FetchData__Group_8_1__1 : rule__FetchData__Group_8_1__1__Impl ;
    public final void rule__FetchData__Group_8_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3479:1: ( rule__FetchData__Group_8_1__1__Impl )
            // InternalIoT.g:3480:2: rule__FetchData__Group_8_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FetchData__Group_8_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FetchData__Group_8_1__1"


    // $ANTLR start "rule__FetchData__Group_8_1__1__Impl"
    // InternalIoT.g:3486:1: rule__FetchData__Group_8_1__1__Impl : ( ( rule__FetchData__DestinationAssignment_8_1_1 ) ) ;
    public final void rule__FetchData__Group_8_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3490:1: ( ( ( rule__FetchData__DestinationAssignment_8_1_1 ) ) )
            // InternalIoT.g:3491:1: ( ( rule__FetchData__DestinationAssignment_8_1_1 ) )
            {
            // InternalIoT.g:3491:1: ( ( rule__FetchData__DestinationAssignment_8_1_1 ) )
            // InternalIoT.g:3492:2: ( rule__FetchData__DestinationAssignment_8_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFetchDataAccess().getDestinationAssignment_8_1_1()); 
            }
            // InternalIoT.g:3493:2: ( rule__FetchData__DestinationAssignment_8_1_1 )
            // InternalIoT.g:3493:3: rule__FetchData__DestinationAssignment_8_1_1
            {
            pushFollow(FOLLOW_2);
            rule__FetchData__DestinationAssignment_8_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFetchDataAccess().getDestinationAssignment_8_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FetchData__Group_8_1__1__Impl"


    // $ANTLR start "rule__FetchData__Group_9__0"
    // InternalIoT.g:3502:1: rule__FetchData__Group_9__0 : rule__FetchData__Group_9__0__Impl rule__FetchData__Group_9__1 ;
    public final void rule__FetchData__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3506:1: ( rule__FetchData__Group_9__0__Impl rule__FetchData__Group_9__1 )
            // InternalIoT.g:3507:2: rule__FetchData__Group_9__0__Impl rule__FetchData__Group_9__1
            {
            pushFollow(FOLLOW_26);
            rule__FetchData__Group_9__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FetchData__Group_9__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FetchData__Group_9__0"


    // $ANTLR start "rule__FetchData__Group_9__0__Impl"
    // InternalIoT.g:3514:1: rule__FetchData__Group_9__0__Impl : ( ( 'condition' ) ) ;
    public final void rule__FetchData__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3518:1: ( ( ( 'condition' ) ) )
            // InternalIoT.g:3519:1: ( ( 'condition' ) )
            {
            // InternalIoT.g:3519:1: ( ( 'condition' ) )
            // InternalIoT.g:3520:2: ( 'condition' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFetchDataAccess().getConditionKeyword_9_0()); 
            }
            // InternalIoT.g:3521:2: ( 'condition' )
            // InternalIoT.g:3521:3: 'condition'
            {
            match(input,49,FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFetchDataAccess().getConditionKeyword_9_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FetchData__Group_9__0__Impl"


    // $ANTLR start "rule__FetchData__Group_9__1"
    // InternalIoT.g:3529:1: rule__FetchData__Group_9__1 : rule__FetchData__Group_9__1__Impl ;
    public final void rule__FetchData__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3533:1: ( rule__FetchData__Group_9__1__Impl )
            // InternalIoT.g:3534:2: rule__FetchData__Group_9__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FetchData__Group_9__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FetchData__Group_9__1"


    // $ANTLR start "rule__FetchData__Group_9__1__Impl"
    // InternalIoT.g:3540:1: rule__FetchData__Group_9__1__Impl : ( ( rule__FetchData__ConditionAssignment_9_1 ) ) ;
    public final void rule__FetchData__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3544:1: ( ( ( rule__FetchData__ConditionAssignment_9_1 ) ) )
            // InternalIoT.g:3545:1: ( ( rule__FetchData__ConditionAssignment_9_1 ) )
            {
            // InternalIoT.g:3545:1: ( ( rule__FetchData__ConditionAssignment_9_1 ) )
            // InternalIoT.g:3546:2: ( rule__FetchData__ConditionAssignment_9_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFetchDataAccess().getConditionAssignment_9_1()); 
            }
            // InternalIoT.g:3547:2: ( rule__FetchData__ConditionAssignment_9_1 )
            // InternalIoT.g:3547:3: rule__FetchData__ConditionAssignment_9_1
            {
            pushFollow(FOLLOW_2);
            rule__FetchData__ConditionAssignment_9_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFetchDataAccess().getConditionAssignment_9_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FetchData__Group_9__1__Impl"


    // $ANTLR start "rule__FetchData__Group_10__0"
    // InternalIoT.g:3556:1: rule__FetchData__Group_10__0 : rule__FetchData__Group_10__0__Impl rule__FetchData__Group_10__1 ;
    public final void rule__FetchData__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3560:1: ( rule__FetchData__Group_10__0__Impl rule__FetchData__Group_10__1 )
            // InternalIoT.g:3561:2: rule__FetchData__Group_10__0__Impl rule__FetchData__Group_10__1
            {
            pushFollow(FOLLOW_27);
            rule__FetchData__Group_10__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FetchData__Group_10__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FetchData__Group_10__0"


    // $ANTLR start "rule__FetchData__Group_10__0__Impl"
    // InternalIoT.g:3568:1: rule__FetchData__Group_10__0__Impl : ( ( 'triggered' ) ) ;
    public final void rule__FetchData__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3572:1: ( ( ( 'triggered' ) ) )
            // InternalIoT.g:3573:1: ( ( 'triggered' ) )
            {
            // InternalIoT.g:3573:1: ( ( 'triggered' ) )
            // InternalIoT.g:3574:2: ( 'triggered' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFetchDataAccess().getTriggeredKeyword_10_0()); 
            }
            // InternalIoT.g:3575:2: ( 'triggered' )
            // InternalIoT.g:3575:3: 'triggered'
            {
            match(input,50,FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFetchDataAccess().getTriggeredKeyword_10_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FetchData__Group_10__0__Impl"


    // $ANTLR start "rule__FetchData__Group_10__1"
    // InternalIoT.g:3583:1: rule__FetchData__Group_10__1 : rule__FetchData__Group_10__1__Impl ;
    public final void rule__FetchData__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3587:1: ( rule__FetchData__Group_10__1__Impl )
            // InternalIoT.g:3588:2: rule__FetchData__Group_10__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FetchData__Group_10__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FetchData__Group_10__1"


    // $ANTLR start "rule__FetchData__Group_10__1__Impl"
    // InternalIoT.g:3594:1: rule__FetchData__Group_10__1__Impl : ( ( rule__FetchData__TriggeredAssignment_10_1 ) ) ;
    public final void rule__FetchData__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3598:1: ( ( ( rule__FetchData__TriggeredAssignment_10_1 ) ) )
            // InternalIoT.g:3599:1: ( ( rule__FetchData__TriggeredAssignment_10_1 ) )
            {
            // InternalIoT.g:3599:1: ( ( rule__FetchData__TriggeredAssignment_10_1 ) )
            // InternalIoT.g:3600:2: ( rule__FetchData__TriggeredAssignment_10_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFetchDataAccess().getTriggeredAssignment_10_1()); 
            }
            // InternalIoT.g:3601:2: ( rule__FetchData__TriggeredAssignment_10_1 )
            // InternalIoT.g:3601:3: rule__FetchData__TriggeredAssignment_10_1
            {
            pushFollow(FOLLOW_2);
            rule__FetchData__TriggeredAssignment_10_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFetchDataAccess().getTriggeredAssignment_10_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FetchData__Group_10__1__Impl"


    // $ANTLR start "rule__FetchDataExpression__Group__0"
    // InternalIoT.g:3610:1: rule__FetchDataExpression__Group__0 : rule__FetchDataExpression__Group__0__Impl rule__FetchDataExpression__Group__1 ;
    public final void rule__FetchDataExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3614:1: ( rule__FetchDataExpression__Group__0__Impl rule__FetchDataExpression__Group__1 )
            // InternalIoT.g:3615:2: rule__FetchDataExpression__Group__0__Impl rule__FetchDataExpression__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__FetchDataExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FetchDataExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FetchDataExpression__Group__0"


    // $ANTLR start "rule__FetchDataExpression__Group__0__Impl"
    // InternalIoT.g:3622:1: rule__FetchDataExpression__Group__0__Impl : ( 'every' ) ;
    public final void rule__FetchDataExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3626:1: ( ( 'every' ) )
            // InternalIoT.g:3627:1: ( 'every' )
            {
            // InternalIoT.g:3627:1: ( 'every' )
            // InternalIoT.g:3628:2: 'every'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFetchDataExpressionAccess().getEveryKeyword_0()); 
            }
            match(input,51,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFetchDataExpressionAccess().getEveryKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FetchDataExpression__Group__0__Impl"


    // $ANTLR start "rule__FetchDataExpression__Group__1"
    // InternalIoT.g:3637:1: rule__FetchDataExpression__Group__1 : rule__FetchDataExpression__Group__1__Impl rule__FetchDataExpression__Group__2 ;
    public final void rule__FetchDataExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3641:1: ( rule__FetchDataExpression__Group__1__Impl rule__FetchDataExpression__Group__2 )
            // InternalIoT.g:3642:2: rule__FetchDataExpression__Group__1__Impl rule__FetchDataExpression__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__FetchDataExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FetchDataExpression__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FetchDataExpression__Group__1"


    // $ANTLR start "rule__FetchDataExpression__Group__1__Impl"
    // InternalIoT.g:3649:1: rule__FetchDataExpression__Group__1__Impl : ( ( rule__FetchDataExpression__DurationAssignment_1 ) ) ;
    public final void rule__FetchDataExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3653:1: ( ( ( rule__FetchDataExpression__DurationAssignment_1 ) ) )
            // InternalIoT.g:3654:1: ( ( rule__FetchDataExpression__DurationAssignment_1 ) )
            {
            // InternalIoT.g:3654:1: ( ( rule__FetchDataExpression__DurationAssignment_1 ) )
            // InternalIoT.g:3655:2: ( rule__FetchDataExpression__DurationAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFetchDataExpressionAccess().getDurationAssignment_1()); 
            }
            // InternalIoT.g:3656:2: ( rule__FetchDataExpression__DurationAssignment_1 )
            // InternalIoT.g:3656:3: rule__FetchDataExpression__DurationAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__FetchDataExpression__DurationAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFetchDataExpressionAccess().getDurationAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FetchDataExpression__Group__1__Impl"


    // $ANTLR start "rule__FetchDataExpression__Group__2"
    // InternalIoT.g:3664:1: rule__FetchDataExpression__Group__2 : rule__FetchDataExpression__Group__2__Impl ;
    public final void rule__FetchDataExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3668:1: ( rule__FetchDataExpression__Group__2__Impl )
            // InternalIoT.g:3669:2: rule__FetchDataExpression__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FetchDataExpression__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FetchDataExpression__Group__2"


    // $ANTLR start "rule__FetchDataExpression__Group__2__Impl"
    // InternalIoT.g:3675:1: rule__FetchDataExpression__Group__2__Impl : ( ( rule__FetchDataExpression__TimeUnitAssignment_2 ) ) ;
    public final void rule__FetchDataExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3679:1: ( ( ( rule__FetchDataExpression__TimeUnitAssignment_2 ) ) )
            // InternalIoT.g:3680:1: ( ( rule__FetchDataExpression__TimeUnitAssignment_2 ) )
            {
            // InternalIoT.g:3680:1: ( ( rule__FetchDataExpression__TimeUnitAssignment_2 ) )
            // InternalIoT.g:3681:2: ( rule__FetchDataExpression__TimeUnitAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFetchDataExpressionAccess().getTimeUnitAssignment_2()); 
            }
            // InternalIoT.g:3682:2: ( rule__FetchDataExpression__TimeUnitAssignment_2 )
            // InternalIoT.g:3682:3: rule__FetchDataExpression__TimeUnitAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__FetchDataExpression__TimeUnitAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFetchDataExpressionAccess().getTimeUnitAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FetchDataExpression__Group__2__Impl"


    // $ANTLR start "rule__FetchDataCondition__Group__0"
    // InternalIoT.g:3691:1: rule__FetchDataCondition__Group__0 : rule__FetchDataCondition__Group__0__Impl rule__FetchDataCondition__Group__1 ;
    public final void rule__FetchDataCondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3695:1: ( rule__FetchDataCondition__Group__0__Impl rule__FetchDataCondition__Group__1 )
            // InternalIoT.g:3696:2: rule__FetchDataCondition__Group__0__Impl rule__FetchDataCondition__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__FetchDataCondition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FetchDataCondition__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FetchDataCondition__Group__0"


    // $ANTLR start "rule__FetchDataCondition__Group__0__Impl"
    // InternalIoT.g:3703:1: rule__FetchDataCondition__Group__0__Impl : ( 'if' ) ;
    public final void rule__FetchDataCondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3707:1: ( ( 'if' ) )
            // InternalIoT.g:3708:1: ( 'if' )
            {
            // InternalIoT.g:3708:1: ( 'if' )
            // InternalIoT.g:3709:2: 'if'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFetchDataConditionAccess().getIfKeyword_0()); 
            }
            match(input,52,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFetchDataConditionAccess().getIfKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FetchDataCondition__Group__0__Impl"


    // $ANTLR start "rule__FetchDataCondition__Group__1"
    // InternalIoT.g:3718:1: rule__FetchDataCondition__Group__1 : rule__FetchDataCondition__Group__1__Impl rule__FetchDataCondition__Group__2 ;
    public final void rule__FetchDataCondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3722:1: ( rule__FetchDataCondition__Group__1__Impl rule__FetchDataCondition__Group__2 )
            // InternalIoT.g:3723:2: rule__FetchDataCondition__Group__1__Impl rule__FetchDataCondition__Group__2
            {
            pushFollow(FOLLOW_29);
            rule__FetchDataCondition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FetchDataCondition__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FetchDataCondition__Group__1"


    // $ANTLR start "rule__FetchDataCondition__Group__1__Impl"
    // InternalIoT.g:3730:1: rule__FetchDataCondition__Group__1__Impl : ( ( rule__FetchDataCondition__Group_1__0 ) ) ;
    public final void rule__FetchDataCondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3734:1: ( ( ( rule__FetchDataCondition__Group_1__0 ) ) )
            // InternalIoT.g:3735:1: ( ( rule__FetchDataCondition__Group_1__0 ) )
            {
            // InternalIoT.g:3735:1: ( ( rule__FetchDataCondition__Group_1__0 ) )
            // InternalIoT.g:3736:2: ( rule__FetchDataCondition__Group_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFetchDataConditionAccess().getGroup_1()); 
            }
            // InternalIoT.g:3737:2: ( rule__FetchDataCondition__Group_1__0 )
            // InternalIoT.g:3737:3: rule__FetchDataCondition__Group_1__0
            {
            pushFollow(FOLLOW_2);
            rule__FetchDataCondition__Group_1__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFetchDataConditionAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FetchDataCondition__Group__1__Impl"


    // $ANTLR start "rule__FetchDataCondition__Group__2"
    // InternalIoT.g:3745:1: rule__FetchDataCondition__Group__2 : rule__FetchDataCondition__Group__2__Impl ;
    public final void rule__FetchDataCondition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3749:1: ( rule__FetchDataCondition__Group__2__Impl )
            // InternalIoT.g:3750:2: rule__FetchDataCondition__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FetchDataCondition__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FetchDataCondition__Group__2"


    // $ANTLR start "rule__FetchDataCondition__Group__2__Impl"
    // InternalIoT.g:3756:1: rule__FetchDataCondition__Group__2__Impl : ( ( rule__FetchDataCondition__Group_2__0 )? ) ;
    public final void rule__FetchDataCondition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3760:1: ( ( ( rule__FetchDataCondition__Group_2__0 )? ) )
            // InternalIoT.g:3761:1: ( ( rule__FetchDataCondition__Group_2__0 )? )
            {
            // InternalIoT.g:3761:1: ( ( rule__FetchDataCondition__Group_2__0 )? )
            // InternalIoT.g:3762:2: ( rule__FetchDataCondition__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFetchDataConditionAccess().getGroup_2()); 
            }
            // InternalIoT.g:3763:2: ( rule__FetchDataCondition__Group_2__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==53) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalIoT.g:3763:3: rule__FetchDataCondition__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FetchDataCondition__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFetchDataConditionAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FetchDataCondition__Group__2__Impl"


    // $ANTLR start "rule__FetchDataCondition__Group_1__0"
    // InternalIoT.g:3772:1: rule__FetchDataCondition__Group_1__0 : rule__FetchDataCondition__Group_1__0__Impl rule__FetchDataCondition__Group_1__1 ;
    public final void rule__FetchDataCondition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3776:1: ( rule__FetchDataCondition__Group_1__0__Impl rule__FetchDataCondition__Group_1__1 )
            // InternalIoT.g:3777:2: rule__FetchDataCondition__Group_1__0__Impl rule__FetchDataCondition__Group_1__1
            {
            pushFollow(FOLLOW_30);
            rule__FetchDataCondition__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FetchDataCondition__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FetchDataCondition__Group_1__0"


    // $ANTLR start "rule__FetchDataCondition__Group_1__0__Impl"
    // InternalIoT.g:3784:1: rule__FetchDataCondition__Group_1__0__Impl : ( '(' ) ;
    public final void rule__FetchDataCondition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3788:1: ( ( '(' ) )
            // InternalIoT.g:3789:1: ( '(' )
            {
            // InternalIoT.g:3789:1: ( '(' )
            // InternalIoT.g:3790:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFetchDataConditionAccess().getLeftParenthesisKeyword_1_0()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFetchDataConditionAccess().getLeftParenthesisKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FetchDataCondition__Group_1__0__Impl"


    // $ANTLR start "rule__FetchDataCondition__Group_1__1"
    // InternalIoT.g:3799:1: rule__FetchDataCondition__Group_1__1 : rule__FetchDataCondition__Group_1__1__Impl rule__FetchDataCondition__Group_1__2 ;
    public final void rule__FetchDataCondition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3803:1: ( rule__FetchDataCondition__Group_1__1__Impl rule__FetchDataCondition__Group_1__2 )
            // InternalIoT.g:3804:2: rule__FetchDataCondition__Group_1__1__Impl rule__FetchDataCondition__Group_1__2
            {
            pushFollow(FOLLOW_31);
            rule__FetchDataCondition__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FetchDataCondition__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FetchDataCondition__Group_1__1"


    // $ANTLR start "rule__FetchDataCondition__Group_1__1__Impl"
    // InternalIoT.g:3811:1: rule__FetchDataCondition__Group_1__1__Impl : ( ( rule__FetchDataCondition__ConditionAssignment_1_1 ) ) ;
    public final void rule__FetchDataCondition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3815:1: ( ( ( rule__FetchDataCondition__ConditionAssignment_1_1 ) ) )
            // InternalIoT.g:3816:1: ( ( rule__FetchDataCondition__ConditionAssignment_1_1 ) )
            {
            // InternalIoT.g:3816:1: ( ( rule__FetchDataCondition__ConditionAssignment_1_1 ) )
            // InternalIoT.g:3817:2: ( rule__FetchDataCondition__ConditionAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFetchDataConditionAccess().getConditionAssignment_1_1()); 
            }
            // InternalIoT.g:3818:2: ( rule__FetchDataCondition__ConditionAssignment_1_1 )
            // InternalIoT.g:3818:3: rule__FetchDataCondition__ConditionAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__FetchDataCondition__ConditionAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFetchDataConditionAccess().getConditionAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FetchDataCondition__Group_1__1__Impl"


    // $ANTLR start "rule__FetchDataCondition__Group_1__2"
    // InternalIoT.g:3826:1: rule__FetchDataCondition__Group_1__2 : rule__FetchDataCondition__Group_1__2__Impl ;
    public final void rule__FetchDataCondition__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3830:1: ( rule__FetchDataCondition__Group_1__2__Impl )
            // InternalIoT.g:3831:2: rule__FetchDataCondition__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FetchDataCondition__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FetchDataCondition__Group_1__2"


    // $ANTLR start "rule__FetchDataCondition__Group_1__2__Impl"
    // InternalIoT.g:3837:1: rule__FetchDataCondition__Group_1__2__Impl : ( ')' ) ;
    public final void rule__FetchDataCondition__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3841:1: ( ( ')' ) )
            // InternalIoT.g:3842:1: ( ')' )
            {
            // InternalIoT.g:3842:1: ( ')' )
            // InternalIoT.g:3843:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFetchDataConditionAccess().getRightParenthesisKeyword_1_2()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFetchDataConditionAccess().getRightParenthesisKeyword_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FetchDataCondition__Group_1__2__Impl"


    // $ANTLR start "rule__FetchDataCondition__Group_2__0"
    // InternalIoT.g:3853:1: rule__FetchDataCondition__Group_2__0 : rule__FetchDataCondition__Group_2__0__Impl rule__FetchDataCondition__Group_2__1 ;
    public final void rule__FetchDataCondition__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3857:1: ( rule__FetchDataCondition__Group_2__0__Impl rule__FetchDataCondition__Group_2__1 )
            // InternalIoT.g:3858:2: rule__FetchDataCondition__Group_2__0__Impl rule__FetchDataCondition__Group_2__1
            {
            pushFollow(FOLLOW_26);
            rule__FetchDataCondition__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FetchDataCondition__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FetchDataCondition__Group_2__0"


    // $ANTLR start "rule__FetchDataCondition__Group_2__0__Impl"
    // InternalIoT.g:3865:1: rule__FetchDataCondition__Group_2__0__Impl : ( ( 'else' ) ) ;
    public final void rule__FetchDataCondition__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3869:1: ( ( ( 'else' ) ) )
            // InternalIoT.g:3870:1: ( ( 'else' ) )
            {
            // InternalIoT.g:3870:1: ( ( 'else' ) )
            // InternalIoT.g:3871:2: ( 'else' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFetchDataConditionAccess().getElseKeyword_2_0()); 
            }
            // InternalIoT.g:3872:2: ( 'else' )
            // InternalIoT.g:3872:3: 'else'
            {
            match(input,53,FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFetchDataConditionAccess().getElseKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FetchDataCondition__Group_2__0__Impl"


    // $ANTLR start "rule__FetchDataCondition__Group_2__1"
    // InternalIoT.g:3880:1: rule__FetchDataCondition__Group_2__1 : rule__FetchDataCondition__Group_2__1__Impl ;
    public final void rule__FetchDataCondition__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3884:1: ( rule__FetchDataCondition__Group_2__1__Impl )
            // InternalIoT.g:3885:2: rule__FetchDataCondition__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FetchDataCondition__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FetchDataCondition__Group_2__1"


    // $ANTLR start "rule__FetchDataCondition__Group_2__1__Impl"
    // InternalIoT.g:3891:1: rule__FetchDataCondition__Group_2__1__Impl : ( ( rule__FetchDataCondition__ElseAssignment_2_1 ) ) ;
    public final void rule__FetchDataCondition__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3895:1: ( ( ( rule__FetchDataCondition__ElseAssignment_2_1 ) ) )
            // InternalIoT.g:3896:1: ( ( rule__FetchDataCondition__ElseAssignment_2_1 ) )
            {
            // InternalIoT.g:3896:1: ( ( rule__FetchDataCondition__ElseAssignment_2_1 ) )
            // InternalIoT.g:3897:2: ( rule__FetchDataCondition__ElseAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFetchDataConditionAccess().getElseAssignment_2_1()); 
            }
            // InternalIoT.g:3898:2: ( rule__FetchDataCondition__ElseAssignment_2_1 )
            // InternalIoT.g:3898:3: rule__FetchDataCondition__ElseAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__FetchDataCondition__ElseAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFetchDataConditionAccess().getElseAssignment_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FetchDataCondition__Group_2__1__Impl"


    // $ANTLR start "rule__OrCondition__Group__0"
    // InternalIoT.g:3907:1: rule__OrCondition__Group__0 : rule__OrCondition__Group__0__Impl rule__OrCondition__Group__1 ;
    public final void rule__OrCondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3911:1: ( rule__OrCondition__Group__0__Impl rule__OrCondition__Group__1 )
            // InternalIoT.g:3912:2: rule__OrCondition__Group__0__Impl rule__OrCondition__Group__1
            {
            pushFollow(FOLLOW_32);
            rule__OrCondition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__OrCondition__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrCondition__Group__0"


    // $ANTLR start "rule__OrCondition__Group__0__Impl"
    // InternalIoT.g:3919:1: rule__OrCondition__Group__0__Impl : ( ruleAndCondition ) ;
    public final void rule__OrCondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3923:1: ( ( ruleAndCondition ) )
            // InternalIoT.g:3924:1: ( ruleAndCondition )
            {
            // InternalIoT.g:3924:1: ( ruleAndCondition )
            // InternalIoT.g:3925:2: ruleAndCondition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrConditionAccess().getAndConditionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAndCondition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrConditionAccess().getAndConditionParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrCondition__Group__0__Impl"


    // $ANTLR start "rule__OrCondition__Group__1"
    // InternalIoT.g:3934:1: rule__OrCondition__Group__1 : rule__OrCondition__Group__1__Impl ;
    public final void rule__OrCondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3938:1: ( rule__OrCondition__Group__1__Impl )
            // InternalIoT.g:3939:2: rule__OrCondition__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OrCondition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrCondition__Group__1"


    // $ANTLR start "rule__OrCondition__Group__1__Impl"
    // InternalIoT.g:3945:1: rule__OrCondition__Group__1__Impl : ( ( rule__OrCondition__Group_1__0 )* ) ;
    public final void rule__OrCondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3949:1: ( ( ( rule__OrCondition__Group_1__0 )* ) )
            // InternalIoT.g:3950:1: ( ( rule__OrCondition__Group_1__0 )* )
            {
            // InternalIoT.g:3950:1: ( ( rule__OrCondition__Group_1__0 )* )
            // InternalIoT.g:3951:2: ( rule__OrCondition__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrConditionAccess().getGroup_1()); 
            }
            // InternalIoT.g:3952:2: ( rule__OrCondition__Group_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==54) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalIoT.g:3952:3: rule__OrCondition__Group_1__0
            	    {
            	    pushFollow(FOLLOW_33);
            	    rule__OrCondition__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrConditionAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrCondition__Group__1__Impl"


    // $ANTLR start "rule__OrCondition__Group_1__0"
    // InternalIoT.g:3961:1: rule__OrCondition__Group_1__0 : rule__OrCondition__Group_1__0__Impl rule__OrCondition__Group_1__1 ;
    public final void rule__OrCondition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3965:1: ( rule__OrCondition__Group_1__0__Impl rule__OrCondition__Group_1__1 )
            // InternalIoT.g:3966:2: rule__OrCondition__Group_1__0__Impl rule__OrCondition__Group_1__1
            {
            pushFollow(FOLLOW_32);
            rule__OrCondition__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__OrCondition__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrCondition__Group_1__0"


    // $ANTLR start "rule__OrCondition__Group_1__0__Impl"
    // InternalIoT.g:3973:1: rule__OrCondition__Group_1__0__Impl : ( () ) ;
    public final void rule__OrCondition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3977:1: ( ( () ) )
            // InternalIoT.g:3978:1: ( () )
            {
            // InternalIoT.g:3978:1: ( () )
            // InternalIoT.g:3979:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrConditionAccess().getOrConditionLeftAction_1_0()); 
            }
            // InternalIoT.g:3980:2: ()
            // InternalIoT.g:3980:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrConditionAccess().getOrConditionLeftAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrCondition__Group_1__0__Impl"


    // $ANTLR start "rule__OrCondition__Group_1__1"
    // InternalIoT.g:3988:1: rule__OrCondition__Group_1__1 : rule__OrCondition__Group_1__1__Impl rule__OrCondition__Group_1__2 ;
    public final void rule__OrCondition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3992:1: ( rule__OrCondition__Group_1__1__Impl rule__OrCondition__Group_1__2 )
            // InternalIoT.g:3993:2: rule__OrCondition__Group_1__1__Impl rule__OrCondition__Group_1__2
            {
            pushFollow(FOLLOW_30);
            rule__OrCondition__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__OrCondition__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrCondition__Group_1__1"


    // $ANTLR start "rule__OrCondition__Group_1__1__Impl"
    // InternalIoT.g:4000:1: rule__OrCondition__Group_1__1__Impl : ( '||' ) ;
    public final void rule__OrCondition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:4004:1: ( ( '||' ) )
            // InternalIoT.g:4005:1: ( '||' )
            {
            // InternalIoT.g:4005:1: ( '||' )
            // InternalIoT.g:4006:2: '||'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrConditionAccess().getVerticalLineVerticalLineKeyword_1_1()); 
            }
            match(input,54,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrConditionAccess().getVerticalLineVerticalLineKeyword_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrCondition__Group_1__1__Impl"


    // $ANTLR start "rule__OrCondition__Group_1__2"
    // InternalIoT.g:4015:1: rule__OrCondition__Group_1__2 : rule__OrCondition__Group_1__2__Impl ;
    public final void rule__OrCondition__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:4019:1: ( rule__OrCondition__Group_1__2__Impl )
            // InternalIoT.g:4020:2: rule__OrCondition__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OrCondition__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrCondition__Group_1__2"


    // $ANTLR start "rule__OrCondition__Group_1__2__Impl"
    // InternalIoT.g:4026:1: rule__OrCondition__Group_1__2__Impl : ( ( rule__OrCondition__RightAssignment_1_2 ) ) ;
    public final void rule__OrCondition__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:4030:1: ( ( ( rule__OrCondition__RightAssignment_1_2 ) ) )
            // InternalIoT.g:4031:1: ( ( rule__OrCondition__RightAssignment_1_2 ) )
            {
            // InternalIoT.g:4031:1: ( ( rule__OrCondition__RightAssignment_1_2 ) )
            // InternalIoT.g:4032:2: ( rule__OrCondition__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrConditionAccess().getRightAssignment_1_2()); 
            }
            // InternalIoT.g:4033:2: ( rule__OrCondition__RightAssignment_1_2 )
            // InternalIoT.g:4033:3: rule__OrCondition__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__OrCondition__RightAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrConditionAccess().getRightAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrCondition__Group_1__2__Impl"


    // $ANTLR start "rule__AndCondition__Group__0"
    // InternalIoT.g:4042:1: rule__AndCondition__Group__0 : rule__AndCondition__Group__0__Impl rule__AndCondition__Group__1 ;
    public final void rule__AndCondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:4046:1: ( rule__AndCondition__Group__0__Impl rule__AndCondition__Group__1 )
            // InternalIoT.g:4047:2: rule__AndCondition__Group__0__Impl rule__AndCondition__Group__1
            {
            pushFollow(FOLLOW_34);
            rule__AndCondition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AndCondition__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndCondition__Group__0"


    // $ANTLR start "rule__AndCondition__Group__0__Impl"
    // InternalIoT.g:4054:1: rule__AndCondition__Group__0__Impl : ( ruleComparisonCondition ) ;
    public final void rule__AndCondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:4058:1: ( ( ruleComparisonCondition ) )
            // InternalIoT.g:4059:1: ( ruleComparisonCondition )
            {
            // InternalIoT.g:4059:1: ( ruleComparisonCondition )
            // InternalIoT.g:4060:2: ruleComparisonCondition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndConditionAccess().getComparisonConditionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleComparisonCondition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndConditionAccess().getComparisonConditionParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndCondition__Group__0__Impl"


    // $ANTLR start "rule__AndCondition__Group__1"
    // InternalIoT.g:4069:1: rule__AndCondition__Group__1 : rule__AndCondition__Group__1__Impl ;
    public final void rule__AndCondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:4073:1: ( rule__AndCondition__Group__1__Impl )
            // InternalIoT.g:4074:2: rule__AndCondition__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AndCondition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndCondition__Group__1"


    // $ANTLR start "rule__AndCondition__Group__1__Impl"
    // InternalIoT.g:4080:1: rule__AndCondition__Group__1__Impl : ( ( rule__AndCondition__Group_1__0 )* ) ;
    public final void rule__AndCondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:4084:1: ( ( ( rule__AndCondition__Group_1__0 )* ) )
            // InternalIoT.g:4085:1: ( ( rule__AndCondition__Group_1__0 )* )
            {
            // InternalIoT.g:4085:1: ( ( rule__AndCondition__Group_1__0 )* )
            // InternalIoT.g:4086:2: ( rule__AndCondition__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndConditionAccess().getGroup_1()); 
            }
            // InternalIoT.g:4087:2: ( rule__AndCondition__Group_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==55) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalIoT.g:4087:3: rule__AndCondition__Group_1__0
            	    {
            	    pushFollow(FOLLOW_35);
            	    rule__AndCondition__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndConditionAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndCondition__Group__1__Impl"


    // $ANTLR start "rule__AndCondition__Group_1__0"
    // InternalIoT.g:4096:1: rule__AndCondition__Group_1__0 : rule__AndCondition__Group_1__0__Impl rule__AndCondition__Group_1__1 ;
    public final void rule__AndCondition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:4100:1: ( rule__AndCondition__Group_1__0__Impl rule__AndCondition__Group_1__1 )
            // InternalIoT.g:4101:2: rule__AndCondition__Group_1__0__Impl rule__AndCondition__Group_1__1
            {
            pushFollow(FOLLOW_34);
            rule__AndCondition__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AndCondition__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndCondition__Group_1__0"


    // $ANTLR start "rule__AndCondition__Group_1__0__Impl"
    // InternalIoT.g:4108:1: rule__AndCondition__Group_1__0__Impl : ( () ) ;
    public final void rule__AndCondition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:4112:1: ( ( () ) )
            // InternalIoT.g:4113:1: ( () )
            {
            // InternalIoT.g:4113:1: ( () )
            // InternalIoT.g:4114:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndConditionAccess().getAndConditionLeftAction_1_0()); 
            }
            // InternalIoT.g:4115:2: ()
            // InternalIoT.g:4115:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndConditionAccess().getAndConditionLeftAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndCondition__Group_1__0__Impl"


    // $ANTLR start "rule__AndCondition__Group_1__1"
    // InternalIoT.g:4123:1: rule__AndCondition__Group_1__1 : rule__AndCondition__Group_1__1__Impl rule__AndCondition__Group_1__2 ;
    public final void rule__AndCondition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:4127:1: ( rule__AndCondition__Group_1__1__Impl rule__AndCondition__Group_1__2 )
            // InternalIoT.g:4128:2: rule__AndCondition__Group_1__1__Impl rule__AndCondition__Group_1__2
            {
            pushFollow(FOLLOW_30);
            rule__AndCondition__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AndCondition__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndCondition__Group_1__1"


    // $ANTLR start "rule__AndCondition__Group_1__1__Impl"
    // InternalIoT.g:4135:1: rule__AndCondition__Group_1__1__Impl : ( '&&' ) ;
    public final void rule__AndCondition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:4139:1: ( ( '&&' ) )
            // InternalIoT.g:4140:1: ( '&&' )
            {
            // InternalIoT.g:4140:1: ( '&&' )
            // InternalIoT.g:4141:2: '&&'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndConditionAccess().getAmpersandAmpersandKeyword_1_1()); 
            }
            match(input,55,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndConditionAccess().getAmpersandAmpersandKeyword_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndCondition__Group_1__1__Impl"


    // $ANTLR start "rule__AndCondition__Group_1__2"
    // InternalIoT.g:4150:1: rule__AndCondition__Group_1__2 : rule__AndCondition__Group_1__2__Impl ;
    public final void rule__AndCondition__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:4154:1: ( rule__AndCondition__Group_1__2__Impl )
            // InternalIoT.g:4155:2: rule__AndCondition__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AndCondition__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndCondition__Group_1__2"


    // $ANTLR start "rule__AndCondition__Group_1__2__Impl"
    // InternalIoT.g:4161:1: rule__AndCondition__Group_1__2__Impl : ( ( rule__AndCondition__RightAssignment_1_2 ) ) ;
    public final void rule__AndCondition__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:4165:1: ( ( ( rule__AndCondition__RightAssignment_1_2 ) ) )
            // InternalIoT.g:4166:1: ( ( rule__AndCondition__RightAssignment_1_2 ) )
            {
            // InternalIoT.g:4166:1: ( ( rule__AndCondition__RightAssignment_1_2 ) )
            // InternalIoT.g:4167:2: ( rule__AndCondition__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndConditionAccess().getRightAssignment_1_2()); 
            }
            // InternalIoT.g:4168:2: ( rule__AndCondition__RightAssignment_1_2 )
            // InternalIoT.g:4168:3: rule__AndCondition__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__AndCondition__RightAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndConditionAccess().getRightAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndCondition__Group_1__2__Impl"


    // $ANTLR start "rule__ComparisonCondition__Group__0"
    // InternalIoT.g:4177:1: rule__ComparisonCondition__Group__0 : rule__ComparisonCondition__Group__0__Impl rule__ComparisonCondition__Group__1 ;
    public final void rule__ComparisonCondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:4181:1: ( rule__ComparisonCondition__Group__0__Impl rule__ComparisonCondition__Group__1 )
            // InternalIoT.g:4182:2: rule__ComparisonCondition__Group__0__Impl rule__ComparisonCondition__Group__1
            {
            pushFollow(FOLLOW_36);
            rule__ComparisonCondition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ComparisonCondition__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonCondition__Group__0"


    // $ANTLR start "rule__ComparisonCondition__Group__0__Impl"
    // InternalIoT.g:4189:1: rule__ComparisonCondition__Group__0__Impl : ( rulePrimaryCondition ) ;
    public final void rule__ComparisonCondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:4193:1: ( ( rulePrimaryCondition ) )
            // InternalIoT.g:4194:1: ( rulePrimaryCondition )
            {
            // InternalIoT.g:4194:1: ( rulePrimaryCondition )
            // InternalIoT.g:4195:2: rulePrimaryCondition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonConditionAccess().getPrimaryConditionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePrimaryCondition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonConditionAccess().getPrimaryConditionParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonCondition__Group__0__Impl"


    // $ANTLR start "rule__ComparisonCondition__Group__1"
    // InternalIoT.g:4204:1: rule__ComparisonCondition__Group__1 : rule__ComparisonCondition__Group__1__Impl ;
    public final void rule__ComparisonCondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:4208:1: ( rule__ComparisonCondition__Group__1__Impl )
            // InternalIoT.g:4209:2: rule__ComparisonCondition__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComparisonCondition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonCondition__Group__1"


    // $ANTLR start "rule__ComparisonCondition__Group__1__Impl"
    // InternalIoT.g:4215:1: rule__ComparisonCondition__Group__1__Impl : ( ( rule__ComparisonCondition__Group_1__0 )* ) ;
    public final void rule__ComparisonCondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:4219:1: ( ( ( rule__ComparisonCondition__Group_1__0 )* ) )
            // InternalIoT.g:4220:1: ( ( rule__ComparisonCondition__Group_1__0 )* )
            {
            // InternalIoT.g:4220:1: ( ( rule__ComparisonCondition__Group_1__0 )* )
            // InternalIoT.g:4221:2: ( rule__ComparisonCondition__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonConditionAccess().getGroup_1()); 
            }
            // InternalIoT.g:4222:2: ( rule__ComparisonCondition__Group_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=15 && LA22_0<=19)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalIoT.g:4222:3: rule__ComparisonCondition__Group_1__0
            	    {
            	    pushFollow(FOLLOW_37);
            	    rule__ComparisonCondition__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonConditionAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonCondition__Group__1__Impl"


    // $ANTLR start "rule__ComparisonCondition__Group_1__0"
    // InternalIoT.g:4231:1: rule__ComparisonCondition__Group_1__0 : rule__ComparisonCondition__Group_1__0__Impl rule__ComparisonCondition__Group_1__1 ;
    public final void rule__ComparisonCondition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:4235:1: ( rule__ComparisonCondition__Group_1__0__Impl rule__ComparisonCondition__Group_1__1 )
            // InternalIoT.g:4236:2: rule__ComparisonCondition__Group_1__0__Impl rule__ComparisonCondition__Group_1__1
            {
            pushFollow(FOLLOW_36);
            rule__ComparisonCondition__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ComparisonCondition__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonCondition__Group_1__0"


    // $ANTLR start "rule__ComparisonCondition__Group_1__0__Impl"
    // InternalIoT.g:4243:1: rule__ComparisonCondition__Group_1__0__Impl : ( () ) ;
    public final void rule__ComparisonCondition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:4247:1: ( ( () ) )
            // InternalIoT.g:4248:1: ( () )
            {
            // InternalIoT.g:4248:1: ( () )
            // InternalIoT.g:4249:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonConditionAccess().getComparisonConditionLeftAction_1_0()); 
            }
            // InternalIoT.g:4250:2: ()
            // InternalIoT.g:4250:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonConditionAccess().getComparisonConditionLeftAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonCondition__Group_1__0__Impl"


    // $ANTLR start "rule__ComparisonCondition__Group_1__1"
    // InternalIoT.g:4258:1: rule__ComparisonCondition__Group_1__1 : rule__ComparisonCondition__Group_1__1__Impl rule__ComparisonCondition__Group_1__2 ;
    public final void rule__ComparisonCondition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:4262:1: ( rule__ComparisonCondition__Group_1__1__Impl rule__ComparisonCondition__Group_1__2 )
            // InternalIoT.g:4263:2: rule__ComparisonCondition__Group_1__1__Impl rule__ComparisonCondition__Group_1__2
            {
            pushFollow(FOLLOW_30);
            rule__ComparisonCondition__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ComparisonCondition__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonCondition__Group_1__1"


    // $ANTLR start "rule__ComparisonCondition__Group_1__1__Impl"
    // InternalIoT.g:4270:1: rule__ComparisonCondition__Group_1__1__Impl : ( ( rule__ComparisonCondition__OperatorAssignment_1_1 ) ) ;
    public final void rule__ComparisonCondition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:4274:1: ( ( ( rule__ComparisonCondition__OperatorAssignment_1_1 ) ) )
            // InternalIoT.g:4275:1: ( ( rule__ComparisonCondition__OperatorAssignment_1_1 ) )
            {
            // InternalIoT.g:4275:1: ( ( rule__ComparisonCondition__OperatorAssignment_1_1 ) )
            // InternalIoT.g:4276:2: ( rule__ComparisonCondition__OperatorAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonConditionAccess().getOperatorAssignment_1_1()); 
            }
            // InternalIoT.g:4277:2: ( rule__ComparisonCondition__OperatorAssignment_1_1 )
            // InternalIoT.g:4277:3: rule__ComparisonCondition__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ComparisonCondition__OperatorAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonConditionAccess().getOperatorAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonCondition__Group_1__1__Impl"


    // $ANTLR start "rule__ComparisonCondition__Group_1__2"
    // InternalIoT.g:4285:1: rule__ComparisonCondition__Group_1__2 : rule__ComparisonCondition__Group_1__2__Impl ;
    public final void rule__ComparisonCondition__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:4289:1: ( rule__ComparisonCondition__Group_1__2__Impl )
            // InternalIoT.g:4290:2: rule__ComparisonCondition__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComparisonCondition__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonCondition__Group_1__2"


    // $ANTLR start "rule__ComparisonCondition__Group_1__2__Impl"
    // InternalIoT.g:4296:1: rule__ComparisonCondition__Group_1__2__Impl : ( ( rule__ComparisonCondition__RightAssignment_1_2 ) ) ;
    public final void rule__ComparisonCondition__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:4300:1: ( ( ( rule__ComparisonCondition__RightAssignment_1_2 ) ) )
            // InternalIoT.g:4301:1: ( ( rule__ComparisonCondition__RightAssignment_1_2 ) )
            {
            // InternalIoT.g:4301:1: ( ( rule__ComparisonCondition__RightAssignment_1_2 ) )
            // InternalIoT.g:4302:2: ( rule__ComparisonCondition__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonConditionAccess().getRightAssignment_1_2()); 
            }
            // InternalIoT.g:4303:2: ( rule__ComparisonCondition__RightAssignment_1_2 )
            // InternalIoT.g:4303:3: rule__ComparisonCondition__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__ComparisonCondition__RightAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonConditionAccess().getRightAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonCondition__Group_1__2__Impl"


    // $ANTLR start "rule__PrimaryCondition__Group_0__0"
    // InternalIoT.g:4312:1: rule__PrimaryCondition__Group_0__0 : rule__PrimaryCondition__Group_0__0__Impl rule__PrimaryCondition__Group_0__1 ;
    public final void rule__PrimaryCondition__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:4316:1: ( rule__PrimaryCondition__Group_0__0__Impl rule__PrimaryCondition__Group_0__1 )
            // InternalIoT.g:4317:2: rule__PrimaryCondition__Group_0__0__Impl rule__PrimaryCondition__Group_0__1
            {
            pushFollow(FOLLOW_30);
            rule__PrimaryCondition__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PrimaryCondition__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryCondition__Group_0__0"


    // $ANTLR start "rule__PrimaryCondition__Group_0__0__Impl"
    // InternalIoT.g:4324:1: rule__PrimaryCondition__Group_0__0__Impl : ( '(' ) ;
    public final void rule__PrimaryCondition__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:4328:1: ( ( '(' ) )
            // InternalIoT.g:4329:1: ( '(' )
            {
            // InternalIoT.g:4329:1: ( '(' )
            // InternalIoT.g:4330:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryConditionAccess().getLeftParenthesisKeyword_0_0()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryConditionAccess().getLeftParenthesisKeyword_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryCondition__Group_0__0__Impl"


    // $ANTLR start "rule__PrimaryCondition__Group_0__1"
    // InternalIoT.g:4339:1: rule__PrimaryCondition__Group_0__1 : rule__PrimaryCondition__Group_0__1__Impl rule__PrimaryCondition__Group_0__2 ;
    public final void rule__PrimaryCondition__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:4343:1: ( rule__PrimaryCondition__Group_0__1__Impl rule__PrimaryCondition__Group_0__2 )
            // InternalIoT.g:4344:2: rule__PrimaryCondition__Group_0__1__Impl rule__PrimaryCondition__Group_0__2
            {
            pushFollow(FOLLOW_31);
            rule__PrimaryCondition__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PrimaryCondition__Group_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryCondition__Group_0__1"


    // $ANTLR start "rule__PrimaryCondition__Group_0__1__Impl"
    // InternalIoT.g:4351:1: rule__PrimaryCondition__Group_0__1__Impl : ( ruleCondition ) ;
    public final void rule__PrimaryCondition__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:4355:1: ( ( ruleCondition ) )
            // InternalIoT.g:4356:1: ( ruleCondition )
            {
            // InternalIoT.g:4356:1: ( ruleCondition )
            // InternalIoT.g:4357:2: ruleCondition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryConditionAccess().getConditionParserRuleCall_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryConditionAccess().getConditionParserRuleCall_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryCondition__Group_0__1__Impl"


    // $ANTLR start "rule__PrimaryCondition__Group_0__2"
    // InternalIoT.g:4366:1: rule__PrimaryCondition__Group_0__2 : rule__PrimaryCondition__Group_0__2__Impl ;
    public final void rule__PrimaryCondition__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:4370:1: ( rule__PrimaryCondition__Group_0__2__Impl )
            // InternalIoT.g:4371:2: rule__PrimaryCondition__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryCondition__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryCondition__Group_0__2"


    // $ANTLR start "rule__PrimaryCondition__Group_0__2__Impl"
    // InternalIoT.g:4377:1: rule__PrimaryCondition__Group_0__2__Impl : ( ')' ) ;
    public final void rule__PrimaryCondition__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:4381:1: ( ( ')' ) )
            // InternalIoT.g:4382:1: ( ')' )
            {
            // InternalIoT.g:4382:1: ( ')' )
            // InternalIoT.g:4383:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryConditionAccess().getRightParenthesisKeyword_0_2()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryConditionAccess().getRightParenthesisKeyword_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryCondition__Group_0__2__Impl"


    // $ANTLR start "rule__LiteralBoolean__Group_0__0"
    // InternalIoT.g:4393:1: rule__LiteralBoolean__Group_0__0 : rule__LiteralBoolean__Group_0__0__Impl rule__LiteralBoolean__Group_0__1 ;
    public final void rule__LiteralBoolean__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:4397:1: ( rule__LiteralBoolean__Group_0__0__Impl rule__LiteralBoolean__Group_0__1 )
            // InternalIoT.g:4398:2: rule__LiteralBoolean__Group_0__0__Impl rule__LiteralBoolean__Group_0__1
            {
            pushFollow(FOLLOW_38);
            rule__LiteralBoolean__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LiteralBoolean__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiteralBoolean__Group_0__0"


    // $ANTLR start "rule__LiteralBoolean__Group_0__0__Impl"
    // InternalIoT.g:4405:1: rule__LiteralBoolean__Group_0__0__Impl : ( () ) ;
    public final void rule__LiteralBoolean__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:4409:1: ( ( () ) )
            // InternalIoT.g:4410:1: ( () )
            {
            // InternalIoT.g:4410:1: ( () )
            // InternalIoT.g:4411:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralBooleanAccess().getLiteralBoolAction_0_0()); 
            }
            // InternalIoT.g:4412:2: ()
            // InternalIoT.g:4412:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralBooleanAccess().getLiteralBoolAction_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiteralBoolean__Group_0__0__Impl"


    // $ANTLR start "rule__LiteralBoolean__Group_0__1"
    // InternalIoT.g:4420:1: rule__LiteralBoolean__Group_0__1 : rule__LiteralBoolean__Group_0__1__Impl ;
    public final void rule__LiteralBoolean__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:4424:1: ( rule__LiteralBoolean__Group_0__1__Impl )
            // InternalIoT.g:4425:2: rule__LiteralBoolean__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LiteralBoolean__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiteralBoolean__Group_0__1"


    // $ANTLR start "rule__LiteralBoolean__Group_0__1__Impl"
    // InternalIoT.g:4431:1: rule__LiteralBoolean__Group_0__1__Impl : ( ( rule__LiteralBoolean__ValueAssignment_0_1 ) ) ;
    public final void rule__LiteralBoolean__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:4435:1: ( ( ( rule__LiteralBoolean__ValueAssignment_0_1 ) ) )
            // InternalIoT.g:4436:1: ( ( rule__LiteralBoolean__ValueAssignment_0_1 ) )
            {
            // InternalIoT.g:4436:1: ( ( rule__LiteralBoolean__ValueAssignment_0_1 ) )
            // InternalIoT.g:4437:2: ( rule__LiteralBoolean__ValueAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralBooleanAccess().getValueAssignment_0_1()); 
            }
            // InternalIoT.g:4438:2: ( rule__LiteralBoolean__ValueAssignment_0_1 )
            // InternalIoT.g:4438:3: rule__LiteralBoolean__ValueAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__LiteralBoolean__ValueAssignment_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralBooleanAccess().getValueAssignment_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiteralBoolean__Group_0__1__Impl"


    // $ANTLR start "rule__LiteralBoolean__Group_1__0"
    // InternalIoT.g:4447:1: rule__LiteralBoolean__Group_1__0 : rule__LiteralBoolean__Group_1__0__Impl rule__LiteralBoolean__Group_1__1 ;
    public final void rule__LiteralBoolean__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:4451:1: ( rule__LiteralBoolean__Group_1__0__Impl rule__LiteralBoolean__Group_1__1 )
            // InternalIoT.g:4452:2: rule__LiteralBoolean__Group_1__0__Impl rule__LiteralBoolean__Group_1__1
            {
            pushFollow(FOLLOW_39);
            rule__LiteralBoolean__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LiteralBoolean__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiteralBoolean__Group_1__0"


    // $ANTLR start "rule__LiteralBoolean__Group_1__0__Impl"
    // InternalIoT.g:4459:1: rule__LiteralBoolean__Group_1__0__Impl : ( () ) ;
    public final void rule__LiteralBoolean__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:4463:1: ( ( () ) )
            // InternalIoT.g:4464:1: ( () )
            {
            // InternalIoT.g:4464:1: ( () )
            // InternalIoT.g:4465:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralBooleanAccess().getLiteralBoolAction_1_0()); 
            }
            // InternalIoT.g:4466:2: ()
            // InternalIoT.g:4466:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralBooleanAccess().getLiteralBoolAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiteralBoolean__Group_1__0__Impl"


    // $ANTLR start "rule__LiteralBoolean__Group_1__1"
    // InternalIoT.g:4474:1: rule__LiteralBoolean__Group_1__1 : rule__LiteralBoolean__Group_1__1__Impl ;
    public final void rule__LiteralBoolean__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:4478:1: ( rule__LiteralBoolean__Group_1__1__Impl )
            // InternalIoT.g:4479:2: rule__LiteralBoolean__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LiteralBoolean__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiteralBoolean__Group_1__1"


    // $ANTLR start "rule__LiteralBoolean__Group_1__1__Impl"
    // InternalIoT.g:4485:1: rule__LiteralBoolean__Group_1__1__Impl : ( ( rule__LiteralBoolean__ValueAssignment_1_1 ) ) ;
    public final void rule__LiteralBoolean__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:4489:1: ( ( ( rule__LiteralBoolean__ValueAssignment_1_1 ) ) )
            // InternalIoT.g:4490:1: ( ( rule__LiteralBoolean__ValueAssignment_1_1 ) )
            {
            // InternalIoT.g:4490:1: ( ( rule__LiteralBoolean__ValueAssignment_1_1 ) )
            // InternalIoT.g:4491:2: ( rule__LiteralBoolean__ValueAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralBooleanAccess().getValueAssignment_1_1()); 
            }
            // InternalIoT.g:4492:2: ( rule__LiteralBoolean__ValueAssignment_1_1 )
            // InternalIoT.g:4492:3: rule__LiteralBoolean__ValueAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__LiteralBoolean__ValueAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralBooleanAccess().getValueAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiteralBoolean__Group_1__1__Impl"


    // $ANTLR start "rule__LiteralInteger__Group__0"
    // InternalIoT.g:4501:1: rule__LiteralInteger__Group__0 : rule__LiteralInteger__Group__0__Impl rule__LiteralInteger__Group__1 ;
    public final void rule__LiteralInteger__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:4505:1: ( rule__LiteralInteger__Group__0__Impl rule__LiteralInteger__Group__1 )
            // InternalIoT.g:4506:2: rule__LiteralInteger__Group__0__Impl rule__LiteralInteger__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__LiteralInteger__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LiteralInteger__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiteralInteger__Group__0"


    // $ANTLR start "rule__LiteralInteger__Group__0__Impl"
    // InternalIoT.g:4513:1: rule__LiteralInteger__Group__0__Impl : ( () ) ;
    public final void rule__LiteralInteger__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:4517:1: ( ( () ) )
            // InternalIoT.g:4518:1: ( () )
            {
            // InternalIoT.g:4518:1: ( () )
            // InternalIoT.g:4519:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralIntegerAccess().getLiteralNumberAction_0()); 
            }
            // InternalIoT.g:4520:2: ()
            // InternalIoT.g:4520:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralIntegerAccess().getLiteralNumberAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiteralInteger__Group__0__Impl"


    // $ANTLR start "rule__LiteralInteger__Group__1"
    // InternalIoT.g:4528:1: rule__LiteralInteger__Group__1 : rule__LiteralInteger__Group__1__Impl ;
    public final void rule__LiteralInteger__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:4532:1: ( rule__LiteralInteger__Group__1__Impl )
            // InternalIoT.g:4533:2: rule__LiteralInteger__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LiteralInteger__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiteralInteger__Group__1"


    // $ANTLR start "rule__LiteralInteger__Group__1__Impl"
    // InternalIoT.g:4539:1: rule__LiteralInteger__Group__1__Impl : ( ( rule__LiteralInteger__ValueAssignment_1 ) ) ;
    public final void rule__LiteralInteger__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:4543:1: ( ( ( rule__LiteralInteger__ValueAssignment_1 ) ) )
            // InternalIoT.g:4544:1: ( ( rule__LiteralInteger__ValueAssignment_1 ) )
            {
            // InternalIoT.g:4544:1: ( ( rule__LiteralInteger__ValueAssignment_1 ) )
            // InternalIoT.g:4545:2: ( rule__LiteralInteger__ValueAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralIntegerAccess().getValueAssignment_1()); 
            }
            // InternalIoT.g:4546:2: ( rule__LiteralInteger__ValueAssignment_1 )
            // InternalIoT.g:4546:3: rule__LiteralInteger__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__LiteralInteger__ValueAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralIntegerAccess().getValueAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiteralInteger__Group__1__Impl"


    // $ANTLR start "rule__Ip__Group__0"
    // InternalIoT.g:4555:1: rule__Ip__Group__0 : rule__Ip__Group__0__Impl rule__Ip__Group__1 ;
    public final void rule__Ip__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:4559:1: ( rule__Ip__Group__0__Impl rule__Ip__Group__1 )
            // InternalIoT.g:4560:2: rule__Ip__Group__0__Impl rule__Ip__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__Ip__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Ip__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ip__Group__0"


    // $ANTLR start "rule__Ip__Group__0__Impl"
    // InternalIoT.g:4567:1: rule__Ip__Group__0__Impl : ( () ) ;
    public final void rule__Ip__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:4571:1: ( ( () ) )
            // InternalIoT.g:4572:1: ( () )
            {
            // InternalIoT.g:4572:1: ( () )
            // InternalIoT.g:4573:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIpAccess().getIpAction_0()); 
            }
            // InternalIoT.g:4574:2: ()
            // InternalIoT.g:4574:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIpAccess().getIpAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ip__Group__0__Impl"


    // $ANTLR start "rule__Ip__Group__1"
    // InternalIoT.g:4582:1: rule__Ip__Group__1 : rule__Ip__Group__1__Impl rule__Ip__Group__2 ;
    public final void rule__Ip__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:4586:1: ( rule__Ip__Group__1__Impl rule__Ip__Group__2 )
            // InternalIoT.g:4587:2: rule__Ip__Group__1__Impl rule__Ip__Group__2
            {
            pushFollow(FOLLOW_40);
            rule__Ip__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Ip__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ip__Group__1"


    // $ANTLR start "rule__Ip__Group__1__Impl"
    // InternalIoT.g:4594:1: rule__Ip__Group__1__Impl : ( ( rule__Ip__IpAssignment_1 ) ) ;
    public final void rule__Ip__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:4598:1: ( ( ( rule__Ip__IpAssignment_1 ) ) )
            // InternalIoT.g:4599:1: ( ( rule__Ip__IpAssignment_1 ) )
            {
            // InternalIoT.g:4599:1: ( ( rule__Ip__IpAssignment_1 ) )
            // InternalIoT.g:4600:2: ( rule__Ip__IpAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIpAccess().getIpAssignment_1()); 
            }
            // InternalIoT.g:4601:2: ( rule__Ip__IpAssignment_1 )
            // InternalIoT.g:4601:3: rule__Ip__IpAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Ip__IpAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIpAccess().getIpAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ip__Group__1__Impl"


    // $ANTLR start "rule__Ip__Group__2"
    // InternalIoT.g:4609:1: rule__Ip__Group__2 : rule__Ip__Group__2__Impl rule__Ip__Group__3 ;
    public final void rule__Ip__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:4613:1: ( rule__Ip__Group__2__Impl rule__Ip__Group__3 )
            // InternalIoT.g:4614:2: rule__Ip__Group__2__Impl rule__Ip__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__Ip__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Ip__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ip__Group__2"


    // $ANTLR start "rule__Ip__Group__2__Impl"
    // InternalIoT.g:4621:1: rule__Ip__Group__2__Impl : ( '.' ) ;
    public final void rule__Ip__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:4625:1: ( ( '.' ) )
            // InternalIoT.g:4626:1: ( '.' )
            {
            // InternalIoT.g:4626:1: ( '.' )
            // InternalIoT.g:4627:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIpAccess().getFullStopKeyword_2()); 
            }
            match(input,56,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIpAccess().getFullStopKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ip__Group__2__Impl"


    // $ANTLR start "rule__Ip__Group__3"
    // InternalIoT.g:4636:1: rule__Ip__Group__3 : rule__Ip__Group__3__Impl rule__Ip__Group__4 ;
    public final void rule__Ip__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:4640:1: ( rule__Ip__Group__3__Impl rule__Ip__Group__4 )
            // InternalIoT.g:4641:2: rule__Ip__Group__3__Impl rule__Ip__Group__4
            {
            pushFollow(FOLLOW_40);
            rule__Ip__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Ip__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ip__Group__3"


    // $ANTLR start "rule__Ip__Group__3__Impl"
    // InternalIoT.g:4648:1: rule__Ip__Group__3__Impl : ( ( rule__Ip__IpAssignment_3 ) ) ;
    public final void rule__Ip__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:4652:1: ( ( ( rule__Ip__IpAssignment_3 ) ) )
            // InternalIoT.g:4653:1: ( ( rule__Ip__IpAssignment_3 ) )
            {
            // InternalIoT.g:4653:1: ( ( rule__Ip__IpAssignment_3 ) )
            // InternalIoT.g:4654:2: ( rule__Ip__IpAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIpAccess().getIpAssignment_3()); 
            }
            // InternalIoT.g:4655:2: ( rule__Ip__IpAssignment_3 )
            // InternalIoT.g:4655:3: rule__Ip__IpAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Ip__IpAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIpAccess().getIpAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ip__Group__3__Impl"


    // $ANTLR start "rule__Ip__Group__4"
    // InternalIoT.g:4663:1: rule__Ip__Group__4 : rule__Ip__Group__4__Impl rule__Ip__Group__5 ;
    public final void rule__Ip__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:4667:1: ( rule__Ip__Group__4__Impl rule__Ip__Group__5 )
            // InternalIoT.g:4668:2: rule__Ip__Group__4__Impl rule__Ip__Group__5
            {
            pushFollow(FOLLOW_17);
            rule__Ip__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Ip__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ip__Group__4"


    // $ANTLR start "rule__Ip__Group__4__Impl"
    // InternalIoT.g:4675:1: rule__Ip__Group__4__Impl : ( '.' ) ;
    public final void rule__Ip__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:4679:1: ( ( '.' ) )
            // InternalIoT.g:4680:1: ( '.' )
            {
            // InternalIoT.g:4680:1: ( '.' )
            // InternalIoT.g:4681:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIpAccess().getFullStopKeyword_4()); 
            }
            match(input,56,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIpAccess().getFullStopKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ip__Group__4__Impl"


    // $ANTLR start "rule__Ip__Group__5"
    // InternalIoT.g:4690:1: rule__Ip__Group__5 : rule__Ip__Group__5__Impl rule__Ip__Group__6 ;
    public final void rule__Ip__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:4694:1: ( rule__Ip__Group__5__Impl rule__Ip__Group__6 )
            // InternalIoT.g:4695:2: rule__Ip__Group__5__Impl rule__Ip__Group__6
            {
            pushFollow(FOLLOW_40);
            rule__Ip__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Ip__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ip__Group__5"


    // $ANTLR start "rule__Ip__Group__5__Impl"
    // InternalIoT.g:4702:1: rule__Ip__Group__5__Impl : ( ( rule__Ip__IpAssignment_5 ) ) ;
    public final void rule__Ip__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:4706:1: ( ( ( rule__Ip__IpAssignment_5 ) ) )
            // InternalIoT.g:4707:1: ( ( rule__Ip__IpAssignment_5 ) )
            {
            // InternalIoT.g:4707:1: ( ( rule__Ip__IpAssignment_5 ) )
            // InternalIoT.g:4708:2: ( rule__Ip__IpAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIpAccess().getIpAssignment_5()); 
            }
            // InternalIoT.g:4709:2: ( rule__Ip__IpAssignment_5 )
            // InternalIoT.g:4709:3: rule__Ip__IpAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Ip__IpAssignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIpAccess().getIpAssignment_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ip__Group__5__Impl"


    // $ANTLR start "rule__Ip__Group__6"
    // InternalIoT.g:4717:1: rule__Ip__Group__6 : rule__Ip__Group__6__Impl rule__Ip__Group__7 ;
    public final void rule__Ip__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:4721:1: ( rule__Ip__Group__6__Impl rule__Ip__Group__7 )
            // InternalIoT.g:4722:2: rule__Ip__Group__6__Impl rule__Ip__Group__7
            {
            pushFollow(FOLLOW_17);
            rule__Ip__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Ip__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ip__Group__6"


    // $ANTLR start "rule__Ip__Group__6__Impl"
    // InternalIoT.g:4729:1: rule__Ip__Group__6__Impl : ( '.' ) ;
    public final void rule__Ip__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:4733:1: ( ( '.' ) )
            // InternalIoT.g:4734:1: ( '.' )
            {
            // InternalIoT.g:4734:1: ( '.' )
            // InternalIoT.g:4735:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIpAccess().getFullStopKeyword_6()); 
            }
            match(input,56,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIpAccess().getFullStopKeyword_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ip__Group__6__Impl"


    // $ANTLR start "rule__Ip__Group__7"
    // InternalIoT.g:4744:1: rule__Ip__Group__7 : rule__Ip__Group__7__Impl ;
    public final void rule__Ip__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:4748:1: ( rule__Ip__Group__7__Impl )
            // InternalIoT.g:4749:2: rule__Ip__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Ip__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ip__Group__7"


    // $ANTLR start "rule__Ip__Group__7__Impl"
    // InternalIoT.g:4755:1: rule__Ip__Group__7__Impl : ( ( rule__Ip__IpAssignment_7 ) ) ;
    public final void rule__Ip__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:4759:1: ( ( ( rule__Ip__IpAssignment_7 ) ) )
            // InternalIoT.g:4760:1: ( ( rule__Ip__IpAssignment_7 ) )
            {
            // InternalIoT.g:4760:1: ( ( rule__Ip__IpAssignment_7 ) )
            // InternalIoT.g:4761:2: ( rule__Ip__IpAssignment_7 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIpAccess().getIpAssignment_7()); 
            }
            // InternalIoT.g:4762:2: ( rule__Ip__IpAssignment_7 )
            // InternalIoT.g:4762:3: rule__Ip__IpAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Ip__IpAssignment_7();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIpAccess().getIpAssignment_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ip__Group__7__Impl"


    // $ANTLR start "rule__Portnumber__Group__0"
    // InternalIoT.g:4771:1: rule__Portnumber__Group__0 : rule__Portnumber__Group__0__Impl rule__Portnumber__Group__1 ;
    public final void rule__Portnumber__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:4775:1: ( rule__Portnumber__Group__0__Impl rule__Portnumber__Group__1 )
            // InternalIoT.g:4776:2: rule__Portnumber__Group__0__Impl rule__Portnumber__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__Portnumber__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Portnumber__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Portnumber__Group__0"


    // $ANTLR start "rule__Portnumber__Group__0__Impl"
    // InternalIoT.g:4783:1: rule__Portnumber__Group__0__Impl : ( () ) ;
    public final void rule__Portnumber__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:4787:1: ( ( () ) )
            // InternalIoT.g:4788:1: ( () )
            {
            // InternalIoT.g:4788:1: ( () )
            // InternalIoT.g:4789:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPortnumberAccess().getPortnumberAction_0()); 
            }
            // InternalIoT.g:4790:2: ()
            // InternalIoT.g:4790:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPortnumberAccess().getPortnumberAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Portnumber__Group__0__Impl"


    // $ANTLR start "rule__Portnumber__Group__1"
    // InternalIoT.g:4798:1: rule__Portnumber__Group__1 : rule__Portnumber__Group__1__Impl ;
    public final void rule__Portnumber__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:4802:1: ( rule__Portnumber__Group__1__Impl )
            // InternalIoT.g:4803:2: rule__Portnumber__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Portnumber__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Portnumber__Group__1"


    // $ANTLR start "rule__Portnumber__Group__1__Impl"
    // InternalIoT.g:4809:1: rule__Portnumber__Group__1__Impl : ( ( rule__Portnumber__NumberAssignment_1 ) ) ;
    public final void rule__Portnumber__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:4813:1: ( ( ( rule__Portnumber__NumberAssignment_1 ) ) )
            // InternalIoT.g:4814:1: ( ( rule__Portnumber__NumberAssignment_1 ) )
            {
            // InternalIoT.g:4814:1: ( ( rule__Portnumber__NumberAssignment_1 ) )
            // InternalIoT.g:4815:2: ( rule__Portnumber__NumberAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPortnumberAccess().getNumberAssignment_1()); 
            }
            // InternalIoT.g:4816:2: ( rule__Portnumber__NumberAssignment_1 )
            // InternalIoT.g:4816:3: rule__Portnumber__NumberAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Portnumber__NumberAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPortnumberAccess().getNumberAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Portnumber__Group__1__Impl"


    // $ANTLR start "rule__System__SystemAssignment"
    // InternalIoT.g:4825:1: rule__System__SystemAssignment : ( ( rule__System__SystemAlternatives_0 ) ) ;
    public final void rule__System__SystemAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:4829:1: ( ( ( rule__System__SystemAlternatives_0 ) ) )
            // InternalIoT.g:4830:2: ( ( rule__System__SystemAlternatives_0 ) )
            {
            // InternalIoT.g:4830:2: ( ( rule__System__SystemAlternatives_0 ) )
            // InternalIoT.g:4831:3: ( rule__System__SystemAlternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemAccess().getSystemAlternatives_0()); 
            }
            // InternalIoT.g:4832:3: ( rule__System__SystemAlternatives_0 )
            // InternalIoT.g:4832:4: rule__System__SystemAlternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__System__SystemAlternatives_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSystemAccess().getSystemAlternatives_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__SystemAssignment"


    // $ANTLR start "rule__SensorType__NameAssignment"
    // InternalIoT.g:4840:1: rule__SensorType__NameAssignment : ( RULE_ID ) ;
    public final void rule__SensorType__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:4844:1: ( ( RULE_ID ) )
            // InternalIoT.g:4845:2: ( RULE_ID )
            {
            // InternalIoT.g:4845:2: ( RULE_ID )
            // InternalIoT.g:4846:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSensorTypeAccess().getNameIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSensorTypeAccess().getNameIDTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorType__NameAssignment"


    // $ANTLR start "rule__SensorTypes__TypesAssignment_1"
    // InternalIoT.g:4855:1: rule__SensorTypes__TypesAssignment_1 : ( ruleSensorType ) ;
    public final void rule__SensorTypes__TypesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:4859:1: ( ( ruleSensorType ) )
            // InternalIoT.g:4860:2: ( ruleSensorType )
            {
            // InternalIoT.g:4860:2: ( ruleSensorType )
            // InternalIoT.g:4861:3: ruleSensorType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSensorTypesAccess().getTypesSensorTypeParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSensorType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSensorTypesAccess().getTypesSensorTypeParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorTypes__TypesAssignment_1"


    // $ANTLR start "rule__SensorTypes__TypesAssignment_2_1"
    // InternalIoT.g:4870:1: rule__SensorTypes__TypesAssignment_2_1 : ( ruleSensorType ) ;
    public final void rule__SensorTypes__TypesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:4874:1: ( ( ruleSensorType ) )
            // InternalIoT.g:4875:2: ( ruleSensorType )
            {
            // InternalIoT.g:4875:2: ( ruleSensorType )
            // InternalIoT.g:4876:3: ruleSensorType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSensorTypesAccess().getTypesSensorTypeParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSensorType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSensorTypesAccess().getTypesSensorTypeParserRuleCall_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorTypes__TypesAssignment_2_1"


    // $ANTLR start "rule__Sensor__NameAssignment_1"
    // InternalIoT.g:4885:1: rule__Sensor__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Sensor__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:4889:1: ( ( RULE_ID ) )
            // InternalIoT.g:4890:2: ( RULE_ID )
            {
            // InternalIoT.g:4890:2: ( RULE_ID )
            // InternalIoT.g:4891:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSensorAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSensorAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__NameAssignment_1"


    // $ANTLR start "rule__Sensor__TypeAssignment_4"
    // InternalIoT.g:4900:1: rule__Sensor__TypeAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Sensor__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:4904:1: ( ( ( RULE_ID ) ) )
            // InternalIoT.g:4905:2: ( ( RULE_ID ) )
            {
            // InternalIoT.g:4905:2: ( ( RULE_ID ) )
            // InternalIoT.g:4906:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSensorAccess().getTypeSensorTypeCrossReference_4_0()); 
            }
            // InternalIoT.g:4907:3: ( RULE_ID )
            // InternalIoT.g:4908:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSensorAccess().getTypeSensorTypeIDTerminalRuleCall_4_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSensorAccess().getTypeSensorTypeIDTerminalRuleCall_4_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSensorAccess().getTypeSensorTypeCrossReference_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__TypeAssignment_4"


    // $ANTLR start "rule__SensorGroup__NameAssignment_1"
    // InternalIoT.g:4919:1: rule__SensorGroup__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SensorGroup__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:4923:1: ( ( RULE_ID ) )
            // InternalIoT.g:4924:2: ( RULE_ID )
            {
            // InternalIoT.g:4924:2: ( RULE_ID )
            // InternalIoT.g:4925:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSensorGroupAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSensorGroupAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorGroup__NameAssignment_1"


    // $ANTLR start "rule__SensorGroup__SensorsAssignment_3"
    // InternalIoT.g:4934:1: rule__SensorGroup__SensorsAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__SensorGroup__SensorsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:4938:1: ( ( ( RULE_ID ) ) )
            // InternalIoT.g:4939:2: ( ( RULE_ID ) )
            {
            // InternalIoT.g:4939:2: ( ( RULE_ID ) )
            // InternalIoT.g:4940:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSensorGroupAccess().getSensorsSensorCrossReference_3_0()); 
            }
            // InternalIoT.g:4941:3: ( RULE_ID )
            // InternalIoT.g:4942:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSensorGroupAccess().getSensorsSensorIDTerminalRuleCall_3_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSensorGroupAccess().getSensorsSensorIDTerminalRuleCall_3_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSensorGroupAccess().getSensorsSensorCrossReference_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorGroup__SensorsAssignment_3"


    // $ANTLR start "rule__SensorGroup__SensorsAssignment_4_1"
    // InternalIoT.g:4953:1: rule__SensorGroup__SensorsAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__SensorGroup__SensorsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:4957:1: ( ( ( RULE_ID ) ) )
            // InternalIoT.g:4958:2: ( ( RULE_ID ) )
            {
            // InternalIoT.g:4958:2: ( ( RULE_ID ) )
            // InternalIoT.g:4959:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSensorGroupAccess().getSensorsSensorCrossReference_4_1_0()); 
            }
            // InternalIoT.g:4960:3: ( RULE_ID )
            // InternalIoT.g:4961:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSensorGroupAccess().getSensorsSensorIDTerminalRuleCall_4_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSensorGroupAccess().getSensorsSensorIDTerminalRuleCall_4_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSensorGroupAccess().getSensorsSensorCrossReference_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorGroup__SensorsAssignment_4_1"


    // $ANTLR start "rule__SensorGetMethod__MethodAssignment_1"
    // InternalIoT.g:4972:1: rule__SensorGetMethod__MethodAssignment_1 : ( ruleMethod ) ;
    public final void rule__SensorGetMethod__MethodAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:4976:1: ( ( ruleMethod ) )
            // InternalIoT.g:4977:2: ( ruleMethod )
            {
            // InternalIoT.g:4977:2: ( ruleMethod )
            // InternalIoT.g:4978:3: ruleMethod
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSensorGetMethodAccess().getMethodMethodParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMethod();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSensorGetMethodAccess().getMethodMethodParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorGetMethod__MethodAssignment_1"


    // $ANTLR start "rule__SensorGetMethod__TypeAssignment_4"
    // InternalIoT.g:4987:1: rule__SensorGetMethod__TypeAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__SensorGetMethod__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:4991:1: ( ( ( RULE_ID ) ) )
            // InternalIoT.g:4992:2: ( ( RULE_ID ) )
            {
            // InternalIoT.g:4992:2: ( ( RULE_ID ) )
            // InternalIoT.g:4993:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSensorGetMethodAccess().getTypeSensorTypeCrossReference_4_0()); 
            }
            // InternalIoT.g:4994:3: ( RULE_ID )
            // InternalIoT.g:4995:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSensorGetMethodAccess().getTypeSensorTypeIDTerminalRuleCall_4_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSensorGetMethodAccess().getTypeSensorTypeIDTerminalRuleCall_4_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSensorGetMethodAccess().getTypeSensorTypeCrossReference_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorGetMethod__TypeAssignment_4"


    // $ANTLR start "rule__Method__NameAssignment_0"
    // InternalIoT.g:5006:1: rule__Method__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Method__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:5010:1: ( ( RULE_ID ) )
            // InternalIoT.g:5011:2: ( RULE_ID )
            {
            // InternalIoT.g:5011:2: ( RULE_ID )
            // InternalIoT.g:5012:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getNameIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getNameIDTerminalRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__NameAssignment_0"


    // $ANTLR start "rule__Method__ParametersAssignment_2_0"
    // InternalIoT.g:5021:1: rule__Method__ParametersAssignment_2_0 : ( RULE_ID ) ;
    public final void rule__Method__ParametersAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:5025:1: ( ( RULE_ID ) )
            // InternalIoT.g:5026:2: ( RULE_ID )
            {
            // InternalIoT.g:5026:2: ( RULE_ID )
            // InternalIoT.g:5027:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getParametersIDTerminalRuleCall_2_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getParametersIDTerminalRuleCall_2_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__ParametersAssignment_2_0"


    // $ANTLR start "rule__Method__ParametersAssignment_2_1_1"
    // InternalIoT.g:5036:1: rule__Method__ParametersAssignment_2_1_1 : ( RULE_ID ) ;
    public final void rule__Method__ParametersAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:5040:1: ( ( RULE_ID ) )
            // InternalIoT.g:5041:2: ( RULE_ID )
            {
            // InternalIoT.g:5041:2: ( RULE_ID )
            // InternalIoT.g:5042:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodAccess().getParametersIDTerminalRuleCall_2_1_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodAccess().getParametersIDTerminalRuleCall_2_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__ParametersAssignment_2_1_1"


    // $ANTLR start "rule__DeviceType__NameAssignment"
    // InternalIoT.g:5051:1: rule__DeviceType__NameAssignment : ( RULE_ID ) ;
    public final void rule__DeviceType__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:5055:1: ( ( RULE_ID ) )
            // InternalIoT.g:5056:2: ( RULE_ID )
            {
            // InternalIoT.g:5056:2: ( RULE_ID )
            // InternalIoT.g:5057:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeviceTypeAccess().getNameIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeviceTypeAccess().getNameIDTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceType__NameAssignment"


    // $ANTLR start "rule__DeviceTypes__TypesAssignment_1"
    // InternalIoT.g:5066:1: rule__DeviceTypes__TypesAssignment_1 : ( ruleDeviceType ) ;
    public final void rule__DeviceTypes__TypesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:5070:1: ( ( ruleDeviceType ) )
            // InternalIoT.g:5071:2: ( ruleDeviceType )
            {
            // InternalIoT.g:5071:2: ( ruleDeviceType )
            // InternalIoT.g:5072:3: ruleDeviceType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeviceTypesAccess().getTypesDeviceTypeParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleDeviceType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeviceTypesAccess().getTypesDeviceTypeParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceTypes__TypesAssignment_1"


    // $ANTLR start "rule__DeviceTypes__TypesAssignment_2_1"
    // InternalIoT.g:5081:1: rule__DeviceTypes__TypesAssignment_2_1 : ( ruleDeviceType ) ;
    public final void rule__DeviceTypes__TypesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:5085:1: ( ( ruleDeviceType ) )
            // InternalIoT.g:5086:2: ( ruleDeviceType )
            {
            // InternalIoT.g:5086:2: ( ruleDeviceType )
            // InternalIoT.g:5087:3: ruleDeviceType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeviceTypesAccess().getTypesDeviceTypeParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleDeviceType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeviceTypesAccess().getTypesDeviceTypeParserRuleCall_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceTypes__TypesAssignment_2_1"


    // $ANTLR start "rule__Device__NameAssignment_1"
    // InternalIoT.g:5096:1: rule__Device__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Device__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:5100:1: ( ( RULE_ID ) )
            // InternalIoT.g:5101:2: ( RULE_ID )
            {
            // InternalIoT.g:5101:2: ( RULE_ID )
            // InternalIoT.g:5102:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeviceAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeviceAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__NameAssignment_1"


    // $ANTLR start "rule__Device__TypeAssignment_4"
    // InternalIoT.g:5111:1: rule__Device__TypeAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Device__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:5115:1: ( ( ( RULE_ID ) ) )
            // InternalIoT.g:5116:2: ( ( RULE_ID ) )
            {
            // InternalIoT.g:5116:2: ( ( RULE_ID ) )
            // InternalIoT.g:5117:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeviceAccess().getTypeDeviceTypeCrossReference_4_0()); 
            }
            // InternalIoT.g:5118:3: ( RULE_ID )
            // InternalIoT.g:5119:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeviceAccess().getTypeDeviceTypeIDTerminalRuleCall_4_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeviceAccess().getTypeDeviceTypeIDTerminalRuleCall_4_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeviceAccess().getTypeDeviceTypeCrossReference_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__TypeAssignment_4"


    // $ANTLR start "rule__Device__DevicesAssignment_6_0_1"
    // InternalIoT.g:5130:1: rule__Device__DevicesAssignment_6_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__Device__DevicesAssignment_6_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:5134:1: ( ( ( RULE_ID ) ) )
            // InternalIoT.g:5135:2: ( ( RULE_ID ) )
            {
            // InternalIoT.g:5135:2: ( ( RULE_ID ) )
            // InternalIoT.g:5136:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeviceAccess().getDevicesDeviceCrossReference_6_0_1_0()); 
            }
            // InternalIoT.g:5137:3: ( RULE_ID )
            // InternalIoT.g:5138:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeviceAccess().getDevicesDeviceIDTerminalRuleCall_6_0_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeviceAccess().getDevicesDeviceIDTerminalRuleCall_6_0_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeviceAccess().getDevicesDeviceCrossReference_6_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__DevicesAssignment_6_0_1"


    // $ANTLR start "rule__Device__DevicesAssignment_6_1_1"
    // InternalIoT.g:5149:1: rule__Device__DevicesAssignment_6_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__Device__DevicesAssignment_6_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:5153:1: ( ( ( RULE_ID ) ) )
            // InternalIoT.g:5154:2: ( ( RULE_ID ) )
            {
            // InternalIoT.g:5154:2: ( ( RULE_ID ) )
            // InternalIoT.g:5155:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeviceAccess().getDevicesSensorGroupCrossReference_6_1_1_0()); 
            }
            // InternalIoT.g:5156:3: ( RULE_ID )
            // InternalIoT.g:5157:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeviceAccess().getDevicesSensorGroupIDTerminalRuleCall_6_1_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeviceAccess().getDevicesSensorGroupIDTerminalRuleCall_6_1_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeviceAccess().getDevicesSensorGroupCrossReference_6_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__DevicesAssignment_6_1_1"


    // $ANTLR start "rule__ServerType__NameAssignment"
    // InternalIoT.g:5168:1: rule__ServerType__NameAssignment : ( RULE_ID ) ;
    public final void rule__ServerType__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:5172:1: ( ( RULE_ID ) )
            // InternalIoT.g:5173:2: ( RULE_ID )
            {
            // InternalIoT.g:5173:2: ( RULE_ID )
            // InternalIoT.g:5174:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServerTypeAccess().getNameIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getServerTypeAccess().getNameIDTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServerType__NameAssignment"


    // $ANTLR start "rule__ServerTypes__TypesAssignment_1"
    // InternalIoT.g:5183:1: rule__ServerTypes__TypesAssignment_1 : ( ruleServerType ) ;
    public final void rule__ServerTypes__TypesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:5187:1: ( ( ruleServerType ) )
            // InternalIoT.g:5188:2: ( ruleServerType )
            {
            // InternalIoT.g:5188:2: ( ruleServerType )
            // InternalIoT.g:5189:3: ruleServerType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServerTypesAccess().getTypesServerTypeParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleServerType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getServerTypesAccess().getTypesServerTypeParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServerTypes__TypesAssignment_1"


    // $ANTLR start "rule__ServerTypes__TypesAssignment_2_1"
    // InternalIoT.g:5198:1: rule__ServerTypes__TypesAssignment_2_1 : ( ruleServerType ) ;
    public final void rule__ServerTypes__TypesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:5202:1: ( ( ruleServerType ) )
            // InternalIoT.g:5203:2: ( ruleServerType )
            {
            // InternalIoT.g:5203:2: ( ruleServerType )
            // InternalIoT.g:5204:3: ruleServerType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServerTypesAccess().getTypesServerTypeParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleServerType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getServerTypesAccess().getTypesServerTypeParserRuleCall_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServerTypes__TypesAssignment_2_1"


    // $ANTLR start "rule__Server__NameAssignment_1"
    // InternalIoT.g:5213:1: rule__Server__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Server__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:5217:1: ( ( RULE_ID ) )
            // InternalIoT.g:5218:2: ( RULE_ID )
            {
            // InternalIoT.g:5218:2: ( RULE_ID )
            // InternalIoT.g:5219:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServerAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getServerAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Server__NameAssignment_1"


    // $ANTLR start "rule__Server__TypeAssignment_4"
    // InternalIoT.g:5228:1: rule__Server__TypeAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Server__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:5232:1: ( ( ( RULE_ID ) ) )
            // InternalIoT.g:5233:2: ( ( RULE_ID ) )
            {
            // InternalIoT.g:5233:2: ( ( RULE_ID ) )
            // InternalIoT.g:5234:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServerAccess().getTypeServerTypeCrossReference_4_0()); 
            }
            // InternalIoT.g:5235:3: ( RULE_ID )
            // InternalIoT.g:5236:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServerAccess().getTypeServerTypeIDTerminalRuleCall_4_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getServerAccess().getTypeServerTypeIDTerminalRuleCall_4_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getServerAccess().getTypeServerTypeCrossReference_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Server__TypeAssignment_4"


    // $ANTLR start "rule__Server__IpAssignment_7"
    // InternalIoT.g:5247:1: rule__Server__IpAssignment_7 : ( ruleIp ) ;
    public final void rule__Server__IpAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:5251:1: ( ( ruleIp ) )
            // InternalIoT.g:5252:2: ( ruleIp )
            {
            // InternalIoT.g:5252:2: ( ruleIp )
            // InternalIoT.g:5253:3: ruleIp
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServerAccess().getIpIpParserRuleCall_7_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleIp();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getServerAccess().getIpIpParserRuleCall_7_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Server__IpAssignment_7"


    // $ANTLR start "rule__Server__PortAssignment_9"
    // InternalIoT.g:5262:1: rule__Server__PortAssignment_9 : ( rulePortnumber ) ;
    public final void rule__Server__PortAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:5266:1: ( ( rulePortnumber ) )
            // InternalIoT.g:5267:2: ( rulePortnumber )
            {
            // InternalIoT.g:5267:2: ( rulePortnumber )
            // InternalIoT.g:5268:3: rulePortnumber
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServerAccess().getPortPortnumberParserRuleCall_9_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePortnumber();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getServerAccess().getPortPortnumberParserRuleCall_9_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Server__PortAssignment_9"


    // $ANTLR start "rule__DestinationType__NameAssignment"
    // InternalIoT.g:5277:1: rule__DestinationType__NameAssignment : ( RULE_ID ) ;
    public final void rule__DestinationType__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:5281:1: ( ( RULE_ID ) )
            // InternalIoT.g:5282:2: ( RULE_ID )
            {
            // InternalIoT.g:5282:2: ( RULE_ID )
            // InternalIoT.g:5283:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDestinationTypeAccess().getNameIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDestinationTypeAccess().getNameIDTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DestinationType__NameAssignment"


    // $ANTLR start "rule__DestinationTypes__TypesAssignment_1"
    // InternalIoT.g:5292:1: rule__DestinationTypes__TypesAssignment_1 : ( ruleDestinationType ) ;
    public final void rule__DestinationTypes__TypesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:5296:1: ( ( ruleDestinationType ) )
            // InternalIoT.g:5297:2: ( ruleDestinationType )
            {
            // InternalIoT.g:5297:2: ( ruleDestinationType )
            // InternalIoT.g:5298:3: ruleDestinationType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDestinationTypesAccess().getTypesDestinationTypeParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleDestinationType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDestinationTypesAccess().getTypesDestinationTypeParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DestinationTypes__TypesAssignment_1"


    // $ANTLR start "rule__DestinationTypes__TypesAssignment_2_1"
    // InternalIoT.g:5307:1: rule__DestinationTypes__TypesAssignment_2_1 : ( ruleDestinationType ) ;
    public final void rule__DestinationTypes__TypesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:5311:1: ( ( ruleDestinationType ) )
            // InternalIoT.g:5312:2: ( ruleDestinationType )
            {
            // InternalIoT.g:5312:2: ( ruleDestinationType )
            // InternalIoT.g:5313:3: ruleDestinationType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDestinationTypesAccess().getTypesDestinationTypeParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleDestinationType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDestinationTypesAccess().getTypesDestinationTypeParserRuleCall_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DestinationTypes__TypesAssignment_2_1"


    // $ANTLR start "rule__Destination__NameAssignment_1"
    // InternalIoT.g:5322:1: rule__Destination__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Destination__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:5326:1: ( ( RULE_ID ) )
            // InternalIoT.g:5327:2: ( RULE_ID )
            {
            // InternalIoT.g:5327:2: ( RULE_ID )
            // InternalIoT.g:5328:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDestinationAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDestinationAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Destination__NameAssignment_1"


    // $ANTLR start "rule__Destination__TypeAssignment_3"
    // InternalIoT.g:5337:1: rule__Destination__TypeAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Destination__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:5341:1: ( ( ( RULE_ID ) ) )
            // InternalIoT.g:5342:2: ( ( RULE_ID ) )
            {
            // InternalIoT.g:5342:2: ( ( RULE_ID ) )
            // InternalIoT.g:5343:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDestinationAccess().getTypeDestinationTypeCrossReference_3_0()); 
            }
            // InternalIoT.g:5344:3: ( RULE_ID )
            // InternalIoT.g:5345:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDestinationAccess().getTypeDestinationTypeIDTerminalRuleCall_3_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDestinationAccess().getTypeDestinationTypeIDTerminalRuleCall_3_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDestinationAccess().getTypeDestinationTypeCrossReference_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Destination__TypeAssignment_3"


    // $ANTLR start "rule__FetchData__FilterAssignment_3_0_1"
    // InternalIoT.g:5356:1: rule__FetchData__FilterAssignment_3_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__FetchData__FilterAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:5360:1: ( ( ( RULE_ID ) ) )
            // InternalIoT.g:5361:2: ( ( RULE_ID ) )
            {
            // InternalIoT.g:5361:2: ( ( RULE_ID ) )
            // InternalIoT.g:5362:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFetchDataAccess().getFilterSensorTypeCrossReference_3_0_1_0()); 
            }
            // InternalIoT.g:5363:3: ( RULE_ID )
            // InternalIoT.g:5364:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFetchDataAccess().getFilterSensorTypeIDTerminalRuleCall_3_0_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFetchDataAccess().getFilterSensorTypeIDTerminalRuleCall_3_0_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFetchDataAccess().getFilterSensorTypeCrossReference_3_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FetchData__FilterAssignment_3_0_1"


    // $ANTLR start "rule__FetchData__FilterAssignment_3_1_1"
    // InternalIoT.g:5375:1: rule__FetchData__FilterAssignment_3_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__FetchData__FilterAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:5379:1: ( ( ( RULE_ID ) ) )
            // InternalIoT.g:5380:2: ( ( RULE_ID ) )
            {
            // InternalIoT.g:5380:2: ( ( RULE_ID ) )
            // InternalIoT.g:5381:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFetchDataAccess().getFilterSensorGroupCrossReference_3_1_1_0()); 
            }
            // InternalIoT.g:5382:3: ( RULE_ID )
            // InternalIoT.g:5383:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFetchDataAccess().getFilterSensorGroupIDTerminalRuleCall_3_1_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFetchDataAccess().getFilterSensorGroupIDTerminalRuleCall_3_1_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFetchDataAccess().getFilterSensorGroupCrossReference_3_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FetchData__FilterAssignment_3_1_1"


    // $ANTLR start "rule__FetchData__DeviceAssignment_6"
    // InternalIoT.g:5394:1: rule__FetchData__DeviceAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__FetchData__DeviceAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:5398:1: ( ( ( RULE_ID ) ) )
            // InternalIoT.g:5399:2: ( ( RULE_ID ) )
            {
            // InternalIoT.g:5399:2: ( ( RULE_ID ) )
            // InternalIoT.g:5400:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFetchDataAccess().getDeviceDeviceCrossReference_6_0()); 
            }
            // InternalIoT.g:5401:3: ( RULE_ID )
            // InternalIoT.g:5402:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFetchDataAccess().getDeviceDeviceIDTerminalRuleCall_6_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFetchDataAccess().getDeviceDeviceIDTerminalRuleCall_6_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFetchDataAccess().getDeviceDeviceCrossReference_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FetchData__DeviceAssignment_6"


    // $ANTLR start "rule__FetchData__DestinationAssignment_8_0_1"
    // InternalIoT.g:5413:1: rule__FetchData__DestinationAssignment_8_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__FetchData__DestinationAssignment_8_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:5417:1: ( ( ( RULE_ID ) ) )
            // InternalIoT.g:5418:2: ( ( RULE_ID ) )
            {
            // InternalIoT.g:5418:2: ( ( RULE_ID ) )
            // InternalIoT.g:5419:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFetchDataAccess().getDestinationDestinationCrossReference_8_0_1_0()); 
            }
            // InternalIoT.g:5420:3: ( RULE_ID )
            // InternalIoT.g:5421:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFetchDataAccess().getDestinationDestinationIDTerminalRuleCall_8_0_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFetchDataAccess().getDestinationDestinationIDTerminalRuleCall_8_0_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFetchDataAccess().getDestinationDestinationCrossReference_8_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FetchData__DestinationAssignment_8_0_1"


    // $ANTLR start "rule__FetchData__DestinationAssignment_8_1_1"
    // InternalIoT.g:5432:1: rule__FetchData__DestinationAssignment_8_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__FetchData__DestinationAssignment_8_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:5436:1: ( ( ( RULE_ID ) ) )
            // InternalIoT.g:5437:2: ( ( RULE_ID ) )
            {
            // InternalIoT.g:5437:2: ( ( RULE_ID ) )
            // InternalIoT.g:5438:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFetchDataAccess().getDestinationServerCrossReference_8_1_1_0()); 
            }
            // InternalIoT.g:5439:3: ( RULE_ID )
            // InternalIoT.g:5440:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFetchDataAccess().getDestinationServerIDTerminalRuleCall_8_1_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFetchDataAccess().getDestinationServerIDTerminalRuleCall_8_1_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFetchDataAccess().getDestinationServerCrossReference_8_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FetchData__DestinationAssignment_8_1_1"


    // $ANTLR start "rule__FetchData__ConditionAssignment_9_1"
    // InternalIoT.g:5451:1: rule__FetchData__ConditionAssignment_9_1 : ( ruleFetchDataCondition ) ;
    public final void rule__FetchData__ConditionAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:5455:1: ( ( ruleFetchDataCondition ) )
            // InternalIoT.g:5456:2: ( ruleFetchDataCondition )
            {
            // InternalIoT.g:5456:2: ( ruleFetchDataCondition )
            // InternalIoT.g:5457:3: ruleFetchDataCondition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFetchDataAccess().getConditionFetchDataConditionParserRuleCall_9_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleFetchDataCondition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFetchDataAccess().getConditionFetchDataConditionParserRuleCall_9_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FetchData__ConditionAssignment_9_1"


    // $ANTLR start "rule__FetchData__TriggeredAssignment_10_1"
    // InternalIoT.g:5466:1: rule__FetchData__TriggeredAssignment_10_1 : ( ruleFetchDataExpression ) ;
    public final void rule__FetchData__TriggeredAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:5470:1: ( ( ruleFetchDataExpression ) )
            // InternalIoT.g:5471:2: ( ruleFetchDataExpression )
            {
            // InternalIoT.g:5471:2: ( ruleFetchDataExpression )
            // InternalIoT.g:5472:3: ruleFetchDataExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFetchDataAccess().getTriggeredFetchDataExpressionParserRuleCall_10_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleFetchDataExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFetchDataAccess().getTriggeredFetchDataExpressionParserRuleCall_10_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FetchData__TriggeredAssignment_10_1"


    // $ANTLR start "rule__FetchDataExpression__DurationAssignment_1"
    // InternalIoT.g:5481:1: rule__FetchDataExpression__DurationAssignment_1 : ( ruleTime ) ;
    public final void rule__FetchDataExpression__DurationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:5485:1: ( ( ruleTime ) )
            // InternalIoT.g:5486:2: ( ruleTime )
            {
            // InternalIoT.g:5486:2: ( ruleTime )
            // InternalIoT.g:5487:3: ruleTime
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFetchDataExpressionAccess().getDurationTimeParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTime();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFetchDataExpressionAccess().getDurationTimeParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FetchDataExpression__DurationAssignment_1"


    // $ANTLR start "rule__FetchDataExpression__TimeUnitAssignment_2"
    // InternalIoT.g:5496:1: rule__FetchDataExpression__TimeUnitAssignment_2 : ( ruleTimeUnit ) ;
    public final void rule__FetchDataExpression__TimeUnitAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:5500:1: ( ( ruleTimeUnit ) )
            // InternalIoT.g:5501:2: ( ruleTimeUnit )
            {
            // InternalIoT.g:5501:2: ( ruleTimeUnit )
            // InternalIoT.g:5502:3: ruleTimeUnit
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFetchDataExpressionAccess().getTimeUnitTimeUnitParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTimeUnit();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFetchDataExpressionAccess().getTimeUnitTimeUnitParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FetchDataExpression__TimeUnitAssignment_2"


    // $ANTLR start "rule__FetchDataCondition__ConditionAssignment_1_1"
    // InternalIoT.g:5511:1: rule__FetchDataCondition__ConditionAssignment_1_1 : ( ruleCondition ) ;
    public final void rule__FetchDataCondition__ConditionAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:5515:1: ( ( ruleCondition ) )
            // InternalIoT.g:5516:2: ( ruleCondition )
            {
            // InternalIoT.g:5516:2: ( ruleCondition )
            // InternalIoT.g:5517:3: ruleCondition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFetchDataConditionAccess().getConditionConditionParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFetchDataConditionAccess().getConditionConditionParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FetchDataCondition__ConditionAssignment_1_1"


    // $ANTLR start "rule__FetchDataCondition__ElseAssignment_2_1"
    // InternalIoT.g:5526:1: rule__FetchDataCondition__ElseAssignment_2_1 : ( ruleFetchDataCondition ) ;
    public final void rule__FetchDataCondition__ElseAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:5530:1: ( ( ruleFetchDataCondition ) )
            // InternalIoT.g:5531:2: ( ruleFetchDataCondition )
            {
            // InternalIoT.g:5531:2: ( ruleFetchDataCondition )
            // InternalIoT.g:5532:3: ruleFetchDataCondition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFetchDataConditionAccess().getElseFetchDataConditionParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleFetchDataCondition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFetchDataConditionAccess().getElseFetchDataConditionParserRuleCall_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FetchDataCondition__ElseAssignment_2_1"


    // $ANTLR start "rule__OrCondition__RightAssignment_1_2"
    // InternalIoT.g:5541:1: rule__OrCondition__RightAssignment_1_2 : ( ruleAndCondition ) ;
    public final void rule__OrCondition__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:5545:1: ( ( ruleAndCondition ) )
            // InternalIoT.g:5546:2: ( ruleAndCondition )
            {
            // InternalIoT.g:5546:2: ( ruleAndCondition )
            // InternalIoT.g:5547:3: ruleAndCondition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrConditionAccess().getRightAndConditionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAndCondition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrConditionAccess().getRightAndConditionParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrCondition__RightAssignment_1_2"


    // $ANTLR start "rule__AndCondition__RightAssignment_1_2"
    // InternalIoT.g:5556:1: rule__AndCondition__RightAssignment_1_2 : ( ruleComparisonCondition ) ;
    public final void rule__AndCondition__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:5560:1: ( ( ruleComparisonCondition ) )
            // InternalIoT.g:5561:2: ( ruleComparisonCondition )
            {
            // InternalIoT.g:5561:2: ( ruleComparisonCondition )
            // InternalIoT.g:5562:3: ruleComparisonCondition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndConditionAccess().getRightComparisonConditionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleComparisonCondition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndConditionAccess().getRightComparisonConditionParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndCondition__RightAssignment_1_2"


    // $ANTLR start "rule__ComparisonCondition__OperatorAssignment_1_1"
    // InternalIoT.g:5571:1: rule__ComparisonCondition__OperatorAssignment_1_1 : ( ( rule__ComparisonCondition__OperatorAlternatives_1_1_0 ) ) ;
    public final void rule__ComparisonCondition__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:5575:1: ( ( ( rule__ComparisonCondition__OperatorAlternatives_1_1_0 ) ) )
            // InternalIoT.g:5576:2: ( ( rule__ComparisonCondition__OperatorAlternatives_1_1_0 ) )
            {
            // InternalIoT.g:5576:2: ( ( rule__ComparisonCondition__OperatorAlternatives_1_1_0 ) )
            // InternalIoT.g:5577:3: ( rule__ComparisonCondition__OperatorAlternatives_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonConditionAccess().getOperatorAlternatives_1_1_0()); 
            }
            // InternalIoT.g:5578:3: ( rule__ComparisonCondition__OperatorAlternatives_1_1_0 )
            // InternalIoT.g:5578:4: rule__ComparisonCondition__OperatorAlternatives_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__ComparisonCondition__OperatorAlternatives_1_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonConditionAccess().getOperatorAlternatives_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonCondition__OperatorAssignment_1_1"


    // $ANTLR start "rule__ComparisonCondition__RightAssignment_1_2"
    // InternalIoT.g:5586:1: rule__ComparisonCondition__RightAssignment_1_2 : ( rulePrimaryCondition ) ;
    public final void rule__ComparisonCondition__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:5590:1: ( ( rulePrimaryCondition ) )
            // InternalIoT.g:5591:2: ( rulePrimaryCondition )
            {
            // InternalIoT.g:5591:2: ( rulePrimaryCondition )
            // InternalIoT.g:5592:3: rulePrimaryCondition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonConditionAccess().getRightPrimaryConditionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePrimaryCondition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonConditionAccess().getRightPrimaryConditionParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonCondition__RightAssignment_1_2"


    // $ANTLR start "rule__LiteralBoolean__ValueAssignment_0_1"
    // InternalIoT.g:5601:1: rule__LiteralBoolean__ValueAssignment_0_1 : ( ( 'true' ) ) ;
    public final void rule__LiteralBoolean__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:5605:1: ( ( ( 'true' ) ) )
            // InternalIoT.g:5606:2: ( ( 'true' ) )
            {
            // InternalIoT.g:5606:2: ( ( 'true' ) )
            // InternalIoT.g:5607:3: ( 'true' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralBooleanAccess().getValueTrueKeyword_0_1_0()); 
            }
            // InternalIoT.g:5608:3: ( 'true' )
            // InternalIoT.g:5609:4: 'true'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralBooleanAccess().getValueTrueKeyword_0_1_0()); 
            }
            match(input,57,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralBooleanAccess().getValueTrueKeyword_0_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralBooleanAccess().getValueTrueKeyword_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiteralBoolean__ValueAssignment_0_1"


    // $ANTLR start "rule__LiteralBoolean__ValueAssignment_1_1"
    // InternalIoT.g:5620:1: rule__LiteralBoolean__ValueAssignment_1_1 : ( ( 'false' ) ) ;
    public final void rule__LiteralBoolean__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:5624:1: ( ( ( 'false' ) ) )
            // InternalIoT.g:5625:2: ( ( 'false' ) )
            {
            // InternalIoT.g:5625:2: ( ( 'false' ) )
            // InternalIoT.g:5626:3: ( 'false' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralBooleanAccess().getValueFalseKeyword_1_1_0()); 
            }
            // InternalIoT.g:5627:3: ( 'false' )
            // InternalIoT.g:5628:4: 'false'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralBooleanAccess().getValueFalseKeyword_1_1_0()); 
            }
            match(input,58,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralBooleanAccess().getValueFalseKeyword_1_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralBooleanAccess().getValueFalseKeyword_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiteralBoolean__ValueAssignment_1_1"


    // $ANTLR start "rule__LiteralInteger__ValueAssignment_1"
    // InternalIoT.g:5639:1: rule__LiteralInteger__ValueAssignment_1 : ( RULE_INT ) ;
    public final void rule__LiteralInteger__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:5643:1: ( ( RULE_INT ) )
            // InternalIoT.g:5644:2: ( RULE_INT )
            {
            // InternalIoT.g:5644:2: ( RULE_INT )
            // InternalIoT.g:5645:3: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralIntegerAccess().getValueINTTerminalRuleCall_1_0()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralIntegerAccess().getValueINTTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiteralInteger__ValueAssignment_1"


    // $ANTLR start "rule__Ip__IpAssignment_1"
    // InternalIoT.g:5654:1: rule__Ip__IpAssignment_1 : ( RULE_INT ) ;
    public final void rule__Ip__IpAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:5658:1: ( ( RULE_INT ) )
            // InternalIoT.g:5659:2: ( RULE_INT )
            {
            // InternalIoT.g:5659:2: ( RULE_INT )
            // InternalIoT.g:5660:3: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIpAccess().getIpINTTerminalRuleCall_1_0()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIpAccess().getIpINTTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ip__IpAssignment_1"


    // $ANTLR start "rule__Ip__IpAssignment_3"
    // InternalIoT.g:5669:1: rule__Ip__IpAssignment_3 : ( RULE_INT ) ;
    public final void rule__Ip__IpAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:5673:1: ( ( RULE_INT ) )
            // InternalIoT.g:5674:2: ( RULE_INT )
            {
            // InternalIoT.g:5674:2: ( RULE_INT )
            // InternalIoT.g:5675:3: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIpAccess().getIpINTTerminalRuleCall_3_0()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIpAccess().getIpINTTerminalRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ip__IpAssignment_3"


    // $ANTLR start "rule__Ip__IpAssignment_5"
    // InternalIoT.g:5684:1: rule__Ip__IpAssignment_5 : ( RULE_INT ) ;
    public final void rule__Ip__IpAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:5688:1: ( ( RULE_INT ) )
            // InternalIoT.g:5689:2: ( RULE_INT )
            {
            // InternalIoT.g:5689:2: ( RULE_INT )
            // InternalIoT.g:5690:3: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIpAccess().getIpINTTerminalRuleCall_5_0()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIpAccess().getIpINTTerminalRuleCall_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ip__IpAssignment_5"


    // $ANTLR start "rule__Ip__IpAssignment_7"
    // InternalIoT.g:5699:1: rule__Ip__IpAssignment_7 : ( RULE_INT ) ;
    public final void rule__Ip__IpAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:5703:1: ( ( RULE_INT ) )
            // InternalIoT.g:5704:2: ( RULE_INT )
            {
            // InternalIoT.g:5704:2: ( RULE_INT )
            // InternalIoT.g:5705:3: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIpAccess().getIpINTTerminalRuleCall_7_0()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIpAccess().getIpINTTerminalRuleCall_7_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ip__IpAssignment_7"


    // $ANTLR start "rule__Portnumber__NumberAssignment_1"
    // InternalIoT.g:5714:1: rule__Portnumber__NumberAssignment_1 : ( RULE_INT ) ;
    public final void rule__Portnumber__NumberAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:5718:1: ( ( RULE_INT ) )
            // InternalIoT.g:5719:2: ( RULE_INT )
            {
            // InternalIoT.g:5719:2: ( RULE_INT )
            // InternalIoT.g:5720:3: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPortnumberAccess().getNumberINTTerminalRuleCall_1_0()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPortnumberAccess().getNumberINTTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Portnumber__NumberAssignment_1"


    // $ANTLR start "rule__Time__TimeAssignment"
    // InternalIoT.g:5729:1: rule__Time__TimeAssignment : ( RULE_INT ) ;
    public final void rule__Time__TimeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:5733:1: ( ( RULE_INT ) )
            // InternalIoT.g:5734:2: ( RULE_INT )
            {
            // InternalIoT.g:5734:2: ( RULE_INT )
            // InternalIoT.g:5735:3: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTimeAccess().getTimeINTTerminalRuleCall_0()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTimeAccess().getTimeINTTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Time__TimeAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000E318A500002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000040000010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000801000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0001800000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0006000000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000007800L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0600000020000030L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x00000000000F8000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x00000000000F8002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0600000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0100000000000000L});

}