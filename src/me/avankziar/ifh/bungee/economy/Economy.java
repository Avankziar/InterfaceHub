package me.avankziar.ifh.bungee.economy;

import java.math.RoundingMode;

import javax.annotation.Nonnull;

import me.avankziar.ifh.bungee.economy.currency.EconomyCurrency;
import me.avankziar.ifh.bungee.economy.subinterfaces.AccountHandling;
import me.avankziar.ifh.bungee.economy.subinterfaces.CurrencyHandling;
import me.avankziar.ifh.bungee.economy.subinterfaces.TransactionHandling;

public interface Economy
extends AccountHandling, CurrencyHandling, TransactionHandling
{
	
	/**
	 * @return true if the normal economy is enabled.
	 */
	boolean isEnabled();
	
	/**
	 * @return true if multiple currency exists and are supported.
	 */
	boolean isMultiCurrency();
	
	/**
	 * @return true if wallet accounts are supported.
	 */
	boolean hasWalletSupport();
	
	/**
	 * @return true if bank accounts are supported.
	 */
	boolean hasBankSupport();
	
	/**
	 * Return the Plugin, which has implemented this interface
	 * @return Plugin name
	 */
	String getName();
	
	/**
	 * @return String array of the Authors.
	 */
	String getAuthors();
	
	/**
	 * Formats a double 'amount' as String with the default settings.
	 * @param amount
	 * @param economyCurrency
	 * @return
	 * F.e.:
	 * <br>- '20 $' if $ (Dollar & Cent) is the default currency
	 * <br>For other/unique/better display use 'format' with more input values.
	 */
	String format(double amount, EconomyCurrency economyCurrency);
	
	/**
	 * default value for the methode <b>formatWithCurrency</b>
	 * @param economyCurrency
	 * @return
	 */
	int getDefaultGradationQuantity(EconomyCurrency economyCurrency);
	
	/**
	 * default value for the methode <b>formatWithCurrency</b>
	 * @param economyCurrency
	 * @return
	 */
	boolean getDefaultUseSIPrefix(EconomyCurrency economyCurrency);
	
	/**
	 * default value for the methode <b>formatWithCurrency</b>
	 * @param economyCurrency
	 * @return
	 */
	int getDefaultDecimalPlaces(EconomyCurrency economyCurrency);
	
	/**
	 * default value for the methode <b>formatWithCurrency</b>
	 * @param economyCurrency
	 * @return
	 */
	boolean getDefaultUseSymbol(EconomyCurrency economyCurrency);
	
	/**
	 * Return which symbol are in use for seperate between thousand
	 * @param economyCurrency
	 * @return
	 */
	String getDefaultThousandSeperator(EconomyCurrency economyCurrency);
	
	/**
	 * Return which symbole are in use for seperate the normal number with the decimal number
	 * @param economyCurrency
	 * @return
	 */
	String getDefaultDecimalSeperator(EconomyCurrency economyCurrency);
	
	/**
	 * Return which roundingmode 
	 * @param economyCurrency
	 * @return
	 */
	RoundingMode getDefaultRoundingMode(EconomyCurrency economyCurrency);
	
	/**
	 * A string format of the amount in the specific currency in one String.
	 * <br>decimalPlaces cannot be less than 0.
	 * <br>See the examples.
	 * <br>1 Dollar = 100 Cents
	 * <br>1 Gold = 100 Silver = 10.000 Copper
	 * <br>, = Seperation between Thousand | . = Decimalseperator
	 * <br>k = kilo(thousand), M = Mega(Million), G = Giga(Billion) ... [should be configurable]
	 * <br>gQ = gradationQuantity | SI = useSIPrefix | dP = decimalPlaces | uS = useSymbol
	 * <br>F.e.: 
	 * <br>- <b>1,820 $</b>                      (gQ: <b>0</b> | SI: <b>false</b> | dP: <b>0</b> | uS: <b>true</b>)
	 * <br>- <b>1,820.1 $</b>                    (gQ: <b>0</b> | SI: <b>false</b> | dP: <b>1</b> | uS: <b>true</b>)
	 * <br>- <b>1,820 $ 10 ¢</b>                  (gQ: <b>1</b> | SI: <b>false</b> | dP: <b>1</b> | uS: <b>true</b>)
	 * <br>- <b>1,8201 ¢</b>                     (gQ:<b>-1</b> | SI: <b>false</b> | dP: <b>1</b> | uS: <b>true</b>)
	 * <br>- <b>1,820 $ 10.0 ¢</b>                (gQ: <b>1</b> | SI: <b>false</b> | dP: <b>1</b> | uS: <b>true</b>)
	 * <br>- <b>1,820 Dollars</b>                (gQ: <b>0</b> | SI: <b>false</b> | dP: <b>0</b> | uS: <b>false</b>)
	 * <br>- <b>1,820.1 Dollars</b>              (gQ: <b>0</b> | SI: <b>false</b> | dP: <b>1</b> | uS: <b>false</b>)
	 * <br>- <b>1,820 Dollars 10 Cents</b>        (gQ: <b>1</b> | SI: <b>false</b> | dP: <b>0</b> | uS: <b>false</b>)
	 * <br>- <b>1,820 Dollars 1.0 Cents</b>      (gQ: <b>1</b> | SI: <b>false</b> | dP: <b>1</b> | uS: <b>false</b>)
	 * <br>- <b>1.8k Dollars</b>                 (gQ: <b>1</b> | SI: <b>true</b>  | dP: <b>1</b> | uS: <b>false</b>)
	 * <br> => Now for rpg like currency
	 * <br>- <b>211 Au</b>                       (gQ: <b>0</b> | SI: <b>false</b> | dP: <b>0</b> | uS: <b>true</b>)
	 * <br>- <b>211.13 Au</b>                    (gQ: <b>0</b> | SI: <b>false</b> | dP: <b>2</b> | uS: <b>true</b>)
	 * <br>- <b>211 Au 13 Ag</b>                 (gQ: <b>1</b> | SI: <b>false</b> | dP: <b>0</b> | uS: <b>true</b>)
	 * <br>- <b>211 Au 13 Ag 88 Cu</b>           (gQ: <b>2</b> | SI: <b>false</b> | dP: <b>0</b> | uS: <b>true</b>)
	 * <br>- <b>211 Au 13 Ag 88.0 Cu</b>         (gQ: <b>2</b> | SI: <b>false</b> | dP: <b>1</b> | uS: <b>true</b>)
	 * <br>- <b>211 Gold</b>                     (gQ: <b>0</b> | SI: <b>false</b> | dP: <b>0</b> | uS: <b>false</b>)
	 * <br>- <b>211 Gold 12 Silver</b>           (gQ: <b>1</b> | SI: <b>false</b> | dP: <b>0</b> | uS: <b>false</b>)
	 * <br>- <b>211 Gold 12 Silver 88 Copper</b> (gQ: <b>2</b> | SI: <b>false</b> | dP: <b>0</b> | uS: <b>false</b>)
	 * <br>- <b>21,112 Silver 88 Copper</b>      (gQ:<b>-1</b> | SI: <b>false</b> | dP: <b>0</b> | uS: <b>false</b>)
	 * <br>- <b>21,112,088 Copper</b>            (gQ:<b>-2</b> | SI: <b>false</b> | dP: <b>0</b> | uS: <b>false</b>)
	 * <br>- <b>21,112,088.0 Copper</b>          (gQ:<b>-2</b> | SI: <b>false</b> | dP: <b>1</b> | uS: <b>false</b>)
	 * <br>- <b>21.1M Copper</b>                 (gQ:<b>-2</b> | SI: <b>true</b>  | dP: <b>1</b> | uS: <b>false</b>)
	 * @param amount
	 * @param economyCurrency
	 * @param gradationQuantity
	 * @param decimalPlaces
	 * @param useSIPrefix
	 * @param useSymbol
	 */
	String format(double amount, @Nonnull EconomyCurrency economyCurrency, int gradationQuantity, int decimalPlaces, 
			boolean useSIPrefix, boolean useSymbol);
	
	/**
	 * A string format of the amount in the specific currency in one String.
	 * <br>decimalPlaces cannot be less than 0.
	 * <br>See the examples.
	 * <br>1 Dollar = 100 Cents
	 * <br>1 Gold = 100 Silver = 10.000 Copper
	 * <br> @param thousandSeperator = Seperation between Thousand (here ,)
	 * <br> @param decimalSeperator = Decimalseperator (here .)
	 * <br>k = kilo(thousand), M = Mega(Million), G = Giga(Billion) ... [should be configurable]
	 * <br>gQ = gradationQuantity | SI = useSIPrefix | dP = decimalPlaces | uS = useSymbol
	 * <br>F.e.: 
	 * <br>- <b>1,820 $</b>                      (gQ: <b>0</b> | SI: <b>false</b> | dP: <b>0</b> | uS: <b>true</b>)
	 * <br>- <b>1,820.1 $</b>                    (gQ: <b>0</b> | SI: <b>false</b> | dP: <b>1</b> | uS: <b>true</b>)
	 * <br>- <b>1,820 $ 10 ¢</b>                  (gQ: <b>1</b> | SI: <b>false</b> | dP: <b>1</b> | uS: <b>true</b>)
	 * <br>- <b>1,8201 ¢</b>                     (gQ:<b>-1</b> | SI: <b>false</b> | dP: <b>1</b> | uS: <b>true</b>)
	 * <br>- <b>1,820 $ 10.0 ¢</b>                (gQ: <b>1</b> | SI: <b>false</b> | dP: <b>1</b> | uS: <b>true</b>)
	 * <br>- <b>1,820 Dollars</b>                (gQ: <b>0</b> | SI: <b>false</b> | dP: <b>0</b> | uS: <b>false</b>)
	 * <br>- <b>1,820.1 Dollars</b>              (gQ: <b>0</b> | SI: <b>false</b> | dP: <b>1</b> | uS: <b>false</b>)
	 * <br>- <b>1,820 Dollars 10 Cents</b>        (gQ: <b>1</b> | SI: <b>false</b> | dP: <b>0</b> | uS: <b>false</b>)
	 * <br>- <b>1,820 Dollars 1.0 Cents</b>      (gQ: <b>1</b> | SI: <b>false</b> | dP: <b>1</b> | uS: <b>false</b>)
	 * <br>- <b>1.8k Dollars</b>                 (gQ: <b>1</b> | SI: <b>true</b>  | dP: <b>1</b> | uS: <b>false</b>)
	 * <br> => Now for rpg like currency
	 * <br>- <b>211 Au</b>                       (gQ: <b>0</b> | SI: <b>false</b> | dP: <b>0</b> | uS: <b>true</b>)
	 * <br>- <b>211.13 Au</b>                    (gQ: <b>0</b> | SI: <b>false</b> | dP: <b>2</b> | uS: <b>true</b>)
	 * <br>- <b>211 Au 13 Ag</b>                 (gQ: <b>1</b> | SI: <b>false</b> | dP: <b>0</b> | uS: <b>true</b>)
	 * <br>- <b>211 Au 13 Ag 88 Cu</b>           (gQ: <b>2</b> | SI: <b>false</b> | dP: <b>0</b> | uS: <b>true</b>)
	 * <br>- <b>211 Au 13 Ag 88.0 Cu</b>         (gQ: <b>2</b> | SI: <b>false</b> | dP: <b>1</b> | uS: <b>true</b>)
	 * <br>- <b>211 Gold</b>                     (gQ: <b>0</b> | SI: <b>false</b> | dP: <b>0</b> | uS: <b>false</b>)
	 * <br>- <b>211 Gold 12 Silver</b>           (gQ: <b>1</b> | SI: <b>false</b> | dP: <b>0</b> | uS: <b>false</b>)
	 * <br>- <b>211 Gold 12 Silver 88 Copper</b> (gQ: <b>2</b> | SI: <b>false</b> | dP: <b>0</b> | uS: <b>false</b>)
	 * <br>- <b>21,112 Silver 88 Copper</b>      (gQ:<b>-1</b> | SI: <b>false</b> | dP: <b>0</b> | uS: <b>false</b>)
	 * <br>- <b>21,112,088 Copper</b>            (gQ:<b>-2</b> | SI: <b>false</b> | dP: <b>0</b> | uS: <b>false</b>)
	 * <br>- <b>21,112,088.0 Copper</b>          (gQ:<b>-2</b> | SI: <b>false</b> | dP: <b>1</b> | uS: <b>false</b>)
	 * <br>- <b>21.1M Copper</b>                 (gQ:<b>-2</b> | SI: <b>true</b>  | dP: <b>1</b> | uS: <b>false</b>)
	 * @param amount
	 * @param economyCurrency
	 * @param gradationQuantity
	 * @param decimalPlaces
	 * @param useSIPrefix
	 * @param useSymbol
	 * @param thousandSeperator
	 * @param decimalSeperator
	 */
	String format(double amount, @Nonnull EconomyCurrency economyCurrency, int gradationQuantity, int decimalPlaces, 
			boolean useSIPrefix, boolean useSymbol, String thousandSeperator, String decimalSeperator);
	
	/**
	 * The same as the other format, only with now forceable roundingmode.
	 * @param amount
	 * @param economyCurrency
	 * @param gradationQuantity
	 * @param decimalPlaces
	 * @param useSIPrefix
	 * @param useSymbol
	 * @param thousandSeperator
	 * @param decimalSeperator
	 * @param roundingMode
	 * @return
	 */
	String format(double amount, @Nonnull EconomyCurrency economyCurrency, int gradationQuantity, int decimalPlaces, 
			boolean useSIPrefix, boolean useSymbol, String thousandSeperator, String decimalSeperator, RoundingMode roundingMode);
}