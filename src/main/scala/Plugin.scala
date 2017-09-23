import com.github.tohosokawa.HelloWorldController
import com.github.tohosokawa.ProtectedBranchService.ProtectedBranchReceiveHook
import io.github.gitbucket.solidbase.model.Version

class Plugin extends gitbucket.core.plugin.Plugin {
  override val pluginId: String = "branch-protect"
  override val pluginName: String = "Branch Protect Plugin"
  override val description: String = "Disables force and non force-pushes to this branch and prevents it from being deleted."
  override val versions: List[Version] = List(new Version("1.0.0"))

  override val controllers = Seq(
    "/*" -> new HelloWorldController()
  )

  override val receiveHooks = Seq(
    new ProtectedBranchReceiveHook()
  )
}
