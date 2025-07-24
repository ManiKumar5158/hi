const { Builder, By, until } = require("selenium-webdriver");
const assert = require("assert");
async function loginTest() {
// launch the browser
let driver = await new Builder().forBrowser("chrome").build();
try {
await driver.get("file:///home/mvsr/myloginDemo/login.html");
await driver.findElement(By.id("un")).sendKeys("MVSREC");
await driver.findElement(By.id("pw")).sendKeys("ITD");
await driver.findElement(By.id("s")).click();
const title = await driver.getTitle();
assert.strictEqual(title,"Login Page");
console.log("success");
} finally {
await driver.quit();
}
}
loginTest();
