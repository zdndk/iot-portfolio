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

@SuppressWarnings("all")
public class InternalIoTParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'_??'", "'when'", "'if'", "'ms'", "'s'", "'m'", "'h'", "'SensorTypes'", "','", "'Sensor'", "'of'", "'type'", "'SensorGroup'", "'include'", "'SensorGetMethod'", "'for'", "'('", "')'", "'DeviceTypes'", "'Device'", "'contains'", "'device'", "'group'", "'ServerTypes'", "'Server'", "'listens'", "'on'", "'and'", "'DestinationTypes'", "'Destination'", "'Fetch'", "'data'", "'from'", "'to'", "'destination'", "'server'", "'every'", "'.'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
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
    // InternalIoT.g:53:1: entryRuleSystem : ruleSystem EOF ;
    public final void entryRuleSystem() throws RecognitionException {
        try {
            // InternalIoT.g:54:1: ( ruleSystem EOF )
            // InternalIoT.g:55:1: ruleSystem EOF
            {
             before(grammarAccess.getSystemRule()); 
            pushFollow(FOLLOW_1);
            ruleSystem();

            state._fsp--;

             after(grammarAccess.getSystemRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalIoT.g:62:1: ruleSystem : ( ( ( rule__System__SystemAssignment ) ) ( ( rule__System__SystemAssignment )* ) ) ;
    public final void ruleSystem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:66:2: ( ( ( ( rule__System__SystemAssignment ) ) ( ( rule__System__SystemAssignment )* ) ) )
            // InternalIoT.g:67:2: ( ( ( rule__System__SystemAssignment ) ) ( ( rule__System__SystemAssignment )* ) )
            {
            // InternalIoT.g:67:2: ( ( ( rule__System__SystemAssignment ) ) ( ( rule__System__SystemAssignment )* ) )
            // InternalIoT.g:68:3: ( ( rule__System__SystemAssignment ) ) ( ( rule__System__SystemAssignment )* )
            {
            // InternalIoT.g:68:3: ( ( rule__System__SystemAssignment ) )
            // InternalIoT.g:69:4: ( rule__System__SystemAssignment )
            {
             before(grammarAccess.getSystemAccess().getSystemAssignment()); 
            // InternalIoT.g:70:4: ( rule__System__SystemAssignment )
            // InternalIoT.g:70:5: rule__System__SystemAssignment
            {
            pushFollow(FOLLOW_3);
            rule__System__SystemAssignment();

            state._fsp--;


            }

             after(grammarAccess.getSystemAccess().getSystemAssignment()); 

            }

            // InternalIoT.g:73:3: ( ( rule__System__SystemAssignment )* )
            // InternalIoT.g:74:4: ( rule__System__SystemAssignment )*
            {
             before(grammarAccess.getSystemAccess().getSystemAssignment()); 
            // InternalIoT.g:75:4: ( rule__System__SystemAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==18||LA1_0==20||LA1_0==23||LA1_0==25||(LA1_0>=29 && LA1_0<=30)||(LA1_0>=34 && LA1_0<=35)||(LA1_0>=39 && LA1_0<=41)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalIoT.g:75:5: rule__System__SystemAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__System__SystemAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getSystemAccess().getSystemAssignment()); 

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
    // InternalIoT.g:85:1: entryRuleSensorType : ruleSensorType EOF ;
    public final void entryRuleSensorType() throws RecognitionException {
        try {
            // InternalIoT.g:86:1: ( ruleSensorType EOF )
            // InternalIoT.g:87:1: ruleSensorType EOF
            {
             before(grammarAccess.getSensorTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleSensorType();

            state._fsp--;

             after(grammarAccess.getSensorTypeRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalIoT.g:94:1: ruleSensorType : ( ( rule__SensorType__NameAssignment ) ) ;
    public final void ruleSensorType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:98:2: ( ( ( rule__SensorType__NameAssignment ) ) )
            // InternalIoT.g:99:2: ( ( rule__SensorType__NameAssignment ) )
            {
            // InternalIoT.g:99:2: ( ( rule__SensorType__NameAssignment ) )
            // InternalIoT.g:100:3: ( rule__SensorType__NameAssignment )
            {
             before(grammarAccess.getSensorTypeAccess().getNameAssignment()); 
            // InternalIoT.g:101:3: ( rule__SensorType__NameAssignment )
            // InternalIoT.g:101:4: rule__SensorType__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__SensorType__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getSensorTypeAccess().getNameAssignment()); 

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
    // InternalIoT.g:110:1: entryRuleSensorTypes : ruleSensorTypes EOF ;
    public final void entryRuleSensorTypes() throws RecognitionException {
        try {
            // InternalIoT.g:111:1: ( ruleSensorTypes EOF )
            // InternalIoT.g:112:1: ruleSensorTypes EOF
            {
             before(grammarAccess.getSensorTypesRule()); 
            pushFollow(FOLLOW_1);
            ruleSensorTypes();

            state._fsp--;

             after(grammarAccess.getSensorTypesRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalIoT.g:119:1: ruleSensorTypes : ( ( rule__SensorTypes__Group__0 ) ) ;
    public final void ruleSensorTypes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:123:2: ( ( ( rule__SensorTypes__Group__0 ) ) )
            // InternalIoT.g:124:2: ( ( rule__SensorTypes__Group__0 ) )
            {
            // InternalIoT.g:124:2: ( ( rule__SensorTypes__Group__0 ) )
            // InternalIoT.g:125:3: ( rule__SensorTypes__Group__0 )
            {
             before(grammarAccess.getSensorTypesAccess().getGroup()); 
            // InternalIoT.g:126:3: ( rule__SensorTypes__Group__0 )
            // InternalIoT.g:126:4: rule__SensorTypes__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SensorTypes__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSensorTypesAccess().getGroup()); 

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
    // InternalIoT.g:135:1: entryRuleSensor : ruleSensor EOF ;
    public final void entryRuleSensor() throws RecognitionException {
        try {
            // InternalIoT.g:136:1: ( ruleSensor EOF )
            // InternalIoT.g:137:1: ruleSensor EOF
            {
             before(grammarAccess.getSensorRule()); 
            pushFollow(FOLLOW_1);
            ruleSensor();

            state._fsp--;

             after(grammarAccess.getSensorRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalIoT.g:144:1: ruleSensor : ( ( rule__Sensor__Group__0 ) ) ;
    public final void ruleSensor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:148:2: ( ( ( rule__Sensor__Group__0 ) ) )
            // InternalIoT.g:149:2: ( ( rule__Sensor__Group__0 ) )
            {
            // InternalIoT.g:149:2: ( ( rule__Sensor__Group__0 ) )
            // InternalIoT.g:150:3: ( rule__Sensor__Group__0 )
            {
             before(grammarAccess.getSensorAccess().getGroup()); 
            // InternalIoT.g:151:3: ( rule__Sensor__Group__0 )
            // InternalIoT.g:151:4: rule__Sensor__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSensorAccess().getGroup()); 

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
    // InternalIoT.g:160:1: entryRuleSensorGroup : ruleSensorGroup EOF ;
    public final void entryRuleSensorGroup() throws RecognitionException {
        try {
            // InternalIoT.g:161:1: ( ruleSensorGroup EOF )
            // InternalIoT.g:162:1: ruleSensorGroup EOF
            {
             before(grammarAccess.getSensorGroupRule()); 
            pushFollow(FOLLOW_1);
            ruleSensorGroup();

            state._fsp--;

             after(grammarAccess.getSensorGroupRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalIoT.g:169:1: ruleSensorGroup : ( ( rule__SensorGroup__Group__0 ) ) ;
    public final void ruleSensorGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:173:2: ( ( ( rule__SensorGroup__Group__0 ) ) )
            // InternalIoT.g:174:2: ( ( rule__SensorGroup__Group__0 ) )
            {
            // InternalIoT.g:174:2: ( ( rule__SensorGroup__Group__0 ) )
            // InternalIoT.g:175:3: ( rule__SensorGroup__Group__0 )
            {
             before(grammarAccess.getSensorGroupAccess().getGroup()); 
            // InternalIoT.g:176:3: ( rule__SensorGroup__Group__0 )
            // InternalIoT.g:176:4: rule__SensorGroup__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SensorGroup__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSensorGroupAccess().getGroup()); 

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
    // InternalIoT.g:185:1: entryRuleSensorGetMethod : ruleSensorGetMethod EOF ;
    public final void entryRuleSensorGetMethod() throws RecognitionException {
        try {
            // InternalIoT.g:186:1: ( ruleSensorGetMethod EOF )
            // InternalIoT.g:187:1: ruleSensorGetMethod EOF
            {
             before(grammarAccess.getSensorGetMethodRule()); 
            pushFollow(FOLLOW_1);
            ruleSensorGetMethod();

            state._fsp--;

             after(grammarAccess.getSensorGetMethodRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalIoT.g:194:1: ruleSensorGetMethod : ( ( rule__SensorGetMethod__Group__0 ) ) ;
    public final void ruleSensorGetMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:198:2: ( ( ( rule__SensorGetMethod__Group__0 ) ) )
            // InternalIoT.g:199:2: ( ( rule__SensorGetMethod__Group__0 ) )
            {
            // InternalIoT.g:199:2: ( ( rule__SensorGetMethod__Group__0 ) )
            // InternalIoT.g:200:3: ( rule__SensorGetMethod__Group__0 )
            {
             before(grammarAccess.getSensorGetMethodAccess().getGroup()); 
            // InternalIoT.g:201:3: ( rule__SensorGetMethod__Group__0 )
            // InternalIoT.g:201:4: rule__SensorGetMethod__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SensorGetMethod__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSensorGetMethodAccess().getGroup()); 

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
    // InternalIoT.g:210:1: entryRuleMethod : ruleMethod EOF ;
    public final void entryRuleMethod() throws RecognitionException {
        try {
            // InternalIoT.g:211:1: ( ruleMethod EOF )
            // InternalIoT.g:212:1: ruleMethod EOF
            {
             before(grammarAccess.getMethodRule()); 
            pushFollow(FOLLOW_1);
            ruleMethod();

            state._fsp--;

             after(grammarAccess.getMethodRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalIoT.g:219:1: ruleMethod : ( ( rule__Method__Group__0 ) ) ;
    public final void ruleMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:223:2: ( ( ( rule__Method__Group__0 ) ) )
            // InternalIoT.g:224:2: ( ( rule__Method__Group__0 ) )
            {
            // InternalIoT.g:224:2: ( ( rule__Method__Group__0 ) )
            // InternalIoT.g:225:3: ( rule__Method__Group__0 )
            {
             before(grammarAccess.getMethodAccess().getGroup()); 
            // InternalIoT.g:226:3: ( rule__Method__Group__0 )
            // InternalIoT.g:226:4: rule__Method__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Method__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMethodAccess().getGroup()); 

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
    // InternalIoT.g:235:1: entryRuleDeviceType : ruleDeviceType EOF ;
    public final void entryRuleDeviceType() throws RecognitionException {
        try {
            // InternalIoT.g:236:1: ( ruleDeviceType EOF )
            // InternalIoT.g:237:1: ruleDeviceType EOF
            {
             before(grammarAccess.getDeviceTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleDeviceType();

            state._fsp--;

             after(grammarAccess.getDeviceTypeRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalIoT.g:244:1: ruleDeviceType : ( ( rule__DeviceType__NameAssignment ) ) ;
    public final void ruleDeviceType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:248:2: ( ( ( rule__DeviceType__NameAssignment ) ) )
            // InternalIoT.g:249:2: ( ( rule__DeviceType__NameAssignment ) )
            {
            // InternalIoT.g:249:2: ( ( rule__DeviceType__NameAssignment ) )
            // InternalIoT.g:250:3: ( rule__DeviceType__NameAssignment )
            {
             before(grammarAccess.getDeviceTypeAccess().getNameAssignment()); 
            // InternalIoT.g:251:3: ( rule__DeviceType__NameAssignment )
            // InternalIoT.g:251:4: rule__DeviceType__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__DeviceType__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getDeviceTypeAccess().getNameAssignment()); 

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
    // InternalIoT.g:260:1: entryRuleDeviceTypes : ruleDeviceTypes EOF ;
    public final void entryRuleDeviceTypes() throws RecognitionException {
        try {
            // InternalIoT.g:261:1: ( ruleDeviceTypes EOF )
            // InternalIoT.g:262:1: ruleDeviceTypes EOF
            {
             before(grammarAccess.getDeviceTypesRule()); 
            pushFollow(FOLLOW_1);
            ruleDeviceTypes();

            state._fsp--;

             after(grammarAccess.getDeviceTypesRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalIoT.g:269:1: ruleDeviceTypes : ( ( rule__DeviceTypes__Group__0 ) ) ;
    public final void ruleDeviceTypes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:273:2: ( ( ( rule__DeviceTypes__Group__0 ) ) )
            // InternalIoT.g:274:2: ( ( rule__DeviceTypes__Group__0 ) )
            {
            // InternalIoT.g:274:2: ( ( rule__DeviceTypes__Group__0 ) )
            // InternalIoT.g:275:3: ( rule__DeviceTypes__Group__0 )
            {
             before(grammarAccess.getDeviceTypesAccess().getGroup()); 
            // InternalIoT.g:276:3: ( rule__DeviceTypes__Group__0 )
            // InternalIoT.g:276:4: rule__DeviceTypes__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DeviceTypes__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDeviceTypesAccess().getGroup()); 

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
    // InternalIoT.g:285:1: entryRuleDevice : ruleDevice EOF ;
    public final void entryRuleDevice() throws RecognitionException {
        try {
            // InternalIoT.g:286:1: ( ruleDevice EOF )
            // InternalIoT.g:287:1: ruleDevice EOF
            {
             before(grammarAccess.getDeviceRule()); 
            pushFollow(FOLLOW_1);
            ruleDevice();

            state._fsp--;

             after(grammarAccess.getDeviceRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalIoT.g:294:1: ruleDevice : ( ( rule__Device__Group__0 ) ) ;
    public final void ruleDevice() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:298:2: ( ( ( rule__Device__Group__0 ) ) )
            // InternalIoT.g:299:2: ( ( rule__Device__Group__0 ) )
            {
            // InternalIoT.g:299:2: ( ( rule__Device__Group__0 ) )
            // InternalIoT.g:300:3: ( rule__Device__Group__0 )
            {
             before(grammarAccess.getDeviceAccess().getGroup()); 
            // InternalIoT.g:301:3: ( rule__Device__Group__0 )
            // InternalIoT.g:301:4: rule__Device__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Device__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDeviceAccess().getGroup()); 

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
    // InternalIoT.g:310:1: entryRuleServerType : ruleServerType EOF ;
    public final void entryRuleServerType() throws RecognitionException {
        try {
            // InternalIoT.g:311:1: ( ruleServerType EOF )
            // InternalIoT.g:312:1: ruleServerType EOF
            {
             before(grammarAccess.getServerTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleServerType();

            state._fsp--;

             after(grammarAccess.getServerTypeRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalIoT.g:319:1: ruleServerType : ( ( rule__ServerType__NameAssignment ) ) ;
    public final void ruleServerType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:323:2: ( ( ( rule__ServerType__NameAssignment ) ) )
            // InternalIoT.g:324:2: ( ( rule__ServerType__NameAssignment ) )
            {
            // InternalIoT.g:324:2: ( ( rule__ServerType__NameAssignment ) )
            // InternalIoT.g:325:3: ( rule__ServerType__NameAssignment )
            {
             before(grammarAccess.getServerTypeAccess().getNameAssignment()); 
            // InternalIoT.g:326:3: ( rule__ServerType__NameAssignment )
            // InternalIoT.g:326:4: rule__ServerType__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ServerType__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getServerTypeAccess().getNameAssignment()); 

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
    // InternalIoT.g:335:1: entryRuleServerTypes : ruleServerTypes EOF ;
    public final void entryRuleServerTypes() throws RecognitionException {
        try {
            // InternalIoT.g:336:1: ( ruleServerTypes EOF )
            // InternalIoT.g:337:1: ruleServerTypes EOF
            {
             before(grammarAccess.getServerTypesRule()); 
            pushFollow(FOLLOW_1);
            ruleServerTypes();

            state._fsp--;

             after(grammarAccess.getServerTypesRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalIoT.g:344:1: ruleServerTypes : ( ( rule__ServerTypes__Group__0 ) ) ;
    public final void ruleServerTypes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:348:2: ( ( ( rule__ServerTypes__Group__0 ) ) )
            // InternalIoT.g:349:2: ( ( rule__ServerTypes__Group__0 ) )
            {
            // InternalIoT.g:349:2: ( ( rule__ServerTypes__Group__0 ) )
            // InternalIoT.g:350:3: ( rule__ServerTypes__Group__0 )
            {
             before(grammarAccess.getServerTypesAccess().getGroup()); 
            // InternalIoT.g:351:3: ( rule__ServerTypes__Group__0 )
            // InternalIoT.g:351:4: rule__ServerTypes__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ServerTypes__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getServerTypesAccess().getGroup()); 

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
    // InternalIoT.g:360:1: entryRuleServer : ruleServer EOF ;
    public final void entryRuleServer() throws RecognitionException {
        try {
            // InternalIoT.g:361:1: ( ruleServer EOF )
            // InternalIoT.g:362:1: ruleServer EOF
            {
             before(grammarAccess.getServerRule()); 
            pushFollow(FOLLOW_1);
            ruleServer();

            state._fsp--;

             after(grammarAccess.getServerRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalIoT.g:369:1: ruleServer : ( ( rule__Server__Group__0 ) ) ;
    public final void ruleServer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:373:2: ( ( ( rule__Server__Group__0 ) ) )
            // InternalIoT.g:374:2: ( ( rule__Server__Group__0 ) )
            {
            // InternalIoT.g:374:2: ( ( rule__Server__Group__0 ) )
            // InternalIoT.g:375:3: ( rule__Server__Group__0 )
            {
             before(grammarAccess.getServerAccess().getGroup()); 
            // InternalIoT.g:376:3: ( rule__Server__Group__0 )
            // InternalIoT.g:376:4: rule__Server__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Server__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getServerAccess().getGroup()); 

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
    // InternalIoT.g:385:1: entryRuleDestinationType : ruleDestinationType EOF ;
    public final void entryRuleDestinationType() throws RecognitionException {
        try {
            // InternalIoT.g:386:1: ( ruleDestinationType EOF )
            // InternalIoT.g:387:1: ruleDestinationType EOF
            {
             before(grammarAccess.getDestinationTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleDestinationType();

            state._fsp--;

             after(grammarAccess.getDestinationTypeRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalIoT.g:394:1: ruleDestinationType : ( ( rule__DestinationType__NameAssignment ) ) ;
    public final void ruleDestinationType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:398:2: ( ( ( rule__DestinationType__NameAssignment ) ) )
            // InternalIoT.g:399:2: ( ( rule__DestinationType__NameAssignment ) )
            {
            // InternalIoT.g:399:2: ( ( rule__DestinationType__NameAssignment ) )
            // InternalIoT.g:400:3: ( rule__DestinationType__NameAssignment )
            {
             before(grammarAccess.getDestinationTypeAccess().getNameAssignment()); 
            // InternalIoT.g:401:3: ( rule__DestinationType__NameAssignment )
            // InternalIoT.g:401:4: rule__DestinationType__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__DestinationType__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getDestinationTypeAccess().getNameAssignment()); 

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
    // InternalIoT.g:410:1: entryRuleDestinationTypes : ruleDestinationTypes EOF ;
    public final void entryRuleDestinationTypes() throws RecognitionException {
        try {
            // InternalIoT.g:411:1: ( ruleDestinationTypes EOF )
            // InternalIoT.g:412:1: ruleDestinationTypes EOF
            {
             before(grammarAccess.getDestinationTypesRule()); 
            pushFollow(FOLLOW_1);
            ruleDestinationTypes();

            state._fsp--;

             after(grammarAccess.getDestinationTypesRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalIoT.g:419:1: ruleDestinationTypes : ( ( rule__DestinationTypes__Group__0 ) ) ;
    public final void ruleDestinationTypes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:423:2: ( ( ( rule__DestinationTypes__Group__0 ) ) )
            // InternalIoT.g:424:2: ( ( rule__DestinationTypes__Group__0 ) )
            {
            // InternalIoT.g:424:2: ( ( rule__DestinationTypes__Group__0 ) )
            // InternalIoT.g:425:3: ( rule__DestinationTypes__Group__0 )
            {
             before(grammarAccess.getDestinationTypesAccess().getGroup()); 
            // InternalIoT.g:426:3: ( rule__DestinationTypes__Group__0 )
            // InternalIoT.g:426:4: rule__DestinationTypes__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DestinationTypes__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDestinationTypesAccess().getGroup()); 

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
    // InternalIoT.g:435:1: entryRuleDestination : ruleDestination EOF ;
    public final void entryRuleDestination() throws RecognitionException {
        try {
            // InternalIoT.g:436:1: ( ruleDestination EOF )
            // InternalIoT.g:437:1: ruleDestination EOF
            {
             before(grammarAccess.getDestinationRule()); 
            pushFollow(FOLLOW_1);
            ruleDestination();

            state._fsp--;

             after(grammarAccess.getDestinationRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalIoT.g:444:1: ruleDestination : ( ( rule__Destination__Group__0 ) ) ;
    public final void ruleDestination() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:448:2: ( ( ( rule__Destination__Group__0 ) ) )
            // InternalIoT.g:449:2: ( ( rule__Destination__Group__0 ) )
            {
            // InternalIoT.g:449:2: ( ( rule__Destination__Group__0 ) )
            // InternalIoT.g:450:3: ( rule__Destination__Group__0 )
            {
             before(grammarAccess.getDestinationAccess().getGroup()); 
            // InternalIoT.g:451:3: ( rule__Destination__Group__0 )
            // InternalIoT.g:451:4: rule__Destination__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Destination__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDestinationAccess().getGroup()); 

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
    // InternalIoT.g:460:1: entryRuleFetchData : ruleFetchData EOF ;
    public final void entryRuleFetchData() throws RecognitionException {
        try {
            // InternalIoT.g:461:1: ( ruleFetchData EOF )
            // InternalIoT.g:462:1: ruleFetchData EOF
            {
             before(grammarAccess.getFetchDataRule()); 
            pushFollow(FOLLOW_1);
            ruleFetchData();

            state._fsp--;

             after(grammarAccess.getFetchDataRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalIoT.g:469:1: ruleFetchData : ( ( rule__FetchData__Group__0 ) ) ;
    public final void ruleFetchData() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:473:2: ( ( ( rule__FetchData__Group__0 ) ) )
            // InternalIoT.g:474:2: ( ( rule__FetchData__Group__0 ) )
            {
            // InternalIoT.g:474:2: ( ( rule__FetchData__Group__0 ) )
            // InternalIoT.g:475:3: ( rule__FetchData__Group__0 )
            {
             before(grammarAccess.getFetchDataAccess().getGroup()); 
            // InternalIoT.g:476:3: ( rule__FetchData__Group__0 )
            // InternalIoT.g:476:4: rule__FetchData__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FetchData__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFetchDataAccess().getGroup()); 

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
    // InternalIoT.g:485:1: entryRuleFetchDataExpression : ruleFetchDataExpression EOF ;
    public final void entryRuleFetchDataExpression() throws RecognitionException {
        try {
            // InternalIoT.g:486:1: ( ruleFetchDataExpression EOF )
            // InternalIoT.g:487:1: ruleFetchDataExpression EOF
            {
             before(grammarAccess.getFetchDataExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleFetchDataExpression();

            state._fsp--;

             after(grammarAccess.getFetchDataExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalIoT.g:494:1: ruleFetchDataExpression : ( ( rule__FetchDataExpression__Group__0 ) ) ;
    public final void ruleFetchDataExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:498:2: ( ( ( rule__FetchDataExpression__Group__0 ) ) )
            // InternalIoT.g:499:2: ( ( rule__FetchDataExpression__Group__0 ) )
            {
            // InternalIoT.g:499:2: ( ( rule__FetchDataExpression__Group__0 ) )
            // InternalIoT.g:500:3: ( rule__FetchDataExpression__Group__0 )
            {
             before(grammarAccess.getFetchDataExpressionAccess().getGroup()); 
            // InternalIoT.g:501:3: ( rule__FetchDataExpression__Group__0 )
            // InternalIoT.g:501:4: rule__FetchDataExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FetchDataExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFetchDataExpressionAccess().getGroup()); 

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
    // InternalIoT.g:510:1: entryRuleFetchDataCondition : ruleFetchDataCondition EOF ;
    public final void entryRuleFetchDataCondition() throws RecognitionException {
        try {
            // InternalIoT.g:511:1: ( ruleFetchDataCondition EOF )
            // InternalIoT.g:512:1: ruleFetchDataCondition EOF
            {
             before(grammarAccess.getFetchDataConditionRule()); 
            pushFollow(FOLLOW_1);
            ruleFetchDataCondition();

            state._fsp--;

             after(grammarAccess.getFetchDataConditionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalIoT.g:519:1: ruleFetchDataCondition : ( ( rule__FetchDataCondition__Group__0 ) ) ;
    public final void ruleFetchDataCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:523:2: ( ( ( rule__FetchDataCondition__Group__0 ) ) )
            // InternalIoT.g:524:2: ( ( rule__FetchDataCondition__Group__0 ) )
            {
            // InternalIoT.g:524:2: ( ( rule__FetchDataCondition__Group__0 ) )
            // InternalIoT.g:525:3: ( rule__FetchDataCondition__Group__0 )
            {
             before(grammarAccess.getFetchDataConditionAccess().getGroup()); 
            // InternalIoT.g:526:3: ( rule__FetchDataCondition__Group__0 )
            // InternalIoT.g:526:4: rule__FetchDataCondition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FetchDataCondition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFetchDataConditionAccess().getGroup()); 

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
    // InternalIoT.g:535:1: entryRuleTimeUnit : ruleTimeUnit EOF ;
    public final void entryRuleTimeUnit() throws RecognitionException {
        try {
            // InternalIoT.g:536:1: ( ruleTimeUnit EOF )
            // InternalIoT.g:537:1: ruleTimeUnit EOF
            {
             before(grammarAccess.getTimeUnitRule()); 
            pushFollow(FOLLOW_1);
            ruleTimeUnit();

            state._fsp--;

             after(grammarAccess.getTimeUnitRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalIoT.g:544:1: ruleTimeUnit : ( ( rule__TimeUnit__Alternatives ) ) ;
    public final void ruleTimeUnit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:548:2: ( ( ( rule__TimeUnit__Alternatives ) ) )
            // InternalIoT.g:549:2: ( ( rule__TimeUnit__Alternatives ) )
            {
            // InternalIoT.g:549:2: ( ( rule__TimeUnit__Alternatives ) )
            // InternalIoT.g:550:3: ( rule__TimeUnit__Alternatives )
            {
             before(grammarAccess.getTimeUnitAccess().getAlternatives()); 
            // InternalIoT.g:551:3: ( rule__TimeUnit__Alternatives )
            // InternalIoT.g:551:4: rule__TimeUnit__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TimeUnit__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTimeUnitAccess().getAlternatives()); 

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
    // InternalIoT.g:560:1: entryRuleCondition : ruleCondition EOF ;
    public final void entryRuleCondition() throws RecognitionException {
        try {
            // InternalIoT.g:561:1: ( ruleCondition EOF )
            // InternalIoT.g:562:1: ruleCondition EOF
            {
             before(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_1);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getConditionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalIoT.g:569:1: ruleCondition : ( '_??' ) ;
    public final void ruleCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:573:2: ( ( '_??' ) )
            // InternalIoT.g:574:2: ( '_??' )
            {
            // InternalIoT.g:574:2: ( '_??' )
            // InternalIoT.g:575:3: '_??'
            {
             before(grammarAccess.getConditionAccess().get_Keyword()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getConditionAccess().get_Keyword()); 

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


    // $ANTLR start "entryRuleIp"
    // InternalIoT.g:585:1: entryRuleIp : ruleIp EOF ;
    public final void entryRuleIp() throws RecognitionException {
        try {
            // InternalIoT.g:586:1: ( ruleIp EOF )
            // InternalIoT.g:587:1: ruleIp EOF
            {
             before(grammarAccess.getIpRule()); 
            pushFollow(FOLLOW_1);
            ruleIp();

            state._fsp--;

             after(grammarAccess.getIpRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalIoT.g:594:1: ruleIp : ( ( rule__Ip__Group__0 ) ) ;
    public final void ruleIp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:598:2: ( ( ( rule__Ip__Group__0 ) ) )
            // InternalIoT.g:599:2: ( ( rule__Ip__Group__0 ) )
            {
            // InternalIoT.g:599:2: ( ( rule__Ip__Group__0 ) )
            // InternalIoT.g:600:3: ( rule__Ip__Group__0 )
            {
             before(grammarAccess.getIpAccess().getGroup()); 
            // InternalIoT.g:601:3: ( rule__Ip__Group__0 )
            // InternalIoT.g:601:4: rule__Ip__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Ip__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIpAccess().getGroup()); 

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
    // InternalIoT.g:610:1: entryRulePortnumber : rulePortnumber EOF ;
    public final void entryRulePortnumber() throws RecognitionException {
        try {
            // InternalIoT.g:611:1: ( rulePortnumber EOF )
            // InternalIoT.g:612:1: rulePortnumber EOF
            {
             before(grammarAccess.getPortnumberRule()); 
            pushFollow(FOLLOW_1);
            rulePortnumber();

            state._fsp--;

             after(grammarAccess.getPortnumberRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalIoT.g:619:1: rulePortnumber : ( ( rule__Portnumber__Group__0 ) ) ;
    public final void rulePortnumber() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:623:2: ( ( ( rule__Portnumber__Group__0 ) ) )
            // InternalIoT.g:624:2: ( ( rule__Portnumber__Group__0 ) )
            {
            // InternalIoT.g:624:2: ( ( rule__Portnumber__Group__0 ) )
            // InternalIoT.g:625:3: ( rule__Portnumber__Group__0 )
            {
             before(grammarAccess.getPortnumberAccess().getGroup()); 
            // InternalIoT.g:626:3: ( rule__Portnumber__Group__0 )
            // InternalIoT.g:626:4: rule__Portnumber__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Portnumber__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPortnumberAccess().getGroup()); 

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
    // InternalIoT.g:635:1: entryRuleTime : ruleTime EOF ;
    public final void entryRuleTime() throws RecognitionException {
        try {
            // InternalIoT.g:636:1: ( ruleTime EOF )
            // InternalIoT.g:637:1: ruleTime EOF
            {
             before(grammarAccess.getTimeRule()); 
            pushFollow(FOLLOW_1);
            ruleTime();

            state._fsp--;

             after(grammarAccess.getTimeRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalIoT.g:644:1: ruleTime : ( ( rule__Time__TimeAssignment ) ) ;
    public final void ruleTime() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:648:2: ( ( ( rule__Time__TimeAssignment ) ) )
            // InternalIoT.g:649:2: ( ( rule__Time__TimeAssignment ) )
            {
            // InternalIoT.g:649:2: ( ( rule__Time__TimeAssignment ) )
            // InternalIoT.g:650:3: ( rule__Time__TimeAssignment )
            {
             before(grammarAccess.getTimeAccess().getTimeAssignment()); 
            // InternalIoT.g:651:3: ( rule__Time__TimeAssignment )
            // InternalIoT.g:651:4: rule__Time__TimeAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Time__TimeAssignment();

            state._fsp--;


            }

             after(grammarAccess.getTimeAccess().getTimeAssignment()); 

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
    // InternalIoT.g:659:1: rule__System__SystemAlternatives_0 : ( ( ruleSensorTypes ) | ( ruleSensor ) | ( ruleSensorGroup ) | ( ruleSensorGetMethod ) | ( ruleDeviceTypes ) | ( ruleDevice ) | ( ruleServerTypes ) | ( ruleServer ) | ( ruleDestinationTypes ) | ( ruleDestination ) | ( ruleFetchData ) );
    public final void rule__System__SystemAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:663:1: ( ( ruleSensorTypes ) | ( ruleSensor ) | ( ruleSensorGroup ) | ( ruleSensorGetMethod ) | ( ruleDeviceTypes ) | ( ruleDevice ) | ( ruleServerTypes ) | ( ruleServer ) | ( ruleDestinationTypes ) | ( ruleDestination ) | ( ruleFetchData ) )
            int alt2=11;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt2=1;
                }
                break;
            case 20:
                {
                alt2=2;
                }
                break;
            case 23:
                {
                alt2=3;
                }
                break;
            case 25:
                {
                alt2=4;
                }
                break;
            case 29:
                {
                alt2=5;
                }
                break;
            case 30:
                {
                alt2=6;
                }
                break;
            case 34:
                {
                alt2=7;
                }
                break;
            case 35:
                {
                alt2=8;
                }
                break;
            case 39:
                {
                alt2=9;
                }
                break;
            case 40:
                {
                alt2=10;
                }
                break;
            case 41:
                {
                alt2=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalIoT.g:664:2: ( ruleSensorTypes )
                    {
                    // InternalIoT.g:664:2: ( ruleSensorTypes )
                    // InternalIoT.g:665:3: ruleSensorTypes
                    {
                     before(grammarAccess.getSystemAccess().getSystemSensorTypesParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSensorTypes();

                    state._fsp--;

                     after(grammarAccess.getSystemAccess().getSystemSensorTypesParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalIoT.g:670:2: ( ruleSensor )
                    {
                    // InternalIoT.g:670:2: ( ruleSensor )
                    // InternalIoT.g:671:3: ruleSensor
                    {
                     before(grammarAccess.getSystemAccess().getSystemSensorParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleSensor();

                    state._fsp--;

                     after(grammarAccess.getSystemAccess().getSystemSensorParserRuleCall_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalIoT.g:676:2: ( ruleSensorGroup )
                    {
                    // InternalIoT.g:676:2: ( ruleSensorGroup )
                    // InternalIoT.g:677:3: ruleSensorGroup
                    {
                     before(grammarAccess.getSystemAccess().getSystemSensorGroupParserRuleCall_0_2()); 
                    pushFollow(FOLLOW_2);
                    ruleSensorGroup();

                    state._fsp--;

                     after(grammarAccess.getSystemAccess().getSystemSensorGroupParserRuleCall_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalIoT.g:682:2: ( ruleSensorGetMethod )
                    {
                    // InternalIoT.g:682:2: ( ruleSensorGetMethod )
                    // InternalIoT.g:683:3: ruleSensorGetMethod
                    {
                     before(grammarAccess.getSystemAccess().getSystemSensorGetMethodParserRuleCall_0_3()); 
                    pushFollow(FOLLOW_2);
                    ruleSensorGetMethod();

                    state._fsp--;

                     after(grammarAccess.getSystemAccess().getSystemSensorGetMethodParserRuleCall_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalIoT.g:688:2: ( ruleDeviceTypes )
                    {
                    // InternalIoT.g:688:2: ( ruleDeviceTypes )
                    // InternalIoT.g:689:3: ruleDeviceTypes
                    {
                     before(grammarAccess.getSystemAccess().getSystemDeviceTypesParserRuleCall_0_4()); 
                    pushFollow(FOLLOW_2);
                    ruleDeviceTypes();

                    state._fsp--;

                     after(grammarAccess.getSystemAccess().getSystemDeviceTypesParserRuleCall_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalIoT.g:694:2: ( ruleDevice )
                    {
                    // InternalIoT.g:694:2: ( ruleDevice )
                    // InternalIoT.g:695:3: ruleDevice
                    {
                     before(grammarAccess.getSystemAccess().getSystemDeviceParserRuleCall_0_5()); 
                    pushFollow(FOLLOW_2);
                    ruleDevice();

                    state._fsp--;

                     after(grammarAccess.getSystemAccess().getSystemDeviceParserRuleCall_0_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalIoT.g:700:2: ( ruleServerTypes )
                    {
                    // InternalIoT.g:700:2: ( ruleServerTypes )
                    // InternalIoT.g:701:3: ruleServerTypes
                    {
                     before(grammarAccess.getSystemAccess().getSystemServerTypesParserRuleCall_0_6()); 
                    pushFollow(FOLLOW_2);
                    ruleServerTypes();

                    state._fsp--;

                     after(grammarAccess.getSystemAccess().getSystemServerTypesParserRuleCall_0_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalIoT.g:706:2: ( ruleServer )
                    {
                    // InternalIoT.g:706:2: ( ruleServer )
                    // InternalIoT.g:707:3: ruleServer
                    {
                     before(grammarAccess.getSystemAccess().getSystemServerParserRuleCall_0_7()); 
                    pushFollow(FOLLOW_2);
                    ruleServer();

                    state._fsp--;

                     after(grammarAccess.getSystemAccess().getSystemServerParserRuleCall_0_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalIoT.g:712:2: ( ruleDestinationTypes )
                    {
                    // InternalIoT.g:712:2: ( ruleDestinationTypes )
                    // InternalIoT.g:713:3: ruleDestinationTypes
                    {
                     before(grammarAccess.getSystemAccess().getSystemDestinationTypesParserRuleCall_0_8()); 
                    pushFollow(FOLLOW_2);
                    ruleDestinationTypes();

                    state._fsp--;

                     after(grammarAccess.getSystemAccess().getSystemDestinationTypesParserRuleCall_0_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalIoT.g:718:2: ( ruleDestination )
                    {
                    // InternalIoT.g:718:2: ( ruleDestination )
                    // InternalIoT.g:719:3: ruleDestination
                    {
                     before(grammarAccess.getSystemAccess().getSystemDestinationParserRuleCall_0_9()); 
                    pushFollow(FOLLOW_2);
                    ruleDestination();

                    state._fsp--;

                     after(grammarAccess.getSystemAccess().getSystemDestinationParserRuleCall_0_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalIoT.g:724:2: ( ruleFetchData )
                    {
                    // InternalIoT.g:724:2: ( ruleFetchData )
                    // InternalIoT.g:725:3: ruleFetchData
                    {
                     before(grammarAccess.getSystemAccess().getSystemFetchDataParserRuleCall_0_10()); 
                    pushFollow(FOLLOW_2);
                    ruleFetchData();

                    state._fsp--;

                     after(grammarAccess.getSystemAccess().getSystemFetchDataParserRuleCall_0_10()); 

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
    // InternalIoT.g:734:1: rule__Device__Alternatives_6 : ( ( ( rule__Device__Group_6_0__0 ) ) | ( ( rule__Device__Group_6_1__0 ) ) );
    public final void rule__Device__Alternatives_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:738:1: ( ( ( rule__Device__Group_6_0__0 ) ) | ( ( rule__Device__Group_6_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==32) ) {
                alt3=1;
            }
            else if ( (LA3_0==33) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalIoT.g:739:2: ( ( rule__Device__Group_6_0__0 ) )
                    {
                    // InternalIoT.g:739:2: ( ( rule__Device__Group_6_0__0 ) )
                    // InternalIoT.g:740:3: ( rule__Device__Group_6_0__0 )
                    {
                     before(grammarAccess.getDeviceAccess().getGroup_6_0()); 
                    // InternalIoT.g:741:3: ( rule__Device__Group_6_0__0 )
                    // InternalIoT.g:741:4: rule__Device__Group_6_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Device__Group_6_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDeviceAccess().getGroup_6_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalIoT.g:745:2: ( ( rule__Device__Group_6_1__0 ) )
                    {
                    // InternalIoT.g:745:2: ( ( rule__Device__Group_6_1__0 ) )
                    // InternalIoT.g:746:3: ( rule__Device__Group_6_1__0 )
                    {
                     before(grammarAccess.getDeviceAccess().getGroup_6_1()); 
                    // InternalIoT.g:747:3: ( rule__Device__Group_6_1__0 )
                    // InternalIoT.g:747:4: rule__Device__Group_6_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Device__Group_6_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDeviceAccess().getGroup_6_1()); 

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
    // InternalIoT.g:755:1: rule__FetchData__Alternatives_3 : ( ( ( rule__FetchData__Group_3_0__0 ) ) | ( ( rule__FetchData__Group_3_1__0 ) ) );
    public final void rule__FetchData__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:759:1: ( ( ( rule__FetchData__Group_3_0__0 ) ) | ( ( rule__FetchData__Group_3_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==22) ) {
                alt4=1;
            }
            else if ( (LA4_0==33) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalIoT.g:760:2: ( ( rule__FetchData__Group_3_0__0 ) )
                    {
                    // InternalIoT.g:760:2: ( ( rule__FetchData__Group_3_0__0 ) )
                    // InternalIoT.g:761:3: ( rule__FetchData__Group_3_0__0 )
                    {
                     before(grammarAccess.getFetchDataAccess().getGroup_3_0()); 
                    // InternalIoT.g:762:3: ( rule__FetchData__Group_3_0__0 )
                    // InternalIoT.g:762:4: rule__FetchData__Group_3_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FetchData__Group_3_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFetchDataAccess().getGroup_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalIoT.g:766:2: ( ( rule__FetchData__Group_3_1__0 ) )
                    {
                    // InternalIoT.g:766:2: ( ( rule__FetchData__Group_3_1__0 ) )
                    // InternalIoT.g:767:3: ( rule__FetchData__Group_3_1__0 )
                    {
                     before(grammarAccess.getFetchDataAccess().getGroup_3_1()); 
                    // InternalIoT.g:768:3: ( rule__FetchData__Group_3_1__0 )
                    // InternalIoT.g:768:4: rule__FetchData__Group_3_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FetchData__Group_3_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFetchDataAccess().getGroup_3_1()); 

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
    // InternalIoT.g:776:1: rule__FetchData__Alternatives_8 : ( ( ( rule__FetchData__Group_8_0__0 ) ) | ( ( rule__FetchData__Group_8_1__0 ) ) );
    public final void rule__FetchData__Alternatives_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:780:1: ( ( ( rule__FetchData__Group_8_0__0 ) ) | ( ( rule__FetchData__Group_8_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==45) ) {
                alt5=1;
            }
            else if ( (LA5_0==46) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalIoT.g:781:2: ( ( rule__FetchData__Group_8_0__0 ) )
                    {
                    // InternalIoT.g:781:2: ( ( rule__FetchData__Group_8_0__0 ) )
                    // InternalIoT.g:782:3: ( rule__FetchData__Group_8_0__0 )
                    {
                     before(grammarAccess.getFetchDataAccess().getGroup_8_0()); 
                    // InternalIoT.g:783:3: ( rule__FetchData__Group_8_0__0 )
                    // InternalIoT.g:783:4: rule__FetchData__Group_8_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FetchData__Group_8_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFetchDataAccess().getGroup_8_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalIoT.g:787:2: ( ( rule__FetchData__Group_8_1__0 ) )
                    {
                    // InternalIoT.g:787:2: ( ( rule__FetchData__Group_8_1__0 ) )
                    // InternalIoT.g:788:3: ( rule__FetchData__Group_8_1__0 )
                    {
                     before(grammarAccess.getFetchDataAccess().getGroup_8_1()); 
                    // InternalIoT.g:789:3: ( rule__FetchData__Group_8_1__0 )
                    // InternalIoT.g:789:4: rule__FetchData__Group_8_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FetchData__Group_8_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFetchDataAccess().getGroup_8_1()); 

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


    // $ANTLR start "rule__FetchData__Alternatives_9"
    // InternalIoT.g:797:1: rule__FetchData__Alternatives_9 : ( ( ( rule__FetchData__ConExpAssignment_9_0 ) ) | ( ( rule__FetchData__ConExpAssignment_9_1 ) ) );
    public final void rule__FetchData__Alternatives_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:801:1: ( ( ( rule__FetchData__ConExpAssignment_9_0 ) ) | ( ( rule__FetchData__ConExpAssignment_9_1 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==47) ) {
                alt6=1;
            }
            else if ( ((LA6_0>=12 && LA6_0<=13)) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalIoT.g:802:2: ( ( rule__FetchData__ConExpAssignment_9_0 ) )
                    {
                    // InternalIoT.g:802:2: ( ( rule__FetchData__ConExpAssignment_9_0 ) )
                    // InternalIoT.g:803:3: ( rule__FetchData__ConExpAssignment_9_0 )
                    {
                     before(grammarAccess.getFetchDataAccess().getConExpAssignment_9_0()); 
                    // InternalIoT.g:804:3: ( rule__FetchData__ConExpAssignment_9_0 )
                    // InternalIoT.g:804:4: rule__FetchData__ConExpAssignment_9_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FetchData__ConExpAssignment_9_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFetchDataAccess().getConExpAssignment_9_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalIoT.g:808:2: ( ( rule__FetchData__ConExpAssignment_9_1 ) )
                    {
                    // InternalIoT.g:808:2: ( ( rule__FetchData__ConExpAssignment_9_1 ) )
                    // InternalIoT.g:809:3: ( rule__FetchData__ConExpAssignment_9_1 )
                    {
                     before(grammarAccess.getFetchDataAccess().getConExpAssignment_9_1()); 
                    // InternalIoT.g:810:3: ( rule__FetchData__ConExpAssignment_9_1 )
                    // InternalIoT.g:810:4: rule__FetchData__ConExpAssignment_9_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__FetchData__ConExpAssignment_9_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getFetchDataAccess().getConExpAssignment_9_1()); 

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
    // $ANTLR end "rule__FetchData__Alternatives_9"


    // $ANTLR start "rule__FetchDataCondition__Alternatives_0"
    // InternalIoT.g:818:1: rule__FetchDataCondition__Alternatives_0 : ( ( 'when' ) | ( 'if' ) );
    public final void rule__FetchDataCondition__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:822:1: ( ( 'when' ) | ( 'if' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==12) ) {
                alt7=1;
            }
            else if ( (LA7_0==13) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalIoT.g:823:2: ( 'when' )
                    {
                    // InternalIoT.g:823:2: ( 'when' )
                    // InternalIoT.g:824:3: 'when'
                    {
                     before(grammarAccess.getFetchDataConditionAccess().getWhenKeyword_0_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getFetchDataConditionAccess().getWhenKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalIoT.g:829:2: ( 'if' )
                    {
                    // InternalIoT.g:829:2: ( 'if' )
                    // InternalIoT.g:830:3: 'if'
                    {
                     before(grammarAccess.getFetchDataConditionAccess().getIfKeyword_0_1()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getFetchDataConditionAccess().getIfKeyword_0_1()); 

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
    // $ANTLR end "rule__FetchDataCondition__Alternatives_0"


    // $ANTLR start "rule__TimeUnit__Alternatives"
    // InternalIoT.g:839:1: rule__TimeUnit__Alternatives : ( ( 'ms' ) | ( 's' ) | ( 'm' ) | ( 'h' ) );
    public final void rule__TimeUnit__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:843:1: ( ( 'ms' ) | ( 's' ) | ( 'm' ) | ( 'h' ) )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt8=1;
                }
                break;
            case 15:
                {
                alt8=2;
                }
                break;
            case 16:
                {
                alt8=3;
                }
                break;
            case 17:
                {
                alt8=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalIoT.g:844:2: ( 'ms' )
                    {
                    // InternalIoT.g:844:2: ( 'ms' )
                    // InternalIoT.g:845:3: 'ms'
                    {
                     before(grammarAccess.getTimeUnitAccess().getMsKeyword_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getTimeUnitAccess().getMsKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalIoT.g:850:2: ( 's' )
                    {
                    // InternalIoT.g:850:2: ( 's' )
                    // InternalIoT.g:851:3: 's'
                    {
                     before(grammarAccess.getTimeUnitAccess().getSKeyword_1()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getTimeUnitAccess().getSKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalIoT.g:856:2: ( 'm' )
                    {
                    // InternalIoT.g:856:2: ( 'm' )
                    // InternalIoT.g:857:3: 'm'
                    {
                     before(grammarAccess.getTimeUnitAccess().getMKeyword_2()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getTimeUnitAccess().getMKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalIoT.g:862:2: ( 'h' )
                    {
                    // InternalIoT.g:862:2: ( 'h' )
                    // InternalIoT.g:863:3: 'h'
                    {
                     before(grammarAccess.getTimeUnitAccess().getHKeyword_3()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getTimeUnitAccess().getHKeyword_3()); 

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


    // $ANTLR start "rule__SensorTypes__Group__0"
    // InternalIoT.g:872:1: rule__SensorTypes__Group__0 : rule__SensorTypes__Group__0__Impl rule__SensorTypes__Group__1 ;
    public final void rule__SensorTypes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:876:1: ( rule__SensorTypes__Group__0__Impl rule__SensorTypes__Group__1 )
            // InternalIoT.g:877:2: rule__SensorTypes__Group__0__Impl rule__SensorTypes__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__SensorTypes__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SensorTypes__Group__1();

            state._fsp--;


            }

        }
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
    // InternalIoT.g:884:1: rule__SensorTypes__Group__0__Impl : ( 'SensorTypes' ) ;
    public final void rule__SensorTypes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:888:1: ( ( 'SensorTypes' ) )
            // InternalIoT.g:889:1: ( 'SensorTypes' )
            {
            // InternalIoT.g:889:1: ( 'SensorTypes' )
            // InternalIoT.g:890:2: 'SensorTypes'
            {
             before(grammarAccess.getSensorTypesAccess().getSensorTypesKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getSensorTypesAccess().getSensorTypesKeyword_0()); 

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
    // InternalIoT.g:899:1: rule__SensorTypes__Group__1 : rule__SensorTypes__Group__1__Impl rule__SensorTypes__Group__2 ;
    public final void rule__SensorTypes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:903:1: ( rule__SensorTypes__Group__1__Impl rule__SensorTypes__Group__2 )
            // InternalIoT.g:904:2: rule__SensorTypes__Group__1__Impl rule__SensorTypes__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__SensorTypes__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SensorTypes__Group__2();

            state._fsp--;


            }

        }
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
    // InternalIoT.g:911:1: rule__SensorTypes__Group__1__Impl : ( ( rule__SensorTypes__TypesAssignment_1 ) ) ;
    public final void rule__SensorTypes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:915:1: ( ( ( rule__SensorTypes__TypesAssignment_1 ) ) )
            // InternalIoT.g:916:1: ( ( rule__SensorTypes__TypesAssignment_1 ) )
            {
            // InternalIoT.g:916:1: ( ( rule__SensorTypes__TypesAssignment_1 ) )
            // InternalIoT.g:917:2: ( rule__SensorTypes__TypesAssignment_1 )
            {
             before(grammarAccess.getSensorTypesAccess().getTypesAssignment_1()); 
            // InternalIoT.g:918:2: ( rule__SensorTypes__TypesAssignment_1 )
            // InternalIoT.g:918:3: rule__SensorTypes__TypesAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SensorTypes__TypesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSensorTypesAccess().getTypesAssignment_1()); 

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
    // InternalIoT.g:926:1: rule__SensorTypes__Group__2 : rule__SensorTypes__Group__2__Impl ;
    public final void rule__SensorTypes__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:930:1: ( rule__SensorTypes__Group__2__Impl )
            // InternalIoT.g:931:2: rule__SensorTypes__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SensorTypes__Group__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalIoT.g:937:1: rule__SensorTypes__Group__2__Impl : ( ( rule__SensorTypes__Group_2__0 )* ) ;
    public final void rule__SensorTypes__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:941:1: ( ( ( rule__SensorTypes__Group_2__0 )* ) )
            // InternalIoT.g:942:1: ( ( rule__SensorTypes__Group_2__0 )* )
            {
            // InternalIoT.g:942:1: ( ( rule__SensorTypes__Group_2__0 )* )
            // InternalIoT.g:943:2: ( rule__SensorTypes__Group_2__0 )*
            {
             before(grammarAccess.getSensorTypesAccess().getGroup_2()); 
            // InternalIoT.g:944:2: ( rule__SensorTypes__Group_2__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==19) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalIoT.g:944:3: rule__SensorTypes__Group_2__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__SensorTypes__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getSensorTypesAccess().getGroup_2()); 

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
    // InternalIoT.g:953:1: rule__SensorTypes__Group_2__0 : rule__SensorTypes__Group_2__0__Impl rule__SensorTypes__Group_2__1 ;
    public final void rule__SensorTypes__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:957:1: ( rule__SensorTypes__Group_2__0__Impl rule__SensorTypes__Group_2__1 )
            // InternalIoT.g:958:2: rule__SensorTypes__Group_2__0__Impl rule__SensorTypes__Group_2__1
            {
            pushFollow(FOLLOW_4);
            rule__SensorTypes__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SensorTypes__Group_2__1();

            state._fsp--;


            }

        }
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
    // InternalIoT.g:965:1: rule__SensorTypes__Group_2__0__Impl : ( ',' ) ;
    public final void rule__SensorTypes__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:969:1: ( ( ',' ) )
            // InternalIoT.g:970:1: ( ',' )
            {
            // InternalIoT.g:970:1: ( ',' )
            // InternalIoT.g:971:2: ','
            {
             before(grammarAccess.getSensorTypesAccess().getCommaKeyword_2_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getSensorTypesAccess().getCommaKeyword_2_0()); 

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
    // InternalIoT.g:980:1: rule__SensorTypes__Group_2__1 : rule__SensorTypes__Group_2__1__Impl ;
    public final void rule__SensorTypes__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:984:1: ( rule__SensorTypes__Group_2__1__Impl )
            // InternalIoT.g:985:2: rule__SensorTypes__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SensorTypes__Group_2__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalIoT.g:991:1: rule__SensorTypes__Group_2__1__Impl : ( ( rule__SensorTypes__TypesAssignment_2_1 ) ) ;
    public final void rule__SensorTypes__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:995:1: ( ( ( rule__SensorTypes__TypesAssignment_2_1 ) ) )
            // InternalIoT.g:996:1: ( ( rule__SensorTypes__TypesAssignment_2_1 ) )
            {
            // InternalIoT.g:996:1: ( ( rule__SensorTypes__TypesAssignment_2_1 ) )
            // InternalIoT.g:997:2: ( rule__SensorTypes__TypesAssignment_2_1 )
            {
             before(grammarAccess.getSensorTypesAccess().getTypesAssignment_2_1()); 
            // InternalIoT.g:998:2: ( rule__SensorTypes__TypesAssignment_2_1 )
            // InternalIoT.g:998:3: rule__SensorTypes__TypesAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__SensorTypes__TypesAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getSensorTypesAccess().getTypesAssignment_2_1()); 

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
    // InternalIoT.g:1007:1: rule__Sensor__Group__0 : rule__Sensor__Group__0__Impl rule__Sensor__Group__1 ;
    public final void rule__Sensor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1011:1: ( rule__Sensor__Group__0__Impl rule__Sensor__Group__1 )
            // InternalIoT.g:1012:2: rule__Sensor__Group__0__Impl rule__Sensor__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Sensor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group__1();

            state._fsp--;


            }

        }
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
    // InternalIoT.g:1019:1: rule__Sensor__Group__0__Impl : ( 'Sensor' ) ;
    public final void rule__Sensor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1023:1: ( ( 'Sensor' ) )
            // InternalIoT.g:1024:1: ( 'Sensor' )
            {
            // InternalIoT.g:1024:1: ( 'Sensor' )
            // InternalIoT.g:1025:2: 'Sensor'
            {
             before(grammarAccess.getSensorAccess().getSensorKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getSensorAccess().getSensorKeyword_0()); 

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
    // InternalIoT.g:1034:1: rule__Sensor__Group__1 : rule__Sensor__Group__1__Impl rule__Sensor__Group__2 ;
    public final void rule__Sensor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1038:1: ( rule__Sensor__Group__1__Impl rule__Sensor__Group__2 )
            // InternalIoT.g:1039:2: rule__Sensor__Group__1__Impl rule__Sensor__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Sensor__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group__2();

            state._fsp--;


            }

        }
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
    // InternalIoT.g:1046:1: rule__Sensor__Group__1__Impl : ( ( rule__Sensor__NameAssignment_1 ) ) ;
    public final void rule__Sensor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1050:1: ( ( ( rule__Sensor__NameAssignment_1 ) ) )
            // InternalIoT.g:1051:1: ( ( rule__Sensor__NameAssignment_1 ) )
            {
            // InternalIoT.g:1051:1: ( ( rule__Sensor__NameAssignment_1 ) )
            // InternalIoT.g:1052:2: ( rule__Sensor__NameAssignment_1 )
            {
             before(grammarAccess.getSensorAccess().getNameAssignment_1()); 
            // InternalIoT.g:1053:2: ( rule__Sensor__NameAssignment_1 )
            // InternalIoT.g:1053:3: rule__Sensor__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSensorAccess().getNameAssignment_1()); 

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
    // InternalIoT.g:1061:1: rule__Sensor__Group__2 : rule__Sensor__Group__2__Impl rule__Sensor__Group__3 ;
    public final void rule__Sensor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1065:1: ( rule__Sensor__Group__2__Impl rule__Sensor__Group__3 )
            // InternalIoT.g:1066:2: rule__Sensor__Group__2__Impl rule__Sensor__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Sensor__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group__3();

            state._fsp--;


            }

        }
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
    // InternalIoT.g:1073:1: rule__Sensor__Group__2__Impl : ( 'of' ) ;
    public final void rule__Sensor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1077:1: ( ( 'of' ) )
            // InternalIoT.g:1078:1: ( 'of' )
            {
            // InternalIoT.g:1078:1: ( 'of' )
            // InternalIoT.g:1079:2: 'of'
            {
             before(grammarAccess.getSensorAccess().getOfKeyword_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getSensorAccess().getOfKeyword_2()); 

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
    // InternalIoT.g:1088:1: rule__Sensor__Group__3 : rule__Sensor__Group__3__Impl rule__Sensor__Group__4 ;
    public final void rule__Sensor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1092:1: ( rule__Sensor__Group__3__Impl rule__Sensor__Group__4 )
            // InternalIoT.g:1093:2: rule__Sensor__Group__3__Impl rule__Sensor__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__Sensor__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group__4();

            state._fsp--;


            }

        }
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
    // InternalIoT.g:1100:1: rule__Sensor__Group__3__Impl : ( 'type' ) ;
    public final void rule__Sensor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1104:1: ( ( 'type' ) )
            // InternalIoT.g:1105:1: ( 'type' )
            {
            // InternalIoT.g:1105:1: ( 'type' )
            // InternalIoT.g:1106:2: 'type'
            {
             before(grammarAccess.getSensorAccess().getTypeKeyword_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getSensorAccess().getTypeKeyword_3()); 

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
    // InternalIoT.g:1115:1: rule__Sensor__Group__4 : rule__Sensor__Group__4__Impl ;
    public final void rule__Sensor__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1119:1: ( rule__Sensor__Group__4__Impl )
            // InternalIoT.g:1120:2: rule__Sensor__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__Group__4__Impl();

            state._fsp--;


            }

        }
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
    // InternalIoT.g:1126:1: rule__Sensor__Group__4__Impl : ( ( rule__Sensor__TypeAssignment_4 ) ) ;
    public final void rule__Sensor__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1130:1: ( ( ( rule__Sensor__TypeAssignment_4 ) ) )
            // InternalIoT.g:1131:1: ( ( rule__Sensor__TypeAssignment_4 ) )
            {
            // InternalIoT.g:1131:1: ( ( rule__Sensor__TypeAssignment_4 ) )
            // InternalIoT.g:1132:2: ( rule__Sensor__TypeAssignment_4 )
            {
             before(grammarAccess.getSensorAccess().getTypeAssignment_4()); 
            // InternalIoT.g:1133:2: ( rule__Sensor__TypeAssignment_4 )
            // InternalIoT.g:1133:3: rule__Sensor__TypeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__TypeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSensorAccess().getTypeAssignment_4()); 

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
    // InternalIoT.g:1142:1: rule__SensorGroup__Group__0 : rule__SensorGroup__Group__0__Impl rule__SensorGroup__Group__1 ;
    public final void rule__SensorGroup__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1146:1: ( rule__SensorGroup__Group__0__Impl rule__SensorGroup__Group__1 )
            // InternalIoT.g:1147:2: rule__SensorGroup__Group__0__Impl rule__SensorGroup__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__SensorGroup__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SensorGroup__Group__1();

            state._fsp--;


            }

        }
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
    // InternalIoT.g:1154:1: rule__SensorGroup__Group__0__Impl : ( 'SensorGroup' ) ;
    public final void rule__SensorGroup__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1158:1: ( ( 'SensorGroup' ) )
            // InternalIoT.g:1159:1: ( 'SensorGroup' )
            {
            // InternalIoT.g:1159:1: ( 'SensorGroup' )
            // InternalIoT.g:1160:2: 'SensorGroup'
            {
             before(grammarAccess.getSensorGroupAccess().getSensorGroupKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getSensorGroupAccess().getSensorGroupKeyword_0()); 

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
    // InternalIoT.g:1169:1: rule__SensorGroup__Group__1 : rule__SensorGroup__Group__1__Impl rule__SensorGroup__Group__2 ;
    public final void rule__SensorGroup__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1173:1: ( rule__SensorGroup__Group__1__Impl rule__SensorGroup__Group__2 )
            // InternalIoT.g:1174:2: rule__SensorGroup__Group__1__Impl rule__SensorGroup__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__SensorGroup__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SensorGroup__Group__2();

            state._fsp--;


            }

        }
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
    // InternalIoT.g:1181:1: rule__SensorGroup__Group__1__Impl : ( ( rule__SensorGroup__NameAssignment_1 ) ) ;
    public final void rule__SensorGroup__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1185:1: ( ( ( rule__SensorGroup__NameAssignment_1 ) ) )
            // InternalIoT.g:1186:1: ( ( rule__SensorGroup__NameAssignment_1 ) )
            {
            // InternalIoT.g:1186:1: ( ( rule__SensorGroup__NameAssignment_1 ) )
            // InternalIoT.g:1187:2: ( rule__SensorGroup__NameAssignment_1 )
            {
             before(grammarAccess.getSensorGroupAccess().getNameAssignment_1()); 
            // InternalIoT.g:1188:2: ( rule__SensorGroup__NameAssignment_1 )
            // InternalIoT.g:1188:3: rule__SensorGroup__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SensorGroup__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSensorGroupAccess().getNameAssignment_1()); 

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
    // InternalIoT.g:1196:1: rule__SensorGroup__Group__2 : rule__SensorGroup__Group__2__Impl rule__SensorGroup__Group__3 ;
    public final void rule__SensorGroup__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1200:1: ( rule__SensorGroup__Group__2__Impl rule__SensorGroup__Group__3 )
            // InternalIoT.g:1201:2: rule__SensorGroup__Group__2__Impl rule__SensorGroup__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__SensorGroup__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SensorGroup__Group__3();

            state._fsp--;


            }

        }
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
    // InternalIoT.g:1208:1: rule__SensorGroup__Group__2__Impl : ( 'include' ) ;
    public final void rule__SensorGroup__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1212:1: ( ( 'include' ) )
            // InternalIoT.g:1213:1: ( 'include' )
            {
            // InternalIoT.g:1213:1: ( 'include' )
            // InternalIoT.g:1214:2: 'include'
            {
             before(grammarAccess.getSensorGroupAccess().getIncludeKeyword_2()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getSensorGroupAccess().getIncludeKeyword_2()); 

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
    // InternalIoT.g:1223:1: rule__SensorGroup__Group__3 : rule__SensorGroup__Group__3__Impl rule__SensorGroup__Group__4 ;
    public final void rule__SensorGroup__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1227:1: ( rule__SensorGroup__Group__3__Impl rule__SensorGroup__Group__4 )
            // InternalIoT.g:1228:2: rule__SensorGroup__Group__3__Impl rule__SensorGroup__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__SensorGroup__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SensorGroup__Group__4();

            state._fsp--;


            }

        }
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
    // InternalIoT.g:1235:1: rule__SensorGroup__Group__3__Impl : ( ( rule__SensorGroup__SensorsAssignment_3 ) ) ;
    public final void rule__SensorGroup__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1239:1: ( ( ( rule__SensorGroup__SensorsAssignment_3 ) ) )
            // InternalIoT.g:1240:1: ( ( rule__SensorGroup__SensorsAssignment_3 ) )
            {
            // InternalIoT.g:1240:1: ( ( rule__SensorGroup__SensorsAssignment_3 ) )
            // InternalIoT.g:1241:2: ( rule__SensorGroup__SensorsAssignment_3 )
            {
             before(grammarAccess.getSensorGroupAccess().getSensorsAssignment_3()); 
            // InternalIoT.g:1242:2: ( rule__SensorGroup__SensorsAssignment_3 )
            // InternalIoT.g:1242:3: rule__SensorGroup__SensorsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__SensorGroup__SensorsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSensorGroupAccess().getSensorsAssignment_3()); 

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
    // InternalIoT.g:1250:1: rule__SensorGroup__Group__4 : rule__SensorGroup__Group__4__Impl ;
    public final void rule__SensorGroup__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1254:1: ( rule__SensorGroup__Group__4__Impl )
            // InternalIoT.g:1255:2: rule__SensorGroup__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SensorGroup__Group__4__Impl();

            state._fsp--;


            }

        }
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
    // InternalIoT.g:1261:1: rule__SensorGroup__Group__4__Impl : ( ( rule__SensorGroup__Group_4__0 )* ) ;
    public final void rule__SensorGroup__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1265:1: ( ( ( rule__SensorGroup__Group_4__0 )* ) )
            // InternalIoT.g:1266:1: ( ( rule__SensorGroup__Group_4__0 )* )
            {
            // InternalIoT.g:1266:1: ( ( rule__SensorGroup__Group_4__0 )* )
            // InternalIoT.g:1267:2: ( rule__SensorGroup__Group_4__0 )*
            {
             before(grammarAccess.getSensorGroupAccess().getGroup_4()); 
            // InternalIoT.g:1268:2: ( rule__SensorGroup__Group_4__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==19) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalIoT.g:1268:3: rule__SensorGroup__Group_4__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__SensorGroup__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getSensorGroupAccess().getGroup_4()); 

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
    // InternalIoT.g:1277:1: rule__SensorGroup__Group_4__0 : rule__SensorGroup__Group_4__0__Impl rule__SensorGroup__Group_4__1 ;
    public final void rule__SensorGroup__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1281:1: ( rule__SensorGroup__Group_4__0__Impl rule__SensorGroup__Group_4__1 )
            // InternalIoT.g:1282:2: rule__SensorGroup__Group_4__0__Impl rule__SensorGroup__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__SensorGroup__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SensorGroup__Group_4__1();

            state._fsp--;


            }

        }
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
    // InternalIoT.g:1289:1: rule__SensorGroup__Group_4__0__Impl : ( ',' ) ;
    public final void rule__SensorGroup__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1293:1: ( ( ',' ) )
            // InternalIoT.g:1294:1: ( ',' )
            {
            // InternalIoT.g:1294:1: ( ',' )
            // InternalIoT.g:1295:2: ','
            {
             before(grammarAccess.getSensorGroupAccess().getCommaKeyword_4_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getSensorGroupAccess().getCommaKeyword_4_0()); 

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
    // InternalIoT.g:1304:1: rule__SensorGroup__Group_4__1 : rule__SensorGroup__Group_4__1__Impl ;
    public final void rule__SensorGroup__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1308:1: ( rule__SensorGroup__Group_4__1__Impl )
            // InternalIoT.g:1309:2: rule__SensorGroup__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SensorGroup__Group_4__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalIoT.g:1315:1: rule__SensorGroup__Group_4__1__Impl : ( ( rule__SensorGroup__SensorsAssignment_4_1 ) ) ;
    public final void rule__SensorGroup__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1319:1: ( ( ( rule__SensorGroup__SensorsAssignment_4_1 ) ) )
            // InternalIoT.g:1320:1: ( ( rule__SensorGroup__SensorsAssignment_4_1 ) )
            {
            // InternalIoT.g:1320:1: ( ( rule__SensorGroup__SensorsAssignment_4_1 ) )
            // InternalIoT.g:1321:2: ( rule__SensorGroup__SensorsAssignment_4_1 )
            {
             before(grammarAccess.getSensorGroupAccess().getSensorsAssignment_4_1()); 
            // InternalIoT.g:1322:2: ( rule__SensorGroup__SensorsAssignment_4_1 )
            // InternalIoT.g:1322:3: rule__SensorGroup__SensorsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__SensorGroup__SensorsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getSensorGroupAccess().getSensorsAssignment_4_1()); 

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
    // InternalIoT.g:1331:1: rule__SensorGetMethod__Group__0 : rule__SensorGetMethod__Group__0__Impl rule__SensorGetMethod__Group__1 ;
    public final void rule__SensorGetMethod__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1335:1: ( rule__SensorGetMethod__Group__0__Impl rule__SensorGetMethod__Group__1 )
            // InternalIoT.g:1336:2: rule__SensorGetMethod__Group__0__Impl rule__SensorGetMethod__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__SensorGetMethod__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SensorGetMethod__Group__1();

            state._fsp--;


            }

        }
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
    // InternalIoT.g:1343:1: rule__SensorGetMethod__Group__0__Impl : ( 'SensorGetMethod' ) ;
    public final void rule__SensorGetMethod__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1347:1: ( ( 'SensorGetMethod' ) )
            // InternalIoT.g:1348:1: ( 'SensorGetMethod' )
            {
            // InternalIoT.g:1348:1: ( 'SensorGetMethod' )
            // InternalIoT.g:1349:2: 'SensorGetMethod'
            {
             before(grammarAccess.getSensorGetMethodAccess().getSensorGetMethodKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getSensorGetMethodAccess().getSensorGetMethodKeyword_0()); 

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
    // InternalIoT.g:1358:1: rule__SensorGetMethod__Group__1 : rule__SensorGetMethod__Group__1__Impl rule__SensorGetMethod__Group__2 ;
    public final void rule__SensorGetMethod__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1362:1: ( rule__SensorGetMethod__Group__1__Impl rule__SensorGetMethod__Group__2 )
            // InternalIoT.g:1363:2: rule__SensorGetMethod__Group__1__Impl rule__SensorGetMethod__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__SensorGetMethod__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SensorGetMethod__Group__2();

            state._fsp--;


            }

        }
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
    // InternalIoT.g:1370:1: rule__SensorGetMethod__Group__1__Impl : ( ( rule__SensorGetMethod__MethodAssignment_1 ) ) ;
    public final void rule__SensorGetMethod__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1374:1: ( ( ( rule__SensorGetMethod__MethodAssignment_1 ) ) )
            // InternalIoT.g:1375:1: ( ( rule__SensorGetMethod__MethodAssignment_1 ) )
            {
            // InternalIoT.g:1375:1: ( ( rule__SensorGetMethod__MethodAssignment_1 ) )
            // InternalIoT.g:1376:2: ( rule__SensorGetMethod__MethodAssignment_1 )
            {
             before(grammarAccess.getSensorGetMethodAccess().getMethodAssignment_1()); 
            // InternalIoT.g:1377:2: ( rule__SensorGetMethod__MethodAssignment_1 )
            // InternalIoT.g:1377:3: rule__SensorGetMethod__MethodAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SensorGetMethod__MethodAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSensorGetMethodAccess().getMethodAssignment_1()); 

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
    // InternalIoT.g:1385:1: rule__SensorGetMethod__Group__2 : rule__SensorGetMethod__Group__2__Impl rule__SensorGetMethod__Group__3 ;
    public final void rule__SensorGetMethod__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1389:1: ( rule__SensorGetMethod__Group__2__Impl rule__SensorGetMethod__Group__3 )
            // InternalIoT.g:1390:2: rule__SensorGetMethod__Group__2__Impl rule__SensorGetMethod__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__SensorGetMethod__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SensorGetMethod__Group__3();

            state._fsp--;


            }

        }
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
    // InternalIoT.g:1397:1: rule__SensorGetMethod__Group__2__Impl : ( 'for' ) ;
    public final void rule__SensorGetMethod__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1401:1: ( ( 'for' ) )
            // InternalIoT.g:1402:1: ( 'for' )
            {
            // InternalIoT.g:1402:1: ( 'for' )
            // InternalIoT.g:1403:2: 'for'
            {
             before(grammarAccess.getSensorGetMethodAccess().getForKeyword_2()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getSensorGetMethodAccess().getForKeyword_2()); 

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
    // InternalIoT.g:1412:1: rule__SensorGetMethod__Group__3 : rule__SensorGetMethod__Group__3__Impl rule__SensorGetMethod__Group__4 ;
    public final void rule__SensorGetMethod__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1416:1: ( rule__SensorGetMethod__Group__3__Impl rule__SensorGetMethod__Group__4 )
            // InternalIoT.g:1417:2: rule__SensorGetMethod__Group__3__Impl rule__SensorGetMethod__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__SensorGetMethod__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SensorGetMethod__Group__4();

            state._fsp--;


            }

        }
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
    // InternalIoT.g:1424:1: rule__SensorGetMethod__Group__3__Impl : ( 'type' ) ;
    public final void rule__SensorGetMethod__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1428:1: ( ( 'type' ) )
            // InternalIoT.g:1429:1: ( 'type' )
            {
            // InternalIoT.g:1429:1: ( 'type' )
            // InternalIoT.g:1430:2: 'type'
            {
             before(grammarAccess.getSensorGetMethodAccess().getTypeKeyword_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getSensorGetMethodAccess().getTypeKeyword_3()); 

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
    // InternalIoT.g:1439:1: rule__SensorGetMethod__Group__4 : rule__SensorGetMethod__Group__4__Impl ;
    public final void rule__SensorGetMethod__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1443:1: ( rule__SensorGetMethod__Group__4__Impl )
            // InternalIoT.g:1444:2: rule__SensorGetMethod__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SensorGetMethod__Group__4__Impl();

            state._fsp--;


            }

        }
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
    // InternalIoT.g:1450:1: rule__SensorGetMethod__Group__4__Impl : ( ( rule__SensorGetMethod__TypeAssignment_4 ) ) ;
    public final void rule__SensorGetMethod__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1454:1: ( ( ( rule__SensorGetMethod__TypeAssignment_4 ) ) )
            // InternalIoT.g:1455:1: ( ( rule__SensorGetMethod__TypeAssignment_4 ) )
            {
            // InternalIoT.g:1455:1: ( ( rule__SensorGetMethod__TypeAssignment_4 ) )
            // InternalIoT.g:1456:2: ( rule__SensorGetMethod__TypeAssignment_4 )
            {
             before(grammarAccess.getSensorGetMethodAccess().getTypeAssignment_4()); 
            // InternalIoT.g:1457:2: ( rule__SensorGetMethod__TypeAssignment_4 )
            // InternalIoT.g:1457:3: rule__SensorGetMethod__TypeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__SensorGetMethod__TypeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSensorGetMethodAccess().getTypeAssignment_4()); 

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
    // InternalIoT.g:1466:1: rule__Method__Group__0 : rule__Method__Group__0__Impl rule__Method__Group__1 ;
    public final void rule__Method__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1470:1: ( rule__Method__Group__0__Impl rule__Method__Group__1 )
            // InternalIoT.g:1471:2: rule__Method__Group__0__Impl rule__Method__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Method__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group__1();

            state._fsp--;


            }

        }
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
    // InternalIoT.g:1478:1: rule__Method__Group__0__Impl : ( ( rule__Method__NameAssignment_0 ) ) ;
    public final void rule__Method__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1482:1: ( ( ( rule__Method__NameAssignment_0 ) ) )
            // InternalIoT.g:1483:1: ( ( rule__Method__NameAssignment_0 ) )
            {
            // InternalIoT.g:1483:1: ( ( rule__Method__NameAssignment_0 ) )
            // InternalIoT.g:1484:2: ( rule__Method__NameAssignment_0 )
            {
             before(grammarAccess.getMethodAccess().getNameAssignment_0()); 
            // InternalIoT.g:1485:2: ( rule__Method__NameAssignment_0 )
            // InternalIoT.g:1485:3: rule__Method__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Method__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMethodAccess().getNameAssignment_0()); 

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
    // InternalIoT.g:1493:1: rule__Method__Group__1 : rule__Method__Group__1__Impl rule__Method__Group__2 ;
    public final void rule__Method__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1497:1: ( rule__Method__Group__1__Impl rule__Method__Group__2 )
            // InternalIoT.g:1498:2: rule__Method__Group__1__Impl rule__Method__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__Method__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group__2();

            state._fsp--;


            }

        }
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
    // InternalIoT.g:1505:1: rule__Method__Group__1__Impl : ( '(' ) ;
    public final void rule__Method__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1509:1: ( ( '(' ) )
            // InternalIoT.g:1510:1: ( '(' )
            {
            // InternalIoT.g:1510:1: ( '(' )
            // InternalIoT.g:1511:2: '('
            {
             before(grammarAccess.getMethodAccess().getLeftParenthesisKeyword_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getMethodAccess().getLeftParenthesisKeyword_1()); 

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
    // InternalIoT.g:1520:1: rule__Method__Group__2 : rule__Method__Group__2__Impl rule__Method__Group__3 ;
    public final void rule__Method__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1524:1: ( rule__Method__Group__2__Impl rule__Method__Group__3 )
            // InternalIoT.g:1525:2: rule__Method__Group__2__Impl rule__Method__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__Method__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group__3();

            state._fsp--;


            }

        }
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
    // InternalIoT.g:1532:1: rule__Method__Group__2__Impl : ( ( rule__Method__Group_2__0 )? ) ;
    public final void rule__Method__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1536:1: ( ( ( rule__Method__Group_2__0 )? ) )
            // InternalIoT.g:1537:1: ( ( rule__Method__Group_2__0 )? )
            {
            // InternalIoT.g:1537:1: ( ( rule__Method__Group_2__0 )? )
            // InternalIoT.g:1538:2: ( rule__Method__Group_2__0 )?
            {
             before(grammarAccess.getMethodAccess().getGroup_2()); 
            // InternalIoT.g:1539:2: ( rule__Method__Group_2__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalIoT.g:1539:3: rule__Method__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Method__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMethodAccess().getGroup_2()); 

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
    // InternalIoT.g:1547:1: rule__Method__Group__3 : rule__Method__Group__3__Impl ;
    public final void rule__Method__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1551:1: ( rule__Method__Group__3__Impl )
            // InternalIoT.g:1552:2: rule__Method__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Method__Group__3__Impl();

            state._fsp--;


            }

        }
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
    // InternalIoT.g:1558:1: rule__Method__Group__3__Impl : ( ')' ) ;
    public final void rule__Method__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1562:1: ( ( ')' ) )
            // InternalIoT.g:1563:1: ( ')' )
            {
            // InternalIoT.g:1563:1: ( ')' )
            // InternalIoT.g:1564:2: ')'
            {
             before(grammarAccess.getMethodAccess().getRightParenthesisKeyword_3()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getMethodAccess().getRightParenthesisKeyword_3()); 

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
    // InternalIoT.g:1574:1: rule__Method__Group_2__0 : rule__Method__Group_2__0__Impl rule__Method__Group_2__1 ;
    public final void rule__Method__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1578:1: ( rule__Method__Group_2__0__Impl rule__Method__Group_2__1 )
            // InternalIoT.g:1579:2: rule__Method__Group_2__0__Impl rule__Method__Group_2__1
            {
            pushFollow(FOLLOW_5);
            rule__Method__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group_2__1();

            state._fsp--;


            }

        }
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
    // InternalIoT.g:1586:1: rule__Method__Group_2__0__Impl : ( ( rule__Method__ParametersAssignment_2_0 ) ) ;
    public final void rule__Method__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1590:1: ( ( ( rule__Method__ParametersAssignment_2_0 ) ) )
            // InternalIoT.g:1591:1: ( ( rule__Method__ParametersAssignment_2_0 ) )
            {
            // InternalIoT.g:1591:1: ( ( rule__Method__ParametersAssignment_2_0 ) )
            // InternalIoT.g:1592:2: ( rule__Method__ParametersAssignment_2_0 )
            {
             before(grammarAccess.getMethodAccess().getParametersAssignment_2_0()); 
            // InternalIoT.g:1593:2: ( rule__Method__ParametersAssignment_2_0 )
            // InternalIoT.g:1593:3: rule__Method__ParametersAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Method__ParametersAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getMethodAccess().getParametersAssignment_2_0()); 

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
    // InternalIoT.g:1601:1: rule__Method__Group_2__1 : rule__Method__Group_2__1__Impl ;
    public final void rule__Method__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1605:1: ( rule__Method__Group_2__1__Impl )
            // InternalIoT.g:1606:2: rule__Method__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Method__Group_2__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalIoT.g:1612:1: rule__Method__Group_2__1__Impl : ( ( rule__Method__Group_2_1__0 )* ) ;
    public final void rule__Method__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1616:1: ( ( ( rule__Method__Group_2_1__0 )* ) )
            // InternalIoT.g:1617:1: ( ( rule__Method__Group_2_1__0 )* )
            {
            // InternalIoT.g:1617:1: ( ( rule__Method__Group_2_1__0 )* )
            // InternalIoT.g:1618:2: ( rule__Method__Group_2_1__0 )*
            {
             before(grammarAccess.getMethodAccess().getGroup_2_1()); 
            // InternalIoT.g:1619:2: ( rule__Method__Group_2_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==19) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalIoT.g:1619:3: rule__Method__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Method__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getMethodAccess().getGroup_2_1()); 

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
    // InternalIoT.g:1628:1: rule__Method__Group_2_1__0 : rule__Method__Group_2_1__0__Impl rule__Method__Group_2_1__1 ;
    public final void rule__Method__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1632:1: ( rule__Method__Group_2_1__0__Impl rule__Method__Group_2_1__1 )
            // InternalIoT.g:1633:2: rule__Method__Group_2_1__0__Impl rule__Method__Group_2_1__1
            {
            pushFollow(FOLLOW_4);
            rule__Method__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group_2_1__1();

            state._fsp--;


            }

        }
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
    // InternalIoT.g:1640:1: rule__Method__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__Method__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1644:1: ( ( ',' ) )
            // InternalIoT.g:1645:1: ( ',' )
            {
            // InternalIoT.g:1645:1: ( ',' )
            // InternalIoT.g:1646:2: ','
            {
             before(grammarAccess.getMethodAccess().getCommaKeyword_2_1_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getMethodAccess().getCommaKeyword_2_1_0()); 

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
    // InternalIoT.g:1655:1: rule__Method__Group_2_1__1 : rule__Method__Group_2_1__1__Impl ;
    public final void rule__Method__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1659:1: ( rule__Method__Group_2_1__1__Impl )
            // InternalIoT.g:1660:2: rule__Method__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Method__Group_2_1__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalIoT.g:1666:1: rule__Method__Group_2_1__1__Impl : ( ( rule__Method__ParametersAssignment_2_1_1 ) ) ;
    public final void rule__Method__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1670:1: ( ( ( rule__Method__ParametersAssignment_2_1_1 ) ) )
            // InternalIoT.g:1671:1: ( ( rule__Method__ParametersAssignment_2_1_1 ) )
            {
            // InternalIoT.g:1671:1: ( ( rule__Method__ParametersAssignment_2_1_1 ) )
            // InternalIoT.g:1672:2: ( rule__Method__ParametersAssignment_2_1_1 )
            {
             before(grammarAccess.getMethodAccess().getParametersAssignment_2_1_1()); 
            // InternalIoT.g:1673:2: ( rule__Method__ParametersAssignment_2_1_1 )
            // InternalIoT.g:1673:3: rule__Method__ParametersAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Method__ParametersAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMethodAccess().getParametersAssignment_2_1_1()); 

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
    // InternalIoT.g:1682:1: rule__DeviceTypes__Group__0 : rule__DeviceTypes__Group__0__Impl rule__DeviceTypes__Group__1 ;
    public final void rule__DeviceTypes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1686:1: ( rule__DeviceTypes__Group__0__Impl rule__DeviceTypes__Group__1 )
            // InternalIoT.g:1687:2: rule__DeviceTypes__Group__0__Impl rule__DeviceTypes__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__DeviceTypes__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeviceTypes__Group__1();

            state._fsp--;


            }

        }
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
    // InternalIoT.g:1694:1: rule__DeviceTypes__Group__0__Impl : ( 'DeviceTypes' ) ;
    public final void rule__DeviceTypes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1698:1: ( ( 'DeviceTypes' ) )
            // InternalIoT.g:1699:1: ( 'DeviceTypes' )
            {
            // InternalIoT.g:1699:1: ( 'DeviceTypes' )
            // InternalIoT.g:1700:2: 'DeviceTypes'
            {
             before(grammarAccess.getDeviceTypesAccess().getDeviceTypesKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getDeviceTypesAccess().getDeviceTypesKeyword_0()); 

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
    // InternalIoT.g:1709:1: rule__DeviceTypes__Group__1 : rule__DeviceTypes__Group__1__Impl rule__DeviceTypes__Group__2 ;
    public final void rule__DeviceTypes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1713:1: ( rule__DeviceTypes__Group__1__Impl rule__DeviceTypes__Group__2 )
            // InternalIoT.g:1714:2: rule__DeviceTypes__Group__1__Impl rule__DeviceTypes__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__DeviceTypes__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeviceTypes__Group__2();

            state._fsp--;


            }

        }
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
    // InternalIoT.g:1721:1: rule__DeviceTypes__Group__1__Impl : ( ( rule__DeviceTypes__TypesAssignment_1 ) ) ;
    public final void rule__DeviceTypes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1725:1: ( ( ( rule__DeviceTypes__TypesAssignment_1 ) ) )
            // InternalIoT.g:1726:1: ( ( rule__DeviceTypes__TypesAssignment_1 ) )
            {
            // InternalIoT.g:1726:1: ( ( rule__DeviceTypes__TypesAssignment_1 ) )
            // InternalIoT.g:1727:2: ( rule__DeviceTypes__TypesAssignment_1 )
            {
             before(grammarAccess.getDeviceTypesAccess().getTypesAssignment_1()); 
            // InternalIoT.g:1728:2: ( rule__DeviceTypes__TypesAssignment_1 )
            // InternalIoT.g:1728:3: rule__DeviceTypes__TypesAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DeviceTypes__TypesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDeviceTypesAccess().getTypesAssignment_1()); 

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
    // InternalIoT.g:1736:1: rule__DeviceTypes__Group__2 : rule__DeviceTypes__Group__2__Impl ;
    public final void rule__DeviceTypes__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1740:1: ( rule__DeviceTypes__Group__2__Impl )
            // InternalIoT.g:1741:2: rule__DeviceTypes__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DeviceTypes__Group__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalIoT.g:1747:1: rule__DeviceTypes__Group__2__Impl : ( ( rule__DeviceTypes__Group_2__0 )* ) ;
    public final void rule__DeviceTypes__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1751:1: ( ( ( rule__DeviceTypes__Group_2__0 )* ) )
            // InternalIoT.g:1752:1: ( ( rule__DeviceTypes__Group_2__0 )* )
            {
            // InternalIoT.g:1752:1: ( ( rule__DeviceTypes__Group_2__0 )* )
            // InternalIoT.g:1753:2: ( rule__DeviceTypes__Group_2__0 )*
            {
             before(grammarAccess.getDeviceTypesAccess().getGroup_2()); 
            // InternalIoT.g:1754:2: ( rule__DeviceTypes__Group_2__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==19) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalIoT.g:1754:3: rule__DeviceTypes__Group_2__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__DeviceTypes__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getDeviceTypesAccess().getGroup_2()); 

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
    // InternalIoT.g:1763:1: rule__DeviceTypes__Group_2__0 : rule__DeviceTypes__Group_2__0__Impl rule__DeviceTypes__Group_2__1 ;
    public final void rule__DeviceTypes__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1767:1: ( rule__DeviceTypes__Group_2__0__Impl rule__DeviceTypes__Group_2__1 )
            // InternalIoT.g:1768:2: rule__DeviceTypes__Group_2__0__Impl rule__DeviceTypes__Group_2__1
            {
            pushFollow(FOLLOW_4);
            rule__DeviceTypes__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeviceTypes__Group_2__1();

            state._fsp--;


            }

        }
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
    // InternalIoT.g:1775:1: rule__DeviceTypes__Group_2__0__Impl : ( ',' ) ;
    public final void rule__DeviceTypes__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1779:1: ( ( ',' ) )
            // InternalIoT.g:1780:1: ( ',' )
            {
            // InternalIoT.g:1780:1: ( ',' )
            // InternalIoT.g:1781:2: ','
            {
             before(grammarAccess.getDeviceTypesAccess().getCommaKeyword_2_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getDeviceTypesAccess().getCommaKeyword_2_0()); 

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
    // InternalIoT.g:1790:1: rule__DeviceTypes__Group_2__1 : rule__DeviceTypes__Group_2__1__Impl ;
    public final void rule__DeviceTypes__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1794:1: ( rule__DeviceTypes__Group_2__1__Impl )
            // InternalIoT.g:1795:2: rule__DeviceTypes__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DeviceTypes__Group_2__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalIoT.g:1801:1: rule__DeviceTypes__Group_2__1__Impl : ( ( rule__DeviceTypes__TypesAssignment_2_1 ) ) ;
    public final void rule__DeviceTypes__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1805:1: ( ( ( rule__DeviceTypes__TypesAssignment_2_1 ) ) )
            // InternalIoT.g:1806:1: ( ( rule__DeviceTypes__TypesAssignment_2_1 ) )
            {
            // InternalIoT.g:1806:1: ( ( rule__DeviceTypes__TypesAssignment_2_1 ) )
            // InternalIoT.g:1807:2: ( rule__DeviceTypes__TypesAssignment_2_1 )
            {
             before(grammarAccess.getDeviceTypesAccess().getTypesAssignment_2_1()); 
            // InternalIoT.g:1808:2: ( rule__DeviceTypes__TypesAssignment_2_1 )
            // InternalIoT.g:1808:3: rule__DeviceTypes__TypesAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__DeviceTypes__TypesAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getDeviceTypesAccess().getTypesAssignment_2_1()); 

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
    // InternalIoT.g:1817:1: rule__Device__Group__0 : rule__Device__Group__0__Impl rule__Device__Group__1 ;
    public final void rule__Device__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1821:1: ( rule__Device__Group__0__Impl rule__Device__Group__1 )
            // InternalIoT.g:1822:2: rule__Device__Group__0__Impl rule__Device__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Device__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Device__Group__1();

            state._fsp--;


            }

        }
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
    // InternalIoT.g:1829:1: rule__Device__Group__0__Impl : ( 'Device' ) ;
    public final void rule__Device__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1833:1: ( ( 'Device' ) )
            // InternalIoT.g:1834:1: ( 'Device' )
            {
            // InternalIoT.g:1834:1: ( 'Device' )
            // InternalIoT.g:1835:2: 'Device'
            {
             before(grammarAccess.getDeviceAccess().getDeviceKeyword_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getDeviceAccess().getDeviceKeyword_0()); 

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
    // InternalIoT.g:1844:1: rule__Device__Group__1 : rule__Device__Group__1__Impl rule__Device__Group__2 ;
    public final void rule__Device__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1848:1: ( rule__Device__Group__1__Impl rule__Device__Group__2 )
            // InternalIoT.g:1849:2: rule__Device__Group__1__Impl rule__Device__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Device__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Device__Group__2();

            state._fsp--;


            }

        }
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
    // InternalIoT.g:1856:1: rule__Device__Group__1__Impl : ( ( rule__Device__NameAssignment_1 ) ) ;
    public final void rule__Device__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1860:1: ( ( ( rule__Device__NameAssignment_1 ) ) )
            // InternalIoT.g:1861:1: ( ( rule__Device__NameAssignment_1 ) )
            {
            // InternalIoT.g:1861:1: ( ( rule__Device__NameAssignment_1 ) )
            // InternalIoT.g:1862:2: ( rule__Device__NameAssignment_1 )
            {
             before(grammarAccess.getDeviceAccess().getNameAssignment_1()); 
            // InternalIoT.g:1863:2: ( rule__Device__NameAssignment_1 )
            // InternalIoT.g:1863:3: rule__Device__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Device__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDeviceAccess().getNameAssignment_1()); 

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
    // InternalIoT.g:1871:1: rule__Device__Group__2 : rule__Device__Group__2__Impl rule__Device__Group__3 ;
    public final void rule__Device__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1875:1: ( rule__Device__Group__2__Impl rule__Device__Group__3 )
            // InternalIoT.g:1876:2: rule__Device__Group__2__Impl rule__Device__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Device__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Device__Group__3();

            state._fsp--;


            }

        }
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
    // InternalIoT.g:1883:1: rule__Device__Group__2__Impl : ( 'of' ) ;
    public final void rule__Device__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1887:1: ( ( 'of' ) )
            // InternalIoT.g:1888:1: ( 'of' )
            {
            // InternalIoT.g:1888:1: ( 'of' )
            // InternalIoT.g:1889:2: 'of'
            {
             before(grammarAccess.getDeviceAccess().getOfKeyword_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getDeviceAccess().getOfKeyword_2()); 

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
    // InternalIoT.g:1898:1: rule__Device__Group__3 : rule__Device__Group__3__Impl rule__Device__Group__4 ;
    public final void rule__Device__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1902:1: ( rule__Device__Group__3__Impl rule__Device__Group__4 )
            // InternalIoT.g:1903:2: rule__Device__Group__3__Impl rule__Device__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__Device__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Device__Group__4();

            state._fsp--;


            }

        }
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
    // InternalIoT.g:1910:1: rule__Device__Group__3__Impl : ( 'type' ) ;
    public final void rule__Device__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1914:1: ( ( 'type' ) )
            // InternalIoT.g:1915:1: ( 'type' )
            {
            // InternalIoT.g:1915:1: ( 'type' )
            // InternalIoT.g:1916:2: 'type'
            {
             before(grammarAccess.getDeviceAccess().getTypeKeyword_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getDeviceAccess().getTypeKeyword_3()); 

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
    // InternalIoT.g:1925:1: rule__Device__Group__4 : rule__Device__Group__4__Impl rule__Device__Group__5 ;
    public final void rule__Device__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1929:1: ( rule__Device__Group__4__Impl rule__Device__Group__5 )
            // InternalIoT.g:1930:2: rule__Device__Group__4__Impl rule__Device__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__Device__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Device__Group__5();

            state._fsp--;


            }

        }
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
    // InternalIoT.g:1937:1: rule__Device__Group__4__Impl : ( ( rule__Device__TypeAssignment_4 ) ) ;
    public final void rule__Device__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1941:1: ( ( ( rule__Device__TypeAssignment_4 ) ) )
            // InternalIoT.g:1942:1: ( ( rule__Device__TypeAssignment_4 ) )
            {
            // InternalIoT.g:1942:1: ( ( rule__Device__TypeAssignment_4 ) )
            // InternalIoT.g:1943:2: ( rule__Device__TypeAssignment_4 )
            {
             before(grammarAccess.getDeviceAccess().getTypeAssignment_4()); 
            // InternalIoT.g:1944:2: ( rule__Device__TypeAssignment_4 )
            // InternalIoT.g:1944:3: rule__Device__TypeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Device__TypeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getDeviceAccess().getTypeAssignment_4()); 

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
    // InternalIoT.g:1952:1: rule__Device__Group__5 : rule__Device__Group__5__Impl rule__Device__Group__6 ;
    public final void rule__Device__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1956:1: ( rule__Device__Group__5__Impl rule__Device__Group__6 )
            // InternalIoT.g:1957:2: rule__Device__Group__5__Impl rule__Device__Group__6
            {
            pushFollow(FOLLOW_14);
            rule__Device__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Device__Group__6();

            state._fsp--;


            }

        }
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
    // InternalIoT.g:1964:1: rule__Device__Group__5__Impl : ( 'contains' ) ;
    public final void rule__Device__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1968:1: ( ( 'contains' ) )
            // InternalIoT.g:1969:1: ( 'contains' )
            {
            // InternalIoT.g:1969:1: ( 'contains' )
            // InternalIoT.g:1970:2: 'contains'
            {
             before(grammarAccess.getDeviceAccess().getContainsKeyword_5()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getDeviceAccess().getContainsKeyword_5()); 

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
    // InternalIoT.g:1979:1: rule__Device__Group__6 : rule__Device__Group__6__Impl ;
    public final void rule__Device__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1983:1: ( rule__Device__Group__6__Impl )
            // InternalIoT.g:1984:2: rule__Device__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Device__Group__6__Impl();

            state._fsp--;


            }

        }
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
    // InternalIoT.g:1990:1: rule__Device__Group__6__Impl : ( ( rule__Device__Alternatives_6 ) ) ;
    public final void rule__Device__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:1994:1: ( ( ( rule__Device__Alternatives_6 ) ) )
            // InternalIoT.g:1995:1: ( ( rule__Device__Alternatives_6 ) )
            {
            // InternalIoT.g:1995:1: ( ( rule__Device__Alternatives_6 ) )
            // InternalIoT.g:1996:2: ( rule__Device__Alternatives_6 )
            {
             before(grammarAccess.getDeviceAccess().getAlternatives_6()); 
            // InternalIoT.g:1997:2: ( rule__Device__Alternatives_6 )
            // InternalIoT.g:1997:3: rule__Device__Alternatives_6
            {
            pushFollow(FOLLOW_2);
            rule__Device__Alternatives_6();

            state._fsp--;


            }

             after(grammarAccess.getDeviceAccess().getAlternatives_6()); 

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
    // InternalIoT.g:2006:1: rule__Device__Group_6_0__0 : rule__Device__Group_6_0__0__Impl rule__Device__Group_6_0__1 ;
    public final void rule__Device__Group_6_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2010:1: ( rule__Device__Group_6_0__0__Impl rule__Device__Group_6_0__1 )
            // InternalIoT.g:2011:2: rule__Device__Group_6_0__0__Impl rule__Device__Group_6_0__1
            {
            pushFollow(FOLLOW_4);
            rule__Device__Group_6_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Device__Group_6_0__1();

            state._fsp--;


            }

        }
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
    // InternalIoT.g:2018:1: rule__Device__Group_6_0__0__Impl : ( 'device' ) ;
    public final void rule__Device__Group_6_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2022:1: ( ( 'device' ) )
            // InternalIoT.g:2023:1: ( 'device' )
            {
            // InternalIoT.g:2023:1: ( 'device' )
            // InternalIoT.g:2024:2: 'device'
            {
             before(grammarAccess.getDeviceAccess().getDeviceKeyword_6_0_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getDeviceAccess().getDeviceKeyword_6_0_0()); 

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
    // InternalIoT.g:2033:1: rule__Device__Group_6_0__1 : rule__Device__Group_6_0__1__Impl ;
    public final void rule__Device__Group_6_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2037:1: ( rule__Device__Group_6_0__1__Impl )
            // InternalIoT.g:2038:2: rule__Device__Group_6_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Device__Group_6_0__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalIoT.g:2044:1: rule__Device__Group_6_0__1__Impl : ( ( rule__Device__DevicesAssignment_6_0_1 ) ) ;
    public final void rule__Device__Group_6_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2048:1: ( ( ( rule__Device__DevicesAssignment_6_0_1 ) ) )
            // InternalIoT.g:2049:1: ( ( rule__Device__DevicesAssignment_6_0_1 ) )
            {
            // InternalIoT.g:2049:1: ( ( rule__Device__DevicesAssignment_6_0_1 ) )
            // InternalIoT.g:2050:2: ( rule__Device__DevicesAssignment_6_0_1 )
            {
             before(grammarAccess.getDeviceAccess().getDevicesAssignment_6_0_1()); 
            // InternalIoT.g:2051:2: ( rule__Device__DevicesAssignment_6_0_1 )
            // InternalIoT.g:2051:3: rule__Device__DevicesAssignment_6_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Device__DevicesAssignment_6_0_1();

            state._fsp--;


            }

             after(grammarAccess.getDeviceAccess().getDevicesAssignment_6_0_1()); 

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
    // InternalIoT.g:2060:1: rule__Device__Group_6_1__0 : rule__Device__Group_6_1__0__Impl rule__Device__Group_6_1__1 ;
    public final void rule__Device__Group_6_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2064:1: ( rule__Device__Group_6_1__0__Impl rule__Device__Group_6_1__1 )
            // InternalIoT.g:2065:2: rule__Device__Group_6_1__0__Impl rule__Device__Group_6_1__1
            {
            pushFollow(FOLLOW_4);
            rule__Device__Group_6_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Device__Group_6_1__1();

            state._fsp--;


            }

        }
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
    // InternalIoT.g:2072:1: rule__Device__Group_6_1__0__Impl : ( 'group' ) ;
    public final void rule__Device__Group_6_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2076:1: ( ( 'group' ) )
            // InternalIoT.g:2077:1: ( 'group' )
            {
            // InternalIoT.g:2077:1: ( 'group' )
            // InternalIoT.g:2078:2: 'group'
            {
             before(grammarAccess.getDeviceAccess().getGroupKeyword_6_1_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getDeviceAccess().getGroupKeyword_6_1_0()); 

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
    // InternalIoT.g:2087:1: rule__Device__Group_6_1__1 : rule__Device__Group_6_1__1__Impl ;
    public final void rule__Device__Group_6_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2091:1: ( rule__Device__Group_6_1__1__Impl )
            // InternalIoT.g:2092:2: rule__Device__Group_6_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Device__Group_6_1__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalIoT.g:2098:1: rule__Device__Group_6_1__1__Impl : ( ( rule__Device__DevicesAssignment_6_1_1 ) ) ;
    public final void rule__Device__Group_6_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2102:1: ( ( ( rule__Device__DevicesAssignment_6_1_1 ) ) )
            // InternalIoT.g:2103:1: ( ( rule__Device__DevicesAssignment_6_1_1 ) )
            {
            // InternalIoT.g:2103:1: ( ( rule__Device__DevicesAssignment_6_1_1 ) )
            // InternalIoT.g:2104:2: ( rule__Device__DevicesAssignment_6_1_1 )
            {
             before(grammarAccess.getDeviceAccess().getDevicesAssignment_6_1_1()); 
            // InternalIoT.g:2105:2: ( rule__Device__DevicesAssignment_6_1_1 )
            // InternalIoT.g:2105:3: rule__Device__DevicesAssignment_6_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Device__DevicesAssignment_6_1_1();

            state._fsp--;


            }

             after(grammarAccess.getDeviceAccess().getDevicesAssignment_6_1_1()); 

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
    // InternalIoT.g:2114:1: rule__ServerTypes__Group__0 : rule__ServerTypes__Group__0__Impl rule__ServerTypes__Group__1 ;
    public final void rule__ServerTypes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2118:1: ( rule__ServerTypes__Group__0__Impl rule__ServerTypes__Group__1 )
            // InternalIoT.g:2119:2: rule__ServerTypes__Group__0__Impl rule__ServerTypes__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__ServerTypes__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServerTypes__Group__1();

            state._fsp--;


            }

        }
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
    // InternalIoT.g:2126:1: rule__ServerTypes__Group__0__Impl : ( 'ServerTypes' ) ;
    public final void rule__ServerTypes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2130:1: ( ( 'ServerTypes' ) )
            // InternalIoT.g:2131:1: ( 'ServerTypes' )
            {
            // InternalIoT.g:2131:1: ( 'ServerTypes' )
            // InternalIoT.g:2132:2: 'ServerTypes'
            {
             before(grammarAccess.getServerTypesAccess().getServerTypesKeyword_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getServerTypesAccess().getServerTypesKeyword_0()); 

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
    // InternalIoT.g:2141:1: rule__ServerTypes__Group__1 : rule__ServerTypes__Group__1__Impl rule__ServerTypes__Group__2 ;
    public final void rule__ServerTypes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2145:1: ( rule__ServerTypes__Group__1__Impl rule__ServerTypes__Group__2 )
            // InternalIoT.g:2146:2: rule__ServerTypes__Group__1__Impl rule__ServerTypes__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__ServerTypes__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServerTypes__Group__2();

            state._fsp--;


            }

        }
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
    // InternalIoT.g:2153:1: rule__ServerTypes__Group__1__Impl : ( ( rule__ServerTypes__TypesAssignment_1 ) ) ;
    public final void rule__ServerTypes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2157:1: ( ( ( rule__ServerTypes__TypesAssignment_1 ) ) )
            // InternalIoT.g:2158:1: ( ( rule__ServerTypes__TypesAssignment_1 ) )
            {
            // InternalIoT.g:2158:1: ( ( rule__ServerTypes__TypesAssignment_1 ) )
            // InternalIoT.g:2159:2: ( rule__ServerTypes__TypesAssignment_1 )
            {
             before(grammarAccess.getServerTypesAccess().getTypesAssignment_1()); 
            // InternalIoT.g:2160:2: ( rule__ServerTypes__TypesAssignment_1 )
            // InternalIoT.g:2160:3: rule__ServerTypes__TypesAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ServerTypes__TypesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getServerTypesAccess().getTypesAssignment_1()); 

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
    // InternalIoT.g:2168:1: rule__ServerTypes__Group__2 : rule__ServerTypes__Group__2__Impl ;
    public final void rule__ServerTypes__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2172:1: ( rule__ServerTypes__Group__2__Impl )
            // InternalIoT.g:2173:2: rule__ServerTypes__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ServerTypes__Group__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalIoT.g:2179:1: rule__ServerTypes__Group__2__Impl : ( ( rule__ServerTypes__Group_2__0 )* ) ;
    public final void rule__ServerTypes__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2183:1: ( ( ( rule__ServerTypes__Group_2__0 )* ) )
            // InternalIoT.g:2184:1: ( ( rule__ServerTypes__Group_2__0 )* )
            {
            // InternalIoT.g:2184:1: ( ( rule__ServerTypes__Group_2__0 )* )
            // InternalIoT.g:2185:2: ( rule__ServerTypes__Group_2__0 )*
            {
             before(grammarAccess.getServerTypesAccess().getGroup_2()); 
            // InternalIoT.g:2186:2: ( rule__ServerTypes__Group_2__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==19) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalIoT.g:2186:3: rule__ServerTypes__Group_2__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__ServerTypes__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getServerTypesAccess().getGroup_2()); 

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
    // InternalIoT.g:2195:1: rule__ServerTypes__Group_2__0 : rule__ServerTypes__Group_2__0__Impl rule__ServerTypes__Group_2__1 ;
    public final void rule__ServerTypes__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2199:1: ( rule__ServerTypes__Group_2__0__Impl rule__ServerTypes__Group_2__1 )
            // InternalIoT.g:2200:2: rule__ServerTypes__Group_2__0__Impl rule__ServerTypes__Group_2__1
            {
            pushFollow(FOLLOW_4);
            rule__ServerTypes__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServerTypes__Group_2__1();

            state._fsp--;


            }

        }
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
    // InternalIoT.g:2207:1: rule__ServerTypes__Group_2__0__Impl : ( ',' ) ;
    public final void rule__ServerTypes__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2211:1: ( ( ',' ) )
            // InternalIoT.g:2212:1: ( ',' )
            {
            // InternalIoT.g:2212:1: ( ',' )
            // InternalIoT.g:2213:2: ','
            {
             before(grammarAccess.getServerTypesAccess().getCommaKeyword_2_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getServerTypesAccess().getCommaKeyword_2_0()); 

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
    // InternalIoT.g:2222:1: rule__ServerTypes__Group_2__1 : rule__ServerTypes__Group_2__1__Impl ;
    public final void rule__ServerTypes__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2226:1: ( rule__ServerTypes__Group_2__1__Impl )
            // InternalIoT.g:2227:2: rule__ServerTypes__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ServerTypes__Group_2__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalIoT.g:2233:1: rule__ServerTypes__Group_2__1__Impl : ( ( rule__ServerTypes__TypesAssignment_2_1 ) ) ;
    public final void rule__ServerTypes__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2237:1: ( ( ( rule__ServerTypes__TypesAssignment_2_1 ) ) )
            // InternalIoT.g:2238:1: ( ( rule__ServerTypes__TypesAssignment_2_1 ) )
            {
            // InternalIoT.g:2238:1: ( ( rule__ServerTypes__TypesAssignment_2_1 ) )
            // InternalIoT.g:2239:2: ( rule__ServerTypes__TypesAssignment_2_1 )
            {
             before(grammarAccess.getServerTypesAccess().getTypesAssignment_2_1()); 
            // InternalIoT.g:2240:2: ( rule__ServerTypes__TypesAssignment_2_1 )
            // InternalIoT.g:2240:3: rule__ServerTypes__TypesAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ServerTypes__TypesAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getServerTypesAccess().getTypesAssignment_2_1()); 

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
    // InternalIoT.g:2249:1: rule__Server__Group__0 : rule__Server__Group__0__Impl rule__Server__Group__1 ;
    public final void rule__Server__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2253:1: ( rule__Server__Group__0__Impl rule__Server__Group__1 )
            // InternalIoT.g:2254:2: rule__Server__Group__0__Impl rule__Server__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Server__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Server__Group__1();

            state._fsp--;


            }

        }
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
    // InternalIoT.g:2261:1: rule__Server__Group__0__Impl : ( 'Server' ) ;
    public final void rule__Server__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2265:1: ( ( 'Server' ) )
            // InternalIoT.g:2266:1: ( 'Server' )
            {
            // InternalIoT.g:2266:1: ( 'Server' )
            // InternalIoT.g:2267:2: 'Server'
            {
             before(grammarAccess.getServerAccess().getServerKeyword_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getServerAccess().getServerKeyword_0()); 

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
    // InternalIoT.g:2276:1: rule__Server__Group__1 : rule__Server__Group__1__Impl rule__Server__Group__2 ;
    public final void rule__Server__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2280:1: ( rule__Server__Group__1__Impl rule__Server__Group__2 )
            // InternalIoT.g:2281:2: rule__Server__Group__1__Impl rule__Server__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Server__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Server__Group__2();

            state._fsp--;


            }

        }
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
    // InternalIoT.g:2288:1: rule__Server__Group__1__Impl : ( ( rule__Server__NameAssignment_1 ) ) ;
    public final void rule__Server__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2292:1: ( ( ( rule__Server__NameAssignment_1 ) ) )
            // InternalIoT.g:2293:1: ( ( rule__Server__NameAssignment_1 ) )
            {
            // InternalIoT.g:2293:1: ( ( rule__Server__NameAssignment_1 ) )
            // InternalIoT.g:2294:2: ( rule__Server__NameAssignment_1 )
            {
             before(grammarAccess.getServerAccess().getNameAssignment_1()); 
            // InternalIoT.g:2295:2: ( rule__Server__NameAssignment_1 )
            // InternalIoT.g:2295:3: rule__Server__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Server__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getServerAccess().getNameAssignment_1()); 

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
    // InternalIoT.g:2303:1: rule__Server__Group__2 : rule__Server__Group__2__Impl rule__Server__Group__3 ;
    public final void rule__Server__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2307:1: ( rule__Server__Group__2__Impl rule__Server__Group__3 )
            // InternalIoT.g:2308:2: rule__Server__Group__2__Impl rule__Server__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Server__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Server__Group__3();

            state._fsp--;


            }

        }
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
    // InternalIoT.g:2315:1: rule__Server__Group__2__Impl : ( 'of' ) ;
    public final void rule__Server__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2319:1: ( ( 'of' ) )
            // InternalIoT.g:2320:1: ( 'of' )
            {
            // InternalIoT.g:2320:1: ( 'of' )
            // InternalIoT.g:2321:2: 'of'
            {
             before(grammarAccess.getServerAccess().getOfKeyword_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getServerAccess().getOfKeyword_2()); 

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
    // InternalIoT.g:2330:1: rule__Server__Group__3 : rule__Server__Group__3__Impl rule__Server__Group__4 ;
    public final void rule__Server__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2334:1: ( rule__Server__Group__3__Impl rule__Server__Group__4 )
            // InternalIoT.g:2335:2: rule__Server__Group__3__Impl rule__Server__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__Server__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Server__Group__4();

            state._fsp--;


            }

        }
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
    // InternalIoT.g:2342:1: rule__Server__Group__3__Impl : ( 'type' ) ;
    public final void rule__Server__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2346:1: ( ( 'type' ) )
            // InternalIoT.g:2347:1: ( 'type' )
            {
            // InternalIoT.g:2347:1: ( 'type' )
            // InternalIoT.g:2348:2: 'type'
            {
             before(grammarAccess.getServerAccess().getTypeKeyword_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getServerAccess().getTypeKeyword_3()); 

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
    // InternalIoT.g:2357:1: rule__Server__Group__4 : rule__Server__Group__4__Impl rule__Server__Group__5 ;
    public final void rule__Server__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2361:1: ( rule__Server__Group__4__Impl rule__Server__Group__5 )
            // InternalIoT.g:2362:2: rule__Server__Group__4__Impl rule__Server__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__Server__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Server__Group__5();

            state._fsp--;


            }

        }
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
    // InternalIoT.g:2369:1: rule__Server__Group__4__Impl : ( ( rule__Server__TypeAssignment_4 ) ) ;
    public final void rule__Server__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2373:1: ( ( ( rule__Server__TypeAssignment_4 ) ) )
            // InternalIoT.g:2374:1: ( ( rule__Server__TypeAssignment_4 ) )
            {
            // InternalIoT.g:2374:1: ( ( rule__Server__TypeAssignment_4 ) )
            // InternalIoT.g:2375:2: ( rule__Server__TypeAssignment_4 )
            {
             before(grammarAccess.getServerAccess().getTypeAssignment_4()); 
            // InternalIoT.g:2376:2: ( rule__Server__TypeAssignment_4 )
            // InternalIoT.g:2376:3: rule__Server__TypeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Server__TypeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getServerAccess().getTypeAssignment_4()); 

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
    // InternalIoT.g:2384:1: rule__Server__Group__5 : rule__Server__Group__5__Impl rule__Server__Group__6 ;
    public final void rule__Server__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2388:1: ( rule__Server__Group__5__Impl rule__Server__Group__6 )
            // InternalIoT.g:2389:2: rule__Server__Group__5__Impl rule__Server__Group__6
            {
            pushFollow(FOLLOW_16);
            rule__Server__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Server__Group__6();

            state._fsp--;


            }

        }
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
    // InternalIoT.g:2396:1: rule__Server__Group__5__Impl : ( 'listens' ) ;
    public final void rule__Server__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2400:1: ( ( 'listens' ) )
            // InternalIoT.g:2401:1: ( 'listens' )
            {
            // InternalIoT.g:2401:1: ( 'listens' )
            // InternalIoT.g:2402:2: 'listens'
            {
             before(grammarAccess.getServerAccess().getListensKeyword_5()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getServerAccess().getListensKeyword_5()); 

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
    // InternalIoT.g:2411:1: rule__Server__Group__6 : rule__Server__Group__6__Impl rule__Server__Group__7 ;
    public final void rule__Server__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2415:1: ( rule__Server__Group__6__Impl rule__Server__Group__7 )
            // InternalIoT.g:2416:2: rule__Server__Group__6__Impl rule__Server__Group__7
            {
            pushFollow(FOLLOW_17);
            rule__Server__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Server__Group__7();

            state._fsp--;


            }

        }
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
    // InternalIoT.g:2423:1: rule__Server__Group__6__Impl : ( 'on' ) ;
    public final void rule__Server__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2427:1: ( ( 'on' ) )
            // InternalIoT.g:2428:1: ( 'on' )
            {
            // InternalIoT.g:2428:1: ( 'on' )
            // InternalIoT.g:2429:2: 'on'
            {
             before(grammarAccess.getServerAccess().getOnKeyword_6()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getServerAccess().getOnKeyword_6()); 

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
    // InternalIoT.g:2438:1: rule__Server__Group__7 : rule__Server__Group__7__Impl rule__Server__Group__8 ;
    public final void rule__Server__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2442:1: ( rule__Server__Group__7__Impl rule__Server__Group__8 )
            // InternalIoT.g:2443:2: rule__Server__Group__7__Impl rule__Server__Group__8
            {
            pushFollow(FOLLOW_18);
            rule__Server__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Server__Group__8();

            state._fsp--;


            }

        }
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
    // InternalIoT.g:2450:1: rule__Server__Group__7__Impl : ( ( rule__Server__IpAssignment_7 ) ) ;
    public final void rule__Server__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2454:1: ( ( ( rule__Server__IpAssignment_7 ) ) )
            // InternalIoT.g:2455:1: ( ( rule__Server__IpAssignment_7 ) )
            {
            // InternalIoT.g:2455:1: ( ( rule__Server__IpAssignment_7 ) )
            // InternalIoT.g:2456:2: ( rule__Server__IpAssignment_7 )
            {
             before(grammarAccess.getServerAccess().getIpAssignment_7()); 
            // InternalIoT.g:2457:2: ( rule__Server__IpAssignment_7 )
            // InternalIoT.g:2457:3: rule__Server__IpAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Server__IpAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getServerAccess().getIpAssignment_7()); 

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
    // InternalIoT.g:2465:1: rule__Server__Group__8 : rule__Server__Group__8__Impl rule__Server__Group__9 ;
    public final void rule__Server__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2469:1: ( rule__Server__Group__8__Impl rule__Server__Group__9 )
            // InternalIoT.g:2470:2: rule__Server__Group__8__Impl rule__Server__Group__9
            {
            pushFollow(FOLLOW_17);
            rule__Server__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Server__Group__9();

            state._fsp--;


            }

        }
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
    // InternalIoT.g:2477:1: rule__Server__Group__8__Impl : ( 'and' ) ;
    public final void rule__Server__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2481:1: ( ( 'and' ) )
            // InternalIoT.g:2482:1: ( 'and' )
            {
            // InternalIoT.g:2482:1: ( 'and' )
            // InternalIoT.g:2483:2: 'and'
            {
             before(grammarAccess.getServerAccess().getAndKeyword_8()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getServerAccess().getAndKeyword_8()); 

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
    // InternalIoT.g:2492:1: rule__Server__Group__9 : rule__Server__Group__9__Impl ;
    public final void rule__Server__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2496:1: ( rule__Server__Group__9__Impl )
            // InternalIoT.g:2497:2: rule__Server__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Server__Group__9__Impl();

            state._fsp--;


            }

        }
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
    // InternalIoT.g:2503:1: rule__Server__Group__9__Impl : ( ( rule__Server__PortAssignment_9 ) ) ;
    public final void rule__Server__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2507:1: ( ( ( rule__Server__PortAssignment_9 ) ) )
            // InternalIoT.g:2508:1: ( ( rule__Server__PortAssignment_9 ) )
            {
            // InternalIoT.g:2508:1: ( ( rule__Server__PortAssignment_9 ) )
            // InternalIoT.g:2509:2: ( rule__Server__PortAssignment_9 )
            {
             before(grammarAccess.getServerAccess().getPortAssignment_9()); 
            // InternalIoT.g:2510:2: ( rule__Server__PortAssignment_9 )
            // InternalIoT.g:2510:3: rule__Server__PortAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__Server__PortAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getServerAccess().getPortAssignment_9()); 

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
    // InternalIoT.g:2519:1: rule__DestinationTypes__Group__0 : rule__DestinationTypes__Group__0__Impl rule__DestinationTypes__Group__1 ;
    public final void rule__DestinationTypes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2523:1: ( rule__DestinationTypes__Group__0__Impl rule__DestinationTypes__Group__1 )
            // InternalIoT.g:2524:2: rule__DestinationTypes__Group__0__Impl rule__DestinationTypes__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__DestinationTypes__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DestinationTypes__Group__1();

            state._fsp--;


            }

        }
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
    // InternalIoT.g:2531:1: rule__DestinationTypes__Group__0__Impl : ( 'DestinationTypes' ) ;
    public final void rule__DestinationTypes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2535:1: ( ( 'DestinationTypes' ) )
            // InternalIoT.g:2536:1: ( 'DestinationTypes' )
            {
            // InternalIoT.g:2536:1: ( 'DestinationTypes' )
            // InternalIoT.g:2537:2: 'DestinationTypes'
            {
             before(grammarAccess.getDestinationTypesAccess().getDestinationTypesKeyword_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getDestinationTypesAccess().getDestinationTypesKeyword_0()); 

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
    // InternalIoT.g:2546:1: rule__DestinationTypes__Group__1 : rule__DestinationTypes__Group__1__Impl rule__DestinationTypes__Group__2 ;
    public final void rule__DestinationTypes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2550:1: ( rule__DestinationTypes__Group__1__Impl rule__DestinationTypes__Group__2 )
            // InternalIoT.g:2551:2: rule__DestinationTypes__Group__1__Impl rule__DestinationTypes__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__DestinationTypes__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DestinationTypes__Group__2();

            state._fsp--;


            }

        }
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
    // InternalIoT.g:2558:1: rule__DestinationTypes__Group__1__Impl : ( ( rule__DestinationTypes__TypesAssignment_1 ) ) ;
    public final void rule__DestinationTypes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2562:1: ( ( ( rule__DestinationTypes__TypesAssignment_1 ) ) )
            // InternalIoT.g:2563:1: ( ( rule__DestinationTypes__TypesAssignment_1 ) )
            {
            // InternalIoT.g:2563:1: ( ( rule__DestinationTypes__TypesAssignment_1 ) )
            // InternalIoT.g:2564:2: ( rule__DestinationTypes__TypesAssignment_1 )
            {
             before(grammarAccess.getDestinationTypesAccess().getTypesAssignment_1()); 
            // InternalIoT.g:2565:2: ( rule__DestinationTypes__TypesAssignment_1 )
            // InternalIoT.g:2565:3: rule__DestinationTypes__TypesAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DestinationTypes__TypesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDestinationTypesAccess().getTypesAssignment_1()); 

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
    // InternalIoT.g:2573:1: rule__DestinationTypes__Group__2 : rule__DestinationTypes__Group__2__Impl ;
    public final void rule__DestinationTypes__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2577:1: ( rule__DestinationTypes__Group__2__Impl )
            // InternalIoT.g:2578:2: rule__DestinationTypes__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DestinationTypes__Group__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalIoT.g:2584:1: rule__DestinationTypes__Group__2__Impl : ( ( rule__DestinationTypes__Group_2__0 )* ) ;
    public final void rule__DestinationTypes__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2588:1: ( ( ( rule__DestinationTypes__Group_2__0 )* ) )
            // InternalIoT.g:2589:1: ( ( rule__DestinationTypes__Group_2__0 )* )
            {
            // InternalIoT.g:2589:1: ( ( rule__DestinationTypes__Group_2__0 )* )
            // InternalIoT.g:2590:2: ( rule__DestinationTypes__Group_2__0 )*
            {
             before(grammarAccess.getDestinationTypesAccess().getGroup_2()); 
            // InternalIoT.g:2591:2: ( rule__DestinationTypes__Group_2__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==19) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalIoT.g:2591:3: rule__DestinationTypes__Group_2__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__DestinationTypes__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getDestinationTypesAccess().getGroup_2()); 

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
    // InternalIoT.g:2600:1: rule__DestinationTypes__Group_2__0 : rule__DestinationTypes__Group_2__0__Impl rule__DestinationTypes__Group_2__1 ;
    public final void rule__DestinationTypes__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2604:1: ( rule__DestinationTypes__Group_2__0__Impl rule__DestinationTypes__Group_2__1 )
            // InternalIoT.g:2605:2: rule__DestinationTypes__Group_2__0__Impl rule__DestinationTypes__Group_2__1
            {
            pushFollow(FOLLOW_4);
            rule__DestinationTypes__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DestinationTypes__Group_2__1();

            state._fsp--;


            }

        }
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
    // InternalIoT.g:2612:1: rule__DestinationTypes__Group_2__0__Impl : ( ',' ) ;
    public final void rule__DestinationTypes__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2616:1: ( ( ',' ) )
            // InternalIoT.g:2617:1: ( ',' )
            {
            // InternalIoT.g:2617:1: ( ',' )
            // InternalIoT.g:2618:2: ','
            {
             before(grammarAccess.getDestinationTypesAccess().getCommaKeyword_2_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getDestinationTypesAccess().getCommaKeyword_2_0()); 

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
    // InternalIoT.g:2627:1: rule__DestinationTypes__Group_2__1 : rule__DestinationTypes__Group_2__1__Impl ;
    public final void rule__DestinationTypes__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2631:1: ( rule__DestinationTypes__Group_2__1__Impl )
            // InternalIoT.g:2632:2: rule__DestinationTypes__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DestinationTypes__Group_2__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalIoT.g:2638:1: rule__DestinationTypes__Group_2__1__Impl : ( ( rule__DestinationTypes__TypesAssignment_2_1 ) ) ;
    public final void rule__DestinationTypes__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2642:1: ( ( ( rule__DestinationTypes__TypesAssignment_2_1 ) ) )
            // InternalIoT.g:2643:1: ( ( rule__DestinationTypes__TypesAssignment_2_1 ) )
            {
            // InternalIoT.g:2643:1: ( ( rule__DestinationTypes__TypesAssignment_2_1 ) )
            // InternalIoT.g:2644:2: ( rule__DestinationTypes__TypesAssignment_2_1 )
            {
             before(grammarAccess.getDestinationTypesAccess().getTypesAssignment_2_1()); 
            // InternalIoT.g:2645:2: ( rule__DestinationTypes__TypesAssignment_2_1 )
            // InternalIoT.g:2645:3: rule__DestinationTypes__TypesAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__DestinationTypes__TypesAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getDestinationTypesAccess().getTypesAssignment_2_1()); 

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
    // InternalIoT.g:2654:1: rule__Destination__Group__0 : rule__Destination__Group__0__Impl rule__Destination__Group__1 ;
    public final void rule__Destination__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2658:1: ( rule__Destination__Group__0__Impl rule__Destination__Group__1 )
            // InternalIoT.g:2659:2: rule__Destination__Group__0__Impl rule__Destination__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Destination__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Destination__Group__1();

            state._fsp--;


            }

        }
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
    // InternalIoT.g:2666:1: rule__Destination__Group__0__Impl : ( 'Destination' ) ;
    public final void rule__Destination__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2670:1: ( ( 'Destination' ) )
            // InternalIoT.g:2671:1: ( 'Destination' )
            {
            // InternalIoT.g:2671:1: ( 'Destination' )
            // InternalIoT.g:2672:2: 'Destination'
            {
             before(grammarAccess.getDestinationAccess().getDestinationKeyword_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getDestinationAccess().getDestinationKeyword_0()); 

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
    // InternalIoT.g:2681:1: rule__Destination__Group__1 : rule__Destination__Group__1__Impl rule__Destination__Group__2 ;
    public final void rule__Destination__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2685:1: ( rule__Destination__Group__1__Impl rule__Destination__Group__2 )
            // InternalIoT.g:2686:2: rule__Destination__Group__1__Impl rule__Destination__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Destination__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Destination__Group__2();

            state._fsp--;


            }

        }
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
    // InternalIoT.g:2693:1: rule__Destination__Group__1__Impl : ( ( rule__Destination__NameAssignment_1 ) ) ;
    public final void rule__Destination__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2697:1: ( ( ( rule__Destination__NameAssignment_1 ) ) )
            // InternalIoT.g:2698:1: ( ( rule__Destination__NameAssignment_1 ) )
            {
            // InternalIoT.g:2698:1: ( ( rule__Destination__NameAssignment_1 ) )
            // InternalIoT.g:2699:2: ( rule__Destination__NameAssignment_1 )
            {
             before(grammarAccess.getDestinationAccess().getNameAssignment_1()); 
            // InternalIoT.g:2700:2: ( rule__Destination__NameAssignment_1 )
            // InternalIoT.g:2700:3: rule__Destination__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Destination__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDestinationAccess().getNameAssignment_1()); 

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
    // InternalIoT.g:2708:1: rule__Destination__Group__2 : rule__Destination__Group__2__Impl rule__Destination__Group__3 ;
    public final void rule__Destination__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2712:1: ( rule__Destination__Group__2__Impl rule__Destination__Group__3 )
            // InternalIoT.g:2713:2: rule__Destination__Group__2__Impl rule__Destination__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Destination__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Destination__Group__3();

            state._fsp--;


            }

        }
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
    // InternalIoT.g:2720:1: rule__Destination__Group__2__Impl : ( 'of' ) ;
    public final void rule__Destination__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2724:1: ( ( 'of' ) )
            // InternalIoT.g:2725:1: ( 'of' )
            {
            // InternalIoT.g:2725:1: ( 'of' )
            // InternalIoT.g:2726:2: 'of'
            {
             before(grammarAccess.getDestinationAccess().getOfKeyword_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getDestinationAccess().getOfKeyword_2()); 

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
    // InternalIoT.g:2735:1: rule__Destination__Group__3 : rule__Destination__Group__3__Impl ;
    public final void rule__Destination__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2739:1: ( rule__Destination__Group__3__Impl )
            // InternalIoT.g:2740:2: rule__Destination__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Destination__Group__3__Impl();

            state._fsp--;


            }

        }
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
    // InternalIoT.g:2746:1: rule__Destination__Group__3__Impl : ( ( rule__Destination__TypeAssignment_3 ) ) ;
    public final void rule__Destination__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2750:1: ( ( ( rule__Destination__TypeAssignment_3 ) ) )
            // InternalIoT.g:2751:1: ( ( rule__Destination__TypeAssignment_3 ) )
            {
            // InternalIoT.g:2751:1: ( ( rule__Destination__TypeAssignment_3 ) )
            // InternalIoT.g:2752:2: ( rule__Destination__TypeAssignment_3 )
            {
             before(grammarAccess.getDestinationAccess().getTypeAssignment_3()); 
            // InternalIoT.g:2753:2: ( rule__Destination__TypeAssignment_3 )
            // InternalIoT.g:2753:3: rule__Destination__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Destination__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDestinationAccess().getTypeAssignment_3()); 

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
    // InternalIoT.g:2762:1: rule__FetchData__Group__0 : rule__FetchData__Group__0__Impl rule__FetchData__Group__1 ;
    public final void rule__FetchData__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2766:1: ( rule__FetchData__Group__0__Impl rule__FetchData__Group__1 )
            // InternalIoT.g:2767:2: rule__FetchData__Group__0__Impl rule__FetchData__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__FetchData__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FetchData__Group__1();

            state._fsp--;


            }

        }
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
    // InternalIoT.g:2774:1: rule__FetchData__Group__0__Impl : ( 'Fetch' ) ;
    public final void rule__FetchData__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2778:1: ( ( 'Fetch' ) )
            // InternalIoT.g:2779:1: ( 'Fetch' )
            {
            // InternalIoT.g:2779:1: ( 'Fetch' )
            // InternalIoT.g:2780:2: 'Fetch'
            {
             before(grammarAccess.getFetchDataAccess().getFetchKeyword_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getFetchDataAccess().getFetchKeyword_0()); 

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
    // InternalIoT.g:2789:1: rule__FetchData__Group__1 : rule__FetchData__Group__1__Impl rule__FetchData__Group__2 ;
    public final void rule__FetchData__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2793:1: ( rule__FetchData__Group__1__Impl rule__FetchData__Group__2 )
            // InternalIoT.g:2794:2: rule__FetchData__Group__1__Impl rule__FetchData__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__FetchData__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FetchData__Group__2();

            state._fsp--;


            }

        }
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
    // InternalIoT.g:2801:1: rule__FetchData__Group__1__Impl : ( 'data' ) ;
    public final void rule__FetchData__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2805:1: ( ( 'data' ) )
            // InternalIoT.g:2806:1: ( 'data' )
            {
            // InternalIoT.g:2806:1: ( 'data' )
            // InternalIoT.g:2807:2: 'data'
            {
             before(grammarAccess.getFetchDataAccess().getDataKeyword_1()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getFetchDataAccess().getDataKeyword_1()); 

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
    // InternalIoT.g:2816:1: rule__FetchData__Group__2 : rule__FetchData__Group__2__Impl rule__FetchData__Group__3 ;
    public final void rule__FetchData__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2820:1: ( rule__FetchData__Group__2__Impl rule__FetchData__Group__3 )
            // InternalIoT.g:2821:2: rule__FetchData__Group__2__Impl rule__FetchData__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__FetchData__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FetchData__Group__3();

            state._fsp--;


            }

        }
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
    // InternalIoT.g:2828:1: rule__FetchData__Group__2__Impl : ( 'from' ) ;
    public final void rule__FetchData__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2832:1: ( ( 'from' ) )
            // InternalIoT.g:2833:1: ( 'from' )
            {
            // InternalIoT.g:2833:1: ( 'from' )
            // InternalIoT.g:2834:2: 'from'
            {
             before(grammarAccess.getFetchDataAccess().getFromKeyword_2()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getFetchDataAccess().getFromKeyword_2()); 

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
    // InternalIoT.g:2843:1: rule__FetchData__Group__3 : rule__FetchData__Group__3__Impl rule__FetchData__Group__4 ;
    public final void rule__FetchData__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2847:1: ( rule__FetchData__Group__3__Impl rule__FetchData__Group__4 )
            // InternalIoT.g:2848:2: rule__FetchData__Group__3__Impl rule__FetchData__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__FetchData__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FetchData__Group__4();

            state._fsp--;


            }

        }
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
    // InternalIoT.g:2855:1: rule__FetchData__Group__3__Impl : ( ( rule__FetchData__Alternatives_3 ) ) ;
    public final void rule__FetchData__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2859:1: ( ( ( rule__FetchData__Alternatives_3 ) ) )
            // InternalIoT.g:2860:1: ( ( rule__FetchData__Alternatives_3 ) )
            {
            // InternalIoT.g:2860:1: ( ( rule__FetchData__Alternatives_3 ) )
            // InternalIoT.g:2861:2: ( rule__FetchData__Alternatives_3 )
            {
             before(grammarAccess.getFetchDataAccess().getAlternatives_3()); 
            // InternalIoT.g:2862:2: ( rule__FetchData__Alternatives_3 )
            // InternalIoT.g:2862:3: rule__FetchData__Alternatives_3
            {
            pushFollow(FOLLOW_2);
            rule__FetchData__Alternatives_3();

            state._fsp--;


            }

             after(grammarAccess.getFetchDataAccess().getAlternatives_3()); 

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
    // InternalIoT.g:2870:1: rule__FetchData__Group__4 : rule__FetchData__Group__4__Impl rule__FetchData__Group__5 ;
    public final void rule__FetchData__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2874:1: ( rule__FetchData__Group__4__Impl rule__FetchData__Group__5 )
            // InternalIoT.g:2875:2: rule__FetchData__Group__4__Impl rule__FetchData__Group__5
            {
            pushFollow(FOLLOW_22);
            rule__FetchData__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FetchData__Group__5();

            state._fsp--;


            }

        }
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
    // InternalIoT.g:2882:1: rule__FetchData__Group__4__Impl : ( 'for' ) ;
    public final void rule__FetchData__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2886:1: ( ( 'for' ) )
            // InternalIoT.g:2887:1: ( 'for' )
            {
            // InternalIoT.g:2887:1: ( 'for' )
            // InternalIoT.g:2888:2: 'for'
            {
             before(grammarAccess.getFetchDataAccess().getForKeyword_4()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getFetchDataAccess().getForKeyword_4()); 

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
    // InternalIoT.g:2897:1: rule__FetchData__Group__5 : rule__FetchData__Group__5__Impl rule__FetchData__Group__6 ;
    public final void rule__FetchData__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2901:1: ( rule__FetchData__Group__5__Impl rule__FetchData__Group__6 )
            // InternalIoT.g:2902:2: rule__FetchData__Group__5__Impl rule__FetchData__Group__6
            {
            pushFollow(FOLLOW_4);
            rule__FetchData__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FetchData__Group__6();

            state._fsp--;


            }

        }
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
    // InternalIoT.g:2909:1: rule__FetchData__Group__5__Impl : ( 'device' ) ;
    public final void rule__FetchData__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2913:1: ( ( 'device' ) )
            // InternalIoT.g:2914:1: ( 'device' )
            {
            // InternalIoT.g:2914:1: ( 'device' )
            // InternalIoT.g:2915:2: 'device'
            {
             before(grammarAccess.getFetchDataAccess().getDeviceKeyword_5()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getFetchDataAccess().getDeviceKeyword_5()); 

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
    // InternalIoT.g:2924:1: rule__FetchData__Group__6 : rule__FetchData__Group__6__Impl rule__FetchData__Group__7 ;
    public final void rule__FetchData__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2928:1: ( rule__FetchData__Group__6__Impl rule__FetchData__Group__7 )
            // InternalIoT.g:2929:2: rule__FetchData__Group__6__Impl rule__FetchData__Group__7
            {
            pushFollow(FOLLOW_23);
            rule__FetchData__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FetchData__Group__7();

            state._fsp--;


            }

        }
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
    // InternalIoT.g:2936:1: rule__FetchData__Group__6__Impl : ( ( rule__FetchData__DeviceAssignment_6 ) ) ;
    public final void rule__FetchData__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2940:1: ( ( ( rule__FetchData__DeviceAssignment_6 ) ) )
            // InternalIoT.g:2941:1: ( ( rule__FetchData__DeviceAssignment_6 ) )
            {
            // InternalIoT.g:2941:1: ( ( rule__FetchData__DeviceAssignment_6 ) )
            // InternalIoT.g:2942:2: ( rule__FetchData__DeviceAssignment_6 )
            {
             before(grammarAccess.getFetchDataAccess().getDeviceAssignment_6()); 
            // InternalIoT.g:2943:2: ( rule__FetchData__DeviceAssignment_6 )
            // InternalIoT.g:2943:3: rule__FetchData__DeviceAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__FetchData__DeviceAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getFetchDataAccess().getDeviceAssignment_6()); 

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
    // InternalIoT.g:2951:1: rule__FetchData__Group__7 : rule__FetchData__Group__7__Impl rule__FetchData__Group__8 ;
    public final void rule__FetchData__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2955:1: ( rule__FetchData__Group__7__Impl rule__FetchData__Group__8 )
            // InternalIoT.g:2956:2: rule__FetchData__Group__7__Impl rule__FetchData__Group__8
            {
            pushFollow(FOLLOW_24);
            rule__FetchData__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FetchData__Group__8();

            state._fsp--;


            }

        }
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
    // InternalIoT.g:2963:1: rule__FetchData__Group__7__Impl : ( 'to' ) ;
    public final void rule__FetchData__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2967:1: ( ( 'to' ) )
            // InternalIoT.g:2968:1: ( 'to' )
            {
            // InternalIoT.g:2968:1: ( 'to' )
            // InternalIoT.g:2969:2: 'to'
            {
             before(grammarAccess.getFetchDataAccess().getToKeyword_7()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getFetchDataAccess().getToKeyword_7()); 

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
    // InternalIoT.g:2978:1: rule__FetchData__Group__8 : rule__FetchData__Group__8__Impl rule__FetchData__Group__9 ;
    public final void rule__FetchData__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2982:1: ( rule__FetchData__Group__8__Impl rule__FetchData__Group__9 )
            // InternalIoT.g:2983:2: rule__FetchData__Group__8__Impl rule__FetchData__Group__9
            {
            pushFollow(FOLLOW_25);
            rule__FetchData__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FetchData__Group__9();

            state._fsp--;


            }

        }
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
    // InternalIoT.g:2990:1: rule__FetchData__Group__8__Impl : ( ( rule__FetchData__Alternatives_8 ) ) ;
    public final void rule__FetchData__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:2994:1: ( ( ( rule__FetchData__Alternatives_8 ) ) )
            // InternalIoT.g:2995:1: ( ( rule__FetchData__Alternatives_8 ) )
            {
            // InternalIoT.g:2995:1: ( ( rule__FetchData__Alternatives_8 ) )
            // InternalIoT.g:2996:2: ( rule__FetchData__Alternatives_8 )
            {
             before(grammarAccess.getFetchDataAccess().getAlternatives_8()); 
            // InternalIoT.g:2997:2: ( rule__FetchData__Alternatives_8 )
            // InternalIoT.g:2997:3: rule__FetchData__Alternatives_8
            {
            pushFollow(FOLLOW_2);
            rule__FetchData__Alternatives_8();

            state._fsp--;


            }

             after(grammarAccess.getFetchDataAccess().getAlternatives_8()); 

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
    // InternalIoT.g:3005:1: rule__FetchData__Group__9 : rule__FetchData__Group__9__Impl ;
    public final void rule__FetchData__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3009:1: ( rule__FetchData__Group__9__Impl )
            // InternalIoT.g:3010:2: rule__FetchData__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FetchData__Group__9__Impl();

            state._fsp--;


            }

        }
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
    // InternalIoT.g:3016:1: rule__FetchData__Group__9__Impl : ( ( rule__FetchData__Alternatives_9 )? ) ;
    public final void rule__FetchData__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3020:1: ( ( ( rule__FetchData__Alternatives_9 )? ) )
            // InternalIoT.g:3021:1: ( ( rule__FetchData__Alternatives_9 )? )
            {
            // InternalIoT.g:3021:1: ( ( rule__FetchData__Alternatives_9 )? )
            // InternalIoT.g:3022:2: ( rule__FetchData__Alternatives_9 )?
            {
             before(grammarAccess.getFetchDataAccess().getAlternatives_9()); 
            // InternalIoT.g:3023:2: ( rule__FetchData__Alternatives_9 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=12 && LA16_0<=13)||LA16_0==47) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalIoT.g:3023:3: rule__FetchData__Alternatives_9
                    {
                    pushFollow(FOLLOW_2);
                    rule__FetchData__Alternatives_9();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFetchDataAccess().getAlternatives_9()); 

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


    // $ANTLR start "rule__FetchData__Group_3_0__0"
    // InternalIoT.g:3032:1: rule__FetchData__Group_3_0__0 : rule__FetchData__Group_3_0__0__Impl rule__FetchData__Group_3_0__1 ;
    public final void rule__FetchData__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3036:1: ( rule__FetchData__Group_3_0__0__Impl rule__FetchData__Group_3_0__1 )
            // InternalIoT.g:3037:2: rule__FetchData__Group_3_0__0__Impl rule__FetchData__Group_3_0__1
            {
            pushFollow(FOLLOW_4);
            rule__FetchData__Group_3_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FetchData__Group_3_0__1();

            state._fsp--;


            }

        }
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
    // InternalIoT.g:3044:1: rule__FetchData__Group_3_0__0__Impl : ( 'type' ) ;
    public final void rule__FetchData__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3048:1: ( ( 'type' ) )
            // InternalIoT.g:3049:1: ( 'type' )
            {
            // InternalIoT.g:3049:1: ( 'type' )
            // InternalIoT.g:3050:2: 'type'
            {
             before(grammarAccess.getFetchDataAccess().getTypeKeyword_3_0_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getFetchDataAccess().getTypeKeyword_3_0_0()); 

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
    // InternalIoT.g:3059:1: rule__FetchData__Group_3_0__1 : rule__FetchData__Group_3_0__1__Impl ;
    public final void rule__FetchData__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3063:1: ( rule__FetchData__Group_3_0__1__Impl )
            // InternalIoT.g:3064:2: rule__FetchData__Group_3_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FetchData__Group_3_0__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalIoT.g:3070:1: rule__FetchData__Group_3_0__1__Impl : ( ( rule__FetchData__FilterAssignment_3_0_1 ) ) ;
    public final void rule__FetchData__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3074:1: ( ( ( rule__FetchData__FilterAssignment_3_0_1 ) ) )
            // InternalIoT.g:3075:1: ( ( rule__FetchData__FilterAssignment_3_0_1 ) )
            {
            // InternalIoT.g:3075:1: ( ( rule__FetchData__FilterAssignment_3_0_1 ) )
            // InternalIoT.g:3076:2: ( rule__FetchData__FilterAssignment_3_0_1 )
            {
             before(grammarAccess.getFetchDataAccess().getFilterAssignment_3_0_1()); 
            // InternalIoT.g:3077:2: ( rule__FetchData__FilterAssignment_3_0_1 )
            // InternalIoT.g:3077:3: rule__FetchData__FilterAssignment_3_0_1
            {
            pushFollow(FOLLOW_2);
            rule__FetchData__FilterAssignment_3_0_1();

            state._fsp--;


            }

             after(grammarAccess.getFetchDataAccess().getFilterAssignment_3_0_1()); 

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
    // InternalIoT.g:3086:1: rule__FetchData__Group_3_1__0 : rule__FetchData__Group_3_1__0__Impl rule__FetchData__Group_3_1__1 ;
    public final void rule__FetchData__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3090:1: ( rule__FetchData__Group_3_1__0__Impl rule__FetchData__Group_3_1__1 )
            // InternalIoT.g:3091:2: rule__FetchData__Group_3_1__0__Impl rule__FetchData__Group_3_1__1
            {
            pushFollow(FOLLOW_4);
            rule__FetchData__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FetchData__Group_3_1__1();

            state._fsp--;


            }

        }
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
    // InternalIoT.g:3098:1: rule__FetchData__Group_3_1__0__Impl : ( 'group' ) ;
    public final void rule__FetchData__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3102:1: ( ( 'group' ) )
            // InternalIoT.g:3103:1: ( 'group' )
            {
            // InternalIoT.g:3103:1: ( 'group' )
            // InternalIoT.g:3104:2: 'group'
            {
             before(grammarAccess.getFetchDataAccess().getGroupKeyword_3_1_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getFetchDataAccess().getGroupKeyword_3_1_0()); 

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
    // InternalIoT.g:3113:1: rule__FetchData__Group_3_1__1 : rule__FetchData__Group_3_1__1__Impl ;
    public final void rule__FetchData__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3117:1: ( rule__FetchData__Group_3_1__1__Impl )
            // InternalIoT.g:3118:2: rule__FetchData__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FetchData__Group_3_1__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalIoT.g:3124:1: rule__FetchData__Group_3_1__1__Impl : ( ( rule__FetchData__FilterAssignment_3_1_1 ) ) ;
    public final void rule__FetchData__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3128:1: ( ( ( rule__FetchData__FilterAssignment_3_1_1 ) ) )
            // InternalIoT.g:3129:1: ( ( rule__FetchData__FilterAssignment_3_1_1 ) )
            {
            // InternalIoT.g:3129:1: ( ( rule__FetchData__FilterAssignment_3_1_1 ) )
            // InternalIoT.g:3130:2: ( rule__FetchData__FilterAssignment_3_1_1 )
            {
             before(grammarAccess.getFetchDataAccess().getFilterAssignment_3_1_1()); 
            // InternalIoT.g:3131:2: ( rule__FetchData__FilterAssignment_3_1_1 )
            // InternalIoT.g:3131:3: rule__FetchData__FilterAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__FetchData__FilterAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getFetchDataAccess().getFilterAssignment_3_1_1()); 

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
    // InternalIoT.g:3140:1: rule__FetchData__Group_8_0__0 : rule__FetchData__Group_8_0__0__Impl rule__FetchData__Group_8_0__1 ;
    public final void rule__FetchData__Group_8_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3144:1: ( rule__FetchData__Group_8_0__0__Impl rule__FetchData__Group_8_0__1 )
            // InternalIoT.g:3145:2: rule__FetchData__Group_8_0__0__Impl rule__FetchData__Group_8_0__1
            {
            pushFollow(FOLLOW_4);
            rule__FetchData__Group_8_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FetchData__Group_8_0__1();

            state._fsp--;


            }

        }
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
    // InternalIoT.g:3152:1: rule__FetchData__Group_8_0__0__Impl : ( 'destination' ) ;
    public final void rule__FetchData__Group_8_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3156:1: ( ( 'destination' ) )
            // InternalIoT.g:3157:1: ( 'destination' )
            {
            // InternalIoT.g:3157:1: ( 'destination' )
            // InternalIoT.g:3158:2: 'destination'
            {
             before(grammarAccess.getFetchDataAccess().getDestinationKeyword_8_0_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getFetchDataAccess().getDestinationKeyword_8_0_0()); 

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
    // InternalIoT.g:3167:1: rule__FetchData__Group_8_0__1 : rule__FetchData__Group_8_0__1__Impl ;
    public final void rule__FetchData__Group_8_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3171:1: ( rule__FetchData__Group_8_0__1__Impl )
            // InternalIoT.g:3172:2: rule__FetchData__Group_8_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FetchData__Group_8_0__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalIoT.g:3178:1: rule__FetchData__Group_8_0__1__Impl : ( ( rule__FetchData__DestinationAssignment_8_0_1 ) ) ;
    public final void rule__FetchData__Group_8_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3182:1: ( ( ( rule__FetchData__DestinationAssignment_8_0_1 ) ) )
            // InternalIoT.g:3183:1: ( ( rule__FetchData__DestinationAssignment_8_0_1 ) )
            {
            // InternalIoT.g:3183:1: ( ( rule__FetchData__DestinationAssignment_8_0_1 ) )
            // InternalIoT.g:3184:2: ( rule__FetchData__DestinationAssignment_8_0_1 )
            {
             before(grammarAccess.getFetchDataAccess().getDestinationAssignment_8_0_1()); 
            // InternalIoT.g:3185:2: ( rule__FetchData__DestinationAssignment_8_0_1 )
            // InternalIoT.g:3185:3: rule__FetchData__DestinationAssignment_8_0_1
            {
            pushFollow(FOLLOW_2);
            rule__FetchData__DestinationAssignment_8_0_1();

            state._fsp--;


            }

             after(grammarAccess.getFetchDataAccess().getDestinationAssignment_8_0_1()); 

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
    // InternalIoT.g:3194:1: rule__FetchData__Group_8_1__0 : rule__FetchData__Group_8_1__0__Impl rule__FetchData__Group_8_1__1 ;
    public final void rule__FetchData__Group_8_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3198:1: ( rule__FetchData__Group_8_1__0__Impl rule__FetchData__Group_8_1__1 )
            // InternalIoT.g:3199:2: rule__FetchData__Group_8_1__0__Impl rule__FetchData__Group_8_1__1
            {
            pushFollow(FOLLOW_4);
            rule__FetchData__Group_8_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FetchData__Group_8_1__1();

            state._fsp--;


            }

        }
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
    // InternalIoT.g:3206:1: rule__FetchData__Group_8_1__0__Impl : ( 'server' ) ;
    public final void rule__FetchData__Group_8_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3210:1: ( ( 'server' ) )
            // InternalIoT.g:3211:1: ( 'server' )
            {
            // InternalIoT.g:3211:1: ( 'server' )
            // InternalIoT.g:3212:2: 'server'
            {
             before(grammarAccess.getFetchDataAccess().getServerKeyword_8_1_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getFetchDataAccess().getServerKeyword_8_1_0()); 

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
    // InternalIoT.g:3221:1: rule__FetchData__Group_8_1__1 : rule__FetchData__Group_8_1__1__Impl ;
    public final void rule__FetchData__Group_8_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3225:1: ( rule__FetchData__Group_8_1__1__Impl )
            // InternalIoT.g:3226:2: rule__FetchData__Group_8_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FetchData__Group_8_1__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalIoT.g:3232:1: rule__FetchData__Group_8_1__1__Impl : ( ( rule__FetchData__DestinationAssignment_8_1_1 ) ) ;
    public final void rule__FetchData__Group_8_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3236:1: ( ( ( rule__FetchData__DestinationAssignment_8_1_1 ) ) )
            // InternalIoT.g:3237:1: ( ( rule__FetchData__DestinationAssignment_8_1_1 ) )
            {
            // InternalIoT.g:3237:1: ( ( rule__FetchData__DestinationAssignment_8_1_1 ) )
            // InternalIoT.g:3238:2: ( rule__FetchData__DestinationAssignment_8_1_1 )
            {
             before(grammarAccess.getFetchDataAccess().getDestinationAssignment_8_1_1()); 
            // InternalIoT.g:3239:2: ( rule__FetchData__DestinationAssignment_8_1_1 )
            // InternalIoT.g:3239:3: rule__FetchData__DestinationAssignment_8_1_1
            {
            pushFollow(FOLLOW_2);
            rule__FetchData__DestinationAssignment_8_1_1();

            state._fsp--;


            }

             after(grammarAccess.getFetchDataAccess().getDestinationAssignment_8_1_1()); 

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


    // $ANTLR start "rule__FetchDataExpression__Group__0"
    // InternalIoT.g:3248:1: rule__FetchDataExpression__Group__0 : rule__FetchDataExpression__Group__0__Impl rule__FetchDataExpression__Group__1 ;
    public final void rule__FetchDataExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3252:1: ( rule__FetchDataExpression__Group__0__Impl rule__FetchDataExpression__Group__1 )
            // InternalIoT.g:3253:2: rule__FetchDataExpression__Group__0__Impl rule__FetchDataExpression__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__FetchDataExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FetchDataExpression__Group__1();

            state._fsp--;


            }

        }
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
    // InternalIoT.g:3260:1: rule__FetchDataExpression__Group__0__Impl : ( 'every' ) ;
    public final void rule__FetchDataExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3264:1: ( ( 'every' ) )
            // InternalIoT.g:3265:1: ( 'every' )
            {
            // InternalIoT.g:3265:1: ( 'every' )
            // InternalIoT.g:3266:2: 'every'
            {
             before(grammarAccess.getFetchDataExpressionAccess().getEveryKeyword_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getFetchDataExpressionAccess().getEveryKeyword_0()); 

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
    // InternalIoT.g:3275:1: rule__FetchDataExpression__Group__1 : rule__FetchDataExpression__Group__1__Impl rule__FetchDataExpression__Group__2 ;
    public final void rule__FetchDataExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3279:1: ( rule__FetchDataExpression__Group__1__Impl rule__FetchDataExpression__Group__2 )
            // InternalIoT.g:3280:2: rule__FetchDataExpression__Group__1__Impl rule__FetchDataExpression__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__FetchDataExpression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FetchDataExpression__Group__2();

            state._fsp--;


            }

        }
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
    // InternalIoT.g:3287:1: rule__FetchDataExpression__Group__1__Impl : ( ( rule__FetchDataExpression__DurationAssignment_1 ) ) ;
    public final void rule__FetchDataExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3291:1: ( ( ( rule__FetchDataExpression__DurationAssignment_1 ) ) )
            // InternalIoT.g:3292:1: ( ( rule__FetchDataExpression__DurationAssignment_1 ) )
            {
            // InternalIoT.g:3292:1: ( ( rule__FetchDataExpression__DurationAssignment_1 ) )
            // InternalIoT.g:3293:2: ( rule__FetchDataExpression__DurationAssignment_1 )
            {
             before(grammarAccess.getFetchDataExpressionAccess().getDurationAssignment_1()); 
            // InternalIoT.g:3294:2: ( rule__FetchDataExpression__DurationAssignment_1 )
            // InternalIoT.g:3294:3: rule__FetchDataExpression__DurationAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__FetchDataExpression__DurationAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFetchDataExpressionAccess().getDurationAssignment_1()); 

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
    // InternalIoT.g:3302:1: rule__FetchDataExpression__Group__2 : rule__FetchDataExpression__Group__2__Impl ;
    public final void rule__FetchDataExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3306:1: ( rule__FetchDataExpression__Group__2__Impl )
            // InternalIoT.g:3307:2: rule__FetchDataExpression__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FetchDataExpression__Group__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalIoT.g:3313:1: rule__FetchDataExpression__Group__2__Impl : ( ( rule__FetchDataExpression__TimeUnitAssignment_2 ) ) ;
    public final void rule__FetchDataExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3317:1: ( ( ( rule__FetchDataExpression__TimeUnitAssignment_2 ) ) )
            // InternalIoT.g:3318:1: ( ( rule__FetchDataExpression__TimeUnitAssignment_2 ) )
            {
            // InternalIoT.g:3318:1: ( ( rule__FetchDataExpression__TimeUnitAssignment_2 ) )
            // InternalIoT.g:3319:2: ( rule__FetchDataExpression__TimeUnitAssignment_2 )
            {
             before(grammarAccess.getFetchDataExpressionAccess().getTimeUnitAssignment_2()); 
            // InternalIoT.g:3320:2: ( rule__FetchDataExpression__TimeUnitAssignment_2 )
            // InternalIoT.g:3320:3: rule__FetchDataExpression__TimeUnitAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__FetchDataExpression__TimeUnitAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFetchDataExpressionAccess().getTimeUnitAssignment_2()); 

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
    // InternalIoT.g:3329:1: rule__FetchDataCondition__Group__0 : rule__FetchDataCondition__Group__0__Impl rule__FetchDataCondition__Group__1 ;
    public final void rule__FetchDataCondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3333:1: ( rule__FetchDataCondition__Group__0__Impl rule__FetchDataCondition__Group__1 )
            // InternalIoT.g:3334:2: rule__FetchDataCondition__Group__0__Impl rule__FetchDataCondition__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__FetchDataCondition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FetchDataCondition__Group__1();

            state._fsp--;


            }

        }
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
    // InternalIoT.g:3341:1: rule__FetchDataCondition__Group__0__Impl : ( ( rule__FetchDataCondition__Alternatives_0 ) ) ;
    public final void rule__FetchDataCondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3345:1: ( ( ( rule__FetchDataCondition__Alternatives_0 ) ) )
            // InternalIoT.g:3346:1: ( ( rule__FetchDataCondition__Alternatives_0 ) )
            {
            // InternalIoT.g:3346:1: ( ( rule__FetchDataCondition__Alternatives_0 ) )
            // InternalIoT.g:3347:2: ( rule__FetchDataCondition__Alternatives_0 )
            {
             before(grammarAccess.getFetchDataConditionAccess().getAlternatives_0()); 
            // InternalIoT.g:3348:2: ( rule__FetchDataCondition__Alternatives_0 )
            // InternalIoT.g:3348:3: rule__FetchDataCondition__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__FetchDataCondition__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getFetchDataConditionAccess().getAlternatives_0()); 

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
    // InternalIoT.g:3356:1: rule__FetchDataCondition__Group__1 : rule__FetchDataCondition__Group__1__Impl ;
    public final void rule__FetchDataCondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3360:1: ( rule__FetchDataCondition__Group__1__Impl )
            // InternalIoT.g:3361:2: rule__FetchDataCondition__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FetchDataCondition__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalIoT.g:3367:1: rule__FetchDataCondition__Group__1__Impl : ( ( rule__FetchDataCondition__ConditionAssignment_1 ) ) ;
    public final void rule__FetchDataCondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3371:1: ( ( ( rule__FetchDataCondition__ConditionAssignment_1 ) ) )
            // InternalIoT.g:3372:1: ( ( rule__FetchDataCondition__ConditionAssignment_1 ) )
            {
            // InternalIoT.g:3372:1: ( ( rule__FetchDataCondition__ConditionAssignment_1 ) )
            // InternalIoT.g:3373:2: ( rule__FetchDataCondition__ConditionAssignment_1 )
            {
             before(grammarAccess.getFetchDataConditionAccess().getConditionAssignment_1()); 
            // InternalIoT.g:3374:2: ( rule__FetchDataCondition__ConditionAssignment_1 )
            // InternalIoT.g:3374:3: rule__FetchDataCondition__ConditionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__FetchDataCondition__ConditionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFetchDataConditionAccess().getConditionAssignment_1()); 

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


    // $ANTLR start "rule__Ip__Group__0"
    // InternalIoT.g:3383:1: rule__Ip__Group__0 : rule__Ip__Group__0__Impl rule__Ip__Group__1 ;
    public final void rule__Ip__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3387:1: ( rule__Ip__Group__0__Impl rule__Ip__Group__1 )
            // InternalIoT.g:3388:2: rule__Ip__Group__0__Impl rule__Ip__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__Ip__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ip__Group__1();

            state._fsp--;


            }

        }
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
    // InternalIoT.g:3395:1: rule__Ip__Group__0__Impl : ( () ) ;
    public final void rule__Ip__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3399:1: ( ( () ) )
            // InternalIoT.g:3400:1: ( () )
            {
            // InternalIoT.g:3400:1: ( () )
            // InternalIoT.g:3401:2: ()
            {
             before(grammarAccess.getIpAccess().getIpAction_0()); 
            // InternalIoT.g:3402:2: ()
            // InternalIoT.g:3402:3: 
            {
            }

             after(grammarAccess.getIpAccess().getIpAction_0()); 

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
    // InternalIoT.g:3410:1: rule__Ip__Group__1 : rule__Ip__Group__1__Impl rule__Ip__Group__2 ;
    public final void rule__Ip__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3414:1: ( rule__Ip__Group__1__Impl rule__Ip__Group__2 )
            // InternalIoT.g:3415:2: rule__Ip__Group__1__Impl rule__Ip__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__Ip__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ip__Group__2();

            state._fsp--;


            }

        }
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
    // InternalIoT.g:3422:1: rule__Ip__Group__1__Impl : ( ( rule__Ip__IpAssignment_1 ) ) ;
    public final void rule__Ip__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3426:1: ( ( ( rule__Ip__IpAssignment_1 ) ) )
            // InternalIoT.g:3427:1: ( ( rule__Ip__IpAssignment_1 ) )
            {
            // InternalIoT.g:3427:1: ( ( rule__Ip__IpAssignment_1 ) )
            // InternalIoT.g:3428:2: ( rule__Ip__IpAssignment_1 )
            {
             before(grammarAccess.getIpAccess().getIpAssignment_1()); 
            // InternalIoT.g:3429:2: ( rule__Ip__IpAssignment_1 )
            // InternalIoT.g:3429:3: rule__Ip__IpAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Ip__IpAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getIpAccess().getIpAssignment_1()); 

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
    // InternalIoT.g:3437:1: rule__Ip__Group__2 : rule__Ip__Group__2__Impl rule__Ip__Group__3 ;
    public final void rule__Ip__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3441:1: ( rule__Ip__Group__2__Impl rule__Ip__Group__3 )
            // InternalIoT.g:3442:2: rule__Ip__Group__2__Impl rule__Ip__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__Ip__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ip__Group__3();

            state._fsp--;


            }

        }
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
    // InternalIoT.g:3449:1: rule__Ip__Group__2__Impl : ( '.' ) ;
    public final void rule__Ip__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3453:1: ( ( '.' ) )
            // InternalIoT.g:3454:1: ( '.' )
            {
            // InternalIoT.g:3454:1: ( '.' )
            // InternalIoT.g:3455:2: '.'
            {
             before(grammarAccess.getIpAccess().getFullStopKeyword_2()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getIpAccess().getFullStopKeyword_2()); 

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
    // InternalIoT.g:3464:1: rule__Ip__Group__3 : rule__Ip__Group__3__Impl rule__Ip__Group__4 ;
    public final void rule__Ip__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3468:1: ( rule__Ip__Group__3__Impl rule__Ip__Group__4 )
            // InternalIoT.g:3469:2: rule__Ip__Group__3__Impl rule__Ip__Group__4
            {
            pushFollow(FOLLOW_28);
            rule__Ip__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ip__Group__4();

            state._fsp--;


            }

        }
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
    // InternalIoT.g:3476:1: rule__Ip__Group__3__Impl : ( ( rule__Ip__IpAssignment_3 ) ) ;
    public final void rule__Ip__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3480:1: ( ( ( rule__Ip__IpAssignment_3 ) ) )
            // InternalIoT.g:3481:1: ( ( rule__Ip__IpAssignment_3 ) )
            {
            // InternalIoT.g:3481:1: ( ( rule__Ip__IpAssignment_3 ) )
            // InternalIoT.g:3482:2: ( rule__Ip__IpAssignment_3 )
            {
             before(grammarAccess.getIpAccess().getIpAssignment_3()); 
            // InternalIoT.g:3483:2: ( rule__Ip__IpAssignment_3 )
            // InternalIoT.g:3483:3: rule__Ip__IpAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Ip__IpAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getIpAccess().getIpAssignment_3()); 

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
    // InternalIoT.g:3491:1: rule__Ip__Group__4 : rule__Ip__Group__4__Impl rule__Ip__Group__5 ;
    public final void rule__Ip__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3495:1: ( rule__Ip__Group__4__Impl rule__Ip__Group__5 )
            // InternalIoT.g:3496:2: rule__Ip__Group__4__Impl rule__Ip__Group__5
            {
            pushFollow(FOLLOW_17);
            rule__Ip__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ip__Group__5();

            state._fsp--;


            }

        }
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
    // InternalIoT.g:3503:1: rule__Ip__Group__4__Impl : ( '.' ) ;
    public final void rule__Ip__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3507:1: ( ( '.' ) )
            // InternalIoT.g:3508:1: ( '.' )
            {
            // InternalIoT.g:3508:1: ( '.' )
            // InternalIoT.g:3509:2: '.'
            {
             before(grammarAccess.getIpAccess().getFullStopKeyword_4()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getIpAccess().getFullStopKeyword_4()); 

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
    // InternalIoT.g:3518:1: rule__Ip__Group__5 : rule__Ip__Group__5__Impl rule__Ip__Group__6 ;
    public final void rule__Ip__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3522:1: ( rule__Ip__Group__5__Impl rule__Ip__Group__6 )
            // InternalIoT.g:3523:2: rule__Ip__Group__5__Impl rule__Ip__Group__6
            {
            pushFollow(FOLLOW_28);
            rule__Ip__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ip__Group__6();

            state._fsp--;


            }

        }
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
    // InternalIoT.g:3530:1: rule__Ip__Group__5__Impl : ( ( rule__Ip__IpAssignment_5 ) ) ;
    public final void rule__Ip__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3534:1: ( ( ( rule__Ip__IpAssignment_5 ) ) )
            // InternalIoT.g:3535:1: ( ( rule__Ip__IpAssignment_5 ) )
            {
            // InternalIoT.g:3535:1: ( ( rule__Ip__IpAssignment_5 ) )
            // InternalIoT.g:3536:2: ( rule__Ip__IpAssignment_5 )
            {
             before(grammarAccess.getIpAccess().getIpAssignment_5()); 
            // InternalIoT.g:3537:2: ( rule__Ip__IpAssignment_5 )
            // InternalIoT.g:3537:3: rule__Ip__IpAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Ip__IpAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getIpAccess().getIpAssignment_5()); 

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
    // InternalIoT.g:3545:1: rule__Ip__Group__6 : rule__Ip__Group__6__Impl rule__Ip__Group__7 ;
    public final void rule__Ip__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3549:1: ( rule__Ip__Group__6__Impl rule__Ip__Group__7 )
            // InternalIoT.g:3550:2: rule__Ip__Group__6__Impl rule__Ip__Group__7
            {
            pushFollow(FOLLOW_17);
            rule__Ip__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ip__Group__7();

            state._fsp--;


            }

        }
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
    // InternalIoT.g:3557:1: rule__Ip__Group__6__Impl : ( '.' ) ;
    public final void rule__Ip__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3561:1: ( ( '.' ) )
            // InternalIoT.g:3562:1: ( '.' )
            {
            // InternalIoT.g:3562:1: ( '.' )
            // InternalIoT.g:3563:2: '.'
            {
             before(grammarAccess.getIpAccess().getFullStopKeyword_6()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getIpAccess().getFullStopKeyword_6()); 

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
    // InternalIoT.g:3572:1: rule__Ip__Group__7 : rule__Ip__Group__7__Impl ;
    public final void rule__Ip__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3576:1: ( rule__Ip__Group__7__Impl )
            // InternalIoT.g:3577:2: rule__Ip__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Ip__Group__7__Impl();

            state._fsp--;


            }

        }
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
    // InternalIoT.g:3583:1: rule__Ip__Group__7__Impl : ( ( rule__Ip__IpAssignment_7 ) ) ;
    public final void rule__Ip__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3587:1: ( ( ( rule__Ip__IpAssignment_7 ) ) )
            // InternalIoT.g:3588:1: ( ( rule__Ip__IpAssignment_7 ) )
            {
            // InternalIoT.g:3588:1: ( ( rule__Ip__IpAssignment_7 ) )
            // InternalIoT.g:3589:2: ( rule__Ip__IpAssignment_7 )
            {
             before(grammarAccess.getIpAccess().getIpAssignment_7()); 
            // InternalIoT.g:3590:2: ( rule__Ip__IpAssignment_7 )
            // InternalIoT.g:3590:3: rule__Ip__IpAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Ip__IpAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getIpAccess().getIpAssignment_7()); 

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
    // InternalIoT.g:3599:1: rule__Portnumber__Group__0 : rule__Portnumber__Group__0__Impl rule__Portnumber__Group__1 ;
    public final void rule__Portnumber__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3603:1: ( rule__Portnumber__Group__0__Impl rule__Portnumber__Group__1 )
            // InternalIoT.g:3604:2: rule__Portnumber__Group__0__Impl rule__Portnumber__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__Portnumber__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Portnumber__Group__1();

            state._fsp--;


            }

        }
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
    // InternalIoT.g:3611:1: rule__Portnumber__Group__0__Impl : ( () ) ;
    public final void rule__Portnumber__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3615:1: ( ( () ) )
            // InternalIoT.g:3616:1: ( () )
            {
            // InternalIoT.g:3616:1: ( () )
            // InternalIoT.g:3617:2: ()
            {
             before(grammarAccess.getPortnumberAccess().getPortnumberAction_0()); 
            // InternalIoT.g:3618:2: ()
            // InternalIoT.g:3618:3: 
            {
            }

             after(grammarAccess.getPortnumberAccess().getPortnumberAction_0()); 

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
    // InternalIoT.g:3626:1: rule__Portnumber__Group__1 : rule__Portnumber__Group__1__Impl ;
    public final void rule__Portnumber__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3630:1: ( rule__Portnumber__Group__1__Impl )
            // InternalIoT.g:3631:2: rule__Portnumber__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Portnumber__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalIoT.g:3637:1: rule__Portnumber__Group__1__Impl : ( ( rule__Portnumber__NumberAssignment_1 ) ) ;
    public final void rule__Portnumber__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3641:1: ( ( ( rule__Portnumber__NumberAssignment_1 ) ) )
            // InternalIoT.g:3642:1: ( ( rule__Portnumber__NumberAssignment_1 ) )
            {
            // InternalIoT.g:3642:1: ( ( rule__Portnumber__NumberAssignment_1 ) )
            // InternalIoT.g:3643:2: ( rule__Portnumber__NumberAssignment_1 )
            {
             before(grammarAccess.getPortnumberAccess().getNumberAssignment_1()); 
            // InternalIoT.g:3644:2: ( rule__Portnumber__NumberAssignment_1 )
            // InternalIoT.g:3644:3: rule__Portnumber__NumberAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Portnumber__NumberAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPortnumberAccess().getNumberAssignment_1()); 

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
    // InternalIoT.g:3653:1: rule__System__SystemAssignment : ( ( rule__System__SystemAlternatives_0 ) ) ;
    public final void rule__System__SystemAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3657:1: ( ( ( rule__System__SystemAlternatives_0 ) ) )
            // InternalIoT.g:3658:2: ( ( rule__System__SystemAlternatives_0 ) )
            {
            // InternalIoT.g:3658:2: ( ( rule__System__SystemAlternatives_0 ) )
            // InternalIoT.g:3659:3: ( rule__System__SystemAlternatives_0 )
            {
             before(grammarAccess.getSystemAccess().getSystemAlternatives_0()); 
            // InternalIoT.g:3660:3: ( rule__System__SystemAlternatives_0 )
            // InternalIoT.g:3660:4: rule__System__SystemAlternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__System__SystemAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getSystemAccess().getSystemAlternatives_0()); 

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
    // InternalIoT.g:3668:1: rule__SensorType__NameAssignment : ( RULE_ID ) ;
    public final void rule__SensorType__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3672:1: ( ( RULE_ID ) )
            // InternalIoT.g:3673:2: ( RULE_ID )
            {
            // InternalIoT.g:3673:2: ( RULE_ID )
            // InternalIoT.g:3674:3: RULE_ID
            {
             before(grammarAccess.getSensorTypeAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSensorTypeAccess().getNameIDTerminalRuleCall_0()); 

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
    // InternalIoT.g:3683:1: rule__SensorTypes__TypesAssignment_1 : ( ruleSensorType ) ;
    public final void rule__SensorTypes__TypesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3687:1: ( ( ruleSensorType ) )
            // InternalIoT.g:3688:2: ( ruleSensorType )
            {
            // InternalIoT.g:3688:2: ( ruleSensorType )
            // InternalIoT.g:3689:3: ruleSensorType
            {
             before(grammarAccess.getSensorTypesAccess().getTypesSensorTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSensorType();

            state._fsp--;

             after(grammarAccess.getSensorTypesAccess().getTypesSensorTypeParserRuleCall_1_0()); 

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
    // InternalIoT.g:3698:1: rule__SensorTypes__TypesAssignment_2_1 : ( ruleSensorType ) ;
    public final void rule__SensorTypes__TypesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3702:1: ( ( ruleSensorType ) )
            // InternalIoT.g:3703:2: ( ruleSensorType )
            {
            // InternalIoT.g:3703:2: ( ruleSensorType )
            // InternalIoT.g:3704:3: ruleSensorType
            {
             before(grammarAccess.getSensorTypesAccess().getTypesSensorTypeParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSensorType();

            state._fsp--;

             after(grammarAccess.getSensorTypesAccess().getTypesSensorTypeParserRuleCall_2_1_0()); 

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
    // InternalIoT.g:3713:1: rule__Sensor__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Sensor__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3717:1: ( ( RULE_ID ) )
            // InternalIoT.g:3718:2: ( RULE_ID )
            {
            // InternalIoT.g:3718:2: ( RULE_ID )
            // InternalIoT.g:3719:3: RULE_ID
            {
             before(grammarAccess.getSensorAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSensorAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // InternalIoT.g:3728:1: rule__Sensor__TypeAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Sensor__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3732:1: ( ( ( RULE_ID ) ) )
            // InternalIoT.g:3733:2: ( ( RULE_ID ) )
            {
            // InternalIoT.g:3733:2: ( ( RULE_ID ) )
            // InternalIoT.g:3734:3: ( RULE_ID )
            {
             before(grammarAccess.getSensorAccess().getTypeSensorTypeCrossReference_4_0()); 
            // InternalIoT.g:3735:3: ( RULE_ID )
            // InternalIoT.g:3736:4: RULE_ID
            {
             before(grammarAccess.getSensorAccess().getTypeSensorTypeIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSensorAccess().getTypeSensorTypeIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getSensorAccess().getTypeSensorTypeCrossReference_4_0()); 

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
    // InternalIoT.g:3747:1: rule__SensorGroup__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SensorGroup__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3751:1: ( ( RULE_ID ) )
            // InternalIoT.g:3752:2: ( RULE_ID )
            {
            // InternalIoT.g:3752:2: ( RULE_ID )
            // InternalIoT.g:3753:3: RULE_ID
            {
             before(grammarAccess.getSensorGroupAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSensorGroupAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // InternalIoT.g:3762:1: rule__SensorGroup__SensorsAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__SensorGroup__SensorsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3766:1: ( ( ( RULE_ID ) ) )
            // InternalIoT.g:3767:2: ( ( RULE_ID ) )
            {
            // InternalIoT.g:3767:2: ( ( RULE_ID ) )
            // InternalIoT.g:3768:3: ( RULE_ID )
            {
             before(grammarAccess.getSensorGroupAccess().getSensorsSensorCrossReference_3_0()); 
            // InternalIoT.g:3769:3: ( RULE_ID )
            // InternalIoT.g:3770:4: RULE_ID
            {
             before(grammarAccess.getSensorGroupAccess().getSensorsSensorIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSensorGroupAccess().getSensorsSensorIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getSensorGroupAccess().getSensorsSensorCrossReference_3_0()); 

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
    // InternalIoT.g:3781:1: rule__SensorGroup__SensorsAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__SensorGroup__SensorsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3785:1: ( ( ( RULE_ID ) ) )
            // InternalIoT.g:3786:2: ( ( RULE_ID ) )
            {
            // InternalIoT.g:3786:2: ( ( RULE_ID ) )
            // InternalIoT.g:3787:3: ( RULE_ID )
            {
             before(grammarAccess.getSensorGroupAccess().getSensorsSensorCrossReference_4_1_0()); 
            // InternalIoT.g:3788:3: ( RULE_ID )
            // InternalIoT.g:3789:4: RULE_ID
            {
             before(grammarAccess.getSensorGroupAccess().getSensorsSensorIDTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSensorGroupAccess().getSensorsSensorIDTerminalRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getSensorGroupAccess().getSensorsSensorCrossReference_4_1_0()); 

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
    // InternalIoT.g:3800:1: rule__SensorGetMethod__MethodAssignment_1 : ( ruleMethod ) ;
    public final void rule__SensorGetMethod__MethodAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3804:1: ( ( ruleMethod ) )
            // InternalIoT.g:3805:2: ( ruleMethod )
            {
            // InternalIoT.g:3805:2: ( ruleMethod )
            // InternalIoT.g:3806:3: ruleMethod
            {
             before(grammarAccess.getSensorGetMethodAccess().getMethodMethodParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMethod();

            state._fsp--;

             after(grammarAccess.getSensorGetMethodAccess().getMethodMethodParserRuleCall_1_0()); 

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
    // InternalIoT.g:3815:1: rule__SensorGetMethod__TypeAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__SensorGetMethod__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3819:1: ( ( ( RULE_ID ) ) )
            // InternalIoT.g:3820:2: ( ( RULE_ID ) )
            {
            // InternalIoT.g:3820:2: ( ( RULE_ID ) )
            // InternalIoT.g:3821:3: ( RULE_ID )
            {
             before(grammarAccess.getSensorGetMethodAccess().getTypeSensorTypeCrossReference_4_0()); 
            // InternalIoT.g:3822:3: ( RULE_ID )
            // InternalIoT.g:3823:4: RULE_ID
            {
             before(grammarAccess.getSensorGetMethodAccess().getTypeSensorTypeIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSensorGetMethodAccess().getTypeSensorTypeIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getSensorGetMethodAccess().getTypeSensorTypeCrossReference_4_0()); 

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
    // InternalIoT.g:3834:1: rule__Method__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Method__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3838:1: ( ( RULE_ID ) )
            // InternalIoT.g:3839:2: ( RULE_ID )
            {
            // InternalIoT.g:3839:2: ( RULE_ID )
            // InternalIoT.g:3840:3: RULE_ID
            {
             before(grammarAccess.getMethodAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMethodAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // InternalIoT.g:3849:1: rule__Method__ParametersAssignment_2_0 : ( RULE_ID ) ;
    public final void rule__Method__ParametersAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3853:1: ( ( RULE_ID ) )
            // InternalIoT.g:3854:2: ( RULE_ID )
            {
            // InternalIoT.g:3854:2: ( RULE_ID )
            // InternalIoT.g:3855:3: RULE_ID
            {
             before(grammarAccess.getMethodAccess().getParametersIDTerminalRuleCall_2_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMethodAccess().getParametersIDTerminalRuleCall_2_0_0()); 

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
    // InternalIoT.g:3864:1: rule__Method__ParametersAssignment_2_1_1 : ( RULE_ID ) ;
    public final void rule__Method__ParametersAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3868:1: ( ( RULE_ID ) )
            // InternalIoT.g:3869:2: ( RULE_ID )
            {
            // InternalIoT.g:3869:2: ( RULE_ID )
            // InternalIoT.g:3870:3: RULE_ID
            {
             before(grammarAccess.getMethodAccess().getParametersIDTerminalRuleCall_2_1_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMethodAccess().getParametersIDTerminalRuleCall_2_1_1_0()); 

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
    // InternalIoT.g:3879:1: rule__DeviceType__NameAssignment : ( RULE_ID ) ;
    public final void rule__DeviceType__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3883:1: ( ( RULE_ID ) )
            // InternalIoT.g:3884:2: ( RULE_ID )
            {
            // InternalIoT.g:3884:2: ( RULE_ID )
            // InternalIoT.g:3885:3: RULE_ID
            {
             before(grammarAccess.getDeviceTypeAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDeviceTypeAccess().getNameIDTerminalRuleCall_0()); 

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
    // InternalIoT.g:3894:1: rule__DeviceTypes__TypesAssignment_1 : ( ruleDeviceType ) ;
    public final void rule__DeviceTypes__TypesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3898:1: ( ( ruleDeviceType ) )
            // InternalIoT.g:3899:2: ( ruleDeviceType )
            {
            // InternalIoT.g:3899:2: ( ruleDeviceType )
            // InternalIoT.g:3900:3: ruleDeviceType
            {
             before(grammarAccess.getDeviceTypesAccess().getTypesDeviceTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDeviceType();

            state._fsp--;

             after(grammarAccess.getDeviceTypesAccess().getTypesDeviceTypeParserRuleCall_1_0()); 

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
    // InternalIoT.g:3909:1: rule__DeviceTypes__TypesAssignment_2_1 : ( ruleDeviceType ) ;
    public final void rule__DeviceTypes__TypesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3913:1: ( ( ruleDeviceType ) )
            // InternalIoT.g:3914:2: ( ruleDeviceType )
            {
            // InternalIoT.g:3914:2: ( ruleDeviceType )
            // InternalIoT.g:3915:3: ruleDeviceType
            {
             before(grammarAccess.getDeviceTypesAccess().getTypesDeviceTypeParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDeviceType();

            state._fsp--;

             after(grammarAccess.getDeviceTypesAccess().getTypesDeviceTypeParserRuleCall_2_1_0()); 

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
    // InternalIoT.g:3924:1: rule__Device__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Device__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3928:1: ( ( RULE_ID ) )
            // InternalIoT.g:3929:2: ( RULE_ID )
            {
            // InternalIoT.g:3929:2: ( RULE_ID )
            // InternalIoT.g:3930:3: RULE_ID
            {
             before(grammarAccess.getDeviceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDeviceAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // InternalIoT.g:3939:1: rule__Device__TypeAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Device__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3943:1: ( ( ( RULE_ID ) ) )
            // InternalIoT.g:3944:2: ( ( RULE_ID ) )
            {
            // InternalIoT.g:3944:2: ( ( RULE_ID ) )
            // InternalIoT.g:3945:3: ( RULE_ID )
            {
             before(grammarAccess.getDeviceAccess().getTypeDeviceTypeCrossReference_4_0()); 
            // InternalIoT.g:3946:3: ( RULE_ID )
            // InternalIoT.g:3947:4: RULE_ID
            {
             before(grammarAccess.getDeviceAccess().getTypeDeviceTypeIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDeviceAccess().getTypeDeviceTypeIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getDeviceAccess().getTypeDeviceTypeCrossReference_4_0()); 

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
    // InternalIoT.g:3958:1: rule__Device__DevicesAssignment_6_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__Device__DevicesAssignment_6_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3962:1: ( ( ( RULE_ID ) ) )
            // InternalIoT.g:3963:2: ( ( RULE_ID ) )
            {
            // InternalIoT.g:3963:2: ( ( RULE_ID ) )
            // InternalIoT.g:3964:3: ( RULE_ID )
            {
             before(grammarAccess.getDeviceAccess().getDevicesDeviceCrossReference_6_0_1_0()); 
            // InternalIoT.g:3965:3: ( RULE_ID )
            // InternalIoT.g:3966:4: RULE_ID
            {
             before(grammarAccess.getDeviceAccess().getDevicesDeviceIDTerminalRuleCall_6_0_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDeviceAccess().getDevicesDeviceIDTerminalRuleCall_6_0_1_0_1()); 

            }

             after(grammarAccess.getDeviceAccess().getDevicesDeviceCrossReference_6_0_1_0()); 

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
    // InternalIoT.g:3977:1: rule__Device__DevicesAssignment_6_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__Device__DevicesAssignment_6_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:3981:1: ( ( ( RULE_ID ) ) )
            // InternalIoT.g:3982:2: ( ( RULE_ID ) )
            {
            // InternalIoT.g:3982:2: ( ( RULE_ID ) )
            // InternalIoT.g:3983:3: ( RULE_ID )
            {
             before(grammarAccess.getDeviceAccess().getDevicesSensorGroupCrossReference_6_1_1_0()); 
            // InternalIoT.g:3984:3: ( RULE_ID )
            // InternalIoT.g:3985:4: RULE_ID
            {
             before(grammarAccess.getDeviceAccess().getDevicesSensorGroupIDTerminalRuleCall_6_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDeviceAccess().getDevicesSensorGroupIDTerminalRuleCall_6_1_1_0_1()); 

            }

             after(grammarAccess.getDeviceAccess().getDevicesSensorGroupCrossReference_6_1_1_0()); 

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
    // InternalIoT.g:3996:1: rule__ServerType__NameAssignment : ( RULE_ID ) ;
    public final void rule__ServerType__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:4000:1: ( ( RULE_ID ) )
            // InternalIoT.g:4001:2: ( RULE_ID )
            {
            // InternalIoT.g:4001:2: ( RULE_ID )
            // InternalIoT.g:4002:3: RULE_ID
            {
             before(grammarAccess.getServerTypeAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getServerTypeAccess().getNameIDTerminalRuleCall_0()); 

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
    // InternalIoT.g:4011:1: rule__ServerTypes__TypesAssignment_1 : ( ruleServerType ) ;
    public final void rule__ServerTypes__TypesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:4015:1: ( ( ruleServerType ) )
            // InternalIoT.g:4016:2: ( ruleServerType )
            {
            // InternalIoT.g:4016:2: ( ruleServerType )
            // InternalIoT.g:4017:3: ruleServerType
            {
             before(grammarAccess.getServerTypesAccess().getTypesServerTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleServerType();

            state._fsp--;

             after(grammarAccess.getServerTypesAccess().getTypesServerTypeParserRuleCall_1_0()); 

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
    // InternalIoT.g:4026:1: rule__ServerTypes__TypesAssignment_2_1 : ( ruleServerType ) ;
    public final void rule__ServerTypes__TypesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:4030:1: ( ( ruleServerType ) )
            // InternalIoT.g:4031:2: ( ruleServerType )
            {
            // InternalIoT.g:4031:2: ( ruleServerType )
            // InternalIoT.g:4032:3: ruleServerType
            {
             before(grammarAccess.getServerTypesAccess().getTypesServerTypeParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleServerType();

            state._fsp--;

             after(grammarAccess.getServerTypesAccess().getTypesServerTypeParserRuleCall_2_1_0()); 

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
    // InternalIoT.g:4041:1: rule__Server__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Server__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:4045:1: ( ( RULE_ID ) )
            // InternalIoT.g:4046:2: ( RULE_ID )
            {
            // InternalIoT.g:4046:2: ( RULE_ID )
            // InternalIoT.g:4047:3: RULE_ID
            {
             before(grammarAccess.getServerAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getServerAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // InternalIoT.g:4056:1: rule__Server__TypeAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Server__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:4060:1: ( ( ( RULE_ID ) ) )
            // InternalIoT.g:4061:2: ( ( RULE_ID ) )
            {
            // InternalIoT.g:4061:2: ( ( RULE_ID ) )
            // InternalIoT.g:4062:3: ( RULE_ID )
            {
             before(grammarAccess.getServerAccess().getTypeServerTypeCrossReference_4_0()); 
            // InternalIoT.g:4063:3: ( RULE_ID )
            // InternalIoT.g:4064:4: RULE_ID
            {
             before(grammarAccess.getServerAccess().getTypeServerTypeIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getServerAccess().getTypeServerTypeIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getServerAccess().getTypeServerTypeCrossReference_4_0()); 

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
    // InternalIoT.g:4075:1: rule__Server__IpAssignment_7 : ( ruleIp ) ;
    public final void rule__Server__IpAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:4079:1: ( ( ruleIp ) )
            // InternalIoT.g:4080:2: ( ruleIp )
            {
            // InternalIoT.g:4080:2: ( ruleIp )
            // InternalIoT.g:4081:3: ruleIp
            {
             before(grammarAccess.getServerAccess().getIpIpParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleIp();

            state._fsp--;

             after(grammarAccess.getServerAccess().getIpIpParserRuleCall_7_0()); 

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
    // InternalIoT.g:4090:1: rule__Server__PortAssignment_9 : ( rulePortnumber ) ;
    public final void rule__Server__PortAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:4094:1: ( ( rulePortnumber ) )
            // InternalIoT.g:4095:2: ( rulePortnumber )
            {
            // InternalIoT.g:4095:2: ( rulePortnumber )
            // InternalIoT.g:4096:3: rulePortnumber
            {
             before(grammarAccess.getServerAccess().getPortPortnumberParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            rulePortnumber();

            state._fsp--;

             after(grammarAccess.getServerAccess().getPortPortnumberParserRuleCall_9_0()); 

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
    // InternalIoT.g:4105:1: rule__DestinationType__NameAssignment : ( RULE_ID ) ;
    public final void rule__DestinationType__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:4109:1: ( ( RULE_ID ) )
            // InternalIoT.g:4110:2: ( RULE_ID )
            {
            // InternalIoT.g:4110:2: ( RULE_ID )
            // InternalIoT.g:4111:3: RULE_ID
            {
             before(grammarAccess.getDestinationTypeAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDestinationTypeAccess().getNameIDTerminalRuleCall_0()); 

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
    // InternalIoT.g:4120:1: rule__DestinationTypes__TypesAssignment_1 : ( ruleDestinationType ) ;
    public final void rule__DestinationTypes__TypesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:4124:1: ( ( ruleDestinationType ) )
            // InternalIoT.g:4125:2: ( ruleDestinationType )
            {
            // InternalIoT.g:4125:2: ( ruleDestinationType )
            // InternalIoT.g:4126:3: ruleDestinationType
            {
             before(grammarAccess.getDestinationTypesAccess().getTypesDestinationTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDestinationType();

            state._fsp--;

             after(grammarAccess.getDestinationTypesAccess().getTypesDestinationTypeParserRuleCall_1_0()); 

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
    // InternalIoT.g:4135:1: rule__DestinationTypes__TypesAssignment_2_1 : ( ruleDestinationType ) ;
    public final void rule__DestinationTypes__TypesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:4139:1: ( ( ruleDestinationType ) )
            // InternalIoT.g:4140:2: ( ruleDestinationType )
            {
            // InternalIoT.g:4140:2: ( ruleDestinationType )
            // InternalIoT.g:4141:3: ruleDestinationType
            {
             before(grammarAccess.getDestinationTypesAccess().getTypesDestinationTypeParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDestinationType();

            state._fsp--;

             after(grammarAccess.getDestinationTypesAccess().getTypesDestinationTypeParserRuleCall_2_1_0()); 

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
    // InternalIoT.g:4150:1: rule__Destination__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Destination__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:4154:1: ( ( RULE_ID ) )
            // InternalIoT.g:4155:2: ( RULE_ID )
            {
            // InternalIoT.g:4155:2: ( RULE_ID )
            // InternalIoT.g:4156:3: RULE_ID
            {
             before(grammarAccess.getDestinationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDestinationAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // InternalIoT.g:4165:1: rule__Destination__TypeAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Destination__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:4169:1: ( ( ( RULE_ID ) ) )
            // InternalIoT.g:4170:2: ( ( RULE_ID ) )
            {
            // InternalIoT.g:4170:2: ( ( RULE_ID ) )
            // InternalIoT.g:4171:3: ( RULE_ID )
            {
             before(grammarAccess.getDestinationAccess().getTypeDestinationTypeCrossReference_3_0()); 
            // InternalIoT.g:4172:3: ( RULE_ID )
            // InternalIoT.g:4173:4: RULE_ID
            {
             before(grammarAccess.getDestinationAccess().getTypeDestinationTypeIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDestinationAccess().getTypeDestinationTypeIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getDestinationAccess().getTypeDestinationTypeCrossReference_3_0()); 

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
    // InternalIoT.g:4184:1: rule__FetchData__FilterAssignment_3_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__FetchData__FilterAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:4188:1: ( ( ( RULE_ID ) ) )
            // InternalIoT.g:4189:2: ( ( RULE_ID ) )
            {
            // InternalIoT.g:4189:2: ( ( RULE_ID ) )
            // InternalIoT.g:4190:3: ( RULE_ID )
            {
             before(grammarAccess.getFetchDataAccess().getFilterSensorTypeCrossReference_3_0_1_0()); 
            // InternalIoT.g:4191:3: ( RULE_ID )
            // InternalIoT.g:4192:4: RULE_ID
            {
             before(grammarAccess.getFetchDataAccess().getFilterSensorTypeIDTerminalRuleCall_3_0_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFetchDataAccess().getFilterSensorTypeIDTerminalRuleCall_3_0_1_0_1()); 

            }

             after(grammarAccess.getFetchDataAccess().getFilterSensorTypeCrossReference_3_0_1_0()); 

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
    // InternalIoT.g:4203:1: rule__FetchData__FilterAssignment_3_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__FetchData__FilterAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:4207:1: ( ( ( RULE_ID ) ) )
            // InternalIoT.g:4208:2: ( ( RULE_ID ) )
            {
            // InternalIoT.g:4208:2: ( ( RULE_ID ) )
            // InternalIoT.g:4209:3: ( RULE_ID )
            {
             before(grammarAccess.getFetchDataAccess().getFilterSensorGroupCrossReference_3_1_1_0()); 
            // InternalIoT.g:4210:3: ( RULE_ID )
            // InternalIoT.g:4211:4: RULE_ID
            {
             before(grammarAccess.getFetchDataAccess().getFilterSensorGroupIDTerminalRuleCall_3_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFetchDataAccess().getFilterSensorGroupIDTerminalRuleCall_3_1_1_0_1()); 

            }

             after(grammarAccess.getFetchDataAccess().getFilterSensorGroupCrossReference_3_1_1_0()); 

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
    // InternalIoT.g:4222:1: rule__FetchData__DeviceAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__FetchData__DeviceAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:4226:1: ( ( ( RULE_ID ) ) )
            // InternalIoT.g:4227:2: ( ( RULE_ID ) )
            {
            // InternalIoT.g:4227:2: ( ( RULE_ID ) )
            // InternalIoT.g:4228:3: ( RULE_ID )
            {
             before(grammarAccess.getFetchDataAccess().getDeviceDeviceCrossReference_6_0()); 
            // InternalIoT.g:4229:3: ( RULE_ID )
            // InternalIoT.g:4230:4: RULE_ID
            {
             before(grammarAccess.getFetchDataAccess().getDeviceDeviceIDTerminalRuleCall_6_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFetchDataAccess().getDeviceDeviceIDTerminalRuleCall_6_0_1()); 

            }

             after(grammarAccess.getFetchDataAccess().getDeviceDeviceCrossReference_6_0()); 

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
    // InternalIoT.g:4241:1: rule__FetchData__DestinationAssignment_8_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__FetchData__DestinationAssignment_8_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:4245:1: ( ( ( RULE_ID ) ) )
            // InternalIoT.g:4246:2: ( ( RULE_ID ) )
            {
            // InternalIoT.g:4246:2: ( ( RULE_ID ) )
            // InternalIoT.g:4247:3: ( RULE_ID )
            {
             before(grammarAccess.getFetchDataAccess().getDestinationDestinationCrossReference_8_0_1_0()); 
            // InternalIoT.g:4248:3: ( RULE_ID )
            // InternalIoT.g:4249:4: RULE_ID
            {
             before(grammarAccess.getFetchDataAccess().getDestinationDestinationIDTerminalRuleCall_8_0_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFetchDataAccess().getDestinationDestinationIDTerminalRuleCall_8_0_1_0_1()); 

            }

             after(grammarAccess.getFetchDataAccess().getDestinationDestinationCrossReference_8_0_1_0()); 

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
    // InternalIoT.g:4260:1: rule__FetchData__DestinationAssignment_8_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__FetchData__DestinationAssignment_8_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:4264:1: ( ( ( RULE_ID ) ) )
            // InternalIoT.g:4265:2: ( ( RULE_ID ) )
            {
            // InternalIoT.g:4265:2: ( ( RULE_ID ) )
            // InternalIoT.g:4266:3: ( RULE_ID )
            {
             before(grammarAccess.getFetchDataAccess().getDestinationServerCrossReference_8_1_1_0()); 
            // InternalIoT.g:4267:3: ( RULE_ID )
            // InternalIoT.g:4268:4: RULE_ID
            {
             before(grammarAccess.getFetchDataAccess().getDestinationServerIDTerminalRuleCall_8_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFetchDataAccess().getDestinationServerIDTerminalRuleCall_8_1_1_0_1()); 

            }

             after(grammarAccess.getFetchDataAccess().getDestinationServerCrossReference_8_1_1_0()); 

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


    // $ANTLR start "rule__FetchData__ConExpAssignment_9_0"
    // InternalIoT.g:4279:1: rule__FetchData__ConExpAssignment_9_0 : ( ruleFetchDataExpression ) ;
    public final void rule__FetchData__ConExpAssignment_9_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:4283:1: ( ( ruleFetchDataExpression ) )
            // InternalIoT.g:4284:2: ( ruleFetchDataExpression )
            {
            // InternalIoT.g:4284:2: ( ruleFetchDataExpression )
            // InternalIoT.g:4285:3: ruleFetchDataExpression
            {
             before(grammarAccess.getFetchDataAccess().getConExpFetchDataExpressionParserRuleCall_9_0_0()); 
            pushFollow(FOLLOW_2);
            ruleFetchDataExpression();

            state._fsp--;

             after(grammarAccess.getFetchDataAccess().getConExpFetchDataExpressionParserRuleCall_9_0_0()); 

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
    // $ANTLR end "rule__FetchData__ConExpAssignment_9_0"


    // $ANTLR start "rule__FetchData__ConExpAssignment_9_1"
    // InternalIoT.g:4294:1: rule__FetchData__ConExpAssignment_9_1 : ( ruleFetchDataCondition ) ;
    public final void rule__FetchData__ConExpAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:4298:1: ( ( ruleFetchDataCondition ) )
            // InternalIoT.g:4299:2: ( ruleFetchDataCondition )
            {
            // InternalIoT.g:4299:2: ( ruleFetchDataCondition )
            // InternalIoT.g:4300:3: ruleFetchDataCondition
            {
             before(grammarAccess.getFetchDataAccess().getConExpFetchDataConditionParserRuleCall_9_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFetchDataCondition();

            state._fsp--;

             after(grammarAccess.getFetchDataAccess().getConExpFetchDataConditionParserRuleCall_9_1_0()); 

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
    // $ANTLR end "rule__FetchData__ConExpAssignment_9_1"


    // $ANTLR start "rule__FetchDataExpression__DurationAssignment_1"
    // InternalIoT.g:4309:1: rule__FetchDataExpression__DurationAssignment_1 : ( ruleTime ) ;
    public final void rule__FetchDataExpression__DurationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:4313:1: ( ( ruleTime ) )
            // InternalIoT.g:4314:2: ( ruleTime )
            {
            // InternalIoT.g:4314:2: ( ruleTime )
            // InternalIoT.g:4315:3: ruleTime
            {
             before(grammarAccess.getFetchDataExpressionAccess().getDurationTimeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTime();

            state._fsp--;

             after(grammarAccess.getFetchDataExpressionAccess().getDurationTimeParserRuleCall_1_0()); 

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
    // InternalIoT.g:4324:1: rule__FetchDataExpression__TimeUnitAssignment_2 : ( ruleTimeUnit ) ;
    public final void rule__FetchDataExpression__TimeUnitAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:4328:1: ( ( ruleTimeUnit ) )
            // InternalIoT.g:4329:2: ( ruleTimeUnit )
            {
            // InternalIoT.g:4329:2: ( ruleTimeUnit )
            // InternalIoT.g:4330:3: ruleTimeUnit
            {
             before(grammarAccess.getFetchDataExpressionAccess().getTimeUnitTimeUnitParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTimeUnit();

            state._fsp--;

             after(grammarAccess.getFetchDataExpressionAccess().getTimeUnitTimeUnitParserRuleCall_2_0()); 

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


    // $ANTLR start "rule__FetchDataCondition__ConditionAssignment_1"
    // InternalIoT.g:4339:1: rule__FetchDataCondition__ConditionAssignment_1 : ( ruleCondition ) ;
    public final void rule__FetchDataCondition__ConditionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:4343:1: ( ( ruleCondition ) )
            // InternalIoT.g:4344:2: ( ruleCondition )
            {
            // InternalIoT.g:4344:2: ( ruleCondition )
            // InternalIoT.g:4345:3: ruleCondition
            {
             before(grammarAccess.getFetchDataConditionAccess().getConditionConditionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getFetchDataConditionAccess().getConditionConditionParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__FetchDataCondition__ConditionAssignment_1"


    // $ANTLR start "rule__Ip__IpAssignment_1"
    // InternalIoT.g:4354:1: rule__Ip__IpAssignment_1 : ( RULE_INT ) ;
    public final void rule__Ip__IpAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:4358:1: ( ( RULE_INT ) )
            // InternalIoT.g:4359:2: ( RULE_INT )
            {
            // InternalIoT.g:4359:2: ( RULE_INT )
            // InternalIoT.g:4360:3: RULE_INT
            {
             before(grammarAccess.getIpAccess().getIpINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getIpAccess().getIpINTTerminalRuleCall_1_0()); 

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
    // InternalIoT.g:4369:1: rule__Ip__IpAssignment_3 : ( RULE_INT ) ;
    public final void rule__Ip__IpAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:4373:1: ( ( RULE_INT ) )
            // InternalIoT.g:4374:2: ( RULE_INT )
            {
            // InternalIoT.g:4374:2: ( RULE_INT )
            // InternalIoT.g:4375:3: RULE_INT
            {
             before(grammarAccess.getIpAccess().getIpINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getIpAccess().getIpINTTerminalRuleCall_3_0()); 

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
    // InternalIoT.g:4384:1: rule__Ip__IpAssignment_5 : ( RULE_INT ) ;
    public final void rule__Ip__IpAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:4388:1: ( ( RULE_INT ) )
            // InternalIoT.g:4389:2: ( RULE_INT )
            {
            // InternalIoT.g:4389:2: ( RULE_INT )
            // InternalIoT.g:4390:3: RULE_INT
            {
             before(grammarAccess.getIpAccess().getIpINTTerminalRuleCall_5_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getIpAccess().getIpINTTerminalRuleCall_5_0()); 

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
    // InternalIoT.g:4399:1: rule__Ip__IpAssignment_7 : ( RULE_INT ) ;
    public final void rule__Ip__IpAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:4403:1: ( ( RULE_INT ) )
            // InternalIoT.g:4404:2: ( RULE_INT )
            {
            // InternalIoT.g:4404:2: ( RULE_INT )
            // InternalIoT.g:4405:3: RULE_INT
            {
             before(grammarAccess.getIpAccess().getIpINTTerminalRuleCall_7_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getIpAccess().getIpINTTerminalRuleCall_7_0()); 

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
    // InternalIoT.g:4414:1: rule__Portnumber__NumberAssignment_1 : ( RULE_INT ) ;
    public final void rule__Portnumber__NumberAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:4418:1: ( ( RULE_INT ) )
            // InternalIoT.g:4419:2: ( RULE_INT )
            {
            // InternalIoT.g:4419:2: ( RULE_INT )
            // InternalIoT.g:4420:3: RULE_INT
            {
             before(grammarAccess.getPortnumberAccess().getNumberINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getPortnumberAccess().getNumberINTTerminalRuleCall_1_0()); 

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
    // InternalIoT.g:4429:1: rule__Time__TimeAssignment : ( RULE_INT ) ;
    public final void rule__Time__TimeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalIoT.g:4433:1: ( ( RULE_INT ) )
            // InternalIoT.g:4434:2: ( RULE_INT )
            {
            // InternalIoT.g:4434:2: ( RULE_INT )
            // InternalIoT.g:4435:3: RULE_INT
            {
             before(grammarAccess.getTimeAccess().getTimeINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTimeAccess().getTimeINTTerminalRuleCall_0()); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000038C62940002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000200400000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000600000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000800000003000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x000000000003C000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0001000000000000L});

}