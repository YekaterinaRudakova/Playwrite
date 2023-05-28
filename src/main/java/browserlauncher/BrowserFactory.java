package browserlauncher;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.Playwright;

interface BrowserFactory {
    Browser createBrowser(Playwright playwright);
}
