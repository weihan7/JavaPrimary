function replaceSpace(str)
{
    //return str.replace(/ /g, "%20");
    return str.replace(/\s/g, "%20");
}
module.exports = {
    replaceSpace : replaceSpace
};