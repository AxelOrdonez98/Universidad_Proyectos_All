const capitansCtrl = {}

capitansCtrl.rendercapitanFormulario = (req, res) => {
    res.render('capitan/nuevo-capitan')
}

capitansCtrl.crearNuevocapitan = (req, res) => {
    console.log(req.body)
    res.send('capitan nuevo')
}

capitansCtrl.rendercapitan = (req, res) => {
    res.send('render capitan')
}

capitansCtrl.renderEditarcapitan = (req, res) => {
    res.send('Editar capitan')
}

capitansCtrl.updatecapitan = (req, res) => {
    res.send('update capitan')
}

capitansCtrl.eliminarcapitans = (req, res) => {
    res.send('capitan eliminado')
}
module.exports = capitansCtrl