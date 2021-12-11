package main.java.me.avankziar.ifh.spigot.economy;

import javax.annotation.Nonnull;

import main.java.me.avankziar.ifh.spigot.economy.currency.EconomyCurrency;
import main.java.me.avankziar.ifh.spigot.economy.subinterfaces.AccountHandling;
import main.java.me.avankziar.ifh.spigot.economy.subinterfaces.CurrencyHandling;
import main.java.me.avankziar.ifh.spigot.economy.subinterfaces.TransactionHandling;

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
	 * @return true if the plugin support itemstackcurrency
	 */
	boolean hasItemStackCurrencySupport();
	
	/**
	 * @return true if the plugin support playerexperiencecurrency
	 */
	boolean hasPlayerExperienceCurrencySupport();
	
	/**
	 * Return the Plugin, which has implemented this interface
	 * @return Plugin name
	 */
	String getName();
	
	/**
	 * @return String array of the Authors.
	 */
	String[] getAuthors();
	
	/**
	 * Formats a double 'amount' as String with the default settings.
	 * @param amount
	 * @return
	 * F.e.:
	 * <br>- '20 $' if $ (Dollar & Cent) is the default currency
	 * <br>For other/unique/better display use 'formatWithCurency'
	 */
	String format(EconomyCurrency economyCurrency, double amount);
	
	int getDefaultGradationQuantity(EconomyCurrency economyCurrency);
	
	boolean getDefaultUseSIPrefix(EconomyCurrency economyCurrency);
	
	int getDefaultDecimalPlaces(EconomyCurrency economyCurrency);
	
	boolean getDefaultUseSymbol(EconomyCurrency economyCurrency);
	
	/**
	 * A string format of the amount in the specific currency in one String.
	 * <br><b>The value decimalPlaces and gradationQuantity are mutually exclusive.</b>
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
	 * <br>- <b>1,820 $ 1 ¢</b>                  (gQ: <b>1</b> | SI: <b>false</b> | dP: <b>1</b> | uS: <b>true</b>)
	 * <br>- <b>1,8201 ¢</b>                     (gQ:<b>-1</b> | SI: <b>false</b> | dP: <b>1</b> | uS: <b>true</b>)
	 * <br>- <b>1,820 $ 1.0 ¢</b>                (gQ: <b>1</b> | SI: <b>false</b> | dP: <b>1</b> | uS: <b>true</b>)
	 * <br>- <b>1,820 Dollars</b>                (gQ: <b>0</b> | SI: <b>false</b> | dP: <b>0</b> | uS: <b>false</b>)
	 * <br>- <b>1,820.1 Dollars</b>              (gQ: <b>0</b> | SI: <b>false</b> | dP: <b>1</b> | uS: <b>false</b>)
	 * <br>- <b>1,820 Dollars 1 Cents</b>        (gQ: <b>1</b> | SI: <b>false</b> | dP: <b>0</b> | uS: <b>false</b>)
	 * <br>- <b>1,820 Dollars 1.0 Cents</b>      (gQ: <b>1</b> | SI: <b>false</b> | dP: <b>1</b> | uS: <b>false</b>)
	 * <br>- <b>1.8k Dollars</b>                 (gQ: <b>1</b> | SI: <b>true</b>  | dP: <b>1</b> | uS: <b>false</b>)
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
	String formatWithCurrency(double amount, @Nonnull EconomyCurrency economyCurrency, int gradationQuantity, int decimalPlaces, 
			boolean useSIPrefix, boolean useSymbol);
}