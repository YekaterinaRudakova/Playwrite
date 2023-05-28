package browserlauncher;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Playwright;

class WebKitBrowserFactory implements BrowserFactory {

    @Override
    public Browser createBrowser(Playwright playwright) {
        return playwright.webkit().launch(new BrowserType.LaunchOptions().setHeadless(false));
    }
}
