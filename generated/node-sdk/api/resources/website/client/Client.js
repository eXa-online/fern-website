"use strict";
/**
 * This file was auto-generated by Fern from our API Definition.
 */
Object.defineProperty(exports, "__esModule", { value: true });
exports.Website = void 0;
const Client_1 = require("../resources/v1/client/Client");
class Website {
    constructor(options) {
        this.options = options;
    }
    get v1() {
        var _a;
        return ((_a = this._v1) !== null && _a !== void 0 ? _a : (this._v1 = new Client_1.V1(this.options)));
    }
}
exports.Website = Website;