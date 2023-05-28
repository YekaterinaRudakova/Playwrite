package browserlauncher;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Playwright;

class FirefoxBrowserFactory implements BrowserFactory {

    @Override
    public Browser createBrowser(Playwright playwright) {
        return playwright.firefox().launch(new BrowserType.LaunchOptions().setHeadless(false));
    }
}
